## cljs.core/keep-indexed



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keep-indexed</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keep-indexed)
</td>
</tr>
</table>


 <samp>
(__keep-indexed__ f)<br>
</samp>
 <samp>
(__keep-indexed__ f coll)<br>
</samp>

---

Returns a lazy sequence of the non-nil results of `(f index item)`. Note, this
means false return values will be included.

`f` must be free of side-effects.

Returns a stateful transducer when no collection is provided.



---


###### See Also:

[`cljs.core/map-indexed`](../cljs.core/map-indexed.md)<br>
[`cljs.core/keep`](../cljs.core/keep.md)<br>

---


Source docstring:

```
Returns a lazy sequence of the non-nil results of (f index item). Note,
this means false return values will be included.  f must be free of
side-effects.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L2652-L2673):

```clj
(defn keep-indexed
  ([f coll]
     (letfn [(keepi [idx coll]
               (lazy-seq
                (when-let [s (seq coll)]
                  (if (chunked-seq? s)
                    (let [c (chunk-first s)
                          size (count c)
                          b (chunk-buffer size)]
                      (dotimes [i size]
                        (let [x (f (+ idx i) (-nth c i))]
                          (when-not (nil? x)
                            (chunk-append b x))))
                      (chunk-cons (chunk b) (keepi (+ idx size) (chunk-rest s))))
                    (let [x (f idx (first s))]
                      (if (nil? x)
                        (keepi (inc idx) (rest s))
                        (cons x (keepi (inc idx) (rest s)))))))))]
       (keepi 0 coll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2652-2673](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L2652-L2673)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/keep-indexed` @ clojuredocs](http://clojuredocs.org/clojure.core/keep-indexed)<br>
[`clojure.core/keep-indexed` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/keep-indexed/)<br>
[`clojure.core/keep-indexed` @ crossclj](http://crossclj.info/fun/clojure.core/keep-indexed.html)<br>
[`cljs.core/keep-indexed` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/keep-indexed.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/keep-indexed.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of the non-nil results of `(f index item)`. Note, this\nmeans false return values will be included.\n\n`f` must be free of side-effects.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "keep-indexed",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map-indexed" "cljs.core/keep"],
 :full-name-encode "cljs.core/keep-indexed",
 :source {:code "(defn keep-indexed\n  ([f coll]\n     (letfn [(keepi [idx coll]\n               (lazy-seq\n                (when-let [s (seq coll)]\n                  (if (chunked-seq? s)\n                    (let [c (chunk-first s)\n                          size (count c)\n                          b (chunk-buffer size)]\n                      (dotimes [i size]\n                        (let [x (f (+ idx i) (-nth c i))]\n                          (when-not (nil? x)\n                            (chunk-append b x))))\n                      (chunk-cons (chunk b) (keepi (+ idx size) (chunk-rest s))))\n                    (let [x (f idx (first s))]\n                      (if (nil? x)\n                        (keepi (inc idx) (rest s))\n                        (cons x (keepi (inc idx) (rest s)))))))))]\n       (keepi 0 coll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2652 2673]},
 :full-name "cljs.core/keep-indexed",
 :clj-symbol "clojure.core/keep-indexed",
 :docstring "Returns a lazy sequence of the non-nil results of (f index item). Note,\nthis means false return values will be included.  f must be free of\nside-effects."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keep-indexed"]))
```

-->
