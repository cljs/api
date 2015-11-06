## cljs.core/as->



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/as-></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/as-%3E)
</td>
</tr>
</table>


 <samp>
(__as->__ expr name & forms)<br>
</samp>

---

Binds `name` to `expr`, evaluates the first form in the lexical context of that
binding, then binds `name` to that result, repeating for each successive form,
returning the result of the last form.

Useful for when you want a threading macro to use different "places" at each
form.



---

###### Examples:

```clj
(as-> [1 2 3 4] x
  (reduce + x)
  (/ x 2))
;;=> 5
```



---

###### See Also:

[`cljs.core/->`](../cljs.core/-GT.md)<br>
[`cljs.core/->>`](../cljs.core/-GTGT.md)<br>
[`cljs.core/cond->`](../cljs.core/cond-GT.md)<br>
[`cljs.core/cond->>`](../cljs.core/cond-GTGT.md)<br>
[`cljs.core/some->`](../cljs.core/some-GT.md)<br>
[`cljs.core/some->>`](../cljs.core/some-GTGT.md)<br>

---


Source docstring:

```
Binds name to expr, evaluates the first form in the lexical context
of that binding, then binds name to that result, repeating for each
successive form, returning the result of the last form.
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L7259-L7267):

```clj
(defmacro as->
  [expr name & forms]
  `(let [~name ~expr
         ~@(interleave (repeat name) forms)]
     ~name))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0-alpha6
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:7259-7267](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L7259-L7267)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/as->` @ clojuredocs](http://clojuredocs.org/clojure.core/as->)<br>
[`clojure.core/as->` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/as-%3E/)<br>
[`clojure.core/as->` @ crossclj](http://crossclj.info/fun/clojure.core/as-%3E.html)<br>
[`cljs.core/as->` @ crossclj](http://crossclj.info/fun/cljs.core/as-%3E.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/as-GT.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Binds `name` to `expr`, evaluates the first form in the lexical context of that\nbinding, then binds `name` to that result, repeating for each successive form,\nreturning the result of the last form.\n\nUseful for when you want a threading macro to use different \"places\" at each\nform.",
 :ns "cljs.core",
 :name "as->",
 :signature ["[expr name & forms]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :related ["cljs.core/->"
           "cljs.core/->>"
           "cljs.core/cond->"
           "cljs.core/cond->>"
           "cljs.core/some->"
           "cljs.core/some->>"],
 :full-name-encode "cljs.core/as-GT",
 :source {:code "(defmacro as->\n  [expr name & forms]\n  `(let [~name ~expr\n         ~@(interleave (repeat name) forms)]\n     ~name))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0-alpha6",
          :filename "src/clj/clojure/core.clj",
          :lines [7259 7267]},
 :examples [{:id "5e7eef",
             :content "```clj\n(as-> [1 2 3 4] x\n  (reduce + x)\n  (/ x 2))\n;;=> 5\n```"}],
 :full-name "cljs.core/as->",
 :clj-symbol "clojure.core/as->",
 :docstring "Binds name to expr, evaluates the first form in the lexical context\nof that binding, then binds name to that result, repeating for each\nsuccessive form, returning the result of the last form."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/as->"]))
```

-->
