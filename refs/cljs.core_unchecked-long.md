## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-long

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-long</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-long)
</td>
</tr>
</table>

 <samp>
(__unchecked-long__ x)<br>
</samp>

```
Coerce to long by stripping decimal places. Identical to `int'.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1568-1571](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1568-L1571)</ins>
</pre>

```clj
(defn unchecked-long
  [x]
  (fix x))
```


---

```clj
{:ns "cljs.core",
 :name "unchecked-long",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-long",
 :source {:code "(defn unchecked-long\n  [x]\n  (fix x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1568 1571],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1568-L1571"},
 :full-name "cljs.core/unchecked-long",
 :clj-symbol "clojure.core/unchecked-long",
 :docstring "Coerce to long by stripping decimal places. Identical to `int'."}

```
