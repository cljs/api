## cljs.repl/repl



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl__ repl-env & {:as opts})<br>
</samp>

---





Source docstring:

```
Note - repl will reload core.cljs every time, even if supplied old repl-env
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/repl.clj#L426-L429):

```clj
(defn repl
  [repl-env & {:as opts}]
  (repl* repl-env opts))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:426-429](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/repl.clj#L426-L429)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/repl` @ crossclj](http://crossclj.info/fun/cljs.repl/repl.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/repl.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "repl",
 :signature ["[repl-env & {:as opts}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl/repl",
 :source {:code "(defn repl\n  [repl-env & {:as opts}]\n  (repl* repl-env opts))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/clj/cljs/repl.clj",
          :lines [426 429]},
 :full-name "cljs.repl/repl",
 :docstring "Note - repl will reload core.cljs every time, even if supplied old repl-env"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl"]))
```

-->
