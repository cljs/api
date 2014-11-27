(ns core
  (:require
    [clojure.java.io :as io]
    [clojure.tools.reader :as reader]
    [clojure.tools.reader.reader-types :as readers]
    [clojure.string :refer [split-lines join]]
    [cljs.env :as env]
    [cljs.tagged-literals :refer [*cljs-data-readers*]]
    [cljs.analyzer :refer [forms-seq analyze-file]]))

;;------------------------------------------------------------
;; Form Retrieving
;;------------------------------------------------------------

;; HACK: We need to create this so the reader doesn't crash on `::ana/numeric`
;; which is used by cljs.core. (the ana namespace has to exist)
(create-ns 'ana)

(defn get-forms-from-file
  [path]
  (let [is (clojure.java.io/input-stream path)
        r1 (readers/input-stream-push-back-reader is)
        r  (readers/source-logging-push-back-reader r1 1 path)]
    (loop [forms (transient [])]
      (if-let [f (try (binding [reader/*data-readers* *cljs-data-readers*]
                        (reader/read r))
                      (catch Exception e
                        (when-not (= (.getMessage e) "EOF") (throw e))))]
        (recur (conj! forms f))
        (persistent! forms)))))

(defn get-cljs-forms
  "NOT WORKING. Here, I tried to use ClojureScript compiler's own function for
  reading a sequence of forms from a file, but I couldn't figure out how to
  create the compiler state env/*compiler*.  It seemed to be nil even when
  using env/ensure which creates a dynamic binding of *compiler*. This probably
  means it is still nil in another thread trying to access it."
  [path]
  (let [res (io/file path)]
    (env/ensure
      (forms-seq res))))

;;------------------------------------------------------------
;; Form Formatting
;;------------------------------------------------------------

(defn get-def-name
  [form]
  (let [[a b c] form
        aname (name a)]
    (when (.startsWith aname "def")
      (if (= "defmethod" aname)
        [a b c]
        [a b]))))

(defn form-data
  [form]
  (let [m (meta form)
        name- (get-def-name form)
        num-lines (inc (- (:end-line m) (:line m)))]
    (if name-
      {;:form form
       :name name-
       :lines [(:line m) (:end-line m)]
       :filename (:file m)
       :source (join "\n" (take-last num-lines (split-lines (:source m))))
       :docstring nil
       :github-link nil
       })))

;;------------------------------------------------------------
;; Symbol Retrieval
;;------------------------------------------------------------

(def paths
  "Locations for the symbols of a given namespace"
  {"cljs.core"      {:cljs {"core.cljs"   "clojurescript/src/cljs/cljs/core.cljs"
                            "core.clj"    "clojurescript/src/clj/cljs/core.clj"}
                     :clj  {"core.clj"    "clojure/src/clj/clojure/core.clj"}}
   "clojure.set"    {:cljs {"set.cljs"    "clojurescript/src/cljs/clojure/set.cljs"}}
   "clojure.string" {:cljs {"string.cljs" "clojurescript/src/cljs/clojure/string.cljs"}}})

(def repo-path "code-to-parse")

(defn get-repo-path
  [& args]
  (str repo-path "/" (get-in paths args)))

(defmulti get-symbols (fn [ns-] ns-))

(defmethod get-symbols "cljs.core" [ns-]
  (let [clj-forms      (get-forms-from-file (get-repo-path "cljs.core" :clj "core.clj"))
        clj-cljs-forms (get-forms-from-file (get-repo-path "cljs.core" :cljs "core.clj"))
        cljs-forms     (get-forms-from-file (get-repo-path "cljs.core" :cljs "core.cljs"))
        ;; TODO: get import-macros vector from cljs.core clj
        ;; TODO: read in clojure.core forms listed in import-macros vector
        ]
    (println
      "cljs.core forms:"
      (count clj-forms)
      (count clj-cljs-forms)
      (count cljs-forms))))

(defmethod get-symbols "clojure.set" [ns-]
  (let [forms (get-forms-from-file (get-repo-path "clojure.set" :cljs "set.cljs"))]
    (println
      "clojure.set forms:"
      (count forms))))

(defmethod get-symbols "clojure.string" [ns-]
  (let [forms (get-forms-from-file (get-repo-path "clojure.string" :cljs "string.cljs"))]
    (println
      "clojure.string forms:"
      (count forms))))

;;------------------------------------------------------------
;; Program Entry
;;------------------------------------------------------------

(defn -main
  []
  (get-symbols "cljs.core")
  (get-symbols "clojure.set")
  (get-symbols "clojure.string"))

