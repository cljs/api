## cljs.core/nthrest



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" title="Added in 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nthrest</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nthrest)
</td>
</tr>
</table>


 <samp>
(__nthrest__ coll n)<br>
</samp>

---

Returns the `nth` rest of `coll`.

Returns `coll` when `n` is 0.



---


###### See Also:

[`cljs.core/drop`](../cljs.core/drop.md)<br>
[`cljs.core/nthnext`](../cljs.core/nthnext.md)<br>
[`cljs.core/nth`](../cljs.core/nth.md)<br>

---


Source docstring:

```
Returns the nth rest of coll, coll when n is 0.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L1247-L1253):

```clj
(defn nthrest
  [coll n]
    (loop [n n xs coll]
      (if (and (pos? n) (seq xs))
        (recur (dec n) (rest xs))
        xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2629
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1247-1253](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L1247-L1253)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/nthrest` @ clojuredocs](http://clojuredocs.org/clojure.core/nthrest)<br>
[`clojure.core/nthrest` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/nthrest/)<br>
[`clojure.core/nthrest` @ crossclj](http://crossclj.info/fun/clojure.core/nthrest.html)<br>
[`cljs.core/nthrest` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/nthrest.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/nthrest.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the `nth` rest of `coll`.\n\nReturns `coll` when `n` is 0.",
 :ns "cljs.core",
 :name "nthrest",
 :signature ["[coll n]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :related ["cljs.core/drop" "cljs.core/nthnext" "cljs.core/nth"],
 :full-name-encode "cljs.core/nthrest",
 :source {:code "(defn nthrest\n  [coll n]\n    (loop [n n xs coll]\n      (if (and (pos? n) (seq xs))\n        (recur (dec n) (rest xs))\n        xs)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1247 1253]},
 :full-name "cljs.core/nthrest",
 :clj-symbol "clojure.core/nthrest",
 :docstring "Returns the nth rest of coll, coll when n is 0."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nthrest"]))
```

-->
