## cljs.core/declare



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/declare</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/declare)
</td>
</tr>
</table>


 <samp>
(__declare__ & names)<br>
</samp>

---

Uses `def` to establish symbols of `names` with no bindings.

Useful for making forward declarations.



---

###### Examples:

```clj
a
;; WARNING: Use of undeclared Var

(declare a)
a
;;=> nil
```



---

###### See Also:

[`def`](../special/def.md)<br>

---


Source docstring:

```
defs the supplied var names with no bindings, useful for making forward declarations.
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L2643-L2646):

```clj
(defmacro declare
  [& names] `(do ~@(map #(list 'def (vary-meta % assoc :declared true)) names)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0-alpha6
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:2643-2646](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L2643-L2646)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/declare` @ clojuredocs](http://clojuredocs.org/clojure.core/declare)<br>
[`clojure.core/declare` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/declare/)<br>
[`clojure.core/declare` @ crossclj](http://crossclj.info/fun/clojure.core/declare.html)<br>
[`cljs.core/declare` @ crossclj](http://crossclj.info/fun/cljs.core/declare.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/declare.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Uses `def` to establish symbols of `names` with no bindings.\n\nUseful for making forward declarations.",
 :ns "cljs.core",
 :name "declare",
 :signature ["[& names]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/def"],
 :full-name-encode "cljs.core/declare",
 :source {:code "(defmacro declare\n  [& names] `(do ~@(map #(list 'def (vary-meta % assoc :declared true)) names)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0-alpha6",
          :filename "src/clj/clojure/core.clj",
          :lines [2643 2646]},
 :examples [{:id "5a2dc2",
             :content "```clj\na\n;; WARNING: Use of undeclared Var\n\n(declare a)\na\n;;=> nil\n```"}],
 :full-name "cljs.core/declare",
 :clj-symbol "clojure.core/declare",
 :docstring "defs the supplied var names with no bindings, useful for making forward declarations."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/declare"]))
```

-->
