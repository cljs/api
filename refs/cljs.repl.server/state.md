## cljs.repl.server/state



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/repl/server.clj#L16-L18):

```clj
(defonce state (atom {:socket nil
                      :connection nil
                      :promised-conn nil}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:16-18](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/repl/server.clj#L16-L18)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.server/state` @ crossclj](http://crossclj.info/fun/cljs.repl.server/state.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server/state.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.server",
 :name "state",
 :type "var",
 :source {:code "(defonce state (atom {:socket nil\n                      :connection nil\n                      :promised-conn nil}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [16 18]},
 :full-name "cljs.repl.server/state",
 :full-name-encode "cljs.repl.server/state",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/state"]))
```

-->
