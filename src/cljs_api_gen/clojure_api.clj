(ns cljs-api-gen.clojure-api
  (:require
    [cljs-api-gen.repo-cljs :refer [*clj-tag*]]
    ))

(defn clj-tag->doc-version [tag]
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
                       (apply hash-set))]
      (swap! api-symbols assoc v symbols))))

(def cljs-ns->clj
  {"cljs.core"   "clojure.core"
   "cljs.pprint" "clojure.pprint"
   "cljs.test"   "clojure.test"
   "special"     "clojure.core"
   "specialrepl" "clojure.core"
   })

(defn attach-clj-symbol
  [item]
  (let [version     (clj-tag->doc-version *clj-tag*)
        clj-symbol? (get @api-symbols version)
        clj-ns      (or (get cljs-ns->clj (:ns item)) (:ns item))
        lookup-name (str clj-ns "/" (:name item))]
    (if (clj-symbol? lookup-name)
      (assoc item :clj-symbol lookup-name)
      item)))

(defn attach-clj-symbol-to-items
  [items]
  (map attach-clj-symbol items))

