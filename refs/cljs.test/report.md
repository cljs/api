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


Source code @ [github]():

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

</pre>

-->

---

Dispatch method @ [github]():

```clj
(defmethod report :default [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :pass] [m]
  (inc-report-counter! :pass))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :fail] [m]
  (inc-report-counter! :fail)
  (println "\nFAIL in" (testing-vars-str m))
  (when (seq (:testing-contexts (get-current-env)))
    (println (testing-contexts-str)))
  (when-let [message (:message m)] (println message))
  (print-comparison m))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :error] [m]
  (inc-report-counter! :error)
  (println "\nERROR in" (testing-vars-str m))
  (when (seq (:testing-contexts (get-current-env)))
    (println (testing-contexts-str)))
  (when-let [message (:message m)] (println message))
  (print-comparison m))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :summary] [m]
  (println "\nRan" (:test m) "tests containing"
    (+ (:pass m) (:fail m) (:error m)) "assertions.")
  (println (:fail m) "failures," (:error m) "errors."))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :begin-test-ns] [m]
  (println "\nTesting" (name (:ns m))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :end-test-ns] [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :begin-test-var] [m]
  #_(println ":begin-test-var" (testing-vars-str m)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :end-test-var] [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :end-run-tests] [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :end-test-all-vars] [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Dispatch method @ [github]():

```clj
(defmethod report [::default :end-test-vars] [m])
```

<!--
Repo - tag - source tree - lines:

 <pre>

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
 :name-encode "report",
 :history [["+" "0.0-2496"]],
 :type "multimethod",
 :clj-equiv {:full-name "clojure.test/report",
             :url "http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/report"},
 :full-name-encode "cljs.test/report",
 :source {:code "(defmulti\n  ^{:doc \"Generic reporting function, may be overridden to plug in\n   different report formats (e.g., TAP, JUnit).  Assertions such as\n   'is' call 'report' to indicate results.  The argument given to\n   'report' will be a map with a :type key.\"\n     :dynamic true}\n  report (fn [m] [(:reporter (get-current-env)) (:type m)]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [312 318],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L312-L318"},
 :extra-sources ({:code "(defmethod report :default [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [320],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L320"}
                 {:code "(defmethod report [::default :pass] [m]\n  (inc-report-counter! :pass))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [322 323],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L322-L323"}
                 {:code "(defmethod report [::default :fail] [m]\n  (inc-report-counter! :fail)\n  (println \"\\nFAIL in\" (testing-vars-str m))\n  (when (seq (:testing-contexts (get-current-env)))\n    (println (testing-contexts-str)))\n  (when-let [message (:message m)] (println message))\n  (print-comparison m))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [330 336],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L330-L336"}
                 {:code "(defmethod report [::default :error] [m]\n  (inc-report-counter! :error)\n  (println \"\\nERROR in\" (testing-vars-str m))\n  (when (seq (:testing-contexts (get-current-env)))\n    (println (testing-contexts-str)))\n  (when-let [message (:message m)] (println message))\n  (print-comparison m))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [338 344],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L338-L344"}
                 {:code "(defmethod report [::default :summary] [m]\n  (println \"\\nRan\" (:test m) \"tests containing\"\n    (+ (:pass m) (:fail m) (:error m)) \"assertions.\")\n  (println (:fail m) \"failures,\" (:error m) \"errors.\"))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [346 349],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L346-L349"}
                 {:code "(defmethod report [::default :begin-test-ns] [m]\n  (println \"\\nTesting\" (name (:ns m))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [351 352],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L351-L352"}
                 {:code "(defmethod report [::default :end-test-ns] [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [355],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L355"}
                 {:code "(defmethod report [::default :begin-test-var] [m]\n  #_(println \":begin-test-var\" (testing-vars-str m)))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [356 357],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L356-L357"}
                 {:code "(defmethod report [::default :end-test-var] [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [358],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L358"}
                 {:code "(defmethod report [::default :end-run-tests] [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [359],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L359"}
                 {:code "(defmethod report [::default :end-test-all-vars] [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [360],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L360"}
                 {:code "(defmethod report [::default :end-test-vars] [m])",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r1.8.51",
                  :filename "src/main/cljs/cljs/test.cljs",
                  :lines [361],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/test.cljs#L361"}),
 :full-name "cljs.test/report",
 :docstring "Generic reporting function, may be overridden to plug in\n   different report formats (e.g., TAP, JUnit).  Assertions such as\n   'is' call 'report' to indicate results.  The argument given to\n   'report' will be a map with a :type key.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/report.cljsdoc"}

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
