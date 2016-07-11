(ns cljs-api-gen.config)

(def docfile-dir "docfiles")
(def docfile-ext ".md")

(def cache-dir "cache")
(def repos-dir "repos")

(defn edn-parsed-file [v] (str v ".edn"))
(defn edn-result-file [v] (str "cljs-api.edn"))
