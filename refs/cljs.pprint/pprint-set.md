## cljs.pprint/pprint-set



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/pprint.cljs#L2860):

```clj
(def pprint-set (formatter-out "~<#{~;~@{~w~^ ~:_~}~;}~:>"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:2860](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/pprint.cljs#L2860)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.pprint/pprint-set` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/pprint-set.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pprint-set.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "pprint-set",
 :type "var",
 :source {:code "(def pprint-set (formatter-out \"~<#{~;~@{~w~^ ~:_~}~;}~:>\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [2860]},
 :full-name "cljs.pprint/pprint-set",
 :full-name-encode "cljs.pprint/pprint-set",
 :history [["+" "0.0-3255"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-set"]))
```

-->
