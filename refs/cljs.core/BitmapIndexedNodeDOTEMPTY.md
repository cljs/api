## cljs.core/BitmapIndexedNode.EMPTY



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/BitmapIndexedNode.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashMap.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L6159):

```clj
(set! (.-EMPTY BitmapIndexedNode) (BitmapIndexedNode. nil 0 (make-array 0)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6159](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L6159)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/BitmapIndexedNode.EMPTY` @ clojuredocs](http://clojuredocs.org/clojure.lang/BitmapIndexedNode.EMPTY)<br>
[`clojure.lang/BitmapIndexedNode.EMPTY` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/BitmapIndexedNode.EMPTY/)<br>
[`clojure.lang/BitmapIndexedNode.EMPTY` @ crossclj](http://crossclj.info/fun/clojure.lang/BitmapIndexedNode.EMPTY.html)<br>
[`cljs.core/BitmapIndexedNode.EMPTY` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/BitmapIndexedNode.EMPTY.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/BitmapIndexedNodeDOTEMPTY.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "BitmapIndexedNode.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "BitmapIndexedNode",
 :type "var",
 :full-name-encode "cljs.core/BitmapIndexedNodeDOTEMPTY",
 :source {:code "(set! (.-EMPTY BitmapIndexedNode) (BitmapIndexedNode. nil 0 (make-array 0)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6159]},
 :full-name "cljs.core/BitmapIndexedNode.EMPTY",
 :clj-symbol "clojure.lang/BitmapIndexedNode.EMPTY"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/BitmapIndexedNode.EMPTY"]))
```

-->
