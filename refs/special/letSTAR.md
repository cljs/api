## let\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2985/src/clj/cljs/analyzer.clj#L1003-L1005):

```clj
(defmethod parse 'let*
  [op encl-env form _ _]
  (analyze-let encl-env form false))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2985
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1003-1005](https://github.com/clojure/clojurescript/blob/r2985/src/clj/cljs/analyzer.clj#L1003-L1005)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/letSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "let*",
 :type "special form",
 :source {:code "(defmethod parse 'let*\n  [op encl-env form _ _]\n  (analyze-let encl-env form false))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1003 1005]},
 :full-name "special/let*",
 :full-name-encode "special/letSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/let*"]))
```

-->
