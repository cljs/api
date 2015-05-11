(ns cljs-api-gen.read
  (:require
    [clojure.java.io :as io]
    [clojure.tools.reader :as reader]
    [clojure.tools.reader.reader-types :as readers]
    [cljs.tagged-literals :refer [*cljs-data-readers*]]
    [me.raynes.fs :refer [exists?]]
    [cljs-api-gen.config :refer [repo-dir
                                 *cljs-num*]]
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
    (=> *cljs-num* 3255) "src/main/cljs"
    (=> *cljs-num* 0)    "src/cljs"
    :else nil))

(defmethod src-path :compiler
  [src-type]
  (cond
    (=> *cljs-num* 3255) "src/main/clojure"
    (=> *cljs-num* 0)    "src/clj"
    :else nil))

(defn get-ns-files
  [ns- src-types]
  (filter exists?
    (let [ns-path (replace ns- "." "/")]
      (for [src (map src-path src-types)
            ext  ["clj" "cljs" "cljc"]]
        (str repo-dir "/clojurescript/" src "/" ns-path "." ext)))))

(defn read-ns-forms
  [ns- src-types]
  (->> (get-ns-files ns- src-types)
       (mapcat read-forms-from-file)))

(defn read-clj-core-forms
  []
  (->> ["core" "core_proxy" "core_print" "core_deftype"]
       (map #(str repo-dir "/clojure/src/clj/clojure/" % ".clj"))
       (mapcat read-forms-from-file)))

