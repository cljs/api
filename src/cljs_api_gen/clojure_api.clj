(ns cljs-api-gen.clojure-api
  (:require
    [clansi.core :refer [style]]
    [clojure.set :refer [difference]]
    [cljs-api-gen.config :refer [cache-dir]]
    [cljs-api-gen.encode :refer [fullname->ns-name]]
    [cljs-api-gen.repo-cljs :refer [*cljs-tag* *clj-tag* ls-files clj-tag->api-key]]
    [cljs-api-gen.syntax :refer [syntax-map]]
    [me.raynes.fs :refer [exists? base-name]]))

(defn get-equiv-clj-tag
  "At ClojureScript 1.9.14, the bundled Clojure version was still 1.8, but
  cljs.spec was ported from clojure.spec in Clojure 1.9 alpha.  Thus, we must
  consider that the equivalent (clj-equiv) Clojure API version may be different
  from *clj-tag*."
  []
  (let [tags {"r1.9.14" "clojure-1.9.0-alpha4"}]
    (or (tags *cljs-tag*)
        *clj-tag*)))

;;--------------------------------------------------------------------------------
;; Official Clojure API
;;--------------------------------------------------------------------------------

(def versions ["1.3" "1.4" "1.5" "1.6" "1.7" "1.8" "1.9"])
(def api-namespaces (atom {}))
(def api-symbols (atom {}))

(defn api-cache [v]
  (str cache-dir "/clj-api-" v ".clj"))

(defn version-api-url [v]
  (str "https://raw.githubusercontent.com/clojure/clojure/gh-pages/index-v" v ".clj"))

