## cljs.core/filter



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/filter</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/filter)
</td>
</tr>
</table>


 <samp>
(__filter__ f)<br>
</samp>
 <samp>
(__filter__ f coll)<br>
</samp>

---

Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means
false return values will be included.

`f` must be free of side-effects.

Returns a transducer when no collection is provided.



---


###### See Also:

[`cljs.core/remove`](../cljs.core/remove.md)<br>
[`cljs.core/keep`](../cljs.core/keep.md)<br>

---


Source docstring:

```
Returns a lazy sequence of the items in coll for which
(pred item) returns true. pred must be free of side-effects.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2801-L2818):

```clj
(defn filter
  ([pred coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (if (chunked-seq? s)
        (let [c (chunk-first s)
              size (count c)
              b (chunk-buffer size)]
          (dotimes [i size]
              (when (pred (-nth c i))
                (chunk-append b (-nth c i))))
          (chunk-cons (chunk b) (filter pred (chunk-rest s))))
        (let [f (first s) r (rest s)]
          (if (pred f)
            (cons f (filter pred r))
            (filter pred r))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2801-2818](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2801-L2818)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/filter` @ clojuredocs](http://clojuredocs.org/clojure.core/filter)<br>
[`clojure.core/filter` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/filter/)<br>
[`clojure.core/filter` @ crossclj](http://crossclj.info/fun/clojure.core/filter.html)<br>
[`cljs.core/filter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/filter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/filter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means\nfalse return values will be included.\n\n`f` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "filter",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/remove" "cljs.core/keep"],
 :full-name-encode "cljs.core/filter",
 :source {:code "(defn filter\n  ([pred coll]\n   (lazy-seq\n    (when-let [s (seq coll)]\n      (if (chunked-seq? s)\n        (let [c (chunk-first s)\n              size (count c)\n              b (chunk-buffer size)]\n          (dotimes [i size]\n              (when (pred (-nth c i))\n                (chunk-append b (-nth c i))))\n          (chunk-cons (chunk b) (filter pred (chunk-rest s))))\n        (let [f (first s) r (rest s)]\n          (if (pred f)\n            (cons f (filter pred r))\n            (filter pred r))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2801 2818]},
 :full-name "cljs.core/filter",
 :clj-symbol "clojure.core/filter",
 :docstring "Returns a lazy sequence of the items in coll for which\n(pred item) returns true. pred must be free of side-effects."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/filter"]))
```

-->
