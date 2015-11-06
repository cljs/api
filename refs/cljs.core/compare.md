## cljs.core/compare



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/compare</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/compare)
</td>
</tr>
</table>


 <samp>
(__compare__ x y)<br>
</samp>

---

Comparator.

Returns a negative number, zero, or a positive number when `x` is logically
"less than", "equal to", or "greater than" `y`.

Uses `IComparable` if available and `google.array.defaultCompare` for objects of
the same type. nil is treated as a special case and is always less than any
other object.



---

###### Examples:

```clj
(compare 10 12)
;;=> -1

(compare 12 10)
;;=> 1

(compare 10 10)
;;=> 0

(compare 10 nil)
;;=>  1

(compare 10 (list 1 2 3))
;; Error: compare on non-nil objects of different types
```



---

###### See Also:

[`cljs.core/sort-by`](../cljs.core/sort-by.md)<br>
[`cljs.core/sorted-set-by`](../cljs.core/sorted-set-by.md)<br>
[`cljs.core/sorted-map-by`](../cljs.core/sorted-map-by.md)<br>

---


Source docstring:

```
Comparator. Returns a negative number, zero, or a positive number
 when x is logically 'less than', 'equal to', or 'greater than'
 y. Uses IComparable if available and google.array.defaultCompare for objects
of the same type and special-cases nil to be less than any other object.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L1590-L1609):

```clj
(defn ^number compare
  [x y]
  (cond
   (identical? x y) 0

   (nil? x) -1

   (nil? y) 1

   (identical? (type x) (type y))
   (if (implements? IComparable x)
     (-compare ^not-native x y)
     (garray/defaultCompare x y))

   :else
   (throw (js/Error. "compare on non-nil objects of different types"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1590-1609](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L1590-L1609)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/compare` @ clojuredocs](http://clojuredocs.org/clojure.core/compare)<br>
[`clojure.core/compare` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/compare/)<br>
[`clojure.core/compare` @ crossclj](http://crossclj.info/fun/clojure.core/compare.html)<br>
[`cljs.core/compare` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/compare.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/compare.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Comparator.\n\nReturns a negative number, zero, or a positive number when `x` is logically\n\"less than\", \"equal to\", or \"greater than\" `y`.\n\nUses `IComparable` if available and `google.array.defaultCompare` for objects of\nthe same type. nil is treated as a special case and is always less than any\nother object.",
 :return-type number,
 :ns "cljs.core",
 :name "compare",
 :signature ["[x y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/sort-by"
           "cljs.core/sorted-set-by"
           "cljs.core/sorted-map-by"],
 :full-name-encode "cljs.core/compare",
 :source {:code "(defn ^number compare\n  [x y]\n  (cond\n   (identical? x y) 0\n\n   (nil? x) -1\n\n   (nil? y) 1\n\n   (identical? (type x) (type y))\n   (if (implements? IComparable x)\n     (-compare ^not-native x y)\n     (garray/defaultCompare x y))\n\n   :else\n   (throw (js/Error. \"compare on non-nil objects of different types\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1590 1609]},
 :examples [{:id "e13fa0",
             :content "```clj\n(compare 10 12)\n;;=> -1\n\n(compare 12 10)\n;;=> 1\n\n(compare 10 10)\n;;=> 0\n\n(compare 10 nil)\n;;=>  1\n\n(compare 10 (list 1 2 3))\n;; Error: compare on non-nil objects of different types\n```"}],
 :full-name "cljs.core/compare",
 :clj-symbol "clojure.core/compare",
 :docstring "Comparator. Returns a negative number, zero, or a positive number\n when x is logically 'less than', 'equal to', or 'greater than'\n y. Uses IComparable if available and google.array.defaultCompare for objects\nof the same type and special-cases nil to be less than any other object."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/compare"]))
```

-->
