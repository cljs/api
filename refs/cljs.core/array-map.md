## cljs.core/array-map



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/array-map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/array-map)
</td>
</tr>
</table>


 <samp>
(__array-map__ & keyvals)<br>
</samp>

---

Returns a new array map (a map implemented with arrays) with the supplied mappings.

`keyvals` must be an even number of forms.



---

###### Examples:

```clj
(array-map :a 10)
;;=> {:a 10}

(array-map :a 10 :b 20)
;;=> {:a 10 :b 20}
```



---

###### See Also:

[`cljs.core/assoc`](../cljs.core/assoc.md)<br>
[`cljs.core/hash-map`](../cljs.core/hash-map.md)<br>
[`cljs.core/sorted-map`](../cljs.core/sorted-map.md)<br>

---


Source docstring:

```
keyval => key val
Returns a new array map with supplied mappings.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L5540-L5544):

```clj
(defn array-map
  [& keyvals]
  (PersistentArrayMap. nil (quot (count keyvals) 2) (apply array keyvals) nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5540-5544](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L5540-L5544)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/array-map` @ clojuredocs](http://clojuredocs.org/clojure.core/array-map)<br>
[`clojure.core/array-map` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/array-map/)<br>
[`clojure.core/array-map` @ crossclj](http://crossclj.info/fun/clojure.core/array-map.html)<br>
[`cljs.core/array-map` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/array-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/array-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new array map (a map implemented with arrays) with the supplied mappings.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "array-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/assoc"
           "cljs.core/hash-map"
           "cljs.core/sorted-map"],
 :full-name-encode "cljs.core/array-map",
 :source {:code "(defn array-map\n  [& keyvals]\n  (PersistentArrayMap. nil (quot (count keyvals) 2) (apply array keyvals) nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5540 5544]},
 :examples [{:id "198026",
             :content "```clj\n(array-map :a 10)\n;;=> {:a 10}\n\n(array-map :a 10 :b 20)\n;;=> {:a 10 :b 20}\n```"}],
 :full-name "cljs.core/array-map",
 :clj-symbol "clojure.core/array-map",
 :docstring "keyval => key val\nReturns a new array map with supplied mappings."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-map"]))
```

-->
