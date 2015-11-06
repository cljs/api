## cljs.core/mapcat



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mapcat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mapcat)
</td>
</tr>
</table>


 <samp>
(__mapcat__ f)<br>
</samp>
 <samp>
(__mapcat__ f & colls)<br>
</samp>

---

Returns the result of applying `concat` to the result of applying `map` to `f`
and `colls`.

Function `f` should return a collection.

Returns a transducer when no collections are provided.



---


###### See Also:

[`cljs.core/map`](../cljs.core/map.md)<br>
[`cljs.core/concat`](../cljs.core/concat.md)<br>

---


Source docstring:

```
Returns the result of applying concat to the result of applying map
to f and colls.  Thus function f should return a collection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1816-L1822):

```clj
(defn mapcat
  ([f coll]
    (flatten1 (map f coll)))
  ([f coll & colls]
    (flatten1 (apply map f coll colls))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1816-1822](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1816-L1822)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/mapcat` @ clojuredocs](http://clojuredocs.org/clojure.core/mapcat)<br>
[`clojure.core/mapcat` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/mapcat/)<br>
[`clojure.core/mapcat` @ crossclj](http://crossclj.info/fun/clojure.core/mapcat.html)<br>
[`cljs.core/mapcat` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/mapcat.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/mapcat.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the result of applying `concat` to the result of applying `map` to `f`\nand `colls`.\n\nFunction `f` should return a collection.\n\nReturns a transducer when no collections are provided.",
 :ns "cljs.core",
 :name "mapcat",
 :signature ["[f]" "[f & colls]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map" "cljs.core/concat"],
 :full-name-encode "cljs.core/mapcat",
 :source {:code "(defn mapcat\n  ([f coll]\n    (flatten1 (map f coll)))\n  ([f coll & colls]\n    (flatten1 (apply map f coll colls))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1816 1822]},
 :full-name "cljs.core/mapcat",
 :clj-symbol "clojure.core/mapcat",
 :docstring "Returns the result of applying concat to the result of applying map\nto f and colls.  Thus function f should return a collection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mapcat"]))
```

-->
