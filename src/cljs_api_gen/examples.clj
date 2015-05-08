(ns cljs-api-gen.examples
  (:refer-clojure :exclude [replace])
  (:require
    [net.cgrand.enlive-html :as html]
    [clojure.string :refer [split join replace]]
    ))


;;------------------------------------------------------------
;; Examples Scraping from clojuredocs.org
;;------------------------------------------------------------

;; for each symbol
;;  - transform symbol name to url
;;  - pull examples
;;  - write to file

(defn split-ns-symbol
  [s]
  (let [[ns- s] (split s #"/")
        s (if s s "/")] ;; if we are missing a symbol, the split expression threw out the symbol, which has to be "/".
    [ns- s]))

;; from clojuredocs:
;; https://github.com/zk/clojuredocs/blob/813caf018bc2f0681553581761c222f3f9b78d7f/src/cljx/clojuredocs/util.cljx#L58-L66
(defn cd-encode [s]
  (when s
    (cond
      (= "." s) "_."
      (= ".." s) "_.."
      :else (-> s
                (replace #"/" "_fs")
                (replace #"\\" "_bs")
                (replace #"\?" "_q")))))

(defn symbol->clojuredocs-url
  [ns- s]
  (let [ns- (-> ns-
                (replace "cljs.core" "clojure.core")
                (replace "cljs.test" "clojure.test"))
        s (cd-encode s)]
    (str "http://clojuredocs.org/" ns- "/" s)))

(defn fetch-url [url]
  (html/html-resource (java.net.URL. url)))

(defn format-example
  [example]
  (join "\n"
        ["===== Example"
         ""
         "```"
         example
         "```"
         ""]))

(defn clojuredocs-examples [url]
  (let [script-text (-> (fetch-url url) (html/select [:script]) first html/text)
        [_ m] (re-find #"window\.PAGE_DATA=(.*)" script-text)]
    (if m
      (let [data (read-string (read-string m))
            examples (map :body (:examples data))
            content (join "\n" (map format-example examples))]
        content)
      nil)))

(defn scrape-examples!
  []
  (git-docs-repo! "checkout" examples-branch)
  (let [[_latest history] (get-symbol-history)]
    (doseq [ns-and-s (sort (:symbols @history))]
      (let [[ns- s] (split-ns-symbol ns-and-s)
            filename (str docs-repo-dir "/" ns- "_" (symbol->filename s) ".cljsdoc")
            url (symbol->clojuredocs-url ns- s)
            example-content (try (clojuredocs-examples url) (catch Exception e nil))]
        (if example-content
          (do
            (println "scraping" url "... OK")
            (println "  writing to" filename)
            (spit filename example-content))
          (do
            (println "scraping" url "... FAILED")))))))

