(ns cljs-api-gen.config)

(def docfile-dir "docfiles")
(def docfile-ext ".md")

(def cache-dir "cache")
(def repos-dir "repos")

(def clj-maven-file (str cache-dir "/clj-maven.json"))
(def cljs-maven-file (str cache-dir "/cljs-maven.json"))

(defn edn-parsed-file [v] (str v ".edn"))
(defn edn-result-file [v] (str "cljs-api.edn"))
