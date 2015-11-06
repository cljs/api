## deftype\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2655/src/clj/cljs/analyzer.clj#L1352-L1354):

```clj
(defmethod parse 'deftype*
  [_ env form _ _]
  (parse-type :deftype* env form))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2655
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1352-1354](https://github.com/clojure/clojurescript/blob/r2655/src/clj/cljs/analyzer.clj#L1352-L1354)</ins>
</pre>

-->

---




 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/deftypeSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "deftype*",
 :type "special form",
 :source {:code "(defmethod parse 'deftype*\n  [_ env form _ _]\n  (parse-type :deftype* env form))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1352 1354]},
 :full-name "special/deftype*",
 :full-name-encode "special/deftypeSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/deftype*"]))
```

-->
