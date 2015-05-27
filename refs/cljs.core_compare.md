## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/compare

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/compare</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/compare)
</td>
</tr>
</table>

 <samp>
(__compare__ x y)<br>
</samp>

```
Comparator. Returns a negative number, zero, or a positive number
 when x is logically 'less than', 'equal to', or 'greater than'
 y. Uses IComparable if available and google.array.defaultCompare for objects
of the same type and special-cases nil to be less than any other object.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1043-1056](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L1043-L1056)</ins>
</pre>

```clj
(defn compare
  [x y]
  (cond
   (identical? x y) 0
   (nil? x) -1
   (nil? y) 1
   (identical? (type x) (type y)) (if (satisfies? IComparable x)
                                    (-compare x y)
                                    (garray/defaultCompare x y))
   :else (throw (js/Error. "compare on non-nil objects of different types"))))
```


---

```clj
{:ns "cljs.core",
 :name "compare",
 :signature ["[x y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_compare",
 :source {:code "(defn compare\n  [x y]\n  (cond\n   (identical? x y) 0\n   (nil? x) -1\n   (nil? y) 1\n   (identical? (type x) (type y)) (if (satisfies? IComparable x)\n                                    (-compare x y)\n                                    (garray/defaultCompare x y))\n   :else (throw (js/Error. \"compare on non-nil objects of different types\"))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1043 1056],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L1043-L1056"},
 :full-name "cljs.core/compare",
 :clj-symbol "clojure.core/compare",
 :docstring "Comparator. Returns a negative number, zero, or a positive number\n when x is logically 'less than', 'equal to', or 'greater than'\n y. Uses IComparable if available and google.array.defaultCompare for objects\nof the same type and special-cases nil to be less than any other object."}

```
