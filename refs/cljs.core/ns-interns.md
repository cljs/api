## cljs.core/ns-interns



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-interns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-interns)
</td>
</tr>
</table>


 <samp>
(__ns-interns__ \[quote ns\])<br>
</samp>

---





Source docstring:

```
Returns a map of the intern mappings for the namespace.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/core.clj#L1676-L1685):

```clj
(defmacro ns-interns
  [[quote ns]]
  (core/assert (core/and (= quote 'quote) (core/symbol? ns))
    "Argument to ns-interns must be a quoted symbol")
  `(into {}
     [~@(map
          (fn [[sym _]]
            `[(symbol ~(name sym)) (var ~(symbol (name ns) (name sym)))])
          (get-in @env/*compiler* [:cljs.analyzer/namespaces ns :defs]))]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2850
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1676-1685](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/core.clj#L1676-L1685)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ns-interns` @ clojuredocs](http://clojuredocs.org/clojure.core/ns-interns)<br>
[`clojure.core/ns-interns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ns-interns/)<br>
[`clojure.core/ns-interns` @ crossclj](http://crossclj.info/fun/clojure.core/ns-interns.html)<br>
[`cljs.core/ns-interns` @ crossclj](http://crossclj.info/fun/cljs.core/ns-interns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ns-interns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ns-interns",
 :signature ["[[quote ns]]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.core/ns-interns",
 :source {:code "(defmacro ns-interns\n  [[quote ns]]\n  (core/assert (core/and (= quote 'quote) (core/symbol? ns))\n    \"Argument to ns-interns must be a quoted symbol\")\n  `(into {}\n     [~@(map\n          (fn [[sym _]]\n            `[(symbol ~(name sym)) (var ~(symbol (name ns) (name sym)))])\n          (get-in @env/*compiler* [:cljs.analyzer/namespaces ns :defs]))]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/clj/cljs/core.clj",
          :lines [1676 1685]},
 :full-name "cljs.core/ns-interns",
 :clj-symbol "clojure.core/ns-interns",
 :docstring "Returns a map of the intern mappings for the namespace."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ns-interns"]))
```

-->
