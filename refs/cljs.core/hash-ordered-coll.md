## cljs.core/hash-ordered-coll



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-ordered-coll</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-ordered-coll)
</td>
</tr>
</table>


 <samp>
(__hash-ordered-coll__ coll)<br>
</samp>

---





Source docstring:

```
Returns the hash code, consistent with =, for an external ordered
collection implementing Iterable.
See http://clojure.org/data_structures#hash for full algorithms.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L1175-L1184):

```clj
(defn ^number hash-ordered-coll
  [coll]
  (loop [n 0 hash-code 1 coll (seq coll)]
    (if-not (nil? coll)
      (recur (inc n) (bit-or (+ (imul 31 hash-code) (hash (first coll))) 0)
        (next coll))
      (mix-collection-hash hash-code n))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1175-1184](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L1175-L1184)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/hash-ordered-coll` @ clojuredocs](http://clojuredocs.org/clojure.core/hash-ordered-coll)<br>
[`clojure.core/hash-ordered-coll` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/hash-ordered-coll/)<br>
[`clojure.core/hash-ordered-coll` @ crossclj](http://crossclj.info/fun/clojure.core/hash-ordered-coll.html)<br>
[`cljs.core/hash-ordered-coll` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/hash-ordered-coll.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/hash-ordered-coll.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type number,
 :ns "cljs.core",
 :name "hash-ordered-coll",
 :signature ["[coll]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core/hash-ordered-coll",
 :source {:code "(defn ^number hash-ordered-coll\n  [coll]\n  (loop [n 0 hash-code 1 coll (seq coll)]\n    (if-not (nil? coll)\n      (recur (inc n) (bit-or (+ (imul 31 hash-code) (hash (first coll))) 0)\n        (next coll))\n      (mix-collection-hash hash-code n))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1175 1184]},
 :full-name "cljs.core/hash-ordered-coll",
 :clj-symbol "clojure.core/hash-ordered-coll",
 :docstring "Returns the hash code, consistent with =, for an external ordered\ncollection implementing Iterable.\nSee http://clojure.org/data_structures#hash for full algorithms."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-ordered-coll"]))
```

-->
