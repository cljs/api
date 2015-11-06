## cljs.repl/doc



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/doc</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/doc)
</td>
</tr>
</table>


 <samp>
(__doc__ name)<br>
</samp>

---

Prints documentation for the var or special form with the name `name`.



---

###### Examples:

```clj
(doc map)
;; Prints:
;;  -------------------------
;;  cljs.core/map
;;  [f coll]
;;    Returns a lazy sequence consisting of the result of applying f to
;;    the set of first items of each coll, followed by applying f to the
;;    set of second items in each coll, until any one of the colls is
;;    exhausted.  Any remaining items in other colls are ignored. Function
;;    f should accept number-of-colls arguments. Returns a transducer when
;;    no collection is provided.
;;
;;=> nil
```



---

###### See Also:

[``](../cljs.repl/find-doc.md)<br>
[`cljs.core/meta`](../cljs.core/meta.md)<br>
[`var`](../special/var.md)<br>

---


Source docstring:

```
Prints documentation for a var or special form given its name
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/clj/cljs/repl.clj#L439-L442):

```clj
(defmacro doc
  [sym]
  `(cljs.repl/print-doc (meta (var ~sym))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:439-442](https://github.com/clojure/clojurescript/blob/r2719/src/clj/cljs/repl.clj#L439-L442)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.repl/doc` @ clojuredocs](http://clojuredocs.org/clojure.repl/doc)<br>
[`clojure.repl/doc` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.repl/doc/)<br>
[`clojure.repl/doc` @ crossclj](http://crossclj.info/fun/clojure.repl/doc.html)<br>
[`cljs.repl/doc` @ crossclj](http://crossclj.info/fun/cljs.repl/doc.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/doc.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Prints documentation for the var or special form with the name `name`.",
 :ns "cljs.repl",
 :name "doc",
 :signature ["[name]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :related ["cljs.repl/find-doc" "cljs.core/meta" "special/var"],
 :full-name-encode "cljs.repl/doc",
 :source {:code "(defmacro doc\n  [sym]\n  `(cljs.repl/print-doc (meta (var ~sym))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/clj/cljs/repl.clj",
          :lines [439 442]},
 :examples [{:id "4d2768",
             :content "```clj\n(doc map)\n;; Prints:\n;;  -------------------------\n;;  cljs.core/map\n;;  [f coll]\n;;    Returns a lazy sequence consisting of the result of applying f to\n;;    the set of first items of each coll, followed by applying f to the\n;;    set of second items in each coll, until any one of the colls is\n;;    exhausted.  Any remaining items in other colls are ignored. Function\n;;    f should accept number-of-colls arguments. Returns a transducer when\n;;    no collection is provided.\n;;\n;;=> nil\n```"}],
 :full-name "cljs.repl/doc",
 :clj-symbol "clojure.repl/doc",
 :docstring "Prints documentation for a var or special form given its name"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/doc"]))
```

-->
