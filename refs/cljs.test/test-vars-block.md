## cljs.test/test-vars-block



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__test-vars-block__ vars)<br>
</samp>

---





Source docstring:

```
Like test-vars, but returns a block for further composition and
later execution.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/cljs/test.cljs#L511-L540):

```clj
(defn test-vars-block
  [vars]
  (map
   (fn [[ns vars]]
     (fn []
       (block
        (let [env (get-current-env)
              once-fixtures (get-in env [:once-fixtures ns])
              each-fixtures (get-in env [:each-fixtures ns])]
          (case (execution-strategy once-fixtures each-fixtures)
            :async
            (->> vars
                 (filter (comp :test meta))
                 (mapcat (comp (partial wrap-map-fixtures each-fixtures)
                               test-var-block))
                 (wrap-map-fixtures once-fixtures))
            :sync
            (do
              (let [each-fixture-fn (join-fixtures each-fixtures)]
                [(fn []
                   ((join-fixtures once-fixtures)
                    (fn []
                      (doseq [v vars]
                        (when (:test (meta v))
                          (each-fixture-fn
                           (fn []
                             (test-var v))))))))])))))))
   (group-by (comp :ns meta) vars)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3190
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:511-540](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/cljs/test.cljs#L511-L540)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/test-vars-block` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/test-vars-block.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-vars-block.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "test-vars-block",
 :signature ["[vars]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test/test-vars-block",
 :source {:code "(defn test-vars-block\n  [vars]\n  (map\n   (fn [[ns vars]]\n     (fn []\n       (block\n        (let [env (get-current-env)\n              once-fixtures (get-in env [:once-fixtures ns])\n              each-fixtures (get-in env [:each-fixtures ns])]\n          (case (execution-strategy once-fixtures each-fixtures)\n            :async\n            (->> vars\n                 (filter (comp :test meta))\n                 (mapcat (comp (partial wrap-map-fixtures each-fixtures)\n                               test-var-block))\n                 (wrap-map-fixtures once-fixtures))\n            :sync\n            (do\n              (let [each-fixture-fn (join-fixtures each-fixtures)]\n                [(fn []\n                   ((join-fixtures once-fixtures)\n                    (fn []\n                      (doseq [v vars]\n                        (when (:test (meta v))\n                          (each-fixture-fn\n                           (fn []\n                             (test-var v))))))))])))))))\n   (group-by (comp :ns meta) vars)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/cljs/cljs/test.cljs",
          :lines [511 540]},
 :full-name "cljs.test/test-vars-block",
 :docstring "Like test-vars, but returns a block for further composition and\nlater execution."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-vars-block"]))
```

-->
