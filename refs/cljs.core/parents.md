## cljs.core/parents



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/parents</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/parents)
</td>
</tr>
</table>


 <samp>
(__parents__ tag)<br>
</samp>
 <samp>
(__parents__ h tag)<br>
</samp>

---





Source docstring:

```
Returns the immediate parents of tag, either via a JavaScript type
inheritance relationship or a relationship established via derive. h
must be a hierarchy obtained from make-hierarchy, if not supplied
defaults to the global hierarchy
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2173/src/cljs/cljs/core.cljs#L7449-L7455):

```clj
(defn parents
  ([tag] (parents @(get-global-hierarchy) tag))
  ([h tag] (not-empty (get (:parents h) tag))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2173
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7449-7455](https://github.com/clojure/clojurescript/blob/r2173/src/cljs/cljs/core.cljs#L7449-L7455)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/parents` @ clojuredocs](http://clojuredocs.org/clojure.core/parents)<br>
[`clojure.core/parents` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/parents/)<br>
[`clojure.core/parents` @ crossclj](http://crossclj.info/fun/clojure.core/parents.html)<br>
[`cljs.core/parents` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/parents.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/parents.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "parents",
 :signature ["[tag]" "[h tag]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/parents",
 :source {:code "(defn parents\n  ([tag] (parents @(get-global-hierarchy) tag))\n  ([h tag] (not-empty (get (:parents h) tag))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2173",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7449 7455]},
 :full-name "cljs.core/parents",
 :clj-symbol "clojure.core/parents",
 :docstring "Returns the immediate parents of tag, either via a JavaScript type\ninheritance relationship or a relationship established via derive. h\nmust be a hierarchy obtained from make-hierarchy, if not supplied\ndefaults to the global hierarchy"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/parents"]))
```

-->
