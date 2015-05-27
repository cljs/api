## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/int)
</td>
</tr>
</table>

 <samp>
(__int__ x)<br>
</samp>

```
Coerce to int by stripping decimal places.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1553-1556](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1553-L1556)</ins>
</pre>

```clj
(defn int
  [x]
  (bit-or x 0))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:413-414](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L413-L414)</ins>
</pre>

```clj
(defmacro int [x]
  `(bit-or ~x 0))
```

---

```clj
{:ns "cljs.core",
 :name "int",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro int [x]\n  `(bit-or ~x 0))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [413 414],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L413-L414"}),
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_int",
 :source {:code "(defn int\n  [x]\n  (bit-or x 0))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1553 1556],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1553-L1556"},
 :full-name "cljs.core/int",
 :clj-symbol "clojure.core/int",
 :docstring "Coerce to int by stripping decimal places."}

```
