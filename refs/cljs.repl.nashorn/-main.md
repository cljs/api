## cljs.repl.nashorn/-main



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3165"><img valign="middle" alt="[+] 0.0-3165" title="Added in 0.0-3165" src="https://img.shields.io/badge/+-0.0--3165-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__-main__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/repl/nashorn.clj#L204-L205):

```clj
(defn -main []
  (repl/repl (repl-env)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:204-205](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/repl/nashorn.clj#L204-L205)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.nashorn/-main` @ crossclj](http://crossclj.info/fun/cljs.repl.nashorn/-main.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn/-main.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.nashorn",
 :name "-main",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn -main []\n  (repl/repl (repl-env)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [204 205]},
 :full-name "cljs.repl.nashorn/-main",
 :full-name-encode "cljs.repl.nashorn/-main",
 :history [["+" "0.0-3165"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/-main"]))
```

-->
