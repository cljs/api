## cljs.repl/\*cljs-verbose\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L34):

```clj
(def ^:dynamic *cljs-verbose* false)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:34](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L34)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/*cljs-verbose*` @ crossclj](http://crossclj.info/fun/cljs.repl/*cljs-verbose*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/STARcljs-verboseSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "*cljs-verbose*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *cljs-verbose* false)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/repl.clj",
          :lines [34]},
 :full-name "cljs.repl/*cljs-verbose*",
 :full-name-encode "cljs.repl/STARcljs-verboseSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/*cljs-verbose*"]))
```

-->
