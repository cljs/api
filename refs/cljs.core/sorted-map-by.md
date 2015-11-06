## cljs.core/sorted-map-by



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-map-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-map-by)
</td>
</tr>
</table>


 <samp>
(__sorted-map-by__ comparator & keyvals)<br>
</samp>

---

Returns a new sorted map with supplied mappings, using the supplied comparator
function.

`keyvals` must be an even number of forms.



---


###### See Also:

[`cljs.core/sorted-map`](../cljs.core/sorted-map.md)<br>
[`cljs.core/subseq`](../cljs.core/subseq.md)<br>
[`cljs.core/rsubseq`](../cljs.core/rsubseq.md)<br>
[`cljs.core/sorted-set-by`](../cljs.core/sorted-set-by.md)<br>

---


Source docstring:

```
keyval => key val
Returns a new sorted map with supplied mappings, using the supplied comparator.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5569-L5577):

```clj
(defn sorted-map-by
  ([comparator & keyvals]
     (loop [in (seq keyvals)
            out (cljs.core.PersistentTreeMap. (fn->comparator comparator) nil 0 nil 0)]
       (if in
         (recur (nnext in) (assoc out (first in) (second in)))
         out))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5569-5577](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5569-L5577)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sorted-map-by` @ clojuredocs](http://clojuredocs.org/clojure.core/sorted-map-by)<br>
[`clojure.core/sorted-map-by` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sorted-map-by/)<br>
[`clojure.core/sorted-map-by` @ crossclj](http://crossclj.info/fun/clojure.core/sorted-map-by.html)<br>
[`cljs.core/sorted-map-by` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sorted-map-by.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sorted-map-by.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new sorted map with supplied mappings, using the supplied comparator\nfunction.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "sorted-map-by",
 :signature ["[comparator & keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/sorted-map"
           "cljs.core/subseq"
           "cljs.core/rsubseq"
           "cljs.core/sorted-set-by"],
 :full-name-encode "cljs.core/sorted-map-by",
 :source {:code "(defn sorted-map-by\n  ([comparator & keyvals]\n     (loop [in (seq keyvals)\n            out (cljs.core.PersistentTreeMap. (fn->comparator comparator) nil 0 nil 0)]\n       (if in\n         (recur (nnext in) (assoc out (first in) (second in)))\n         out))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5569 5577]},
 :full-name "cljs.core/sorted-map-by",
 :clj-symbol "clojure.core/sorted-map-by",
 :docstring "keyval => key val\nReturns a new sorted map with supplied mappings, using the supplied comparator."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sorted-map-by"]))
```

-->
