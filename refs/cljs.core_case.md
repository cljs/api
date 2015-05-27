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
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:639-646](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L639-L646)</ins>
</pre>

```clj
(defmacro case [e & clauses]
  (let [default (if (odd? (count clauses))
                  (last clauses)
                  `(throw (js/Error. (core/str "No matching clause: " ~e))))
        pairs (partition 2 clauses)]
   `(condp = ~e
      ~@(apply concat pairs)
      ~default)))
```


---

```clj
{:full-name "cljs.core/case",
 :ns "cljs.core",
 :name "case",
 :type "macro",
 :signature ["[e & clauses]"],
 :source {:code "(defmacro case [e & clauses]\n  (let [default (if (odd? (count clauses))\n                  (last clauses)\n                  `(throw (js/Error. (core/str \"No matching clause: \" ~e))))\n        pairs (partition 2 clauses)]\n   `(condp = ~e\n      ~@(apply concat pairs)\n      ~default)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [639 646],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L639-L646"},
 :full-name-encode "cljs.core_case",
 :clj-symbol "clojure.core/case",
 :history [["+" "0.0-1211"]]}

```
