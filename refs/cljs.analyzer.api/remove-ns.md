## cljs.analyzer.api/remove-ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" title="Added in 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-ns)
</td>
</tr>
</table>


 <samp>
(__remove-ns__ ns)<br>
</samp>
 <samp>
(__remove-ns__ state ns)<br>
</samp>

---





Source docstring:

```
Removes the namespace named by the symbol.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/clojure/cljs/analyzer/api.clj#L195-L201):

```clj
(defn remove-ns
  ([ns]
   (remove-ns env/*compiler* ns))
  ([state ns]
   {:pre [(symbol? ns)]}
   (swap! state update-in [::ana/namespaces] dissoc ns)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.107
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:195-201](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/clojure/cljs/analyzer/api.clj#L195-L201)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/remove-ns` @ clojuredocs](http://clojuredocs.org/clojure.core/remove-ns)<br>
[`clojure.core/remove-ns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/remove-ns/)<br>
[`clojure.core/remove-ns` @ crossclj](http://crossclj.info/fun/clojure.core/remove-ns.html)<br>
[`cljs.analyzer.api/remove-ns` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/remove-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/remove-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "remove-ns",
 :signature ["[ns]" "[state ns]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/remove-ns",
 :source {:code "(defn remove-ns\n  ([ns]\n   (remove-ns env/*compiler* ns))\n  ([state ns]\n   {:pre [(symbol? ns)]}\n   (swap! state update-in [::ana/namespaces] dissoc ns)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.107",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [195 201]},
 :full-name "cljs.analyzer.api/remove-ns",
 :clj-symbol "clojure.core/remove-ns",
 :docstring "Removes the namespace named by the symbol."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/remove-ns"]))
```

-->
