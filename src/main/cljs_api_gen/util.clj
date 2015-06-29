(ns cljs-api-gen.util
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.string :refer [replace]]
    ))

(defn split-ns-and-name
  [s]
  ((juxt namespace name) (symbol s)))

(defn mapmap
  "Apply a map function over the values of a map, returning a map."
  [mapf datamap]
  (let [[ks vs] ((juxt keys vals) datamap)
        result (zipmap ks (map mapf vs))]
    result))

(defn sym-sort-key
  "Allows sorting symbols by namespace and then name.
  Example: (sort-by sym-sort-key syms)"
  [s]
  (let [sym (symbol s)]
    [(namespace sym) (name sym)]))
