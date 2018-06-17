(ns cljs-api-gen.clojure-api
  (:require
    [clansi.core :refer [style]]
    [clojure.set :refer [difference]]
    [cljs-api-gen.config :refer [cache-dir]]
    [cljs-api-gen.encode :refer [fullname->ns-name]]
    [cljs-api-gen.repo-cljs :refer [*cljs-tag* *clj-tag* ls-files clj-tag->api-key cljs-cmp]]
    [cljs-api-gen.syntax :refer [syntax-map]]
    [me.raynes.fs :refer [exists? base-name]]))

(defn get-equiv-clj-tag
  "ClojureScript 1.9.X still uses Clojure 1.8.0 for stability, but implements
  Clojure 1.9.0 API symbols. To successfully map these equivalent symbols,
  we find them in the latest Clojure 1.9.0 release, not Clojure 1.8.0."
  []
  (if (cljs-cmp >= *cljs-tag* "r1.9.14")
    "clojure-1.10.0-alpha4" ;; FIXME: replace with latest as it is updated
    *clj-tag*))

;;--------------------------------------------------------------------------------
;; Official Clojure API
;;--------------------------------------------------------------------------------

(def versions ["1.3" "1.4" "1.5" "1.6" "1.7" "1.8" "1.9" "1.10"])
(def api-namespaces (atom {}))
(def api-symbols (atom {}))

(defn api-cache [v]
  (str cache-dir "/clj-api-" v ".clj"))

(defn version-api-url [v]
  (str "https://raw.githubusercontent.com/clojure/clojure/gh-pages/index-v" v ".clj"))

(declare add-spec-alpha-api!)

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
        (swap! api-namespaces assoc v namespaces))))
  (add-spec-alpha-api!))

;;--------------------------------------------------------------------------------
;; core.spec.alpha
;;
;; This is released as a separate library from clojure core, but is bundled with cljs.
;; Thus, we have to retrieve clojure docs separately.
;;
;; Docs are not versioned yet.  first published at "0.1.144" I think
;; - docs here: https://clojure.github.io/spec.alpha/
;; - repo here: https://github.com/clojure/spec.alpha/tree/gh-pages
;;--------------------------------------------------------------------------------

(def spec-alpha-api-url
  "https://raw.githubusercontent.com/clojure/spec.alpha/d4965878d7165c6bbc66c6ba06bf27f146994249/index-0.1.144-SNAPSHOT.clj")

(def spec-alpha-cache
  (str cache-dir "/clj-spec-alpha-api.clj"))

;; versions of clojure that depend on clojure.spec.alpha
;; clojure 1.9 through 1.10-alpha4 depend on clojure.spec.alpha 0.1.143
;;  - see https://github.com/clojure/clojure/blob/clojure-1.9.0/pom.xml
;;  - see https://github.com/clojure/clojure/blob/clojure-1.10.0-alpha4/pom.xml
(def versions-with-spec-alpha
  ["1.9", "1.10"])

(def spec-alpha-namespaces (atom nil))

(defn add-spec-alpha-api! []
  (println " Adding clojure.spec.alpha...")
  (let [filename spec-alpha-cache
        url spec-alpha-api-url]
    (when-not (exists? filename)
      (spit filename (slurp url)))
    (let [data (read-string (slurp filename))
          namespaces (->> (:namespaces data)
                          (map :name)
                          set)
          symbols (->> (:vars data)
                        (map #(str (:namespace %) "/" (:name %)))
                        set)]
      (reset! spec-alpha-namespaces namespaces)
      (doseq [v versions-with-spec-alpha]
        (swap! api-symbols update v into symbols)
        (swap! api-namespaces update v into namespaces)))))

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
   "cljs.spec.alpha"      "clojure.spec.alpha"
   "cljs.spec.test.alpha" "clojure.spec.test.alpha"
   "cljs.spec.gen.alpha"  "clojure.spec.gen.alpha"})

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
  (if (@spec-alpha-namespaces ns-)
    (str "https://clojure.github.io/spec.alpha/" ns- "-api.html")
    (str "http://clojure.github.io/clojure/branch-master/" ns- "-api.html")))

;; TODO: spec.alpha docs linked from https://clojure.org/api/api are not up yet:
;; https://clojure.github.io/spec.alpha/ (<-- make ns-url link here when up)

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
