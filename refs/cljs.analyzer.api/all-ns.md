## cljs.analyzer.api/all-ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/all-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/all-ns)
</td>
</tr>
</table>


 <samp>
(__all-ns__)<br>
</samp>

---





Source docstring:

```
Return all namespaces. Analagous to clojure.core/all-ns but
returns symbols identifying namespaces not Namespace instances.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/analyzer/api.clj#L80-L84):

```clj
(defn all-ns
  []
  (keys (get @env/*compiler* ::ana/namespaces)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── analyzer
                └── <ins>[api.clj:80-84](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/analyzer/api.clj#L80-L84)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/all-ns` @ clojuredocs](http://clojuredocs.org/clojure.core/all-ns)<br>
[`clojure.core/all-ns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/all-ns/)<br>
[`clojure.core/all-ns` @ crossclj](http://crossclj.info/fun/clojure.core/all-ns.html)<br>
[`cljs.analyzer.api/all-ns` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/all-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/all-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "all-ns",
 :signature ["[]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/all-ns",
 :source {:code "(defn all-ns\n  []\n  (keys (get @env/*compiler* ::ana/namespaces)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/analyzer/api.clj",
          :lines [80 84]},
 :full-name "cljs.analyzer.api/all-ns",
 :clj-symbol "clojure.core/all-ns",
 :docstring "Return all namespaces. Analagous to clojure.core/all-ns but\nreturns symbols identifying namespaces not Namespace instances."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/all-ns"]))
```

-->
