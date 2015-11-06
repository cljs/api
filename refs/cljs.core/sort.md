## cljs.core/sort



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sort</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sort)
</td>
</tr>
</table>


 <samp>
(__sort__ coll)<br>
</samp>
 <samp>
(__sort__ comp coll)<br>
</samp>

---

Returns a sorted sequence of the items in `coll`.

`comp` can be a boolean-valued comparison funcion, or a -/0/+ valued comparator.

`comp` defaults to `compare`.



---


###### See Also:

[`cljs.core/sort-by`](../cljs.core/sort-by.md)<br>

---


Source docstring:

```
Returns a sorted sequence of the items in coll. Comp can be
boolean-valued comparison function, or a -/0/+ valued comparator.
Comp defaults to compare.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L1707-L1719):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1707-1719](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L1707-L1719)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sort` @ clojuredocs](http://clojuredocs.org/clojure.core/sort)<br>
[`clojure.core/sort` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sort/)<br>
[`clojure.core/sort` @ crossclj](http://crossclj.info/fun/clojure.core/sort.html)<br>
[`cljs.core/sort` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sort.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sort.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sorted sequence of the items in `coll`.\n\n`comp` can be a boolean-valued comparison funcion, or a -/0/+ valued comparator.\n\n`comp` defaults to `compare`.",
 :ns "cljs.core",
 :name "sort",
 :signature ["[coll]" "[comp coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/sort-by"],
 :full-name-encode "cljs.core/sort",
 :source {:code "(defn sort\n  ([coll]\n   (sort compare coll))\n  ([comp coll]\n   (if (seq coll)\n     (let [a (to-array coll)]\n       ;; matching Clojure's stable sort, though docs don't promise it\n       (garray/stableSort a (fn->comparator comp))\n       (seq a))\n     ())))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1707 1719]},
 :full-name "cljs.core/sort",
 :clj-symbol "clojure.core/sort",
 :docstring "Returns a sorted sequence of the items in coll. Comp can be\nboolean-valued comparison function, or a -/0/+ valued comparator.\nComp defaults to compare."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sort"]))
```

-->
