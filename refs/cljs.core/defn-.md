## cljs.core/defn-



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defn-</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defn-)
</td>
</tr>
</table>


 <samp>
(__defn-__ name & decls)<br>
</samp>

---

Same as `defn`, but adds `{:private true}` metadata to the definition.

Note: `:private` metadata is not currently enforced by the ClojureScript
compiler.



---


###### See Also:

[`cljs.core/defn`](../cljs.core/defn.md)<br>

---


Source docstring:

```
same as defn, yielding non-public def
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L4455-L4459):

```clj
(defmacro defn-
  [name & decls]
    (list* `defn (with-meta name (assoc (meta name) :private true)) decls))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4455-4459](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L4455-L4459)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/defn-` @ clojuredocs](http://clojuredocs.org/clojure.core/defn-)<br>
[`clojure.core/defn-` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defn-/)<br>
[`clojure.core/defn-` @ crossclj](http://crossclj.info/fun/clojure.core/defn-.html)<br>
[`cljs.core/defn-` @ crossclj](http://crossclj.info/fun/cljs.core/defn-.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defn-.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Same as `defn`, but adds `{:private true}` metadata to the definition.\n\nNote: `:private` metadata is not currently enforced by the ClojureScript\ncompiler.",
 :ns "cljs.core",
 :name "defn-",
 :signature ["[name & decls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/defn"],
 :full-name-encode "cljs.core/defn-",
 :source {:code "(defmacro defn-\n  [name & decls]\n    (list* `defn (with-meta name (assoc (meta name) :private true)) decls))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/clj/clojure/core.clj",
          :lines [4455 4459]},
 :full-name "cljs.core/defn-",
 :clj-symbol "clojure.core/defn-",
 :docstring "same as defn, yielding non-public def"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defn-"]))
```

-->
