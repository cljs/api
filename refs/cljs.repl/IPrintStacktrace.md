## cljs.repl/IPrintStacktrace



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2843"><img valign="middle" alt="[+] 0.0-2843" title="Added in 0.0-2843" src="https://img.shields.io/badge/+-0.0--2843-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl.cljc#L149-L152):

```clj
(defprotocol IPrintStacktrace
  (-print-stacktrace [repl-env stacktrace error build-options]
    "Implementing REPL evaluation environments are given the opportunity to
     print the mapped stacktrace themselves. This permits further processing."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:149-152](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/repl.cljc#L149-L152)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/IPrintStacktrace` @ crossclj](http://crossclj.info/fun/cljs.repl/IPrintStacktrace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/IPrintStacktrace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "IPrintStacktrace",
 :type "protocol",
 :full-name-encode "cljs.repl/IPrintStacktrace",
 :source {:code "(defprotocol IPrintStacktrace\n  (-print-stacktrace [repl-env stacktrace error build-options]\n    \"Implementing REPL evaluation environments are given the opportunity to\n     print the mapped stacktrace themselves. This permits further processing.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [149 152]},
 :methods [{:name "-print-stacktrace",
            :signature ["[repl-env stacktrace error build-options]"],
            :docstring "Implementing REPL evaluation environments are given the opportunity to\n     print the mapped stacktrace themselves. This permits further processing."}],
 :full-name "cljs.repl/IPrintStacktrace",
 :history [["+" "0.0-2843"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IPrintStacktrace"]))
```

-->
