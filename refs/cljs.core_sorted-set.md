## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted-set

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-set)
</td>
</tr>
</table>

 <samp>
(__sorted-set__ & keys)<br>
</samp>

```
Returns a new sorted set with supplied keys.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6107-6110](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L6107-L6110)</ins>
</pre>

```clj
(defn sorted-set
  ([& keys]
   (reduce -conj cljs.core.PersistentTreeSet/EMPTY keys)))
```


---

```clj
{:ns "cljs.core",
 :name "sorted-set",
 :signature ["[& keys]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_sorted-set",
 :source {:code "(defn sorted-set\n  ([& keys]\n   (reduce -conj cljs.core.PersistentTreeSet/EMPTY keys)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6107 6110],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L6107-L6110"},
 :full-name "cljs.core/sorted-set",
 :clj-symbol "clojure.core/sorted-set",
 :docstring "Returns a new sorted set with supplied keys."}

```
