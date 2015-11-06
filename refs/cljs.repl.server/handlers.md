## cljs.repl.server/handlers



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/repl/server.clj#L39):

```clj
(defonce handlers (atom {}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[server.clj:39](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/repl/server.clj#L39)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.server/handlers` @ crossclj](http://crossclj.info/fun/cljs.repl.server/handlers.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server/handlers.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.server",
 :name "handlers",
 :type "var",
 :source {:code "(defonce handlers (atom {}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/clojure/cljs/repl/server.clj",
          :lines [39]},
 :full-name "cljs.repl.server/handlers",
 :full-name-encode "cljs.repl.server/handlers",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/handlers"]))
```

-->
