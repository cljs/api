## cljs.test/test-var



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/test-var</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-var)
</td>
</tr>
</table>


 <samp>
(__test-var__ v)<br>
</samp>

---





Source docstring:

```
If v has a function in its :test metadata, calls that function,
add v to :testing-vars property of env.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/test.cljs#L357-L376):

```clj
(defn test-var
  [v]
  {:pre [(instance? Var v)]}
  (if-let [t (:test (meta v))]
    (do
      (update-current-env! [:testing-vars] conj v)
      (update-current-env! [:report-counters :test] inc)
      (do-report {:type :begin-test-var :var v})
      (try
        (t)
        (catch :default e
          (do-report
            {:type :error
             :message "Uncaught exception, not in assertion."
             :expected nil
             :actual e})))
      (do-report {:type :end-test-var :var v})
      (update-current-env! [:testing-vars] rest))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:357-376](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/test.cljs#L357-L376)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/test-var` @ clojuredocs](http://clojuredocs.org/clojure.test/test-var)<br>
[`clojure.test/test-var` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/test-var/)<br>
[`clojure.test/test-var` @ crossclj](http://crossclj.info/fun/clojure.test/test-var.html)<br>
[`cljs.test/test-var` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/test-var.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-var.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "test-var",
 :signature ["[v]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/test-var",
 :source {:code "(defn test-var\n  [v]\n  {:pre [(instance? Var v)]}\n  (if-let [t (:test (meta v))]\n    (do\n      (update-current-env! [:testing-vars] conj v)\n      (update-current-env! [:report-counters :test] inc)\n      (do-report {:type :begin-test-var :var v})\n      (try\n        (t)\n        (catch :default e\n          (do-report\n            {:type :error\n             :message \"Uncaught exception, not in assertion.\"\n             :expected nil\n             :actual e})))\n      (do-report {:type :end-test-var :var v})\n      (update-current-env! [:testing-vars] rest))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/test.cljs",
          :lines [357 376]},
 :full-name "cljs.test/test-var",
 :clj-symbol "clojure.test/test-var",
 :docstring "If v has a function in its :test metadata, calls that function,\nadd v to :testing-vars property of env."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-var"]))
```

-->
