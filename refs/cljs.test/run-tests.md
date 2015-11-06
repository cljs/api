## cljs.test/run-tests



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/run-tests</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/run-tests)
</td>
</tr>
</table>


 <samp>
(__run-tests__)<br>
</samp>
 <samp>
(__run-tests__ env-or-ns)<br>
</samp>
 <samp>
(__run-tests__ env-or-ns & namespaces)<br>
</samp>

---





Source docstring:

```
Runs all tests in the given namespaces; prints results.
Defaults to current namespace if none given.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3030/src/clj/cljs/test.clj#L281-L290):

```clj
(defmacro run-tests
  ([] `(run-tests (cljs.test/empty-env) '~ana/*cljs-ns*))
  ([env-or-ns]
   (if (ns? env-or-ns)
     `(run-tests (cljs.test/empty-env) ~env-or-ns)
     `(run-tests ~env-or-ns '~ana/*cljs-ns*)))
  ([env-or-ns & namespaces]
   `(cljs.test/run-block (run-tests-block ~env-or-ns ~@namespaces))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3030
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:281-290](https://github.com/clojure/clojurescript/blob/r3030/src/clj/cljs/test.clj#L281-L290)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/run-tests` @ clojuredocs](http://clojuredocs.org/clojure.test/run-tests)<br>
[`clojure.test/run-tests` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/run-tests/)<br>
[`clojure.test/run-tests` @ crossclj](http://crossclj.info/fun/clojure.test/run-tests.html)<br>
[`cljs.test/run-tests` @ crossclj](http://crossclj.info/fun/cljs.test/run-tests.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/run-tests.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "run-tests",
 :signature ["[]" "[env-or-ns]" "[env-or-ns & namespaces]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test/run-tests",
 :source {:code "(defmacro run-tests\n  ([] `(run-tests (cljs.test/empty-env) '~ana/*cljs-ns*))\n  ([env-or-ns]\n   (if (ns? env-or-ns)\n     `(run-tests (cljs.test/empty-env) ~env-or-ns)\n     `(run-tests ~env-or-ns '~ana/*cljs-ns*)))\n  ([env-or-ns & namespaces]\n   `(cljs.test/run-block (run-tests-block ~env-or-ns ~@namespaces))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/clj/cljs/test.clj",
          :lines [281 290]},
 :full-name "cljs.test/run-tests",
 :clj-symbol "clojure.test/run-tests",
 :docstring "Runs all tests in the given namespaces; prints results.\nDefaults to current namespace if none given."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/run-tests"]))
```

-->
