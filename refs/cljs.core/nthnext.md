## cljs.core/nthnext



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nthnext</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nthnext)
</td>
</tr>
</table>


 <samp>
(__nthnext__ coll n)<br>
</samp>

---

Returns the `n`th `next` of `coll`.

Returns `(seq coll)` when `n` is 0.



---


###### See Also:

[`cljs.core/nth`](../cljs.core/nth.md)<br>
[`cljs.core/drop`](../cljs.core/drop.md)<br>
[``](../cljs.core/nthrest.md)<br>

---


Source docstring:

```
Returns the nth next of coll, (seq coll) when n is 0.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L1767-L1773):

```clj
(defn nthnext
  [coll n]
  (loop [n n xs (seq coll)]
    (if (and xs (pos? n))
      (recur (dec n) (next xs))
      xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1767-1773](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L1767-L1773)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/nthnext` @ clojuredocs](http://clojuredocs.org/clojure.core/nthnext)<br>
[`clojure.core/nthnext` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/nthnext/)<br>
[`clojure.core/nthnext` @ crossclj](http://crossclj.info/fun/clojure.core/nthnext.html)<br>
[`cljs.core/nthnext` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/nthnext.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/nthnext.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the `n`th `next` of `coll`.\n\nReturns `(seq coll)` when `n` is 0.",
 :ns "cljs.core",
 :name "nthnext",
 :signature ["[coll n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/nth" "cljs.core/drop" "cljs.core/nthrest"],
 :full-name-encode "cljs.core/nthnext",
 :source {:code "(defn nthnext\n  [coll n]\n  (loop [n n xs (seq coll)]\n    (if (and xs (pos? n))\n      (recur (dec n) (next xs))\n      xs)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1767 1773]},
 :full-name "cljs.core/nthnext",
 :clj-symbol "clojure.core/nthnext",
 :docstring "Returns the nth next of coll, (seq coll) when n is 0."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nthnext"]))
```

-->
