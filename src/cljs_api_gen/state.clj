(ns cljs-api-gen.state)

(def ^:dynamic *result*
  "After catalog is done building the result, it stores it here."
  nil)

(def ^:dynamic *docfiles*
  "Parsed docfiles, mapping fullname -> data"
  nil)
