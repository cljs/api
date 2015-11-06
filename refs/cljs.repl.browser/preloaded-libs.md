## cljs.repl.browser/preloaded-libs



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/repl/browser.clj#L24):

```clj
(def preloaded-libs (atom #{}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2227
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:24](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/repl/browser.clj#L24)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/preloaded-libs` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/preloaded-libs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/preloaded-libs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "preloaded-libs",
 :type "var",
 :source {:code "(def preloaded-libs (atom #{}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [24]},
 :full-name "cljs.repl.browser/preloaded-libs",
 :full-name-encode "cljs.repl.browser/preloaded-libs",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/preloaded-libs"]))
```

-->
