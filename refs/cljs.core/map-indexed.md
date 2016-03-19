## cljs.core/map-indexed



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/map-indexed</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/map-indexed)
</td>
</tr>
</table>


 <samp>
(__map-indexed__ f coll)<br>
</samp>

---

Returns a lazy sequence consisting of the result of applying `f` to 0 and the
first item of `coll`, followed by applying `f` to 1 and the second item in
`coll`, etc, until `coll` is exhausted.

Function `f` should accept 2 arguments, index and item.



---


###### See Also:

[`cljs.core/map`](../cljs.core/map.md)<br>
[`cljs.core/keep-indexed`](../cljs.core/keep-indexed.md)<br>

---


Source docstring:

```
Returns a lazy sequence consisting of the result of applying f to 0
and the first item of coll, followed by applying f to 1 and the second
item in coll, etc, until coll is exhausted. Thus function f should
accept 2 arguments, index and item. Returns a stateful transducer when
no collection is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L4013-L4039):

```clj
(defn map-indexed
  ([f]
    (fn [rf]
      (let [i (volatile! -1)]
        (fn
          ([] (rf))
          ([result] (rf result))
          ([result input]
            (rf result (f (vswap! i inc) input)))))))
  ([f coll]
    (letfn [(mapi [idx coll]
              (lazy-seq
                (when-let [s (seq coll)]
                  (if (chunked-seq? s)
                    (let [c (chunk-first s)
                          size (count c)
                          b (chunk-buffer size)]
                      (dotimes [i size]
                        (chunk-append b (f (+ idx i) (-nth c i))))
                      (chunk-cons (chunk b) (mapi (+ idx size) (chunk-rest s))))
                    (cons (f idx (first s)) (mapi (inc idx) (rest s)))))))]
      (mapi 0 coll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4013-4039](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L4013-L4039)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/map-indexed` @ clojuredocs](http://clojuredocs.org/clojure.core/map-indexed)<br>
[`clojure.core/map-indexed` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/map-indexed/)<br>
[`clojure.core/map-indexed` @ crossclj](http://crossclj.info/fun/clojure.core/map-indexed.html)<br>
[`cljs.core/map-indexed` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/map-indexed.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/map-indexed.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence consisting of the result of applying `f` to 0 and the\nfirst item of `coll`, followed by applying `f` to 1 and the second item in\n`coll`, etc, until `coll` is exhausted.\n\nFunction `f` should accept 2 arguments, index and item.",
 :ns "cljs.core",
 :name "map-indexed",
 :signature ["[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map" "cljs.core/keep-indexed"],
 :full-name-encode "cljs.core/map-indexed",
 :source {:code "(defn map-indexed\n  ([f]\n    (fn [rf]\n      (let [i (volatile! -1)]\n        (fn\n          ([] (rf))\n          ([result] (rf result))\n          ([result input]\n            (rf result (f (vswap! i inc) input)))))))\n  ([f coll]\n    (letfn [(mapi [idx coll]\n              (lazy-seq\n                (when-let [s (seq coll)]\n                  (if (chunked-seq? s)\n                    (let [c (chunk-first s)\n                          size (count c)\n                          b (chunk-buffer size)]\n                      (dotimes [i size]\n                        (chunk-append b (f (+ idx i) (-nth c i))))\n                      (chunk-cons (chunk b) (mapi (+ idx size) (chunk-rest s))))\n                    (cons (f idx (first s)) (mapi (inc idx) (rest s)))))))]\n      (mapi 0 coll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4013 4039]},
 :full-name "cljs.core/map-indexed",
 :clj-symbol "clojure.core/map-indexed",
 :docstring "Returns a lazy sequence consisting of the result of applying f to 0\nand the first item of coll, followed by applying f to 1 and the second\nitem in coll, etc, until coll is exhausted. Thus function f should\naccept 2 arguments, index and item. Returns a stateful transducer when\nno collection is provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/map-indexed"]))
```

-->
