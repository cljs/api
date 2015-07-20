(ns cljs-api-gen.write
  (:refer-clojure :exclude [replace])
  (:import
    [java.net URLEncoder])
  (:require
    [clojure.edn :as edn]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [join replace split trim]]
    [fipp.edn :refer [pprint]]
    [cljs-api-gen.cljsdoc.reflink :refer [reflink-pattern
                                          named-reflink-pattern]]
    [cljs-api-gen.repo-cljs :refer [cljs-tag->version *clj-tag*]]
    [cljs-api-gen.encode :refer [encode-fullname]]
    [cljs-api-gen.config :refer [*output-dir*
                                 cljsdoc-dir
                                 refs-dir
                                 edn-result-file]]
    [cljs-api-gen.encode :as encode]
    [cljs-api-gen.display :refer [get-short-display-name
                                  get-full-display-name
                                  get-ns-display-name
                                  sort-symbols
                                  compare-ns]]
    [cljs-api-gen.util :refer [mapmap
                               split-ns-and-name]]
    [cljs-api-gen.clojure-api :refer [lang-symbols->parent]]
    [cljs-api-gen.syntax :refer [syntax-map]]
    [me.raynes.fs :refer [exists? mkdir]]
    [stencil.core :as stencil]
    ))

(def ^:dynamic *result*
  "The current result that we are writing."
  nil)

(def ns-descriptions
  "FIXME: put this in the official docstrings if missing (patch request)"

  {:library
   {"cljs.core"                    "fundamental library of the ClojureScript language"
    "special"                      "special forms (not in a namespace)"
    "specialrepl"                  "REPL special forms (not in a namespace)"
    "syntax"                       "syntax forms (not in a namespace)"
    "cljs.pprint"                  "a pretty-printer for printing data structures"
    "cljs.reader"                  "a reader to parse text and produce data structures"
    "clojure.set"                  "set operations such as union/intersection"
    "clojure.string"               "string operations"
    "clojure.walk"                 "a generic tree walker for Clojure data structures"
    "clojure.zip"                  "functional hierarchical zipper, w/ navigation/editing/enumeration"
    "clojure.data"                 "non-core data functions"
    "clojure.browser.dom"          "browser DOM library, wrapping [goog.dom](http://www.closurecheatsheet.com/dom)"
    "clojure.browser.event"        "browser event library, wrapping [goog.events](http://www.closurecheatsheet.com/events)"
    "clojure.browser.net"          "network communication library, wrapping [goog.net](http://www.closurecheatsheet.com/net)"
    "clojure.browser.repl"         "evaluate compiled cljs in a browser. send results back to server"
    "clojure.core.reducers"        "a library for reduction and parallel folding (parallelism not supported)"
    "clojure.reflect"              "DEPRECATED. Do not use, superceded by REPL enhancements."
    "cljs.nodejs"                  "nodejs support functions"
    "cljs.test"                    "a unit-testing framework"
    "cljs.repl"                    "macros auto-imported into a ClojureScript REPL"
    }

   :compiler
   {
    "cljs.analyzer.api" "programmatic access to the analyzer (producing AST)"
    "cljs.compiler.api" "programmatic access to the compiler (emitting JS)"
    "cljs.build.api"    "programmatic access to project-building facilities"
    "cljs.repl"         "REPL (read eval print loop)"
    "cljs.repl.browser" "browser-connected REPL"
    "cljs.repl.node"    "Node.js REPL"
    "cljs.repl.nashorn" "Nashorn REPL (JS on Java 8)"
    "cljs.repl.rhino"   "Rhino REPL (JS on Java 6+)"

    }})

;;--------------------------------------------------------------------------------
;; External links
;;--------------------------------------------------------------------------------

