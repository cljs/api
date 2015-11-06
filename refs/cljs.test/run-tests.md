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
Defaults to current namespace if none given.  Returns a map
summarizing test results.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/test.clj#L228-L263):

```clj
(defmacro run-tests
  ([] `(run-tests (cljs.test/empty-env) '~ana/*cljs-ns*))
  ([env-or-ns]
   (if (ns? env-or-ns)
     `(run-tests (cljs.test/empty-env) ~env-or-ns)
     `(run-tests ~env-or-ns '~ana/*cljs-ns*)))
  ([env-or-ns & namespaces]
   (assert (every?
             (fn [[quote ns]] (and (= quote 'quote) (symbol? ns)))
             namespaces)
     "All arguments to run-tests must be quoted symbols")
   (let [is-ns (ns? env-or-ns)]
     `(do
        ~(if is-ns
           `(cljs.test/set-env! (cljs.test/empty-env))
           `(cljs.test/set-env! ~env-or-ns))
        ;; TODO: support async - David
        (let [summary# (assoc
                         (reduce
                           (fn [acc# res#]
                             (merge-with +
                               acc#
                               (:report-counters res#)))
                           {:test 0 :pass 0 :fail 0 :error 0}
                           [~@(map
                                (fn [ns]
                                  `(cljs.test/test-ns ~ns))
                                (if is-ns
                                  (concat [env-or-ns] namespaces)
                                  namespaces))])
                         :type :summary)]
          (do-report summary#)
          summary#)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:228-263](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/test.clj#L228-L263)</ins>
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
 :source {:code "(defmacro run-tests\n  ([] `(run-tests (cljs.test/empty-env) '~ana/*cljs-ns*))\n  ([env-or-ns]\n   (if (ns? env-or-ns)\n     `(run-tests (cljs.test/empty-env) ~env-or-ns)\n     `(run-tests ~env-or-ns '~ana/*cljs-ns*)))\n  ([env-or-ns & namespaces]\n   (assert (every?\n             (fn [[quote ns]] (and (= quote 'quote) (symbol? ns)))\n             namespaces)\n     \"All arguments to run-tests must be quoted symbols\")\n   (let [is-ns (ns? env-or-ns)]\n     `(do\n        ~(if is-ns\n           `(cljs.test/set-env! (cljs.test/empty-env))\n           `(cljs.test/set-env! ~env-or-ns))\n        ;; TODO: support async - David\n        (let [summary# (assoc\n                         (reduce\n                           (fn [acc# res#]\n                             (merge-with +\n                               acc#\n                               (:report-counters res#)))\n                           {:test 0 :pass 0 :fail 0 :error 0}\n                           [~@(map\n                                (fn [ns]\n                                  `(cljs.test/test-ns ~ns))\n                                (if is-ns\n                                  (concat [env-or-ns] namespaces)\n                                  namespaces))])\n                         :type :summary)]\n          (do-report summary#)\n          summary#)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/test.clj",
          :lines [228 263]},
 :full-name "cljs.test/run-tests",
 :clj-symbol "clojure.test/run-tests",
 :docstring "Runs all tests in the given namespaces; prints results.\nDefaults to current namespace if none given.  Returns a map\nsummarizing test results."}

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
