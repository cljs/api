(ns cljs-api-gen.cljsdoc.versioned_test
  (:require
    [clojure.data :refer [diff]]
    [clojure.pprint :refer [pprint]]
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

===== Example#1
1

===== Example#2
2

===== Example#1 (0.0-3211)
1 - 3211

===== Example#3 (0.0-3308)
3 - 3308
")

(def example1-versioned
  {:docs {nil        {"name"        "cljs.core/foo"
                      "description" "older"
                      "example#1"   "1"
                      "example#2"   "2"
                      :sections ["name" "description" "example#1" "example#2"]}
          "0.0-3211" {"name"        "cljs.core/foo"
                      "description" "newer"
                      "example#1"   "1 - 3211"
                      "example#2"   "2"
                      :sections ["name" "description" "example#2" "example#1"]}
          "0.0-3308" {"name"        "cljs.core/foo"
                      "description" "newer"
                      "moved"       "cljs.core/bar"
                      "example#1"   "1 - 3211"
                      "example#2"   "2"
                      "example#3"   "3 - 3308"
                      :sections ["name" "description" "moved" "example#2" "example#1" "example#3"]}}
   :versions [nil "0.0-3211" "0.0-3308"]
   :filename "cljs.core_foo.cljsdoc"
   :sections ["name"
              "description"
              "description (0.0-3211)"
              "moved (0.0-3308)"
              "example#1"
              "example#2"
              "example#1 (0.0-3211)"
              "example#3 (0.0-3308)"]
   :empty-sections #{}})

(deftest example1-test
  (let [parsed (parse-doc example1 example1-filename)
        versioned (versioned-doc parsed)]
    (is (= versioned example1-versioned))))
