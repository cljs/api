## cljs.repl.reflect/read-url-string



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/repl/reflect.clj#L42):

```clj
(def read-url-string (comp read-string url-decode))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[reflect.clj:42](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/repl/reflect.clj#L42)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.reflect/read-url-string` @ crossclj](http://crossclj.info/fun/cljs.repl.reflect/read-url-string.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.reflect/read-url-string.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.reflect",
 :name "read-url-string",
 :type "var",
 :source {:code "(def read-url-string (comp read-string url-decode))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/clj/cljs/repl/reflect.clj",
          :lines [42]},
 :full-name "cljs.repl.reflect/read-url-string",
 :full-name-encode "cljs.repl.reflect/read-url-string",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.reflect/read-url-string"]))
```

-->
