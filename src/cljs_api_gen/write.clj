(ns cljs-api-gen.write
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.edn :as edn]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [join replace split trim]]
    [fipp.edn :refer [pprint]]
    [cljs-api-gen.repo-cljs :refer [cljs-tag->version *clj-tag*]]
    [cljs-api-gen.encode :refer [encode-fullname]]
    [cljs-api-gen.config :refer [*output-dir*
                                 cljsdoc-dir
                                 refs-dir
                                 edn-result-file]]
    [cljs-api-gen.encode :as encode]
    [cljs-api-gen.util :refer [mapmap
                               split-ns-and-name]]
    [cljs-api-gen.clojure-api :refer [lang-symbols->parent]]
    [cljs-api-gen.syntax :refer [syntax-order
                                 syntax-map]]
    [cljs-api-gen.cljsdoc :refer [cljsdoc-map]]
    [me.raynes.fs :refer [exists? mkdir]]
    [stencil.core :as stencil]
    ))

(def ns-descriptions
  "FIXME: put this in the official docstrings if missing (patch request)"

  {:library-api
   {"cljs.core"                    "fundamental library of the ClojureScript language"
    "special"                      "_pseudo-namespace_ for special forms"
    "specialrepl"                  "_pseudo-namespace_ for REPL special forms"
    "syntax"                       "_pseudo-namespace_ for syntax forms"
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

   :compiler-api
   {
    ;; TODO: create namespace descriptions
    }})

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
  (when-let [[_ args] (re-find #"^\[(.*)\]$" text)]
    (if (not= "" (trim args))
      (md-escape args)
      nil)))

(defn source-link
  [basename {:keys [lines repo tag filename] :as source}]
  (let [label (str basename ":" (join "-" lines))
        link (str "https://github.com/clojure/" repo "/blob/" tag "/" filename
                  "#" (join "-" (map #(str "L" %) lines)))]
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

(defn add-source-trees
  [item]
  (let [add-tree #(when % (assoc % :path-tree (source-path %)))]
    (-> item
        (update-in [:source] add-tree)
        (update-in [:extra-sources] #(map add-tree %)))))

(defn fix-syntax-form
  [syntax-form]
  (if (vector? syntax-form)
    (map md-escape syntax-form)
    (md-escape syntax-form)))

(defn add-related-links
  [{:keys [related] :as item}]
  (if related
    (assoc item :related
           (for [full-name related]
             {:full-name full-name
              :link (str (encode/encode-fullname full-name) ".md")}))
    item))

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
        :clj-symbol (make-clj-ref item)
        :cljsdoc-path (str cljsdoc-dir "/" (:full-name-encode item) ".cljsdoc"))
      (update-in [:syntax-form] fix-syntax-form)
      (add-related-links)
      (add-source-trees)))

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

        syn-changes (get-api-changes :syntax-api)
        com-changes (get-api-changes :compiler-api)
        lib-changes (get-api-changes :library-api)
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
  (let [all (-> result api-type :symbols)
        get-display-name (fn [{:keys [parent-type] :as item}]
                           (cond-> (:name item)
                             parent-type (replace (str parent-type ".") "")
                             true md-escape
                             (:removed item) md-strikethru))
        make-item (fn [item]
                    {:display-name (get-display-name item)
                     :display-prefix (when (:parent-type item) " └── ")
                     :link (str refs-dir "/" (:full-name-encode item) ".md")
                     :clj-symbol (make-clj-ref item)
                     :clj-doc (:clj-doc item)
                     :edn-doc (:edn-doc item)
                     :name (:name item)
                     :type (:type item)
                     :syntax-form (fix-syntax-form (:syntax-form item))
                     :parent-type (:parent-type item)
                     :history (map history-change-shield (:history item))})
        transform-syms #(sort-items (map make-item %))
        ns-symbols (->> (vals all)
                        (group-by :ns)
                        (mapmap transform-syms)
                        (map (fn [[k v]] {:ns k
                                          :ns-description (get-in ns-descriptions [api-type k])
                                          :ns-link (md-header-link k)
                                          :symbols (if (= k "syntax")
                                                     (sort-by (comp syntax-order :name) v)
                                                     v)}))
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
     :syntax-api (make :syntax-api)
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
  (let [manual-map @cljsdoc-map
        auto-map (merge (-> result :syntax-api :symbols)
                        (-> result :library-api :symbols)
                        (-> result :compiler-api :symbols))
        all-syms (into #{} (keys (merge manual-map auto-map)))
        make-item (fn [s]
                    (let [full-name-encode (encode-fullname s)
                          {:keys [examples related] :as manual-item} (manual-map s)
                          filled? #(and (sequential? %) (pos? (count %)))]
                      {:full-name (md-escape s)
                       :ref (when (auto-map s) (str refs-dir "/" full-name-encode ".md"))
                       :cljsdoc (when manual-item (str "https://github.com/cljsinfo/api-refs/blob/master/" full-name-encode ".cljsdoc"))
                       :examples (filled? examples)
                       :related (filled? related)}))
        sort-key (fn [item]
                   (let [sym (symbol (:full-name item))]
                     [(namespace sym) (name sym)]))
        done? (fn [{:keys [ref cljsdoc examples related]}]
                (and ref cljsdoc examples related))
        symbols (->> all-syms
                     (map make-item)
                     (remove done?)
                     (sort-by sort-key))]
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
  (mkdir *output-dir*)
  (mkdir (str *output-dir* "/" refs-dir))

  (println "writing edn...")
  (dump-edn-file! result)

  (println "writing ref files...")
  (doseq [item (vals (:symbols (:syntax-api result)))]
    (dump-ref-file! item))
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

  (println "writing unfinished...")
  (dump-unfinished! result)

  )