;; https://github.com/zk/clojuredocs/blob/master/src/cljx/clojuredocs/util.cljx#L58-L66
(defn cd-encode
  "clojuredocs' custom encoding scheme."
  [s]
  (when s
    (cond
      (= "." s) "_."
      (= ".." s) "_.."
      :else (-> s
                (replace #"/" "_fs")
                (replace #"\\" "_bs")
                (replace #"\?" "_q")))))

(defn clojuredocs-link
  [full-name]
  (let [[ns- name-] (split-ns-and-name full-name)]
    (str "http://clojuredocs.org/" ns- "/" (cd-encode name-))))

(defn grimoire-link
  [full-name]
  (let [[ns- name-] (split-ns-and-name full-name)
        name-enc (URLEncoder/encode name- "UTF-8")]
    (str "http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/" ns- "/" name-enc "/")))

(defn crossclj-link
  [full-name]
  (let [[ns- name-] (split-ns-and-name full-name)
        name-enc (URLEncoder/encode name- "UTF-8")]
    (str "http://crossclj.info/fun/" ns- "/" name-enc ".html")))

(defn crosscljs-link
  [{:keys [full-name] :as item}]
  (let [[ns- name-] (split-ns-and-name full-name)
        filename (or (-> item :source :filename) "")
        ns- (cond-> ns-
              (re-find #"\.cljs$" filename) (str ".cljs"))
        name-enc (URLEncoder/encode name- "UTF-8")]
    (str "http://crossclj.info/fun/" ns- "/" name-enc ".html")))

(defn crossclj-has-cljs?
  [full-name]
  (let [[ns- name-] (split-ns-and-name full-name)]
    (not (#{"syntax" "special" "specialrepl"} ns-))))

(defn add-external-doc-links
  [{:keys [clj-symbol] :as item}]
  (let [cljs-full (:full-name item)
        clj-full (:full-name clj-symbol)
        links
        (keep identity
          [(when clj-full
             {:source "clojuredocs"
              :symbol clj-full
              :link (clojuredocs-link clj-full)})
           (when clj-full
             {:source "grimoire"
              :symbol clj-full
              :link (grimoire-link clj-full)})
           (when clj-full
             {:source "crossclj"
              :symbol clj-full
              :link (crossclj-link clj-full)})
           (when (crossclj-has-cljs? cljs-full)
             {:source "crossclj"
              :symbol cljs-full
              :link (crosscljs-link item)})])]
    (cond-> item
      (seq links) (assoc :external-doc-links {:links links}))))

;;--------------------------------------------------------------------------------
;; symbol links in markdown
;;--------------------------------------------------------------------------------

(defn resolve-reflink
  [[whole-match full-name]]
  (if-let [item (get-in *result* [:symbols full-name])]
    (str "[`" (get-short-display-name item) "`](" (encode/encode-fullname full-name) ".md)")
    whole-match))

(defn resolve-named-reflink
  [[whole-match full-name]]
  (if (contains? (:symbols *result*) full-name)
    (str "](" (encode/encode-fullname full-name) ".md)")
    whole-match))

(defn resolve-reflinks
  "Replace symbol reflinks in given markdown body."
  [md-body]
  (when md-body
    (-> md-body
        (replace reflink-pattern resolve-reflink)
        (replace named-reflink-pattern resolve-named-reflink))))

;;--------------------------------------------------------------------------------
;; Result dump
;;--------------------------------------------------------------------------------

(defn get-edn-path []
  (str *output-dir* "/" edn-result-file))

(defn get-last-written-result []
  (let [path (get-edn-path)]
    (when (exists? path)
      (edn/read-string (slurp path)))))

(defn dump-edn-file! [result]
  (spit (get-edn-path) (with-out-str (pprint result))))

;;--------------------------------------------------------------------------------
;; Encoding helpers
;;--------------------------------------------------------------------------------

(defn md-escape
  [sym]
  (when sym
    (-> sym
        (replace "\\" "\\\\")
        (replace "*" "\\*")
        (replace "[" "\\[")
        (replace "]" "\\]"))))

(defn md-link-escape
  [s]
  (replace s ">" "%3E"))

(defn md-strikethru
  [s]
  (str "~~" s "~~"))

(defn md-header-link
  [s]
  (-> s
      (replace #"[^a-zA-Z0-9 ]" "")
      (replace " " "-")))

(defn shield-escape
  [s]
  (-> s
      (replace "-" "--")
      ))

(def emoji-url
  "emoji table here: http://apps.timwhitlock.info/emoji/tables/unicode"
  {":heavy_check_mark:" "http://i.imgur.com/JfULGnn.png"
   ":no_entry_sign:"    "http://i.imgur.com/sWBgjc6.png"})

(defn fix-emoji
  "github currently disables emoji-rendering for large readmes, so just process them here."
  [s]
  (reduce
    (fn [s emoji]
      (replace s emoji
        (str "<img width=\"20px\" height=\"20px\" valign=\"middle\" src=\"" (emoji-url emoji) "\">")))
    s (keys emoji-url)))

;;--------------------------------------------------------------------------------
;; Common
;;--------------------------------------------------------------------------------

(def clj-ns->page-ns
  {"clojure.core.reducers" "clojure.core"})

(defn get-clj-link
  [full-name]
  (let [ns- (-> full-name symbol namespace)
        name- (-> full-name symbol name)]
    (or ;; get syntax doc link
        (-> full-name syntax-map :clj-doc)

        ;; get clojure.lang link
        (when (= "clojure.lang" ns-)
          (let [name- (or (lang-symbols->parent name-) name-)]
            (str "https://github.com/clojure/clojure/blob/" *clj-tag* "/src/jvm/clojure/lang/" name- ".java")))

        ;; get official clojure api link
        (let [ns- (or (clj-ns->page-ns ns-) ns-)]
          (str "http://clojure.github.io/clojure/branch-master/" ns- "-api.html#" (md-link-escape full-name))))))

(defn make-clj-ref
  [item]
  (when-let [full-name (:clj-symbol item)]
    {:full-name full-name
     :display-name (md-escape full-name)
     :import (= "clojure" (-> item :source :repo))
     :link (get-clj-link full-name)}))

(defn item-filename
  [item]
  (str *output-dir* "/" refs-dir "/" (encode/encode-fullname (:full-name item))))

(defn history-change-shield
  [[change version]]
  (let [color ({"+" "lightgrey" "-" "red"} change)
        change-symbol ({"+" "+", "-" "×"} change)
        change-word ({"+" "Added", "-" "Removed"} change)
        ]
    (str 
      "<a href=\"https://github.com/cljsinfo/cljs-api-docs/tree/" version "\">"
      "<img valign=\"middle\""
        " alt=\"[" change-symbol "] " version "\""
        " title=\"" change-word " in " version "\""
        " src=\"https://img.shields.io/badge/" change-symbol "-" (shield-escape version) "-" color ".svg\">"
      "</a>")))

(defn version-changes
  [symbols changes]
  (let [make (fn [full-name change]
               (let [item (get symbols full-name)]
                 (assoc item
                   :text (cond-> (md-escape (get-full-display-name item))
                           (= change :removed) md-strikethru)
                   :shield-text (shield-escape (:type item))
                   :change ({:added "+" :removed "×"} change)
                   :shield-color ({:added "brightgreen" :removed "red"} change)
                   :link (str refs-dir "/" (:full-name-encode item) ".md"))))
        added (map #(make % :added) (:added changes))
        removed (map #(make % :removed) (:removed changes))
        all (sort-symbols :full-name (concat added removed))]
    all))

;;--------------------------------------------------------------------------------
;; ref file
;;--------------------------------------------------------------------------------

(defn sig-args
  [text]
  (when-let [[_ args] (re-find #"^\[(.*)\]$" text)]
    (if (not= "" (trim args))
      (md-escape args)
      nil)))

(defn github-src-href
  [{:keys [lines repo tag filename] :as source}]
  (str "https://github.com/clojure/" repo "/blob/" tag "/" filename
       "#" (join "-" (map #(str "L" %) lines))))

(defn source-link
  [basename {:keys [lines] :as source}]
  (let [label (str basename ":" (join "-" lines))
        link (github-src-href source)]
    (str "<ins>[" label "](" link ")</ins>")))

(defn source-path
  [{:keys [filename repo tag] :as source}]
  ;; clojurescript/
  ;; └── src/
  ;;     └── cljs/
  ;;         └── cljs/
  ;;             └── <ins>[core.cljs:2109-2114](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L2109-L2114)</ins>
  (let [crumbs (split filename #"/")
        last-i (dec (count crumbs))
        branch "└── "
        space  "    "]
    (join "\n"
      (cons
        (str repo " @ " tag)
        (map-indexed
          (fn [i crumb]
            (str (join (repeat i space))
                 branch
                 (if (= i last-i)
                   (source-link crumb source)
                   crumb)))
          crumbs)))))

(defn add-source-extras
  [item]
  (let [add-extras #(when %
                      (-> %
                          (assoc :path-tree (source-path %)
                                 :github-link (github-src-href %))))]
    (-> item
        (update-in [:source] add-extras)
        (update-in [:extra-sources] #(map add-extras %)))))

(defn add-source-links
  [item]
  (let [add-link #(when % (assoc % :github-link (github-src-href %)))]
    (-> item
        (update-in [:source] add-link)
        (update-in [:extra-sources] #(map add-link %)))))

(defn ref-link
  [full-name]
  (when full-name
    (let [item (get-in *result* [:symbols full-name])
          display (get-full-display-name item)
          link (str (encode/encode-fullname full-name) ".md")]
      (cond-> (str "[`" display "`](" link ")")
         (:removed item) md-strikethru))))

(defn add-related-links
  [{:keys [related] :as item}]
  (if related
    (let [symbols (map ref-link related)]
      (assoc item :related {:symbols symbols}))
    item))

(defn add-syntax-usage
  [{:keys [usage] :as item}]
  (if usage
    (assoc item :usage {:usages (map md-escape usage)})
    item))

(defn resolve-all-reflinks
  [item]
  (-> item
      (update-in [:description] resolve-reflinks)
      (update-in [:examples] (fn [examples]
                               (map #(update-in % [:content] resolve-reflinks) examples)))))

(defn ref-file-data
  [item]
  (-> item
      (assoc
        :full-name (:full-name item)
        :moved (ref-link (:moved item))
        :display-name (cond-> (md-escape (get-full-display-name item))
                        (:removed item) md-strikethru)
        :data (with-out-str (pprint item))
        :history (map history-change-shield (:history item))
        :signature (let [sigs (:signature item)]
                     (when (and (sequential? sigs) (pos? (count sigs)))
                       {:sigs (map #(hash-map :name (cond-> (md-escape (:name item))
                                                      (= "type" (:type item)) (str "."))
                                              :args (sig-args %))
                                   sigs)}))
        :clj-symbol (make-clj-ref item)
        :cljsdoc-path (str cljsdoc-dir "/" (:full-name-encode item) ".cljsdoc"))
      (add-external-doc-links)
      (add-syntax-usage)
      (add-related-links)
      (add-source-extras)
      (resolve-all-reflinks)))

(defn dump-ref-file!
  [item]
  (encode/assert-lossless (:full-name item))
  (let [filename (item-filename item)]
    (spit (str filename ".md")
      (stencil/render-string
        (slurp "templates/ref.md")
        (ref-file-data item)))))

;;--------------------------------------------------------------------------------
;; history file
;;--------------------------------------------------------------------------------

(defn history-file-data
  [result]
  ;;; The problem we're trying to solve here is to merge the history information
  ;;; of all the API categories.
  ;;;
  ;;; What this function receives:
  ;;;   {:api {:library {}, :compiler {}, :syntax {}}}
  ;;;
  ;;; But each API has its own list of changes, all the same size and with the same version keys per change.
  ;;;
  ;;; What this function should output:
  ;;;   {:versions [
  ;;;               {;; version keys present but not shown.
  ;;;                :library-api {}
  ;;;                :compiler-api {}
  ;;;                :syntax-api {}}]
  ;;;
  ;;; This data transformation is messy.  Need to do this in result.clj

  (let [add-change-info
        (fn [change symbols api-type]
          (let [changes (version-changes symbols change)
                no-changes (if (zero? (count changes)) true nil)
                add-count (count (:added change))
                remove-count (count (:removed change))
                when-pos (fn [x] (when (pos? x) x))]
            (-> change
                (assoc
                   (str (name api-type) "-api")
                   {:changes-link (md-header-link (str (:cljs-version change) "-" (name api-type)))
                    :changes changes
                    :no-changes no-changes
                    :added (:added change)
                    :removed (:removed change)
                    :add-count (when-pos add-count)
                    :remove-count (when-pos remove-count)})
                (dissoc
                  :added :removed))))

        get-api-changes
        (fn [api-type]
          (let [{:keys [symbol-names changes]} (get-in result [:api api-type])
                symbols (select-keys (:symbols result) symbol-names)]
            (->> changes
                 (map #(add-change-info % symbols api-type)))))

        syn-changes (get-api-changes :syntax)
        com-changes (get-api-changes :compiler)
        lib-changes (get-api-changes :library)

        all (reverse (map #(merge %1 %2 %3) syn-changes com-changes lib-changes))]
    {:versions all}))

(defn dump-history! [result]
  (spit (str *output-dir* "/HISTORY.md")
        (fix-emoji (stencil/render-string
          (slurp "templates/history.md")
          (history-file-data result)
          ))))

;;--------------------------------------------------------------------------------
;; unported file
;;--------------------------------------------------------------------------------

(defn unported-file-data
  [result]
  ;; ns-symbols [ {:ns :header-link :symbols [ { :text :link } ] } ]
  (let [syms (:clj-not-cljs result)
        make (fn [full-name]
               (let [[ns- name-] (split-ns-and-name (symbol full-name))]
                 {:ns ns-
                  :name name-
                  :full-name full-name
                  :text (md-escape full-name)
                  :link (get-clj-link full-name)}))
        ns-symbols (->> syms
                        (map make)
                        (group-by :ns)
                        (map (fn [[ns- syms]] {:ns ns-
                                               :header-link (md-header-link ns-)
                                               :symbols (sort-by :name syms)}))
                        (sort-by :ns))]
    {:ns-symbols ns-symbols}))

(defn dump-unported! [result]
  (spit (str *output-dir* "/UNPORTED.md")
        (fix-emoji (stencil/render-string
          (slurp "templates/unported.md")
          (unported-file-data result)))))

;;--------------------------------------------------------------------------------
;; readme file
;;--------------------------------------------------------------------------------

(defn readme-api-changes
  [result api-type]
  ;; name-link tuples
  (let [api (get-in result [:api api-type])
        changes (last (:changes api))
        symbols (select-keys (:symbols result) (:symbol-names api))
        all (version-changes symbols changes)]
    all))

(defn sort-items
  [items]
  (let [main (->> items
               (remove #(#{"type" "protocol"} (:type %)))
               (remove :parent-type)
               (sort-by :name))
        protocols (->> items
                       (filter #(= "protocol" (:type %)))
                       (sort-by :name))
        types (->> items
                   (filter #(= "type" (:type %)))
                   (sort-by :name))
        members (->> items
                     (filter :parent-type)
                     (group-by :parent-type)
                     (mapmap #(sort-by :name %)))
        types+ (mapcat #(cons % (members (:name %))) types)]
    (concat main protocols types+)))

(defn readme-api-symbols
  [result api-type]
  ;; clj-name-type-history tuples
  (let [all (select-keys (:symbols result) (get-in result [:api api-type :symbol-names]))
        get-short-name (fn [item]
                         (cond-> (get-short-display-name item)
                           ;; remove parent type (e.g. Vector.EMPTY -> EMPTY)
                           (:parent-type item) (replace (str (:parent-type item) ".") "")))
        get-display-name (fn [item]
                           (cond-> (md-escape (get-short-name item))
                             (:removed item) md-strikethru))
        make-item (fn [item]
                    {:display-name (get-display-name item)
                     :full-name (:full-name item)
                     :display-prefix (when (:parent-type item) " └── ")
                     :link (str refs-dir "/" (:full-name-encode item) ".md")
                     :clj-symbol (make-clj-ref item)
                     :clj-doc (:clj-doc item)
                     :edn-doc (:edn-doc item)
                     :name (:name item)
                     :type (:type item)
                     :parent-type (:parent-type item)
                     :history (map history-change-shield (:history item))})
        transform-syms #(sort-items (map make-item %))
        ns-symbols (->> (vals all)
                        (group-by :ns)
                        (mapmap transform-syms)
                        (map (fn [[k v]]
                               (let [ns-display (get-ns-display-name k)]
                                 {:ns k
                                  :ns-display ns-display
                                  :ns-description (get-in ns-descriptions [api-type k])
                                  :ns-link (md-header-link ns-display)
                                  :symbols (if (= k "syntax")
                                             (sort-symbols :full-name v)
                                             v)})))
                        (sort-by :ns compare-ns))]
    ns-symbols))

(defn readme-file-data
  [result]
  (let [make (fn [api-type]
               (let [changes (readme-api-changes result api-type)
                     no-changes (if (zero? (count changes)) true nil)
                     ns-symbols (readme-api-symbols result api-type)]
                 {:changes changes
                  :no-changes no-changes
                  :ns-symbols ns-symbols}))]
    {:library-api (make :library)
     :compiler-api (make :compiler)
     :syntax-api (make :syntax)
     :release (:release result)}))

(defn dump-readme! [result]
  (spit (str *output-dir* "/README.md")
        (fix-emoji (stencil/render-string
          (slurp "templates/readme.md")
          (readme-file-data result)
          ))))

;;--------------------------------------------------------------------------------
;; unfinished file
;;--------------------------------------------------------------------------------

(defn unfinished-file-data
  [result]
  (let [make-item (fn [{:keys [full-name description examples related] :as sym}]
                    (let [s full-name
                          full-name-encode (encode-fullname s)
                          non-empty-seq? #(and (sequential? %) (pos? (count %)))
                          non-empty-str? #(and (string? %) (pos? (count %)))]
                      {:full-name s
                       :display-name (md-escape (get-full-display-name sym))
                       :ref (str refs-dir "/" full-name-encode ".md")
                       :cljsdoc (str "https://github.com/cljsinfo/cljs-api-docs/blob/master/"
                                     cljsdoc-dir "/" full-name-encode ".cljsdoc")
                       :description (non-empty-str? description)
                       :examples (non-empty-seq? examples)
                       :related (non-empty-seq? related)}))
        done? (fn [{:keys [ref cljsdoc description examples related]}]
                (and ref cljsdoc description examples))
        symbols (->> (vals (:symbols result))
                     (map make-item)
                     (remove done?)
                     (sort-symbols :full-name))]
    {:symbols symbols}))

(defn dump-unfinished! [result]
  (spit (str *output-dir* "/UNFINISHED.md")
        (fix-emoji (stencil/render-string
          (slurp "templates/unfinished.md")
          (unfinished-file-data result)))))

;;--------------------------------------------------------------------------------
;; Main
;;--------------------------------------------------------------------------------

(defn dump-result! [result]
  (binding [*result* result]

    (mkdir *output-dir*)
    (mkdir (str *output-dir* "/" refs-dir))

    (println "writing edn...")
    (dump-edn-file! result)

    (println "writing ref files...")
    (doseq [item (vals (:symbols result))]
      (dump-ref-file! item))

    (println "writing readme...")
    (dump-readme! result)

    (println "writing history...")
    (dump-history! result)

    (println "writing unported...")
    (dump-unported! result)

    (println "writing unfinished...")
    (dump-unfinished! result))
  )

