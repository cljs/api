## cljs.spec.test/run-all-tests



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.test/run-all-tests</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.test/run-all-tests)
</td>
</tr>
</table>

<samp>(run-all-tests)</samp><br>

---

 <samp>
(__run-all-tests__)<br>
</samp>

---





Source docstring:

```
Like clojure.test/run-all-tests, but runs test.check tests
for all speced vars. Prints per-test results to *out*, and
returns a map with :test,:pass,:fail, and :error counts.
```


Source code @ [github]():

```clj
(defmacro run-all-tests
  []
  `(cljs.spec.test/run-var-tests ~(spec/speced-vars*)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec.test/run-all-tests` @ clojuredocs](http://clojuredocs.org/clojure.spec.test/run-all-tests)<br>
[`clojure.spec.test/run-all-tests` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.test/run-all-tests/)<br>
[`clojure.spec.test/run-all-tests` @ crossclj](http://crossclj.info/fun/clojure.spec.test/run-all-tests.html)<br>
[`cljs.spec.test/run-all-tests` @ crossclj](http://crossclj.info/fun/cljs.spec.test/run-all-tests.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.test/run-all-tests.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.test",
 :name "run-all-tests",
 :signature ["[]"],
 :name-encode "run-all-tests",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec.test/run-all-tests",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.test/run-all-tests"},
 :full-name-encode "cljs.spec.test/run-all-tests",
 :source {:code "(defmacro run-all-tests\n  []\n  `(cljs.spec.test/run-var-tests ~(spec/speced-vars*)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/test.cljc",
          :lines [25 30],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/test.cljc#L25-L30"},
 :usage ["(run-all-tests)"],
 :full-name "cljs.spec.test/run-all-tests",
 :docstring "Like clojure.test/run-all-tests, but runs test.check tests\nfor all speced vars. Prints per-test results to *out*, and\nreturns a map with :test,:pass,:fail, and :error counts.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.test/run-all-tests.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.test/run-all-tests"]))
```

-->
