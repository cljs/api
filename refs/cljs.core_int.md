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
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1325-1328](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L1325-L1328)</ins>
</pre>

```clj
(defn int
  [x]
  (fix x))
```


---

```clj
{:ns "cljs.core",
 :name "int",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_int",
 :source {:code "(defn int\n  [x]\n  (fix x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1325 1328],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L1325-L1328"},
 :full-name "cljs.core/int",
 :clj-symbol "clojure.core/int",
 :docstring "Coerce to int by stripping decimal places."}

```
