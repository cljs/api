## cljs.core/ex-data



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" title="Added in 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ex-data</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ex-data)
</td>
</tr>
</table>


 <samp>
(__ex-data__ ex)<br>
</samp>

---





Source docstring:

```
Alpha - subject to change.
Returns exception data (a map) if ex is an ExceptionInfo.
Otherwise returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/core.cljs#L9898-L9904):

```clj
(defn ex-data
  [ex]
  (when (instance? ExceptionInfo ex)
    (.-data ex)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9898-9904](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/core.cljs#L9898-L9904)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ex-data` @ clojuredocs](http://clojuredocs.org/clojure.core/ex-data)<br>
[`clojure.core/ex-data` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ex-data/)<br>
[`clojure.core/ex-data` @ crossclj](http://crossclj.info/fun/clojure.core/ex-data.html)<br>
[`cljs.core/ex-data` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ex-data.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ex-data.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ex-data",
 :signature ["[ex]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core/ex-data",
 :source {:code "(defn ex-data\n  [ex]\n  (when (instance? ExceptionInfo ex)\n    (.-data ex)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9898 9904]},
 :full-name "cljs.core/ex-data",
 :clj-symbol "clojure.core/ex-data",
 :docstring "Alpha - subject to change.\nReturns exception data (a map) if ex is an ExceptionInfo.\nOtherwise returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ex-data"]))
```

-->
