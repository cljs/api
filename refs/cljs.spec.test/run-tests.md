## cljs.spec.test/run-tests



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec.test/run-tests</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.test/run-tests)
</td>
</tr>
</table>

<samp>(run-tests)</samp><br>
<samp>(run-tests & ns-syms)</samp><br>

---

 <samp>
(__run-tests__)<br>
</samp>
 <samp>
(__run-tests__ & ns-syms)<br>
</samp>

---





Source docstring:

```
Like run-all-tests, but scoped to specific namespaces, or to
*ns* if no ns-sym are specified.
```


Source code @ [github]():

```clj
(defmacro run-tests
  ([]
   `(cljs.spec.test/run-tests '~ana/*cljs-ns*))
  ([& ns-syms]
   `(cljs.spec.test/run-var-tests
      (->> ~(spec/speced-vars* ns-syms)
        (filter (fn [v#] (:args (cljs.spec/fn-specs v#))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec.test/run-tests` @ clojuredocs](http://clojuredocs.org/clojure.spec.test/run-tests)<br>
[`clojure.spec.test/run-tests` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec.test/run-tests/)<br>
[`clojure.spec.test/run-tests` @ crossclj](http://crossclj.info/fun/clojure.spec.test/run-tests.html)<br>
[`cljs.spec.test/run-tests` @ crossclj](http://crossclj.info/fun/cljs.spec.test/run-tests.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.test/run-tests.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec.test",
 :name "run-tests",
 :signature ["[]" "[& ns-syms]"],
 :name-encode "run-tests",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec.test/run-tests",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec.test/run-tests"},
 :full-name-encode "cljs.spec.test/run-tests",
 :source {:code "(defmacro run-tests\n  ([]\n   `(cljs.spec.test/run-tests '~ana/*cljs-ns*))\n  ([& ns-syms]\n   `(cljs.spec.test/run-var-tests\n      (->> ~(spec/speced-vars* ns-syms)\n        (filter (fn [v#] (:args (cljs.spec/fn-specs v#))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec/test.cljc",
          :lines [15 23],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec/test.cljc#L15-L23"},
 :usage ["(run-tests)" "(run-tests & ns-syms)"],
 :full-name "cljs.spec.test/run-tests",
 :docstring "Like run-all-tests, but scoped to specific namespaces, or to\n*ns* if no ns-sym are specified.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec.test/run-tests.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec.test/run-tests"]))
```

-->
