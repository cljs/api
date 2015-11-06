## cljs.core/sorted?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" title="Added in 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted?)
</td>
</tr>
</table>


 <samp>
(__sorted?__ coll)<br>
</samp>

---

Returns true if `coll` implements the `ISorted` protocol, false otherwise.

Sorted maps and sorted sets implement `ISorted`.



---


###### See Also:

[`cljs.core/sorted-map`](../cljs.core/sorted-map.md)<br>
[`cljs.core/sorted-set`](../cljs.core/sorted-set.md)<br>

---


Source docstring:

```
Returns true if coll satisfies ISorted
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L1465-L1467):

```clj
(defn ^boolean sorted?
  [x] (satisfies? ISorted x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1465-1467](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L1465-L1467)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sorted?` @ clojuredocs](http://clojuredocs.org/clojure.core/sorted_q)<br>
[`clojure.core/sorted?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sorted%3F/)<br>
[`clojure.core/sorted?` @ crossclj](http://crossclj.info/fun/clojure.core/sorted%3F.html)<br>
[`cljs.core/sorted?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sorted%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sortedQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `coll` implements the `ISorted` protocol, false otherwise.\n\nSorted maps and sorted sets implement `ISorted`.",
 :return-type boolean,
 :ns "cljs.core",
 :name "sorted?",
 :signature ["[coll]"],
 :history [["+" "0.0-2120"]],
 :type "function",
 :related ["cljs.core/sorted-map" "cljs.core/sorted-set"],
 :full-name-encode "cljs.core/sortedQMARK",
 :source {:code "(defn ^boolean sorted?\n  [x] (satisfies? ISorted x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1465 1467]},
 :full-name "cljs.core/sorted?",
 :clj-symbol "clojure.core/sorted?",
 :docstring "Returns true if coll satisfies ISorted"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted?"]))
```

-->
