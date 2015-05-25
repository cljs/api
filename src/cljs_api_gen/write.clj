(ns cljs-api-gen.write
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.edn :as edn]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [join replace split trim]]
    [fipp.edn :refer [pprint]]
    [cljs-api-gen.repo-cljs :refer [cljs-tag->version]]
    [cljs-api-gen.config :refer [*output-dir*
                                 refs-dir
                                 edn-result-file]]
    [cljs-api-gen.util :refer [symbol->filename mapmap
                               split-ns-and-name]]
    [me.raynes.fs :refer [exists? mkdir]]
    [stencil.core :as stencil]
    ))

(def ns-descriptions
  "FIXME: put this in the official docstrings if missing (patch request)"

  {"cljs.core"                    "fundamental library of the ClojureScript language"
   "special"                      "special forms (not namespaced)"
   "specialrepl"                  "REPL special forms (not namespaced)"
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
   "clojure.browser.repl"         "evalute compiled cljs in a browser. send results back to server"
   "clojure.core.reducers"        "a library for reduction and parallel folding (parallelism not supported)"
   "clojure.reflect"              "DEPRECATED. Do not use, superceded by REPL enhancements."
   "cljs.nodejs"                  "nodejs support functions"
   "cljs.test"                    "a unit-testing framework"
   "cljs.repl"                    "macros auto-imported into a ClojureScript REPL"

   "cljs.build.api"               ""
   "cljs.compiler.api"            ""
   "cljs.analyzer.api"            ""
   })

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
  (-> sym
      (replace "*" "\\*")))

(defn md-link-escape
  [s]
  (replace s ">" "%3E"))

(defn md-strikethru
  [s]
  (str "~~" s "~~"))

(defn md-header-link
  [s]
  (-> s
      (replace "." "")))

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
  (let [ns- (-> full-name symbol namespace)]
    (str "http://clojure.github.io/clojure/branch-master/"
         (if-let [page-ns (clj-ns->page-ns ns-)]
           page-ns
           ns-)
         "-api.html#" (md-link-escape full-name))))

