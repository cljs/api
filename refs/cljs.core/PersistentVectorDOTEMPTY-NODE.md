## cljs.core/PersistentVector.EMPTY-NODE



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github]():

```clj
(set! (.-EMPTY-NODE PersistentVector) (VectorNode. nil (make-array 32)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentVector.EMPTY-NODE` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentVector.EMPTY-NODE.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentVectorDOTEMPTY-NODE.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentVector.EMPTY-NODE",
 :name-encode "PersistentVectorDOTEMPTY-NODE",
 :history [["+" "0.0-2301"]],
 :parent-type "PersistentVector",
 :type "var",
 :full-name-encode "cljs.core/PersistentVectorDOTEMPTY-NODE",
 :source {:code "(set! (.-EMPTY-NODE PersistentVector) (VectorNode. nil (make-array 32)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5056],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L5056"},
 :full-name "cljs.core/PersistentVector.EMPTY-NODE",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentVectorDOTEMPTY-NODE.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector.EMPTY-NODE"]))
```

-->
