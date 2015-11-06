## cljs.test/report



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/report</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/report)
</td>
</tr>
</table>







Source docstring:

```
Generic reporting function, may be overridden to plug in
   different report formats (e.g., TAP, JUnit).  Assertions such as
   'is' call 'report' to indicate results.  The argument given to
   'report' will be a map with a :type key.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L302-L308):

```clj
(defmulti
  ^{:doc "Generic reporting function, may be overridden to plug in
   different report formats (e.g., TAP, JUnit).  Assertions such as
   'is' call 'report' to indicate results.  The argument given to
   'report' will be a map with a :type key."
     :dynamic true}
  report (fn [m] [(:reporter (get-current-env)) (:type m)]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:302-308](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L302-L308)</ins>
</pre>

-->

---

Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L310):

```clj
(defmethod report :default [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:310](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L310)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L312-L313):

```clj
(defmethod report [::default :pass] [m]
  (inc-report-counter! :pass))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:312-313](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L312-L313)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L315-L322):

```clj
(defmethod report [::default :fail] [m]
  (inc-report-counter! :fail)
  (println "\nFAIL in" (testing-vars-str m))
  (when (seq (:testing-contexts (get-current-env)))
    (println (testing-contexts-str)))
  (when-let [message (:message m)] (println message))
  (println "expected:" (pr-str (:expected m)))
  (println "  actual:" (pr-str (:actual m))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:315-322](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L315-L322)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L324-L331):

```clj
(defmethod report [::default :error] [m]
  (inc-report-counter! :error)
  (println "\nERROR in" (testing-vars-str m))
  (when (seq (:testing-contexts (get-current-env)))
    (println (testing-contexts-str)))
  (when-let [message (:message m)] (println message))
  (println "expected:" (pr-str (:expected m)))
  (print "  actual: ") (prn (:actual m)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:324-331](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L324-L331)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L333-L336):

```clj
(defmethod report [::default :summary] [m]
  (println "\nRan" (:test m) "tests containing"
    (+ (:pass m) (:fail m) (:error m)) "assertions.")
  (println (:fail m) "failures," (:error m) "errors."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:333-336](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L333-L336)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L338-L339):

```clj
(defmethod report [::default :begin-test-ns] [m]
  (println "\nTesting" (name (:ns m))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:338-339](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L338-L339)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L342):

```clj
(defmethod report [::default :end-test-ns] [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:342](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L342)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L343-L344):

```clj
(defmethod report [::default :begin-test-var] [m]
  #_(println ":begin-test-var" (testing-vars-str m)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:343-344](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L343-L344)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L345):

```clj
(defmethod report [::default :end-test-var] [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:345](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/test.cljs#L345)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.test/report` @ clojuredocs](http://clojuredocs.org/clojure.test/report)<br>
[`clojure.test/report` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/report/)<br>
[`clojure.test/report` @ crossclj](http://crossclj.info/fun/clojure.test/report.html)<br>
[`cljs.test/report` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/report.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/report.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "report",
 :history [["+" "0.0-2496"]],
 :type "multimethod",
 :full-name-encode "cljs.test/report",
 :source {:code "(defmulti\n  ^{:doc \"Generic reporting function, may be overridden to plug in\n   different report formats (e.g., TAP, JUnit).  Assertions such as\n   'is' call 'report' to indicate results.  The argument given to\n   'report' will be a map with a :type key.\"\n     :dynamic true}\n  report (fn [m] [(:reporter (get-current-env)) (:type m)]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/test.cljs",
          :lines [302 308]},
 :extra-sources ({:code "(defmethod report :default [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [310]}
                 {:code "(defmethod report [::default :pass] [m]\n  (inc-report-counter! :pass))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [312 313]}
                 {:code "(defmethod report [::default :fail] [m]\n  (inc-report-counter! :fail)\n  (println \"\\nFAIL in\" (testing-vars-str m))\n  (when (seq (:testing-contexts (get-current-env)))\n    (println (testing-contexts-str)))\n  (when-let [message (:message m)] (println message))\n  (println \"expected:\" (pr-str (:expected m)))\n  (println \"  actual:\" (pr-str (:actual m))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [315 322]}
                 {:code "(defmethod report [::default :error] [m]\n  (inc-report-counter! :error)\n  (println \"\\nERROR in\" (testing-vars-str m))\n  (when (seq (:testing-contexts (get-current-env)))\n    (println (testing-contexts-str)))\n  (when-let [message (:message m)] (println message))\n  (println \"expected:\" (pr-str (:expected m)))\n  (print \"  actual: \") (prn (:actual m)))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [324 331]}
                 {:code "(defmethod report [::default :summary] [m]\n  (println \"\\nRan\" (:test m) \"tests containing\"\n    (+ (:pass m) (:fail m) (:error m)) \"assertions.\")\n  (println (:fail m) \"failures,\" (:error m) \"errors.\"))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [333 336]}
                 {:code "(defmethod report [::default :begin-test-ns] [m]\n  (println \"\\nTesting\" (name (:ns m))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [338 339]}
                 {:code "(defmethod report [::default :end-test-ns] [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [342]}
                 {:code "(defmethod report [::default :begin-test-var] [m]\n  #_(println \":begin-test-var\" (testing-vars-str m)))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [343 344]}
                 {:code "(defmethod report [::default :end-test-var] [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/cljs/cljs/test.cljs",
                  :lines [345]}),
 :full-name "cljs.test/report",
 :clj-symbol "clojure.test/report",
 :docstring "Generic reporting function, may be overridden to plug in\n   different report formats (e.g., TAP, JUnit).  Assertions such as\n   'is' call 'report' to indicate results.  The argument given to\n   'report' will be a map with a :type key."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/report"]))
```

-->