(defn make-clj-ref
  [item]
  (when-let [full-name (:clj-symbol item)]
    {:full-name full-name
     :display-name (md-escape full-name)
     :import (= "clojure" (second (re-find #"/clojure/([^/]+)/" (-> item :source :link))))
     :link (get-clj-link full-name)}))

(defn item-filename
  [item]
  (str *output-dir* "/" refs-dir "/" (:ns item) "_" (symbol->filename (:name item))))

(defn history-change
  [[change version]]
  (let [change ({"+" "Added", "-" "Removed"} change)]
    {:change change
     :version version}))

(defn history-change-shield
  [[change version]]
  (let [color ({"+" "lightgrey" "-" "red"} change)
        change ({"+" "+", "-" "×"} change)]
    (str 
      "<a href=\"https://github.com/cljsinfo/api-refs/tree/" version "\">"
      "<img valign=\"middle\" alt=\"[" change "] " version "\""
        " src=\"https://img.shields.io/badge/" change "-" (shield-escape version) "-" color ".svg\">"
      "</a>")))

(defn version-changes
  [symbols changes]
  (let [make (fn [full-name change]
               (let [item (get symbols full-name)]
                 (assoc item
                   :text (cond-> (md-escape full-name)
                           (= change :removed) md-strikethru)
                   :shield-text (shield-escape (:type item))
                   :change ({:added "+" :removed "×"} change)
                   :shield-color ({:added "brightgreen" :removed "red"} change)
                   :link (str refs-dir "/" (:full-name-encode item) ".md"))))
        added (map #(make % :added) (:added changes))
        removed (map #(make % :removed) (:removed changes))
        sort-key (fn [item] [(:ns item) (:name item)])
        all (sort-by sort-key (concat added removed))]
    all))

;;--------------------------------------------------------------------------------
;; ref file
;;--------------------------------------------------------------------------------

(defn sig-args
  [text]
  (let [[_ args] (re-find #"^\[(.*)\]$" text)]
    (if (not= "" (trim args))
      (md-escape args)
      nil)))

(defn source-link
  [filename {:keys [lines link] :as source}]
  (str "<ins>[" filename ":" (join "-" lines) "](" link ")</ins>"))

(defn source-path
  [{:keys [filename link] :as source}]
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
      (map-indexed
        (fn [i crumb]
          (if (zero? i)
            (str crumb " @ " (second (re-find #"blob/([^/]*)" link)))
            (str (join (repeat (dec i) space))
                 branch
                 (if (= i last-i)
                   (source-link crumb source)
                   crumb))))
        crumbs))))

(defn add-source-trees
  [item]
  (let [add-tree #(assoc % :path-tree (source-path %))]
    (-> item
        (update-in [:source] add-tree)
        (update-in [:shadowed-sources] #(map add-tree %)))))

(defn ref-file-data
  [item]
  (-> item
      (assoc
        :display-name (cond-> (md-escape (:full-name item))
                        (:removed item) md-strikethru)
        :data (with-out-str (pprint item))
        :history (map history-change-shield (:history item))
        :signature (map #(hash-map :name (cond-> (md-escape (:name item))
                                           (= "type" (:type item)) (str "."))
                                   :args (sig-args %))
                        (:signature item))
        :clj-symbol (make-clj-ref item))
      (add-source-trees)
      (update-in [:docstring]
        #(if (or (nil? %) (= "" (trim %)))
           "(no docstring)"
           %))))

(defn dump-ref-file!
  [item]
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
  (let [add-change-info
        (fn [change symbols api-type]
          (let [changes (version-changes symbols change)
                no-changes (if (zero? (count changes)) true nil)
                add-count (count (:added change))
                remove-count (count (:removed change))
                when-pos (fn [x] (when (pos? x) x))]
            (-> change
                (assoc
                   api-type
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
          (let [{:keys [symbols changes]} (get result api-type)]
            (->> changes
                 (map #(add-change-info % symbols api-type)))))

        com-changes (get-api-changes :compiler-api)
        lib-changes (get-api-changes :library-api)
        all (reverse (map #(merge %1 %2) com-changes lib-changes))]
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
  (let [api (get result api-type)
        changes (last (:changes api))
        all (version-changes (:symbols api) changes)]
    all))

(def ns-order
  {"special" 1
   "specialrepl" 2
   "cljs.core" 3})

(defn compare-ns
  [a b]
  (let [ai (get ns-order a)
        bi (get ns-order b)]
    (cond
      (and (nil? ai) (nil? bi)) (compare a b)
      (nil? ai) 1
      (nil? bi) -1
      :else (compare ai bi))))

(defn readme-api-symbols
  [result api-type]
  ;; clj-name-type-history tuples
  (let [all (-> result api-type :symbols)
        make-item (fn [item]
                    {:display-name (cond-> (md-escape (:name item))
                                     (:removed item) md-strikethru)
                     :link (str refs-dir "/" (:full-name-encode item) ".md")
                     :clj-symbol (make-clj-ref item)
                     :name (:name item)
                     :type (:type item)
                     :history (map history-change-shield (:history item))})
        transform-syms #(sort-by :name (map make-item %))
        ns-symbols (->> (vals all)
                        (group-by :ns)
                        (mapmap transform-syms)
                        (map (fn [[k v]] {:ns k
                                          :ns-description (ns-descriptions k)
                                          :ns-link (md-header-link k)
                                          :symbols v}))
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
    {:library-api (make :library-api)
     :compiler-api (make :compiler-api)
     :release (:release result)}))

(defn dump-readme! [result]
  (spit (str *output-dir* "/README.md")
        (fix-emoji (stencil/render-string
          (slurp "templates/readme.md")
          (readme-file-data result)
          ))))

;;--------------------------------------------------------------------------------
;; Main
;;--------------------------------------------------------------------------------

(defn dump-result! [result]
  (mkdir *output-dir*)
  (mkdir (str *output-dir* "/" refs-dir))

  (println "writing ref files...")
  (doseq [item (vals (:symbols (:library-api result)))]
    (dump-ref-file! item))
  (doseq [item (vals (:symbols (:compiler-api result)))]
    (dump-ref-file! item))

  (println "writing readme...")
  (dump-readme! result)

  (println "writing history...")
  (dump-history! result)

  (println "writing unported...")
  (dump-unported! result)

  (println "writing edn...")
  (dump-edn-file! result))

