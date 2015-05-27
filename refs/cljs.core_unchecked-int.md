## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-int__ x)<br>
</samp>

```
Coerce to int by stripping decimal places.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1520-1523](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1520-L1523)</ins>
</pre>

```clj
(defn unchecked-int
  [x]
  (fix x))
```


---

```clj
{:ns "cljs.core",
 :name "unchecked-int",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-int",
 :source {:code "(defn unchecked-int\n  [x]\n  (fix x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1520 1523],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1520-L1523"},
 :full-name "cljs.core/unchecked-int",
 :clj-symbol "clojure.core/unchecked-int",
 :docstring "Coerce to int by stripping decimal places."}

```
