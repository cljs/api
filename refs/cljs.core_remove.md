## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/remove

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove)
</td>
</tr>
</table>

 <samp>
(__remove__ pred coll)<br>
</samp>

```
Returns a lazy sequence of the items in coll for which
(pred item) returns false. pred must be free of side-effects.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1796-1800](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1796-L1800)</ins>
</pre>

```clj
(defn remove
  [pred coll]
  (filter (complement pred) coll))
```


---

```clj
{:ns "cljs.core",
 :name "remove",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_remove",
 :source {:code "(defn remove\n  [pred coll]\n  (filter (complement pred) coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1796 1800],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1796-L1800"},
 :full-name "cljs.core/remove",
 :clj-symbol "clojure.core/remove",
 :docstring "Returns a lazy sequence of the items in coll for which\n(pred item) returns false. pred must be free of side-effects."}

```
