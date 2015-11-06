## cljs.reader/\*default-data-reader-fn\*



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" title="Added in 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/reader.cljs#L530-L531):

```clj
(def *default-data-reader-fn*
  (atom nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:530-531](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/reader.cljs#L530-L531)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/*default-data-reader-fn*` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/*default-data-reader-fn*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/STARdefault-data-reader-fnSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "*default-data-reader-fn*",
 :type "var",
 :source {:code "(def *default-data-reader-fn*\n  (atom nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [530 531]},
 :full-name "cljs.reader/*default-data-reader-fn*",
 :full-name-encode "cljs.reader/STARdefault-data-reader-fnSTAR",
 :history [["+" "0.0-1576"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/*default-data-reader-fn*"]))
```

-->
