(ns cljs-api-gen.read
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.java.io :as io]
    [clojure.tools.reader :as reader]
    [clojure.tools.reader.reader-types :as readers]
    [clojure.string :refer [replace]]
    [cljs.tagged-literals :refer [*cljs-data-readers*]]
    [me.raynes.fs :refer [exists?]]
    [cljs-api-gen.config :refer [repo-dir]]
    [cljs-api-gen.repo-cljs :refer [*cljs-num*]]
    ))

;;--------------------------------------------------------------------------------
;; Read forms
;;--------------------------------------------------------------------------------

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

;;--------------------------------------------------------------------------------
;; Read forms from namespaces
;;--------------------------------------------------------------------------------

(defmulti src-path
  identity)

(defmethod src-path :library
  [src-type]
  (cond
    (>= *cljs-num* 3255) "src/main/cljs"
    (>= *cljs-num* 0)    "src/cljs"
    :else nil))

(defmethod src-path :compiler
  [src-type]
  (cond
    (>= *cljs-num* 3255) "src/main/clojure"
    (>= *cljs-num* 0)    "src/clj"
    :else nil))

(defn get-ns-files
  [ns- src-types]
  (doall (filter exists?
    (let [ns-path (replace ns- "." "/")]
      (for [src (map src-path src-types)
            ext  ["clj" "cljs" "cljc"]]
        (str repo-dir "/clojurescript/" src "/" ns-path "." ext))))))

(defn read-ns-forms
  [ns- k-or-ks]
  (let [src-types (if (sequential? k-or-ks) k-or-ks [k-or-ks])]
    (->> (get-ns-files ns- src-types)
         (map read-forms-from-file)
         doall)))

(defn read-clj-core-forms
  []
  (->> ["core" "core_proxy" "core_print" "core_deftype"]
       (map #(str repo-dir "/clojure/src/clj/clojure/" % ".clj"))
       (map read-forms-from-file)
       doall))

(comment

  (require 'cljs-api-gen.read :reload)

  (require '[cljs-api-gen.repo-cljs :refer [with-checkout!]])

  (with-checkout! "r927"
    (get-ns-files "cljs.core" [:library :compiler]))

)
