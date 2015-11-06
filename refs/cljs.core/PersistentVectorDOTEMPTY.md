## cljs.core/PersistentVector.EMPTY



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" title="Added in 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentVector.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentVector.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/cljs/core.cljs#L4548-L4549):

```clj
(set! (.-EMPTY PersistentVector)
  (PersistentVector. nil 0 5 (.-EMPTY-NODE PersistentVector) (array) empty-ordered-hash))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3058
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4548-4549](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/cljs/core.cljs#L4548-L4549)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentVector.EMPTY` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentVector.EMPTY)<br>
[`clojure.lang/PersistentVector.EMPTY` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentVector.EMPTY/)<br>
[`clojure.lang/PersistentVector.EMPTY` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentVector.EMPTY.html)<br>
[`cljs.core/PersistentVector.EMPTY` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentVector.EMPTY.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentVectorDOTEMPTY.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentVector.EMPTY",
 :history [["+" "0.0-1006"]],
 :parent-type "PersistentVector",
 :type "var",
 :full-name-encode "cljs.core/PersistentVectorDOTEMPTY",
 :source {:code "(set! (.-EMPTY PersistentVector)\n  (PersistentVector. nil 0 5 (.-EMPTY-NODE PersistentVector) (array) empty-ordered-hash))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4548 4549]},
 :full-name "cljs.core/PersistentVector.EMPTY",
 :clj-symbol "clojure.lang/PersistentVector.EMPTY"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector.EMPTY"]))
```

-->
