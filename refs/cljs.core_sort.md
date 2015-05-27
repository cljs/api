## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sort

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sort</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sort)
</td>
</tr>
</table>

 <samp>
(__sort__ coll)<br>
(__sort__ comp coll)<br>
</samp>

```
Returns a sorted sequence of the items in coll. Comp can be
boolean-valued comparison funcion, or a -/0/+ valued comparator.
Comp defaults to compare.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1267-1279](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1267-L1279)</ins>
</pre>

```clj
(defn sort
  ([coll]
   (sort compare coll))
  ([comp coll]
   (if (seq coll)
     (let [a (to-array coll)]
       ;; matching Clojure's stable sort, though docs don't promise it
       (garray/stableSort a (fn->comparator comp))
       (seq a))
     ())))
```


---

```clj
{:ns "cljs.core",
 :name "sort",
 :signature ["[coll]" "[comp coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_sort",
 :source {:code "(defn sort\n  ([coll]\n   (sort compare coll))\n  ([comp coll]\n   (if (seq coll)\n     (let [a (to-array coll)]\n       ;; matching Clojure's stable sort, though docs don't promise it\n       (garray/stableSort a (fn->comparator comp))\n       (seq a))\n     ())))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1267 1279],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1267-L1279"},
 :full-name "cljs.core/sort",
 :clj-symbol "clojure.core/sort",
 :docstring "Returns a sorted sequence of the items in coll. Comp can be\nboolean-valued comparison funcion, or a -/0/+ valued comparator.\nComp defaults to compare."}

```
