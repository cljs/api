## cljs.core/sort-by



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sort-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sort-by)
</td>
</tr>
</table>


 <samp>
(__sort-by__ keyfn coll)<br>
</samp>
 <samp>
(__sort-by__ keyfn comp coll)<br>
</samp>

---

Returns a sorted sequence of the items in `coll`, where the sort order is
determined by comparing `(keyfn item)`.

`comp` can be boolean-valued comparison function, or a -/0/+ valued comparator.

`comp` defaults to `compare`.



---


###### See Also:

[`cljs.core/sort`](../cljs.core/sort.md)<br>
[`cljs.core/compare`](../cljs.core/compare.md)<br>

---


Source docstring:

```
Returns a sorted sequence of the items in coll, where the sort
order is determined by comparing (keyfn item).  Comp can be
boolean-valued comparison funcion, or a -/0/+ valued comparator.
Comp defaults to compare.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L1978-L1986):

```clj
(defn sort-by
  ([keyfn coll]
   (sort-by keyfn compare coll))
  ([keyfn comp coll]
     (sort (fn [x y] ((fn->comparator comp) (keyfn x) (keyfn y))) coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1978-1986](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L1978-L1986)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sort-by` @ clojuredocs](http://clojuredocs.org/clojure.core/sort-by)<br>
[`clojure.core/sort-by` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sort-by/)<br>
[`clojure.core/sort-by` @ crossclj](http://crossclj.info/fun/clojure.core/sort-by.html)<br>
[`cljs.core/sort-by` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sort-by.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sort-by.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sorted sequence of the items in `coll`, where the sort order is\ndetermined by comparing `(keyfn item)`.\n\n`comp` can be boolean-valued comparison function, or a -/0/+ valued comparator.\n\n`comp` defaults to `compare`.",
 :ns "cljs.core",
 :name "sort-by",
 :signature ["[keyfn coll]" "[keyfn comp coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/sort" "cljs.core/compare"],
 :full-name-encode "cljs.core/sort-by",
 :source {:code "(defn sort-by\n  ([keyfn coll]\n   (sort-by keyfn compare coll))\n  ([keyfn comp coll]\n     (sort (fn [x y] ((fn->comparator comp) (keyfn x) (keyfn y))) coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1978 1986]},
 :full-name "cljs.core/sort-by",
 :clj-symbol "clojure.core/sort-by",
 :docstring "Returns a sorted sequence of the items in coll, where the sort\norder is determined by comparing (keyfn item).  Comp can be\nboolean-valued comparison funcion, or a -/0/+ valued comparator.\nComp defaults to compare."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sort-by"]))
```

-->
