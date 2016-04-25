## cljs.test/assert-expr



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.8.51"><img valign="middle" alt="[+] 1.8.51" title="Added in 1.8.51" src="https://img.shields.io/badge/+-1.8.51-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(assert-expr menv msg form)</samp><br>

---

 <samp>
(__assert-expr__ menv msg form)<br>
</samp>

---







Source code @ [github]():

```clj
(defmulti assert-expr 
  (fn [menv msg form]
    (cond
      (nil? form) :always-fail
      (seq? form) (first form)
      :else :default)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---

Dispatch method @ [github]():

```clj
(defmethod assert-expr :always-fail [menv msg form]
  ;; nil test: always fail
  `(cljs.test/do-report {:type :fail, :message ~msg}))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod assert-expr :default [menv msg form]
  (if (and (sequential? form)
           (function? menv (first form)))
    (assert-predicate msg form)
    (assert-any msg form)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod assert-expr 'instance? [menv msg form]
  ;; Test if x is an instance of y.
  `(let [klass# ~(nth form 1)
         object# ~(nth form 2)]
     (let [result# (instance? klass# object#)]
       (if result#
         (cljs.test/do-report
           {:type :pass, :message ~msg,
            :expected '~form, :actual (type object#)})
         (cljs.test/do-report
           {:type :fail, :message ~msg,
            :expected '~form, :actual (type object#)}))
       result#)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod assert-expr 'thrown? [menv msg form]
  ;; (is (thrown? c expr))
  ;; Asserts that evaluating expr throws an exception of class c.
  ;; Returns the exception thrown.
  (let [klass (second form)
        body (nthnext form 2)]
    `(try
       ~@body
       (cljs.test/do-report
         {:type :fail, :message ~msg,
          :expected '~form, :actual nil})
       (catch ~klass e#
         (cljs.test/do-report
           {:type :pass, :message ~msg,
            :expected '~form, :actual e#})
         e#))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod assert-expr 'thrown-with-msg? [menv msg form]
  ;; (is (thrown-with-msg? c re expr))
  ;; Asserts that evaluating expr throws an exception of class c.
  ;; Also asserts that the message string of the exception matches
  ;; (with re-find) the regular expression re.
  (let [klass (nth form 1)
        re (nth form 2)
        body (nthnext form 3)]
    `(try
       ~@body
       (cljs.test/do-report {:type :fail, :message ~msg, :expected '~form, :actual nil})
       (catch ~klass e#
         (let [m# (.-message e#)]
           (if (re-find ~re m#)
             (cljs.test/do-report
               {:type :pass, :message ~msg,
                :expected '~form, :actual e#})
             (cljs.test/do-report
               {:type :fail, :message ~msg,
                :expected '~form, :actual e#}))
           e#)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---


###### External doc links:

[`cljs.test/assert-expr` @ crossclj](http://crossclj.info/fun/cljs.test/assert-expr.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/assert-expr.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "assert-expr",
 :signature ["[menv msg form]"],
 :name-encode "assert-expr",
 :history [["+" "1.8.51"]],
 :type "multimethod",
 :full-name-encode "cljs.test/assert-expr",
 :source {:code "(defmulti assert-expr \n  (fn [menv msg form]\n    (cond\n      (nil? form) :always-fail\n      (seq? form) (first form)\n      :else :default)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/test.cljc",
          :lines [66 71],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljc#L66-L71"},
 :extra-sources ({:code "(defmethod assert-expr :always-fail [menv msg form]\n  ;; nil test: always fail\n  `(cljs.test/do-report {:type :fail, :message ~msg}))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljc",
                  :lines [73 75],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljc#L73-L75"}
                 {:code "(defmethod assert-expr :default [menv msg form]\n  (if (and (sequential? form)\n           (function? menv (first form)))\n    (assert-predicate msg form)\n    (assert-any msg form)))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljc",
                  :lines [77 81],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljc#L77-L81"}
                 {:code "(defmethod assert-expr 'instance? [menv msg form]\n  ;; Test if x is an instance of y.\n  `(let [klass# ~(nth form 1)\n         object# ~(nth form 2)]\n     (let [result# (instance? klass# object#)]\n       (if result#\n         (cljs.test/do-report\n           {:type :pass, :message ~msg,\n            :expected '~form, :actual (type object#)})\n         (cljs.test/do-report\n           {:type :fail, :message ~msg,\n            :expected '~form, :actual (type object#)}))\n       result#)))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljc",
                  :lines [83 95],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljc#L83-L95"}
                 {:code "(defmethod assert-expr 'thrown? [menv msg form]\n  ;; (is (thrown? c expr))\n  ;; Asserts that evaluating expr throws an exception of class c.\n  ;; Returns the exception thrown.\n  (let [klass (second form)\n        body (nthnext form 2)]\n    `(try\n       ~@body\n       (cljs.test/do-report\n         {:type :fail, :message ~msg,\n          :expected '~form, :actual nil})\n       (catch ~klass e#\n         (cljs.test/do-report\n           {:type :pass, :message ~msg,\n            :expected '~form, :actual e#})\n         e#))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljc",
                  :lines [97 112],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljc#L97-L112"}
                 {:code "(defmethod assert-expr 'thrown-with-msg? [menv msg form]\n  ;; (is (thrown-with-msg? c re expr))\n  ;; Asserts that evaluating expr throws an exception of class c.\n  ;; Also asserts that the message string of the exception matches\n  ;; (with re-find) the regular expression re.\n  (let [klass (nth form 1)\n        re (nth form 2)\n        body (nthnext form 3)]\n    `(try\n       ~@body\n       (cljs.test/do-report {:type :fail, :message ~msg, :expected '~form, :actual nil})\n       (catch ~klass e#\n         (let [m# (.-message e#)]\n           (if (re-find ~re m#)\n             (cljs.test/do-report\n               {:type :pass, :message ~msg,\n                :expected '~form, :actual e#})\n             (cljs.test/do-report\n               {:type :fail, :message ~msg,\n                :expected '~form, :actual e#}))\n           e#)))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljc",
                  :lines [114 134],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljc#L114-L134"}),
 :usage ["(assert-expr menv msg form)"],
 :full-name "cljs.test/assert-expr",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/assert-expr.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/assert-expr"]))
```

-->
