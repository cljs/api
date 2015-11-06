## cljs.core/PersistentVector.EMPTY_NODE



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" title="Added in 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L3309):

```clj
(set! cljs.core.PersistentVector/EMPTY_NODE (VectorNode. nil (make-array 32)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3309](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L3309)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentVector.EMPTY_NODE` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentVector.EMPTY_NODE.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentVectorDOTEMPTY_NODE.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentVector.EMPTY_NODE",
 :type "var",
 :parent-type "PersistentVector",
 :source {:code "(set! cljs.core.PersistentVector/EMPTY_NODE (VectorNode. nil (make-array 32)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3309]},
 :full-name "cljs.core/PersistentVector.EMPTY_NODE",
 :full-name-encode "cljs.core/PersistentVectorDOTEMPTY_NODE",
 :history [["+" "0.0-1006"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector.EMPTY_NODE"]))
```

-->
