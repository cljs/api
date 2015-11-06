## cljs.core/sorted-set



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-set)
</td>
</tr>
</table>


 <samp>
(__sorted-set__ & keys)<br>
</samp>

---

Returns a new sorted set with supplied `keys`.



---


###### See Also:

[`cljs.core/sorted-set-by`](../cljs.core/sorted-set-by.md)<br>
[`cljs.core/subseq`](../cljs.core/subseq.md)<br>
[`cljs.core/rsubseq`](../cljs.core/rsubseq.md)<br>
[`cljs.core/sorted-map`](../cljs.core/sorted-map.md)<br>

---


Source docstring:

```
Returns a new sorted set with supplied keys.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L7603-L7606):

```clj
(defn sorted-set
  ([& keys]
   (reduce -conj (.-EMPTY PersistentTreeSet) keys)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7603-7606](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L7603-L7606)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sorted-set` @ clojuredocs](http://clojuredocs.org/clojure.core/sorted-set)<br>
[`clojure.core/sorted-set` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sorted-set/)<br>
[`clojure.core/sorted-set` @ crossclj](http://crossclj.info/fun/clojure.core/sorted-set.html)<br>
[`cljs.core/sorted-set` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sorted-set.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sorted-set.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new sorted set with supplied `keys`.",
 :ns "cljs.core",
 :name "sorted-set",
 :signature ["[& keys]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/sorted-set-by"
           "cljs.core/subseq"
           "cljs.core/rsubseq"
           "cljs.core/sorted-map"],
 :full-name-encode "cljs.core/sorted-set",
 :source {:code "(defn sorted-set\n  ([& keys]\n   (reduce -conj (.-EMPTY PersistentTreeSet) keys)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7603 7606]},
 :full-name "cljs.core/sorted-set",
 :clj-symbol "clojure.core/sorted-set",
 :docstring "Returns a new sorted set with supplied keys."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted-set"]))
```

-->
