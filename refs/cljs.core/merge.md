## cljs.core/merge



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/merge</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/merge)
</td>
</tr>
</table>


 <samp>
(__merge__ & maps)<br>
</samp>

---

Returns a map that consists of the rest of the maps `conj`-ed onto the first.

If a key occurs in more than one map, the mapping from the rightmost map will
"win".



---


###### See Also:

[`cljs.core/merge-with`](../cljs.core/merge-with.md)<br>
[`cljs.core/hash-map`](../cljs.core/hash-map.md)<br>

---


Source docstring:

```
Returns a map that consists of the rest of the maps conj-ed onto
the first.  If a key occurs in more than one map, the mapping from
the latter (left-to-right) will be the mapping in the result.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L7216-L7222):

```clj
(defn merge
  [& maps]
  (when (some identity maps)
    (reduce #(conj (or %1 {}) %2) maps)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7216-7222](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L7216-L7222)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/merge` @ clojuredocs](http://clojuredocs.org/clojure.core/merge)<br>
[`clojure.core/merge` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/merge/)<br>
[`clojure.core/merge` @ crossclj](http://crossclj.info/fun/clojure.core/merge.html)<br>
[`cljs.core/merge` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/merge.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/merge.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a map that consists of the rest of the maps `conj`-ed onto the first.\n\nIf a key occurs in more than one map, the mapping from the rightmost map will\n\"win\".",
 :ns "cljs.core",
 :name "merge",
 :signature ["[& maps]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/merge-with" "cljs.core/hash-map"],
 :full-name-encode "cljs.core/merge",
 :source {:code "(defn merge\n  [& maps]\n  (when (some identity maps)\n    (reduce #(conj (or %1 {}) %2) maps)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7216 7222]},
 :full-name "cljs.core/merge",
 :clj-symbol "clojure.core/merge",
 :docstring "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping from\nthe latter (left-to-right) will be the mapping in the result."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/merge"]))
```

-->
