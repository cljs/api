## cljs.core/shuffle



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/shuffle</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/shuffle)
</td>
</tr>
</table>


 <samp>
(__shuffle__ coll)<br>
</samp>

---

Returns a random permutation of `coll`.



---




Source docstring:

```
Return a random permutation of coll
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L1683-L1688):

```clj
(defn shuffle
  [coll]
  (let [a (to-array coll)]
    (garray/shuffle a)
    (vec a)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2629
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1683-1688](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L1683-L1688)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/shuffle` @ clojuredocs](http://clojuredocs.org/clojure.core/shuffle)<br>
[`clojure.core/shuffle` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/shuffle/)<br>
[`clojure.core/shuffle` @ crossclj](http://crossclj.info/fun/clojure.core/shuffle.html)<br>
[`cljs.core/shuffle` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/shuffle.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/shuffle.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a random permutation of `coll`.",
 :ns "cljs.core",
 :name "shuffle",
 :signature ["[coll]"],
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core/shuffle",
 :source {:code "(defn shuffle\n  [coll]\n  (let [a (to-array coll)]\n    (garray/shuffle a)\n    (vec a)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1683 1688]},
 :full-name "cljs.core/shuffle",
 :clj-symbol "clojure.core/shuffle",
 :docstring "Return a random permutation of coll"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/shuffle"]))
```

-->
