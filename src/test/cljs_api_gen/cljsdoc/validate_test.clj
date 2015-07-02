(ns cljs-api-gen.cljsdoc.validate_test
  (:require
    [cljs-api-gen.cljsdoc.validate :refer [filename-error-msg signatures-error-msg]]
    [clojure.test :refer [deftest is]]))

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


