## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/long

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/long</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/long)
</td>
</tr>
</table>

 <samp>
(__long__ x)<br>
</samp>

```
Coerce to long by stripping decimal places. Identical to `int'.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1309-1312](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1309-L1312)</ins>
</pre>

```clj
(defn long
  [x]
  (fix x))
```


---

```clj
{:ns "cljs.core",
 :name "long",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_long",
 :source {:code "(defn long\n  [x]\n  (fix x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1309 1312],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1309-L1312"},
 :full-name "cljs.core/long",
 :clj-symbol "clojure.core/long",
 :docstring "Coerce to long by stripping decimal places. Identical to `int'."}

```
