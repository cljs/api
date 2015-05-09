(ns cljs-api-gen.read
  (:require
    [clojure.java.io :as io]
    [clojure.tools.reader :as reader]
    [clojure.tools.reader.reader-types :as readers]
    [cljs.tagged-literals :refer [*cljs-data-readers*]]
    [me.raynes.fs :refer [exists?]]
    ))

(defn read-forms
  [r]
  (loop [forms (transient [])]
    (if-let [f (try (binding [reader/*data-readers* *cljs-data-readers*]
                      (reader/read r))
                    (catch Exception e
                      (when-not (= (.getMessage e) "EOF") (throw e))))]
      (recur (conj! forms f))
      (persistent! forms))))

(defn read-forms-from-file
  [path]
  (if-not (exists? path)
    []
    (let [is (io/input-stream path)
          r1 (readers/input-stream-push-back-reader is)
          r  (readers/source-logging-push-back-reader r1 1 path)]
      (read-forms r))))

(defn read-forms-from-str
  [s]
  (let [r (readers/string-push-back-reader s)]
    (read-forms r)))