(defn get-version-apis! []
  (println (style "\nRetrieving Clojure API files...\n" :cyan))
  (doseq [v versions]
    (println " Clojure" v "API...")
    (let [cache-filename (api-cache v)]
      (when-not (exists? cache-filename)
        (spit cache-filename (slurp (version-api-url v))))
      (let [data (read-string (slurp cache-filename))
            namespaces (->> (:namespaces data)
                            (map :name)
                            set)
            symbols (->> (:vars data)
                         (map #(str (:namespace %) "/" (:name %)))
                         set)]
        (swap! api-symbols assoc v symbols)
        (swap! api-namespaces assoc v namespaces)))))

;;--------------------------------------------------------------------------------
;; Clojure's Types and Protocols
;;
;;  - `clojure.lang` namespace (non-public)
;;  - `clojure.lang.PersistentQueue/EMPTY` has to be used to create queues,
;;    so might as well bring all the types in and relate them to the cljs
;;--------------------------------------------------------------------------------

(def lang-symbols->parent
  "These clojure.lang symbols don't have their own file.
  They belong in the files named after their respective mapped values."

  {"ArrayNode"                "PersistentHashMap"
   "BitmapIndexedNode"        "PersistentHashMap"
   "EmptyList"                "PersistentList"

   "HashCollisionNode"        "PersistentHashmap"
   "KeySeq"                   "APersistentMap"
   "RSeq"                     "APersistentVector"
   "ValSeq"                   "APersistentMap"
   "NodeSeq"                  "PersistentHashMap"
   "ChunkedSeq"               "PersistentVector"

   "TransientArrayMap"        "PersistentArrayMap"
   "TransientHashMap"         "PersistentHashMap"
   "TransientHashSet"         "PersistentHashSet"
   "TransientVector"          "PersistentVector"

   "BitmapIndexedNode.EMPTY"  "PersistentHashMap"
   "PersistentList.EMPTY"     "PersistentList"
   "PersistentArrayMap.EMPTY" "PersistentArrayMap"
   "PersistentHashMap.EMPTY"  "PersistentHashMap"
   "PersistentHashSet.EMPTY"  "PersistentHashSet"
   "PersistentQueue.EMPTY"    "PersistentQueue"
   "PersistentTreeMap.EMPTY"  "PersistentTreeMap"
   "PersistentTreeSet.EMPTY"  "PersistentTreeSet"
   "PersistentVector.EMPTY"   "PersistentVector"})


(def lang-symbols (atom {}))
(def lang-path "src/jvm/clojure/lang/")
(defn get-lang-symbols! [tag]
  (if-let [symbols (@lang-symbols tag)]
    symbols
    (let [ns- "clojure.lang"
          symbols (->> (ls-files "clojure" tag lang-path)
                       (filter #(.endsWith % ".java"))
                       (map #(str ns- "/" (base-name % true)))
                       (concat (map #(str ns- "/" %) (keys lang-symbols->parent)))
                       set)]
      (swap! lang-symbols assoc tag symbols)
      symbols)))

;;--------------------------------------------------------------------------------
;; ClojureScript -> Clojure name mapping
;;--------------------------------------------------------------------------------

(def cljs-ns->clj
  {"cljs.core"   "clojure.core"
   "cljs.pprint" "clojure.pprint"
   "cljs.test"   "clojure.test"
   "cljs.repl"   "clojure.repl"
   "cljs.spec"   "clojure.spec"
   "cljs.spec.test" "clojure.spec.test"
   "cljs.spec.impl.gen" "clojure.spec.gen"})


(def cljs-full-name->clj
  "cljs symbols that map to different clj names."

  {;; library
   "cljs.core/*clojurescript-version*"  "clojure.core/*clojure-version*"
   "cljs.reader/read-string"            "clojure.core/read-string"
   "cljs.reader/read"                   "clojure.core/read"

   ;; compiler
   "cljs.analyzer.api/all-ns"           "clojure.core/all-ns"
   "cljs.analyzer.api/find-ns"          "clojure.core/find-ns"
   "cljs.analyzer.api/ns-interns"       "clojure.core/ns-interns"
   "cljs.analyzer.api/ns-publics"       "clojure.core/ns-publics"
   "cljs.analyzer.api/ns-resolve"       "clojure.core/ns-resolve"
   "cljs.analyzer.api/remove-ns"        "clojure.core/remove-ns"
   "cljs.analyzer.api/resolve"          "clojure.core/resolve"

   ;; protocols
   "cljs.core/IAssociative"             "clojure.lang/Associative"
   "cljs.core/ICounted"                 "clojure.lang/Counted"
   "cljs.core/IIndexed"                 "clojure.lang/Indexed"
   "cljs.core/IList"                    "clojure.lang/IPersistentList"
   "cljs.core/INamed"                   "clojure.lang/Named"
   "cljs.core/IReversible"              "clojure.lang/Reversible"
   "cljs.core/ISeqable"                 "clojure.lang/Seqable"
   "cljs.core/ISequential"              "clojure.lang/Sequential"
   "cljs.core/ISet"                     "clojure.lang/IPersistentSet"
   "cljs.core/ISorted"                  "clojure.lang/Sorted"
   "cljs.core/IStack"                   "clojure.lang/IPersistentStack"
   "cljs.core/IVector"                  "clojure.lang/IPersistentVector"

   ;; types
   "cljs.core/List"                     "clojure.lang/PersistentList"
   "cljs.core/SeqIter"                  "clojure.lang/SeqIterator"

   ;; member attributes
   "cljs.core/List.EMPTY"               "clojure.lang/PersistentList.EMPTY"})

(def clj-ns->page-ns
  {"clojure.core.reducers" "clojure.core"
   "clojure.spec.test" "clojure.spec"
   "clojure.spec.gen" "clojure.spec"})

(defn ns-url [ns-]
  (str "http://clojure.github.io/clojure/branch-master/" ns- "-api.html"))

(defn clj-lookup-name
  "Map a parsed ClojureScript item to a related Clojure name to be looked up for resolution."
  [item]
  (or ;; use custom name mapping if found
      (cljs-full-name->clj (:full-name item))

      ;; map to clojure.lang namespace
      (when (and (= "cljs.core" (:ns item))
                 (or (:parent-type item)
                     (#{"type" "protocol"} (:type item))))
        (str "clojure.lang/" (:name item)))

      ;; use custom namespace mapping if found
      (when-let [clj-ns (cljs-ns->clj (:ns item))]
        (str clj-ns "/" (:name item)))

      ;; default to use full name unmodified
      (:full-name item)))

(defn get-clj-symbol-url
  [ns- name-]
  (let [full-name (str ns- "/" name-)]
    (or
        ;; get clojure.lang link
        (when (= "clojure.lang" ns-)
          (let [name- (or (lang-symbols->parent name-) name-)]
            (str "https://github.com/clojure/clojure/blob/" (get-equiv-clj-tag) "/src/jvm/clojure/lang/" name- ".java")))

        ;; get official clojure api link
        (let [ns- (or (clj-ns->page-ns ns-) ns-)]
          (str (ns-url ns-) "#" full-name)))))

(defn get-clj-ns-url
  [ns-]
  (if-let [page-ns (clj-ns->page-ns ns-)]
    (str (ns-url page-ns) "#" ns-)
    (ns-url ns-)))

(defn get-clj-url
  [full-name]
  (let [[ns- name-] (fullname->ns-name full-name)]
    (if (nil? name-)
      (get-clj-ns-url ns-)
      (get-clj-symbol-url ns- name-))))

(defn get-clj-symbol-equiv
  [item]
  (let [clj-tag (get-equiv-clj-tag)
        clj-version (clj-tag->api-key clj-tag)
        clj-symbol? (get @api-symbols clj-version)
        lang-symbol? (get-lang-symbols! clj-tag)
        clj-sym (clj-lookup-name item)
        exists? (or (lang-symbol? clj-sym)
                    (clj-symbol? clj-sym))]
    (when exists?
      clj-sym)))

(defn get-clj-ns-equiv
  [item]
  (let [clj-tag (get-equiv-clj-tag)
        clj-version (clj-tag->api-key clj-tag)
        clj-ns? (get @api-namespaces clj-version)
        ns- (:ns item)
        clj-ns (or (cljs-ns->clj ns-) ns-)
        exists? (clj-ns? clj-ns)]
    (when exists?
      clj-ns)))

(defn clj-equiv
  [item]
  (when-let [equiv-name (if (= "namespace" (:type item))
                          (get-clj-ns-equiv item)
                          (get-clj-symbol-equiv item))]
    {:full-name equiv-name
     :url (get-clj-url equiv-name)}))

(defn get-clojure-symbols-not-in-items
  [items]
  (let [clj-tag (get-equiv-clj-tag)
        clj-symbols (into (get @api-symbols (clj-tag->api-key clj-tag))
                          (get @lang-symbols clj-tag))
        cljs-symbols (set (map clj-lookup-name items))]
    (difference clj-symbols cljs-symbols)))
