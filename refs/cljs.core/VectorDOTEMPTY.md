## cljs.core/Vector.EMPTY



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L2830):

```clj
(set! cljs.core.Vector/EMPTY (Vector. nil (array) 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2830](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L2830)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/Vector.EMPTY` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Vector.EMPTY.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/VectorDOTEMPTY.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Vector.EMPTY",
 :type "var",
 :parent-type "Vector",
 :source {:code "(set! cljs.core.Vector/EMPTY (Vector. nil (array) 0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2830]},
 :full-name "cljs.core/Vector.EMPTY",
 :full-name-encode "cljs.core/VectorDOTEMPTY",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Vector.EMPTY"]))
```

-->
