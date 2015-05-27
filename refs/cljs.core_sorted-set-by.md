## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted-set-by

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-set-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-set-by)
</td>
</tr>
</table>

 <samp>
(__sorted-set-by__ comparator & keys)<br>
</samp>

```
Returns a new sorted set with supplied keys, using the supplied comparator.
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5698-5703](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L5698-L5703)</ins>
</pre>

```clj
(defn sorted-set-by
  ([comparator & keys]
   (reduce -conj
           (cljs.core.PersistentTreeSet. nil (sorted-map-by comparator) 0)
           keys)))
```


---

```clj
{:ns "cljs.core",
 :name "sorted-set-by",
 :signature ["[comparator & keys]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_sorted-set-by",
 :source {:code "(defn sorted-set-by\n  ([comparator & keys]\n   (reduce -conj\n           (cljs.core.PersistentTreeSet. nil (sorted-map-by comparator) 0)\n           keys)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5698 5703],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L5698-L5703"},
 :full-name "cljs.core/sorted-set-by",
 :clj-symbol "clojure.core/sorted-set-by",
 :docstring "Returns a new sorted set with supplied keys, using the supplied comparator."}

```
