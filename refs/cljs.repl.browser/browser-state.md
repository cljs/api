## cljs.repl.browser/browser-state



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2760/src/clj/cljs/repl/browser.clj#L21-L23):

```clj
(defonce browser-state
  (atom {:return-value-fn nil
         :client-js nil}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2760
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:21-23](https://github.com/clojure/clojurescript/blob/r2760/src/clj/cljs/repl/browser.clj#L21-L23)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/browser-state` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/browser-state.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/browser-state.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "browser-state",
 :type "var",
 :source {:code "(defonce browser-state\n  (atom {:return-value-fn nil\n         :client-js nil}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [21 23]},
 :full-name "cljs.repl.browser/browser-state",
 :full-name-encode "cljs.repl.browser/browser-state",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/browser-state"]))
```

-->
