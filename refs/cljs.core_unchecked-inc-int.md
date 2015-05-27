## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-inc-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-inc-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-inc-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-inc-int__ x)<br>
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
            └── <ins>[core.cljs:1506-1507](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1506-L1507)</ins>
</pre>

```clj
(defn unchecked-inc-int [x]
  (cljs.core/unchecked-inc-int x))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:299-300](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L299-L300)</ins>
</pre>

```clj
(defmacro unchecked-inc-int
  ([x] `(inc ~x)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-inc-int",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro unchecked-inc-int\n  ([x] `(inc ~x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [299 300],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L299-L300"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-inc-int",
 :source {:code "(defn unchecked-inc-int [x]\n  (cljs.core/unchecked-inc-int x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1506 1507],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1506-L1507"},
 :full-name "cljs.core/unchecked-inc-int",
 :clj-symbol "clojure.core/unchecked-inc-int"}

```
