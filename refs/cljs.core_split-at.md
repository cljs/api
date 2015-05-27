## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/split-at

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/split-at</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/split-at)
</td>
</tr>
</table>

 <samp>
(__split-at__ n coll)<br>
</samp>

```
Returns a vector of [(take n coll) (drop n coll)]
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2802-2805](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2802-L2805)</ins>
</pre>

```clj
(defn split-at
  [n coll]
  [(take n coll) (drop n coll)])
```


---

```clj
{:ns "cljs.core",
 :name "split-at",
 :signature ["[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_split-at",
 :source {:code "(defn split-at\n  [n coll]\n  [(take n coll) (drop n coll)])",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2802 2805],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2802-L2805"},
 :full-name "cljs.core/split-at",
 :clj-symbol "clojure.core/split-at",
 :docstring "Returns a vector of [(take n coll) (drop n coll)]"}

```
