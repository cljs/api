## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/case

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/case</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/case)
</td>
</tr>
</table>

 <samp>
(__case__ e & clauses)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:673-693](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L673-L693)</ins>
</pre>

```clj
(defmacro case [e & clauses]
  (let [default (if (odd? (count clauses))
                  (last clauses)
                  `(throw (js/Error. (core/str "No matching clause: " ~e))))
        assoc-test (fn assoc-test [m test expr]
                         (if (contains? m test)
                           (throw (clojure.core/IllegalArgumentException.
                                   (core/str "Duplicate case test constant '"
                                             test "'"
                                             (when (:line &env)
                                               (core/str " on line " (:line &env) " "
                                                         cljs.compiler/*cljs-file*)))))
                           (assoc m test expr)))
        pairs (reduce (fn [m [test expr]]
                        (if (seq? test)
                          (reduce #(assoc-test %1 %2 expr) m test)
                          (assoc-test m test expr)))
                      {} (partition 2 clauses))]
   `(cond
     ~@(mapcat (fn [[m c]] `((identical? ~m ~e) ~c)) pairs)
     :else ~default)))
```


---

```clj
{:full-name "cljs.core/case",
 :ns "cljs.core",
 :name "case",
 :type "macro",
 :signature ["[e & clauses]"],
 :source {:code "(defmacro case [e & clauses]\n  (let [default (if (odd? (count clauses))\n                  (last clauses)\n                  `(throw (js/Error. (core/str \"No matching clause: \" ~e))))\n        assoc-test (fn assoc-test [m test expr]\n                         (if (contains? m test)\n                           (throw (clojure.core/IllegalArgumentException.\n                                   (core/str \"Duplicate case test constant '\"\n                                             test \"'\"\n                                             (when (:line &env)\n                                               (core/str \" on line \" (:line &env) \" \"\n                                                         cljs.compiler/*cljs-file*)))))\n                           (assoc m test expr)))\n        pairs (reduce (fn [m [test expr]]\n                        (if (seq? test)\n                          (reduce #(assoc-test %1 %2 expr) m test)\n                          (assoc-test m test expr)))\n                      {} (partition 2 clauses))]\n   `(cond\n     ~@(mapcat (fn [[m c]] `((identical? ~m ~e) ~c)) pairs)\n     :else ~default)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [673 693],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L673-L693"},
 :full-name-encode "cljs.core_case",
 :clj-symbol "clojure.core/case",
 :history [["+" "0.0-1211"]]}

```
