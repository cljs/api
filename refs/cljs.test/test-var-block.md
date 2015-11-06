## cljs.test/test-var-block



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__test-var-block__ v)<br>
</samp>

---





Source docstring:

```
Like test-var, but returns a block for further composition and
later execution.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/test.cljs#L422-L444):

```clj
(defn test-var-block
  [v]
  {:pre [(instance? Var v)]}
  (if-let [t (:test (meta v))]
    [(fn []
       (update-current-env! [:testing-vars] conj v)
       (update-current-env! [:report-counters :test] inc)
       (do-report {:type :begin-test-var :var v})
       (let [{:keys [async-disabled]} (get-current-env)]
         (cond-> (try
                   (t)
                   (catch :default e
                     (do-report
                      {:type :error
                       :message "Uncaught exception, not in assertion."
                       :expected nil
                       :actual e})))
           async-disabled (-> async? not (assert async-disabled)))))
     (fn []
       (do-report {:type :end-test-var :var v})
       (update-current-env! [:testing-vars] rest))]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:422-444](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/test.cljs#L422-L444)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/test-var-block` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/test-var-block.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-var-block.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "test-var-block",
 :signature ["[v]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test/test-var-block",
 :source {:code "(defn test-var-block\n  [v]\n  {:pre [(instance? Var v)]}\n  (if-let [t (:test (meta v))]\n    [(fn []\n       (update-current-env! [:testing-vars] conj v)\n       (update-current-env! [:report-counters :test] inc)\n       (do-report {:type :begin-test-var :var v})\n       (let [{:keys [async-disabled]} (get-current-env)]\n         (cond-> (try\n                   (t)\n                   (catch :default e\n                     (do-report\n                      {:type :error\n                       :message \"Uncaught exception, not in assertion.\"\n                       :expected nil\n                       :actual e})))\n           async-disabled (-> async? not (assert async-disabled)))))\n     (fn []\n       (do-report {:type :end-test-var :var v})\n       (update-current-env! [:testing-vars] rest))]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/cljs/test.cljs",
          :lines [422 444]},
 :full-name "cljs.test/test-var-block",
 :docstring "Like test-var, but returns a block for further composition and\nlater execution."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-var-block"]))
```

-->
