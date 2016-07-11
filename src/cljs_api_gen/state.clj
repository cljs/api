(ns cljs-api-gen.state)

(def ^:dynamic *result*
  "After catalog is done building the result, it stores it here."
  nil)

(def docfile-map
  "Holds fullname=>docfile data after first-pass"
  (atom nil))
