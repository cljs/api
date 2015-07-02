(ns cljs-api-gen.cljsdoc.versioned_test
  (:require
    [cljs-api-gen.cljsdoc.parse :refer [parse-doc]]
    [cljs-api-gen.cljsdoc.versioned :refer [versioned-doc]]
    [clojure.test :refer [deftest is]]))

(def example1-filename
  "cljs.core_foo.cljsdoc")

(def example1
"
===== Name
cljs.core/foo

===== Description
older

===== Description (0.0-3211)
newer

===== Moved (0.0-3308)
cljs.core/bar
")

(def example1-versioned
  {:versions {nil        {"name"        "cljs.core/foo"
                          "description" "older"}
              "0.0-3211" {"name"        "cljs.core/foo"
                          "description" "newer"}
              "0.0-3308" {"name"        "cljs.core/foo"
                          "description" "newer"
                          "moved"       "cljs.core/bar"}}
   :filename "cljs.core_foo.cljsdoc"
   :sections ["name"
              "description"
              "description (0.0-3211)"
              "moved (0.0-3308)"]
   :empty-sections #{}})

(deftest example1-test
  (let [parsed (parse-doc example1 example1-filename)
        versioned (versioned-doc parsed)]
    (is (= versioned example1-versioned))))
