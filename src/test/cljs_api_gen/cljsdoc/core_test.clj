(ns cljs-api-gen.cljsdoc.core_test
  (:require
    [cljs-api-gen.cljsdoc.validate :refer [filename-error-msg signatures-error-msg]]
    [cljs-api-gen.cljsdoc.parse :refer [parse-doc]]
    [clojure.test :refer [deftest is]]))

(def example1-filename
  "cljs.core_foo.cljsdoc")

(def example1
"
ignore
this
text

===== Name
cljs.core/foo

===== Empty1
===== Empty2
===== Description

Hello
World

===== Empty3


===== Example#1
N/A

===== Example#2
N/A

===== Example#3
N/A

===== Empty4
")

(def example1-parsed
  {"name" "cljs.core/foo"
   "description" "Hello\nWorld"
   "example#1" "N/A"
   "example#2" "N/A"
   "example#3" "N/A"
   :filename "cljs.core_foo.cljsdoc"
   :sections ["name" "description" "example#1" "example#2" "example#3"]
   :empty-sections #{"empty1"
                     "empty2"
                     "empty3"
                     "empty4"}
   })

(deftest example1-test
  (let [parsed (parse-doc example1 example1-filename)]
    (is (= parsed example1-parsed))))

(deftest filename-test
  (let [msg-bad  (filename-error-msg {:full-name "cljs.core/cond*->" :filename "cljs.core_cond*->.cljsdoc"})
        msg-good (filename-error-msg {:full-name "cljs.core/cond*->" :filename "cljs.core_condSTAR-GT.cljsdoc"})]
    (is (= true (boolean msg-bad)))
    (is (= false (boolean msg-good)))))

(deftest signature-test
  (let [msg-bad  (signatures-error-msg {:signature ["[]" "a & b*" "[a b & args]"]})
        msg-good (signatures-error-msg {:signature ["[]" "[a & b]" "[a [b c] & args]"]})]
    (is (= true (boolean msg-bad)))
    (is (= false (boolean msg-good)))))
