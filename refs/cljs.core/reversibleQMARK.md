## cljs.core/reversible?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reversible?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reversible?)
</td>
</tr>
</table>


 <samp>
(__reversible?__ coll)<br>
</samp>

---

Returns true if `coll` implements the `IReversible` protocol, false otherwise.

Vectors, sorted maps, and sorted sets implement `IReversible`.



---






Source code @ [github](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L1963-L1964):

```clj
(defn ^boolean reversible? [coll]
  (satisfies? IReversible coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1963-1964](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L1963-L1964)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reversible?` @ clojuredocs](http://clojuredocs.org/clojure.core/reversible_q)<br>
[`clojure.core/reversible?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reversible%3F/)<br>
[`clojure.core/reversible?` @ crossclj](http://crossclj.info/fun/clojure.core/reversible%3F.html)<br>
[`cljs.core/reversible?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reversible%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reversibleQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `coll` implements the `IReversible` protocol, false otherwise.\n\nVectors, sorted maps, and sorted sets implement `IReversible`.",
 :return-type boolean,
 :ns "cljs.core",
 :name "reversible?",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/reversibleQMARK",
 :source {:code "(defn ^boolean reversible? [coll]\n  (satisfies? IReversible coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1963 1964]},
 :full-name "cljs.core/reversible?",
 :clj-symbol "clojure.core/reversible?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reversible?"]))
```

-->
