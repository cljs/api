## cljs.core/reduce-kv



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reduce-kv</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reduce-kv)
</td>
</tr>
</table>


 <samp>
(__reduce-kv__ f init coll)<br>
</samp>

---

Reduces an associative collection.

`f` should be a function of 3 arguments. Returns the result of applying `f` to
`init`, the first key and the first value in `coll`, then applying `f` to that
result and the 2nd key and value, etc.

If `coll` contains no entries, returns `init` and `f` is not called.

Note that `reduce-kv` is supported on vectors, where the keys will be the
ordinals.



---


###### See Also:

[`cljs.core/reduce`](../cljs.core/reduce.md)<br>

---


Source docstring:

```
Reduces an associative collection. f should be a function of 3
arguments. Returns the result of applying f to init, the first key
and the first value in coll, then applying f to that result and the
2nd key and value, etc. If coll contains no entries, returns init
and f is not called. Note that reduce-kv is supported on vectors,
where the keys will be the ordinals.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/cljs/core.cljs#L1381-L1389):

```clj
(defn reduce-kv
  ([f init coll]
     (-kv-reduce coll f init)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1885
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1381-1389](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/cljs/core.cljs#L1381-L1389)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reduce-kv` @ clojuredocs](http://clojuredocs.org/clojure.core/reduce-kv)<br>
[`clojure.core/reduce-kv` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reduce-kv/)<br>
[`clojure.core/reduce-kv` @ crossclj](http://crossclj.info/fun/clojure.core/reduce-kv.html)<br>
[`cljs.core/reduce-kv` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reduce-kv.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reduce-kv.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Reduces an associative collection.\n\n`f` should be a function of 3 arguments. Returns the result of applying `f` to\n`init`, the first key and the first value in `coll`, then applying `f` to that\nresult and the 2nd key and value, etc.\n\nIf `coll` contains no entries, returns `init` and `f` is not called.\n\nNote that `reduce-kv` is supported on vectors, where the keys will be the\nordinals.",
 :ns "cljs.core",
 :name "reduce-kv",
 :signature ["[f init coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/reduce"],
 :full-name-encode "cljs.core/reduce-kv",
 :source {:code "(defn reduce-kv\n  ([f init coll]\n     (-kv-reduce coll f init)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1885",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1381 1389]},
 :full-name "cljs.core/reduce-kv",
 :clj-symbol "clojure.core/reduce-kv",
 :docstring "Reduces an associative collection. f should be a function of 3\narguments. Returns the result of applying f to init, the first key\nand the first value in coll, then applying f to that result and the\n2nd key and value, etc. If coll contains no entries, returns init\nand f is not called. Note that reduce-kv is supported on vectors,\nwhere the keys will be the ordinals."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduce-kv"]))
```

-->
