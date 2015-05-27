## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-negate

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-negate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-negate)
</td>
</tr>
</table>

 <samp>
(__unchecked-negate__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1523-1524](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1523-L1524)</ins>
</pre>

```clj
(defn unchecked-negate [x]
  (cljs.core/unchecked-negate x))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:308-309](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L308-L309)</ins>
</pre>

```clj
(defmacro unchecked-negate
  ([x] `(- ~x)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-negate",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro unchecked-negate\n  ([x] `(- ~x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [308 309],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L308-L309"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-negate",
 :source {:code "(defn unchecked-negate [x]\n  (cljs.core/unchecked-negate x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1523 1524],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1523-L1524"},
 :full-name "cljs.core/unchecked-negate",
 :clj-symbol "clojure.core/unchecked-negate"}

```
