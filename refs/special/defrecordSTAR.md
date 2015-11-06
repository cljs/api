## defrecord\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/analyzer.clj#L1410-L1412):

```clj
(defmethod parse 'defrecord*
  [_ env form _ _]
  (parse-type :defrecord* env form) )
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1410-1412](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/analyzer.clj#L1410-L1412)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/defrecordSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "defrecord*",
 :type "special form",
 :source {:code "(defmethod parse 'defrecord*\n  [_ env form _ _]\n  (parse-type :defrecord* env form) )",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1410 1412]},
 :full-name "special/defrecord*",
 :full-name-encode "special/defrecordSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/defrecord*"]))
```

-->
