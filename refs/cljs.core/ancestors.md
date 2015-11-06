## cljs.core/ancestors



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ancestors</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ancestors)
</td>
</tr>
</table>


 <samp>
(__ancestors__ tag)<br>
</samp>
 <samp>
(__ancestors__ h tag)<br>
</samp>

---



###### See Also:

[`cljs.core/descendants`](../cljs.core/descendants.md)<br>
[`cljs.core/isa?`](../cljs.core/isaQMARK.md)<br>
[`cljs.core/make-hierarchy`](../cljs.core/make-hierarchy.md)<br>
[`cljs.core/derive`](../cljs.core/derive.md)<br>

---


Source docstring:

```
Returns the immediate and indirect parents of tag, either via a JavaScript type
inheritance relationship or a relationship established via derive. h
must be a hierarchy obtained from make-hierarchy, if not supplied
defaults to the global hierarchy
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L9127-L9133):

```clj
(defn ancestors
  ([tag] (ancestors @(get-global-hierarchy) tag))
  ([h tag] (not-empty (get (:ancestors h) tag))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9127-9133](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L9127-L9133)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ancestors` @ clojuredocs](http://clojuredocs.org/clojure.core/ancestors)<br>
[`clojure.core/ancestors` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ancestors/)<br>
[`clojure.core/ancestors` @ crossclj](http://crossclj.info/fun/clojure.core/ancestors.html)<br>
[`cljs.core/ancestors` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ancestors.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ancestors.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ancestors",
 :signature ["[tag]" "[h tag]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/descendants"
           "cljs.core/isa?"
           "cljs.core/make-hierarchy"
           "cljs.core/derive"],
 :full-name-encode "cljs.core/ancestors",
 :source {:code "(defn ancestors\n  ([tag] (ancestors @(get-global-hierarchy) tag))\n  ([h tag] (not-empty (get (:ancestors h) tag))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9127 9133]},
 :full-name "cljs.core/ancestors",
 :clj-symbol "clojure.core/ancestors",
 :docstring "Returns the immediate and indirect parents of tag, either via a JavaScript type\ninheritance relationship or a relationship established via derive. h\nmust be a hierarchy obtained from make-hierarchy, if not supplied\ndefaults to the global hierarchy"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ancestors"]))
```

-->
