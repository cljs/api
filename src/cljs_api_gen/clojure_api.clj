(ns cljs-api-gen.clojure-api
  (:require
    [clojure.set :refer [difference]]
    [cljs-api-gen.repo-cljs :refer [*clj-tag* ls-files]]
    [me.raynes.fs :refer [base-name]]
    ))

(defn clj-tag->api-key [tag]
  (second (re-find #"clojure-(\d\.\d)" tag)))

(def versions ["1.3" "1.4" "1.5" "1.6" "1.7"])
(def api-symbols (atom {}))

(defn version-api-url [v]
  (str "https://raw.githubusercontent.com/clojure/clojure/gh-pages/index-v" v ".clj"))

(defn get-version-apis! []
  (doseq [v versions]
    (println "Retrieving clojure" v "API...")
    (let [data (read-string (slurp (version-api-url v)))
          symbols (->> (:vars data)
                       (map #(str (:namespace %) "/" (:name %)))
                       set)]
      (swap! api-symbols assoc v symbols))))

(def lang-symbols (atom {}))
(def lang-path "src/jvm/clojure/lang/")
(defn get-lang-symbols! [tag]
  (if-let [symbols (@lang-symbols tag)]
    symbols
    (let [symbols (->> (ls-files "clojure" tag lang-path)
                       (filter #(.endsWith % ".java"))
                       (map #(str "clojure.lang/" (base-name % true)))
                       set)]
      (swap! lang-symbols assoc tag symbols)
      symbols)))

(def cljs-ns->clj
  {"cljs.core"   "clojure.core"
   "cljs.pprint" "clojure.pprint"
   "cljs.test"   "clojure.test"
   "cljs.repl"   "clojure.repl"
   "special"     "clojure.core"
   "specialrepl" "clojure.core"
   })

(def cljs-full-name->clj
  {"cljs.core/*clojurescript-version*"  "clojure.core/*clojure-version*"
   "cljs.reader/read-string"            "clojure.core/read-string"
   "cljs.reader/read"                   "clojure.core/read"
   "cljs.analyzer.api/all-ns"           "clojure.core/all-ns"
   "cljs.analyzer.api/find-ns"          "clojure.core/find-ns"
   "cljs.analyzer.api/ns-interns"       "clojure.core/ns-interns"
   "cljs.analyzer.api/ns-publics"       "clojure.core/ns-publics"
   "cljs.analyzer.api/ns-resolve"       "clojure.core/ns-resolve"
   "cljs.analyzer.api/remove-ns"        "clojure.core/remove-ns"
   "cljs.analyzer.api/resolve"          "clojure.core/resolve"
   })

(defn clj-lookup-name
  [item]
  (if (and (= "cljs.core" (:ns item))
           (#{"type" "protocol"} (:type item)))
    (str "clojure.lang/" (:name item))
    (if-let [clj-full-name (cljs-full-name->clj (:full-name item))]
      clj-full-name
      (if-let [clj-ns (cljs-ns->clj (:ns item))]
        (str clj-ns "/" (:name item))
        (:full-name item)))))

(defn attach-clj-symbol
  [item]
  (let [clj-symbol? (get @api-symbols (clj-tag->api-key *clj-tag*))
        lang-symbol? (get-lang-symbols! *clj-tag*)
        lookup-name (clj-lookup-name item)]
    (if (or (lang-symbol? lookup-name) (clj-symbol? lookup-name))
      (assoc item :clj-symbol lookup-name)
      item)))

(defn get-clojure-symbols-not-in-items
  [items]
  (let [clj-symbols (get @api-symbols (clj-tag->api-key *clj-tag*))
        cljs-symbols (set (map clj-lookup-name items))]
    (difference clj-symbols cljs-symbols)))

