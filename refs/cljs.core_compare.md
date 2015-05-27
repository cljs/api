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
y. Uses google.array.defaultCompare for objects of the same type
and special-cases nil to be less than any other object.
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:901-911](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L901-L911)</ins>
</pre>

```clj
(defn compare
  [x y]
  (cond
    (identical? (type x) (type y)) (garray/defaultCompare x y)
    (nil? x) -1
    (nil? y) 1
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
 :source {:code "(defn compare\n  [x y]\n  (cond\n    (identical? (type x) (type y)) (garray/defaultCompare x y)\n    (nil? x) -1\n    (nil? y) 1\n    :else (throw (js/Error. \"compare on non-nil objects of different types\"))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [901 911],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L901-L911"},
 :full-name "cljs.core/compare",
 :clj-symbol "clojure.core/compare",
 :docstring "Comparator. Returns a negative number, zero, or a positive number\nwhen x is logically 'less than', 'equal to', or 'greater than'\ny. Uses google.array.defaultCompare for objects of the same type\nand special-cases nil to be less than any other object."}

```
