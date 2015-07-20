(ns cljs-api-gen.docset
  (:refer-clojure :exclude [replace])
  (:require
    [clansi.core :refer [style]]
    [clojure.java.shell :refer [sh]]
    [clojure.string :refer [replace join]]
    [cljs-api-gen.write :refer [get-last-written-result]]
    [cljs-api-gen.encode :refer [decode-fullname
                                 md-header-link]]
    [cljs-api-gen.display :refer [get-ns-display-name]]
    [cljs-api-gen.util :refer [split-ns-and-name]]
    [clojure.java.jdbc :as j]
    [me.raynes.fs :refer [delete-dir copy copy-dir list-dir base-name mkdirs directory?]]
    ))

;; NOTE: you have to run docset/run-all.sh first to download/process the
;;       rendered html pages of our markdown docs from github.

;; code derived from Lokeshwaran's (@dlokesh) project:
;; https://github.com/dlokesh/clojuredocs-docset

(def docset-name "ClojureScript.docset")
(def tar-name "ClojureScript.tgz")

(def work-dir "docset")

(def offline-path (str work-dir "/offline"))
(def docset-path (str  work-dir "/" docset-name))
(def tar-path (str work-dir "/" tar-name))

(def docset-docs-path (str docset-path "/Contents/Resources/Documents"))
(def db-path (str docset-path "/Contents/Resources/docSet.dsidx"))

(def sqlite-db {:classname "org.sqlite.JDBC"
			          :subprotocol "sqlite"
                :subname db-path})

(defn resolve-path
  "Resolves an asset path for use by the Docset index."
  [& paths]
  (apply str "offline/github.com/cljsinfo/cljs-api-docs/blob/catalog/" paths))

(def type->dash
  {"var"                 "Variable"
   "dynamic var"         "Variable"
   "protocol"            "Protocol"
   "type"                "Type"
   "macro"               "Macro"
   "function"            "Function"
   "special form"        "Statement" ;; <-- Pending "Special Form"
   "special form (repl)" "Statement" ;;     (avaiable in next Dash version)
   "tagged literal"      "Tag"
   "syntax"              "Operator"  ;; <-- Pending "Syntax"
   "special symbol"      "Constant"
   "special namespace"   "Namespace"
   "binding"             "Builtin"
   "convention"          "Builtin"
   "special character"   "Builtin"
   })

(defn dash-name
  [item]
  (or (:display item)
      (:name item)))

(defn assert-reqs!
  []
  (let [missing-catalog? (not (directory? "catalog"))
        missing-offline? (not (directory? offline-path))
        error? (or missing-catalog? missing-offline?)]

    (when error?

      (when missing-catalog?
        (println)
        (println (style "Docs catalog not found at:" :yellow) "catalog/")
        (println)
        (println "Please build/push the latest version of the docs to github:")
        (println)
        (println (style "$ script/publish.sh" :cyan))
        (println))

      (when missing-offline?
        (println)
        (println (style "Offline rendered docs not found at:" :yellow) offline-path)
        (when-not missing-catalog?
          (println)
          (println "Please push the latest version of the docs to github:")
          (println)
          (println (style "$ script/publish.sh" :cyan)))
        (println)
        (println "Run the following to create an offline version of")
        (println "  github's rendered markdown docs.")
        (println)
        (println (style "$ cd docset" :cyan))
        (println (style "$ ./download-pages.sh" :cyan))
        (println (style "$ ./format-pages.js" :cyan)))

      (println)
      (println "Then, re-run this script to create the docset for Dash:")
      (println)
      (println (style "$ lein run :docset" :cyan))
      (println)
      (System/exit 1))))

(defn create!
  []

  (println "Creating ClojureScript docset...")
  (assert-reqs!)

  (let [result (get-last-written-result)
        syms (:symbols result)]

    (println "Clearing previous docset folder...")
    (delete-dir docset-path)
    (mkdirs docset-docs-path)

    ;; copy over offline pages
    (println "Copying offline pages and resources to docset folder...")
    (copy-dir offline-path docset-docs-path)

    ;; copy over resources
    (copy "docset/icon.png" (str docset-path "/icon.png"))
    (copy "docset/Info.plist" (str docset-path "/Contents/Info.plist"))

    ;; reset/create tables
    (println "Clearing/creating index database tables...")
    (j/db-do-commands sqlite-db
       "DROP TABLE IF EXISTS searchIndex"
       "CREATE TABLE searchIndex(id INTEGER PRIMARY KEY, name TEXT, type TEXT, path TEXT)"
       "CREATE UNIQUE INDEX anchor ON searchIndex (name, type, path)")

    (println "Adding sections to index database...")
    (j/insert! sqlite-db :searchIndex
       ;; insert categories
       {:name "Syntax" :type "Category" :path (resolve-path "README.html#syntax")}
       {:name "Library API"  :type "Category" :path (resolve-path "README.html#library-api")}
       {:name "Compiler API" :type "Category" :path (resolve-path "README.html#compiler-api")}

       ;; insert sections
       {:name "Overview"                :type "Section" :path (resolve-path "README.html")}
       {:name "History"                 :type "Section" :path (resolve-path "HISTORY.html")}
       {:name "Not Ported From Clojure" :type "Section" :path (resolve-path "UNPORTED.html")}
       )

    ;; insert namespaces
    (println "Adding namespaces to index database...")
    (let [get-api-ns-pairs
          (fn [[api-type {:keys [symbol-names]}]]
            (for [s symbol-names]
              (let [[ns-] (split-ns-and-name s)]
                [api-type ns-])))
          pairs (->> (:api result)
                     (mapcat get-api-ns-pairs)
                     (set))]
      (doseq [p pairs]
        (println "pair:" (pr-str p)))
      (apply j/insert! sqlite-db :searchIndex
        (for [[api-type ns-] pairs]
          (let [ns-display (get-ns-display-name ns- api-type)
                ns-link (resolve-path "README.html#" (md-header-link ns-display))]
            {:name ns-display :type "Namespace" :path ns-link}))))

    ;; insert symbols
    (println "Adding symbols to index database...")
    (let [refs-path (str docset-docs-path "/" (resolve-path "refs"))]
      (apply j/insert! sqlite-db :searchIndex
        (for [ref-file (list-dir refs-path)]
          (let [;; We want to retrieve the full name of the symbol belonging to
                ;; this file.  We do this by decoding the original filename of
                ;; the generated page.
                ;;
                ;; But, httrack can rename files by appending number suffixes
                ;; to prevent collision on case-insensitive file systems. This
                ;; is actually really helpful since it allows us to maintain
                ;; compatibility with Windows and Mac, but prevents us from
                ;; decoding the filenames straighaway.
                ;;
                ;; Luckily, httrack adds an html comment stamp containing the
                ;; original filename, which we can parse:
                ;;    <!-- Mirrored from <url-here> by HTTrack Website Copier ... -->
                encoded-name
                (second
                  (re-find #"github\.com/cljsinfo/cljs-api-docs/blob/catalog/refs/(.*)\.md "
                           (slurp ref-file)))
                full-name (decode-fullname encoded-name)
                item (get syms full-name)]
            {:name (dash-name item)
             :type (type->dash (:type item))
             :path (resolve-path "refs/" (base-name ref-file))}
            ))))

    ;; create the tar file
    (println "Creating final docset tar file...")
    (sh "tar"
        "--exclude='.DS_Store'"
        "-cvzf" tar-name
        docset-name
        :dir work-dir)

    (println)
    (println "Created:" (style docset-path :cyan))
    (println "Created:" (style tar-path :cyan))
    (println)
    (println (style "Success!" :green))))
