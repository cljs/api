## cljs.core/sorted-map



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-map)
</td>
</tr>
</table>


 <samp>
(__sorted-map__ & keyvals)<br>
</samp>

---

Returns a new sorted map with supplied mappings.

`keyvals` must be an even number of forms.



---


###### See Also:

[`cljs.core/sorted-map-by`](../cljs.core/sorted-map-by.md)<br>
[`cljs.core/subseq`](../cljs.core/subseq.md)<br>
[`cljs.core/rsubseq`](../cljs.core/rsubseq.md)<br>
[`cljs.core/sorted-set`](../cljs.core/sorted-set.md)<br>
[`cljs.core/array-map`](../cljs.core/array-map.md)<br>
[`cljs.core/hash-map`](../cljs.core/hash-map.md)<br>

---


Source docstring:

```
keyval => key val
Returns a new sorted map with supplied mappings.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L5806-L5813):

```clj
(defn sorted-map
  ([& keyvals]
     (loop [in (seq keyvals) out cljs.core.PersistentTreeMap.EMPTY]
       (if in
         (recur (nnext in) (assoc out (first in) (second in)))
         out))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5806-5813](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L5806-L5813)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sorted-map` @ clojuredocs](http://clojuredocs.org/clojure.core/sorted-map)<br>
[`clojure.core/sorted-map` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sorted-map/)<br>
[`clojure.core/sorted-map` @ crossclj](http://crossclj.info/fun/clojure.core/sorted-map.html)<br>
[`cljs.core/sorted-map` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sorted-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sorted-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new sorted map with supplied mappings.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "sorted-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/sorted-map-by"
           "cljs.core/subseq"
           "cljs.core/rsubseq"
           "cljs.core/sorted-set"
           "cljs.core/array-map"
           "cljs.core/hash-map"],
 :full-name-encode "cljs.core/sorted-map",
 :source {:code "(defn sorted-map\n  ([& keyvals]\n     (loop [in (seq keyvals) out cljs.core.PersistentTreeMap.EMPTY]\n       (if in\n         (recur (nnext in) (assoc out (first in) (second in)))\n         out))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5806 5813]},
 :full-name "cljs.core/sorted-map",
 :clj-symbol "clojure.core/sorted-map",
 :docstring "keyval => key val\nReturns a new sorted map with supplied mappings."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted-map"]))
```

-->
