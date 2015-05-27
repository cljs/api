## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rem

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rem</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rem)
</td>
</tr>
</table>

 <samp>
(__rem__ n d)<br>
</samp>

```
remainder of dividing numerator by denominator.
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1297-1301](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L1297-L1301)</ins>
</pre>

```clj
(defn rem
  [n d]
  (let [q (quot n d)]
    (- n (* d q))))
```


---

```clj
{:ns "cljs.core",
 :name "rem",
 :signature ["[n d]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_rem",
 :source {:code "(defn rem\n  [n d]\n  (let [q (quot n d)]\n    (- n (* d q))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1297 1301],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L1297-L1301"},
 :full-name "cljs.core/rem",
 :clj-symbol "clojure.core/rem",
 :docstring "remainder of dividing numerator by denominator."}

```
