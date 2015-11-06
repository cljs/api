## cljs.core/some->



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/some-></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/some-%3E)
</td>
</tr>
</table>


 <samp>
(__some->__ expr & forms)<br>
</samp>

---

When `expr` is not nil, threads it into the first form (via `->`), and when that
result is not nil, through the next, etc.



---


###### See Also:

[`cljs.core/->`](../cljs.core/-GT.md)<br>
[`cljs.core/->>`](../cljs.core/-GTGT.md)<br>
[`cljs.core/some->>`](../cljs.core/some-GTGT.md)<br>
[`cljs.core/some`](../cljs.core/some.md)<br>

---


Source docstring:

```
When expr is not nil, threads it into the first form (via ->),
and when that result is not nil, through the next etc
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta1/src/clj/clojure/core.clj#L7267-L7276):

```clj
(defmacro some->
  [expr & forms]
  (let [g (gensym)
        pstep (fn [step] `(if (nil? ~g) nil (-> ~g ~step)))]
    `(let [~g ~expr
           ~@(interleave (repeat g) (map pstep forms))]
       ~g)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0-beta1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:7267-7276](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta1/src/clj/clojure/core.clj#L7267-L7276)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/some->` @ clojuredocs](http://clojuredocs.org/clojure.core/some->)<br>
[`clojure.core/some->` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/some-%3E/)<br>
[`clojure.core/some->` @ crossclj](http://crossclj.info/fun/clojure.core/some-%3E.html)<br>
[`cljs.core/some->` @ crossclj](http://crossclj.info/fun/cljs.core/some-%3E.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/some-GT.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "When `expr` is not nil, threads it into the first form (via `->`), and when that\nresult is not nil, through the next, etc.",
 :ns "cljs.core",
 :name "some->",
 :signature ["[expr & forms]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :related ["cljs.core/->"
           "cljs.core/->>"
           "cljs.core/some->>"
           "cljs.core/some"],
 :full-name-encode "cljs.core/some-GT",
 :source {:code "(defmacro some->\n  [expr & forms]\n  (let [g (gensym)\n        pstep (fn [step] `(if (nil? ~g) nil (-> ~g ~step)))]\n    `(let [~g ~expr\n           ~@(interleave (repeat g) (map pstep forms))]\n       ~g)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0-beta1",
          :filename "src/clj/clojure/core.clj",
          :lines [7267 7276]},
 :full-name "cljs.core/some->",
 :clj-symbol "clojure.core/some->",
 :docstring "When expr is not nil, threads it into the first form (via ->),\nand when that result is not nil, through the next etc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/some->"]))
```

-->
