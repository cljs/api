## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sort-by

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sort-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sort-by)
</td>
</tr>
</table>

 <samp>
(__sort-by__ keyfn coll)<br>
(__sort-by__ keyfn comp coll)<br>
</samp>

```
Returns a sorted sequence of the items in coll, where the sort
order is determined by comparing (keyfn item).  Comp can be
boolean-valued comparison funcion, or a -/0/+ valued comparator.
Comp defaults to compare.
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:762-770](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L762-L770)</ins>
</pre>

```clj
(defn sort-by
  ([keyfn coll]
   (sort-by keyfn compare coll))
  ([keyfn comp coll]
     (sort (fn [x y] ((fn->comparator comp) (keyfn x) (keyfn y))) coll)))
```


---

```clj
{:ns "cljs.core",
 :name "sort-by",
 :signature ["[keyfn coll]" "[keyfn comp coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_sort-by",
 :source {:code "(defn sort-by\n  ([keyfn coll]\n   (sort-by keyfn compare coll))\n  ([keyfn comp coll]\n     (sort (fn [x y] ((fn->comparator comp) (keyfn x) (keyfn y))) coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [762 770],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L762-L770"},
 :full-name "cljs.core/sort-by",
 :clj-symbol "clojure.core/sort-by",
 :docstring "Returns a sorted sequence of the items in coll, where the sort\norder is determined by comparing (keyfn item).  Comp can be\nboolean-valued comparison funcion, or a -/0/+ valued comparator.\nComp defaults to compare."}

```
