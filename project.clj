(defproject cljs-api-gen "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [org.clojure/tools.reader "0.8.12"]
                 [org.clojure/core.match "0.2.2"]
                 [me.raynes/fs "1.4.6"]
                 [narkisr/clansi "1.2.0"]
                 [fipp "0.6.1"]
                 [stencil "0.3.5"]
                 [org.clojure/java.jdbc "0.3.7"]
                 [org.xerial/sqlite-jdbc "3.8.10.1"]]
  :main cljs-api-gen.core)
