## cljs.core/tagged-literal



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/tagged-literal</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/tagged-literal)
</td>
</tr>
</table>


 <samp>
(__tagged-literal__ tag form)<br>
</samp>

---

Internal use only.  Create tagged literals with their [syntax form][doc:syntax/tagged-literal] instead.

[doc:syntax/tagged-literal]:../syntax/tagged-literal.md

---




Source docstring:

```
Construct a data representation of a tagged literal from a
tag symbol and a form.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L10252-L10257):

```clj
(defn tagged-literal
  [tag form]
  {:pre [(symbol? tag)]}
  (TaggedLiteral. tag form))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10252-10257](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L10252-L10257)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/tagged-literal` @ clojuredocs](http://clojuredocs.org/clojure.core/tagged-literal)<br>
[`clojure.core/tagged-literal` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/tagged-literal/)<br>
[`clojure.core/tagged-literal` @ crossclj](http://crossclj.info/fun/clojure.core/tagged-literal.html)<br>
[`cljs.core/tagged-literal` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/tagged-literal.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/tagged-literal.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Internal use only.  Create tagged literals with their [syntax form][doc:syntax/tagged-literal] instead.",
 :ns "cljs.core",
 :name "tagged-literal",
 :signature ["[tag form]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.core/tagged-literal",
 :source {:code "(defn tagged-literal\n  [tag form]\n  {:pre [(symbol? tag)]}\n  (TaggedLiteral. tag form))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10252 10257]},
 :full-name "cljs.core/tagged-literal",
 :clj-symbol "clojure.core/tagged-literal",
 :docstring "Construct a data representation of a tagged literal from a\ntag symbol and a form."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/tagged-literal"]))
```

-->
