(ns cljs-api-gen.config)

(def cache-dir "cache")
(def cljsdoc-dir "doc")
(def cljsdoc-ext ".md")
(def repos-dir "repos")

(defn edn-parsed-file [v] (str v ".edn"))
(defn edn-result-file [v] (str "cljs-api.edn"))
