## ~~cljs.core/PersistentVector.EMPTY_NODE~~


> __MOVED__, please see [`cljs.core/PersistentVector.EMPTY-NODE`](../cljs.core/PersistentVectorDOTEMPTY-NODE.md)

 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" title="Added in 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[×] 0.0-2301" title="Removed in 0.0-2301" src="https://img.shields.io/badge/×-0.0--2301-red.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L3667):

```clj
(set! cljs.core.PersistentVector.EMPTY_NODE (VectorNode. nil (make-array 32)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3667](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L3667)</ins>
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
{:moved "cljs.core/PersistentVector.EMPTY-NODE",
 :ns "cljs.core",
 :name "PersistentVector.EMPTY_NODE",
 :history [["+" "0.0-1006"] ["-" "0.0-2301"]],
 :parent-type "PersistentVector",
 :type "var",
 :full-name-encode "cljs.core/PersistentVectorDOTEMPTY_NODE",
 :source {:code "(set! cljs.core.PersistentVector.EMPTY_NODE (VectorNode. nil (make-array 32)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3667]},
 :full-name "cljs.core/PersistentVector.EMPTY_NODE",
 :removed {:in "0.0-2301", :last-seen "0.0-2280"}}

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
