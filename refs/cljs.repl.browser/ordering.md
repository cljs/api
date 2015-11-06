## cljs.repl.browser/ordering



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2069/src/clj/cljs/repl/browser.clj#L113):

```clj
(def ordering (agent {:expecting nil :fns {}}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2069
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:113](https://github.com/clojure/clojurescript/blob/r2069/src/clj/cljs/repl/browser.clj#L113)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/ordering` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/ordering.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/ordering.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "ordering",
 :type "var",
 :source {:code "(def ordering (agent {:expecting nil :fns {}}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [113]},
 :full-name "cljs.repl.browser/ordering",
 :full-name-encode "cljs.repl.browser/ordering",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/ordering"]))
```

-->
