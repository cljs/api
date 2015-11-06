## cljs.core/sorted-set-by



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-set-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-set-by)
</td>
</tr>
</table>


 <samp>
(__sorted-set-by__ comparator & keys)<br>
</samp>

---

Returns a new sorted set with supplied `keys`, using the supplied `comparator`.



---


###### See Also:

[`cljs.core/sorted-set`](../cljs.core/sorted-set.md)<br>
[`cljs.core/sorted-map-by`](../cljs.core/sorted-map-by.md)<br>
[`cljs.core/compare`](../cljs.core/compare.md)<br>

---


Source docstring:

```
Returns a new sorted set with supplied keys, using the supplied comparator.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L7339-L7344):

```clj
(defn sorted-set-by
  ([comparator & keys]
   (reduce -conj
           (PersistentTreeSet. nil (sorted-map-by comparator) 0)
           keys)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7339-7344](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L7339-L7344)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sorted-set-by` @ clojuredocs](http://clojuredocs.org/clojure.core/sorted-set-by)<br>
[`clojure.core/sorted-set-by` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sorted-set-by/)<br>
[`clojure.core/sorted-set-by` @ crossclj](http://crossclj.info/fun/clojure.core/sorted-set-by.html)<br>
[`cljs.core/sorted-set-by` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sorted-set-by.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sorted-set-by.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new sorted set with supplied `keys`, using the supplied `comparator`.",
 :ns "cljs.core",
 :name "sorted-set-by",
 :signature ["[comparator & keys]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/sorted-set"
           "cljs.core/sorted-map-by"
           "cljs.core/compare"],
 :full-name-encode "cljs.core/sorted-set-by",
 :source {:code "(defn sorted-set-by\n  ([comparator & keys]\n   (reduce -conj\n           (PersistentTreeSet. nil (sorted-map-by comparator) 0)\n           keys)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7339 7344]},
 :full-name "cljs.core/sorted-set-by",
 :clj-symbol "clojure.core/sorted-set-by",
 :docstring "Returns a new sorted set with supplied keys, using the supplied comparator."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted-set-by"]))
```

-->
