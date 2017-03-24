(ns cljs-api-gen.read
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.java.io :as io]
    [clojure.tools.reader :as reader]
    [clojure.tools.reader.reader-types :as readers]
    [clojure.string :refer [replace]]
    [cljs.tagged-literals :refer [*cljs-data-readers*]]
    [me.raynes.fs :refer [exists?]]
    [cljs-api-gen.config :refer [repos-dir]]
    [cljs-api-gen.repo-cljs :refer [cljs-cmp]]))


;;--------------------------------------------------------------------------------
;; Read forms
;;--------------------------------------------------------------------------------

(defn read-forms
  [r]
  (loop [forms (transient [])]
    (if-let [f (try (binding [reader/*data-readers* *cljs-data-readers*]
                      (reader/read {:read-cond :allow, :features #{:clj}} r))
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
    (cljs-cmp >= "0.0-3255") "src/main/cljs"
    :else                    "src/cljs"))

(defmethod src-path :compiler
  [src-type]
  (cond
    (cljs-cmp >= "0.0-3255") "src/main/clojure"
    :else                    "src/clj"))

(defn get-ns-files
  [ns- src-type]
  (doall (filter exists?
          (let [ns-path (-> ns- (replace "." "/") (replace "-" "_"))
                src (src-path src-type)]
            (for [ext  ["clj" "cljs" "cljc"]]
              (str repos-dir "/clojurescript/" src "/" ns-path "." ext))))))

(defn read-ns-forms
  "Get all forms from given namespace into a filename -> forms map (possibly a .cljs .clj(c) pairing)"
  [ns- src-type]
  (let [filenames (get-ns-files ns- src-type)
        forms (doall (map read-forms-from-file filenames))]
    (zipmap filenames forms)))

(defn read-all-ns-forms
  "Get all forms for the given namespace (possibly concatenated from multiple files)"
  [ns- src-type]
  (apply concat (vals (read-ns-forms ns- src-type))))

(defn read-clj-core-forms
  []
  (->> ["core" "core_proxy" "core_print" "core_deftype"]
       (map #(str repos-dir "/clojure/src/clj/clojure/" % ".clj"))
       (map read-forms-from-file)
       doall))

(defn read-treader-forms
  []
  (->> ["reader.clj" "reader/impl/commons.clj"]
       (map #(str repos-dir "/tools.reader/src/main/clojure/clojure/tools/" %))
       (mapcat read-forms-from-file)
       doall))

(comment

  (require 'cljs-api-gen.read :reload)

  (require '[cljs-api-gen.repo-cljs :refer [with-version! checkout-repos!]])

  (with-version! "r927"
    (checkout-repos!)
    (get-ns-files "cljs.core" :library)))
