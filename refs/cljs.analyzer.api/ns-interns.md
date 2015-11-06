## cljs.analyzer.api/ns-interns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns-interns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns-interns)
</td>
</tr>
</table>


 <samp>
(__ns-interns__ ns)<br>
</samp>

---





Source docstring:

```
Given a namespace return all the var analysis maps. Analagous to
clojure.core/ns-interns but returns var analysis maps not vars.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/analyzer/api.clj#L93-L100):

```clj
(defn ns-interns
  [ns]
  {:pre [(symbol? ns)]}
  (merge
    (get-in @env/*compiler* [::ana/namespaces ns :macros])
    (get-in @env/*compiler* [::ana/namespaces ns :defs])))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:93-100](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/analyzer/api.clj#L93-L100)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ns-interns` @ clojuredocs](http://clojuredocs.org/clojure.core/ns-interns)<br>
[`clojure.core/ns-interns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ns-interns/)<br>
[`clojure.core/ns-interns` @ crossclj](http://crossclj.info/fun/clojure.core/ns-interns.html)<br>
[`cljs.analyzer.api/ns-interns` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/ns-interns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/ns-interns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "ns-interns",
 :signature ["[ns]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/ns-interns",
 :source {:code "(defn ns-interns\n  [ns]\n  {:pre [(symbol? ns)]}\n  (merge\n    (get-in @env/*compiler* [::ana/namespaces ns :macros])\n    (get-in @env/*compiler* [::ana/namespaces ns :defs])))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [93 100]},
 :full-name "cljs.analyzer.api/ns-interns",
 :clj-symbol "clojure.core/ns-interns",
 :docstring "Given a namespace return all the var analysis maps. Analagous to\nclojure.core/ns-interns but returns var analysis maps not vars."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/ns-interns"]))
```

-->
