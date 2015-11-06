## cljs.analyzer.api/ns-resolve



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-resolve</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-resolve)
</td>
</tr>
</table>


 <samp>
(__ns-resolve__ ns sym)<br>
</samp>

---





Source docstring:

```
Given a namespace and a symbol return the corresponding var analysis map.
Analagous to clojure.core/ns-resolve but returns var analysis map not Var.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/analyzer/api.clj#L59-L64):

```clj
(defn ns-resolve
  [ns sym]
  {:pre [(symbol? ns) (symbol? sym)]}
  (get-in @env/*compiler* [::ana/namespaces ns :defs sym]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:59-64](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/analyzer/api.clj#L59-L64)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ns-resolve` @ clojuredocs](http://clojuredocs.org/clojure.core/ns-resolve)<br>
[`clojure.core/ns-resolve` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ns-resolve/)<br>
[`clojure.core/ns-resolve` @ crossclj](http://crossclj.info/fun/clojure.core/ns-resolve.html)<br>
[`cljs.analyzer.api/ns-resolve` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/ns-resolve.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/ns-resolve.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "ns-resolve",
 :signature ["[ns sym]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/ns-resolve",
 :source {:code "(defn ns-resolve\n  [ns sym]\n  {:pre [(symbol? ns) (symbol? sym)]}\n  (get-in @env/*compiler* [::ana/namespaces ns :defs sym]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [59 64]},
 :full-name "cljs.analyzer.api/ns-resolve",
 :clj-symbol "clojure.core/ns-resolve",
 :docstring "Given a namespace and a symbol return the corresponding var analysis map.\nAnalagous to clojure.core/ns-resolve but returns var analysis map not Var."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/ns-resolve"]))
```

-->
