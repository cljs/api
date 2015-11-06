## clojure.browser.repl/repl-print



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-print__ data)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/clojure/browser/repl.cljs#L30-L32):

```clj
(defn repl-print [data]
  (if-let [conn @xpc-connection]
    (net/transmit conn :print (pr-str data))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3190
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:30-32](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/clojure/browser/repl.cljs#L30-L32)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/repl-print` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/repl-print.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/repl-print.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "repl-print",
 :type "function",
 :signature ["[data]"],
 :source {:code "(defn repl-print [data]\n  (if-let [conn @xpc-connection]\n    (net/transmit conn :print (pr-str data))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [30 32]},
 :full-name "clojure.browser.repl/repl-print",
 :full-name-encode "clojure.browser.repl/repl-print",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/repl-print"]))
```

-->
