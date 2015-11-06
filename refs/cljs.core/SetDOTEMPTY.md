## cljs.core/Set.EMPTY



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L2708):

```clj
(set! cljs.core.Set/EMPTY (Set. nil (hash-map)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2708](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L2708)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/Set.EMPTY` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Set.EMPTY.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/SetDOTEMPTY.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Set.EMPTY",
 :type "var",
 :parent-type "Set",
 :source {:code "(set! cljs.core.Set/EMPTY (Set. nil (hash-map)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2708]},
 :full-name "cljs.core/Set.EMPTY",
 :full-name-encode "cljs.core/SetDOTEMPTY",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Set.EMPTY"]))
```

-->
