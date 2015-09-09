(ns cljs-api-gen.display
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.string :refer [join replace split trim]]
    [cljs-api-gen.syntax :refer [syntax-order]]
    [cljs-api-gen.encode :refer [fullname->ns-name]]
    ))

;;;  A 'pseudo-namespace' (e.g. special, specialrepl, syntax) shouldn't be
;;;  displayed to the reader since its only purpose is to help consistent
;;;  categorization of symbols for the generator.

(defn- full-name->item
  [full-name]
  (let [[ns- name-] (fullname->ns-name full-name)]
    {:full-name full-name
     :ns ns-
     :name name-}))

(defn get-short-display-name
  "Create a short display name for the given item if it has a pseudo-namespace."
  [item]
  (let [item (cond-> item (string? item) full-name->item)]
    (or (:display item)
        (:name item)
        (:ns item) ;; <-- for standalone namespace names
        )))

(defn get-full-display-name
  "Create a full display name for the given item if it has a pseudo-namespace."
  [item]
  (let [item (cond-> item (string? item) full-name->item)]
    (or (:display item)
        (cond
          (= "special" (:ns item)) (:name item)
          (= "specialrepl" (:ns item)) (str (:name item) " (repl)")
          :else (:full-name item)))))

(defn get-ns-display-name
  ([ns-] (get-ns-display-name ns- nil))
  ([ns- api-type]
   (cond
     (= "special" ns-) "special forms"
     (= "specialrepl" ns-) "special forms (repl)"
     (= "syntax" ns-) "syntax forms"
     (= "cljs.repl" ns-) (str ns- " (" (name api-type) ")")
     :else ns-)))

;;----------------------------------------------------------------------
;; Sorting
;;----------------------------------------------------------------------

(defn sym-sort-key
  "Allows sorting symbols by namespace and then name.
  Example: (sort-by sym-sort-key syms)"
  [s]
  (let [sym (symbol s)]
    [(namespace sym) (name sym)]))

(def ns-order
  {"syntax" 0
   "special" 1
   "specialrepl" 2
   "cljs.core" 3
   "cljs.js" 4})

(defn compare-ns
  "Compare two namespaces using our custom namespace order"
  [a b]
  (let [ai (get ns-order a)
        bi (get ns-order b)]
    (cond
      (and (nil? ai) (nil? bi)) (compare a b)
      (nil? ai) 1
      (nil? bi) -1
      :else (compare ai bi))))

(defn sym-compare
  "Compare two ns-name pairs, using our custom namespace order"
  [[a-ns a-name]
   [b-ns b-name]]
  (let [ns-result (compare-ns a-ns b-ns)
        name-result (compare a-name b-name)]
    (if-not (zero? ns-result)
      ns-result
      (if (= "syntax" a-ns b-ns)
        (compare (syntax-order a-name)
                 (syntax-order b-name))
        name-result))))

(defn sort-symbols
  "Sort the collection using our custom namespace order,
  and use a sort-key if supplied."
  ([coll] (sort-symbols identity coll))
  ([key-fn coll]
   (sort-by
     #(sym-sort-key (key-fn %))
     sym-compare
     coll)))

