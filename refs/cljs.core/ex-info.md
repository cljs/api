## cljs.core/ex-info



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" title="Added in 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ex-info</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ex-info)
</td>
</tr>
</table>


 <samp>
(__ex-info__ msg data)<br>
</samp>
 <samp>
(__ex-info__ msg data cause)<br>
</samp>

---





Source docstring:

```
Alpha - subject to change.
Create an instance of ExceptionInfo, an Error type that carries a
map of additional data.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L9555-L9561):

```clj
(defn ex-info
  ([msg data] (ex-info msg data nil))
  ([msg data cause]
    (ExceptionInfo. msg data cause)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9555-9561](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L9555-L9561)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ex-info` @ clojuredocs](http://clojuredocs.org/clojure.core/ex-info)<br>
[`clojure.core/ex-info` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ex-info/)<br>
[`clojure.core/ex-info` @ crossclj](http://crossclj.info/fun/clojure.core/ex-info.html)<br>
[`cljs.core/ex-info` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ex-info.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ex-info.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ex-info",
 :signature ["[msg data]" "[msg data cause]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core/ex-info",
 :source {:code "(defn ex-info\n  ([msg data] (ex-info msg data nil))\n  ([msg data cause]\n    (ExceptionInfo. msg data cause)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9555 9561]},
 :full-name "cljs.core/ex-info",
 :clj-symbol "clojure.core/ex-info",
 :docstring "Alpha - subject to change.\nCreate an instance of ExceptionInfo, an Error type that carries a\nmap of additional data."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ex-info"]))
```

-->
