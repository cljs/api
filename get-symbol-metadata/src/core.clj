(ns core
  (:require
    [clojure.java.io :as io]
    [clojure.tools.reader :as reader]
    [clojure.tools.reader.reader-types :as rt]
    [clojure.string :refer [split-lines join]]))

;;------------------------------------------------------------
;; Form Retrieving
;;------------------------------------------------------------

(defn get-forms-from-file
  [path]
  (let [is (clojure.java.io/input-stream path)
        r1 (rt/input-stream-push-back-reader is)
        r  (rt/source-logging-push-back-reader r1 1 path)]
    (loop [forms (transient [])]
      (if-let [f (try (reader/read r)
                      (catch Exception e
                        (when-not (= (.getMessage e) "EOF") (throw e))))]
        (recur (conj! forms f))
        (persistent! forms)))))

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

(def namespace-locations
  {"cljs.core" {:cljs {"core.cljs" "clojurescript/src/cljs/cljs/core.cljs"
                       "core.clj"  "clojurescript/src/clj/cljs/core.clj"}
                :clj {"core.clj" "clojure/src/clj/clojure/core.clj"}}
   "clojure.set" {:cljs {"set.cljs" "clojurescript/src/cljs/clojure/set.cljs"}}
   "clojure.string" {:cljs {"string.cljs" "clojurescript/src/cljs/clojure/string.cljs"}}})

(defmulti get-symbols (fn [ns-] ns-))

(defmethod get-symbols "cljs.core" [ns-]
  ;; get clojure.core forms
  ;; get cljs.core clj forms
  ;; get import-macros vector from cljs.core clj
  ;; read in clojure.core forms listed in import-macros vector
  ;; get cljs.core cljs forms
  nil)

(defmethod get-symbols "clojure.set" [ns-]
  nil)

(defmethod get-symbols "clojure.string" [ns-]
  nil)

;;------------------------------------------------------------
;; Program Entry
;;------------------------------------------------------------

(defn -main
  []
  nil)
