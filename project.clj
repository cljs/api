(defproject cljs-api-gen "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [org.clojure/tools.reader "0.9.2"]
                 [org.clojure/core.match "0.2.2"]
                 [org.clojure/data.json "0.2.6"]
                 [me.raynes/fs "1.4.6"]
                 [narkisr/clansi "1.2.0"]
                 [fipp "0.6.1"]
                 [stencil "0.3.5"]
                 [org.clojure/java.jdbc "0.3.7"]
                 [org.xerial/sqlite-jdbc "3.8.10.1"]
                 [ccfontes/fuzzy-matcher "0.0.1"]
                 [clj-time "0.9.0"]
                 [clojure-watch "0.1.11"]]


  :source-paths ["src/main"]
  :test-paths ["src/test"]

  :main cljs-api-gen.core)
