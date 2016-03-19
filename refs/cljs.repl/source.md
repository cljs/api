## cljs.repl/source



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/source</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/source)
</td>
</tr>
</table>


 <samp>
(__source__ name)<br>
</samp>

---

Prints the source code for the given symbol `name`, if it can find it.  This
requires that the symbol resolve to a Var defined in a namespace for which the
.cljs is in the classpath.



---

###### Examples:

```clj
(source comment)
;; Prints:
;; (defmacro comment
;;   "Ignores body, yields nil"
;;   {:added "1.0"}
;;   [& body])
;;
;;=> nil
```



---

###### See Also:

[`cljs.repl/doc`](../cljs.repl/doc.md)<br>

---


Source docstring:

```
Prints the source code for the given symbol, if it can find it.
This requires that the symbol resolve to a Var defined in a
namespace for which the .cljs is in the classpath.

Example: (source filter)
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/repl.cljc#L1253-L1260):

```clj
(defmacro source
  [n]
  `(println ~(or (source-fn &env n) (str "Source not found"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:1253-1260](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/repl.cljc#L1253-L1260)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.repl/source` @ clojuredocs](http://clojuredocs.org/clojure.repl/source)<br>
[`clojure.repl/source` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.repl/source/)<br>
[`clojure.repl/source` @ crossclj](http://crossclj.info/fun/clojure.repl/source.html)<br>
[`cljs.repl/source` @ crossclj](http://crossclj.info/fun/cljs.repl/source.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/source.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Prints the source code for the given symbol `name`, if it can find it.  This\nrequires that the symbol resolve to a Var defined in a namespace for which the\n.cljs is in the classpath.",
 :ns "cljs.repl",
 :name "source",
 :signature ["[name]"],
 :history [["+" "0.0-2985"]],
 :type "macro",
 :related ["cljs.repl/doc"],
 :full-name-encode "cljs.repl/source",
 :source {:code "(defmacro source\n  [n]\n  `(println ~(or (source-fn &env n) (str \"Source not found\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [1253 1260]},
 :examples [{:id "94c94c",
             :content "```clj\n(source comment)\n;; Prints:\n;; (defmacro comment\n;;   \"Ignores body, yields nil\"\n;;   {:added \"1.0\"}\n;;   [& body])\n;;\n;;=> nil\n```"}],
 :full-name "cljs.repl/source",
 :clj-symbol "clojure.repl/source",
 :docstring "Prints the source code for the given symbol, if it can find it.\nThis requires that the symbol resolve to a Var defined in a\nnamespace for which the .cljs is in the classpath.\n\nExample: (source filter)"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/source"]))
```

-->
