## cljs.core/make-hierarchy



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/make-hierarchy</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/make-hierarchy)
</td>
</tr>
</table>


 <samp>
(__make-hierarchy__)<br>
</samp>

---



###### See Also:

[`cljs.core/ancestors`](../cljs.core/ancestors.md)<br>
[`cljs.core/descendants`](../cljs.core/descendants.md)<br>
[`cljs.core/isa?`](../cljs.core/isaQMARK.md)<br>
[`cljs.core/derive`](../cljs.core/derive.md)<br>

---


Source docstring:

```
Creates a hierarchy object for use with derive, isa? etc.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L7169-L7171):

```clj
(defn make-hierarchy
  [] {:parents {} :descendants {} :ancestors {}})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7169-7171](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L7169-L7171)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/make-hierarchy` @ clojuredocs](http://clojuredocs.org/clojure.core/make-hierarchy)<br>
[`clojure.core/make-hierarchy` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/make-hierarchy/)<br>
[`clojure.core/make-hierarchy` @ crossclj](http://crossclj.info/fun/clojure.core/make-hierarchy.html)<br>
[`cljs.core/make-hierarchy` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/make-hierarchy.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/make-hierarchy.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "make-hierarchy",
 :signature ["[]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/ancestors"
           "cljs.core/descendants"
           "cljs.core/isa?"
           "cljs.core/derive"],
 :full-name-encode "cljs.core/make-hierarchy",
 :source {:code "(defn make-hierarchy\n  [] {:parents {} :descendants {} :ancestors {}})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7169 7171]},
 :full-name "cljs.core/make-hierarchy",
 :clj-symbol "clojure.core/make-hierarchy",
 :docstring "Creates a hierarchy object for use with derive, isa? etc."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/make-hierarchy"]))
```

-->
