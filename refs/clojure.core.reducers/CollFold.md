## clojure.core.reducers/CollFold



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" title="Added in 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/clojure/core/reducers.cljs#L46-L47):

```clj
(defprotocol CollFold
  (coll-fold [coll n combinef reducef]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2985
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:46-47](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/clojure/core/reducers.cljs#L46-L47)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/CollFold` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/CollFold.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/CollFold.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "CollFold",
 :type "protocol",
 :full-name-encode "clojure.core.reducers/CollFold",
 :source {:code "(defprotocol CollFold\n  (coll-fold [coll n combinef reducef]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [46 47]},
 :methods [{:name "coll-fold",
            :signature ["[coll n combinef reducef]"],
            :docstring nil}],
 :full-name "clojure.core.reducers/CollFold",
 :history [["+" "0.0-2120"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/CollFold"]))
```

-->
