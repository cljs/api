## cljs.core/empty



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/empty</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/empty)
</td>
</tr>
</table>


 <samp>
(__empty__ coll)<br>
</samp>

---

Returns an empty collection of the same category as `coll`.

Returns nil if `coll` is nil.



---


###### See Also:

[`cljs.core/not-empty`](../cljs.core/not-empty.md)<br>

---


Source docstring:

```
Returns an empty collection of the same category as coll, or nil
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L1130-L1134):

```clj
(defn empty
  [coll]
  (when-not (nil? coll)
    (-empty coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1130-1134](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L1130-L1134)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/empty` @ clojuredocs](http://clojuredocs.org/clojure.core/empty)<br>
[`clojure.core/empty` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/empty/)<br>
[`clojure.core/empty` @ crossclj](http://crossclj.info/fun/clojure.core/empty.html)<br>
[`cljs.core/empty` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/empty.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/empty.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns an empty collection of the same category as `coll`.\n\nReturns nil if `coll` is nil.",
 :ns "cljs.core",
 :name "empty",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/not-empty"],
 :full-name-encode "cljs.core/empty",
 :source {:code "(defn empty\n  [coll]\n  (when-not (nil? coll)\n    (-empty coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1130 1134]},
 :full-name "cljs.core/empty",
 :clj-symbol "clojure.core/empty",
 :docstring "Returns an empty collection of the same category as coll, or nil"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/empty"]))
```

-->
