## cljs.repl.node/repl-env



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-env__ & {:as options})<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2758/src/clj/cljs/repl/node.clj#L177-L179):

```clj
(defn repl-env
  [& {:as options}]
  (repl-env* options))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2758
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:177-179](https://github.com/clojure/clojurescript/blob/r2758/src/clj/cljs/repl/node.clj#L177-L179)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.node/repl-env` @ crossclj](http://crossclj.info/fun/cljs.repl.node/repl-env.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/repl-env.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "repl-env",
 :type "function",
 :signature ["[& {:as options}]"],
 :source {:code "(defn repl-env\n  [& {:as options}]\n  (repl-env* options))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [177 179]},
 :full-name "cljs.repl.node/repl-env",
 :full-name-encode "cljs.repl.node/repl-env",
 :history [["+" "0.0-2629"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/repl-env"]))
```

-->
