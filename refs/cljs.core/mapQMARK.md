## cljs.core/map?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/map?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/map?)
</td>
</tr>
</table>


 <samp>
(__map?__ x)<br>
</samp>

---

Returns true if `x` is a map, false otherwise.



---


###### See Also:

[`cljs.core/hash-map`](../cljs.core/hash-map.md)<br>
[`cljs.core/sorted-map`](../cljs.core/sorted-map.md)<br>

---


Source docstring:

```
Return true if x satisfies IMap
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L1530-L1535):

```clj
(defn ^boolean map?
  [x]
  (if (nil? x)
    false
    (satisfies? IMap x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1530-1535](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L1530-L1535)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/map?` @ clojuredocs](http://clojuredocs.org/clojure.core/map_q)<br>
[`clojure.core/map?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/map%3F/)<br>
[`clojure.core/map?` @ crossclj](http://crossclj.info/fun/clojure.core/map%3F.html)<br>
[`cljs.core/map?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/map%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/mapQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a map, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "map?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/hash-map" "cljs.core/sorted-map"],
 :full-name-encode "cljs.core/mapQMARK",
 :source {:code "(defn ^boolean map?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? IMap x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1530 1535]},
 :full-name "cljs.core/map?",
 :clj-symbol "clojure.core/map?",
 :docstring "Return true if x satisfies IMap"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/map?"]))
```

-->
