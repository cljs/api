## cljs.core/let



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/let</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/let)
</td>
</tr>
</table>


 <samp>
(__let__ bindings & body)<br>
</samp>

---

Binds expressions to symbols and makes those symbols available only within
`body`.

`bindings` should be a vector with an even number of forms, ie: `[a1 b1, a2 b2,
a3 b3]`. The first item in a pair (the `a`s) should be a symbol that is assigned
the evaluation of the second item (the `b`s). These symbols (the `a`s) are then
available within `body` (and not outside of `body`).

Another way to think about this is that the binding symbols in `let` are like
local `def`s that are only available within `let`'s scope.

In addition to direct symbol binding, `let` supports a destructuring syntax to
"break apart" collections into multiple symbols. This destructuring syntax is
like it's own [mini-language] and allows for succinct code.

`let` is a wrapper over one of ClojureScript's [special forms] and is a
fundamental building block of the language. Many macros rely on `let`s binding
syntax and scope rules.

[mini-language]:http://blog.jayfields.com/2010/07/clojure-destructuring.html
[special forms]:http://clojure.org/special_forms



---


###### See Also:

[`cljs.core/letfn`](../cljs.core/letfn.md)<br>
[`cljs.core/if-let`](../cljs.core/if-let.md)<br>

---


Source docstring:

```
binding => binding-form init-expr

Evaluates the exprs in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs or parts
therein.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1835/src/clj/cljs/core.clj#L127-L137):

```clj
(defmacro let
  [bindings & body]
  (assert-args
     (vector? bindings) "a vector for its binding"
     (even? (count bindings)) "an even number of forms in binding vector")
  `(let* ~(destructure bindings) ~@body))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1835
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:127-137](https://github.com/clojure/clojurescript/blob/r1835/src/clj/cljs/core.clj#L127-L137)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/let` @ clojuredocs](http://clojuredocs.org/clojure.core/let)<br>
[`clojure.core/let` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/let/)<br>
[`clojure.core/let` @ crossclj](http://crossclj.info/fun/clojure.core/let.html)<br>
[`cljs.core/let` @ crossclj](http://crossclj.info/fun/cljs.core/let.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/let.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Binds expressions to symbols and makes those symbols available only within\n`body`.\n\n`bindings` should be a vector with an even number of forms, ie: `[a1 b1, a2 b2,\na3 b3]`. The first item in a pair (the `a`s) should be a symbol that is assigned\nthe evaluation of the second item (the `b`s). These symbols (the `a`s) are then\navailable within `body` (and not outside of `body`).\n\nAnother way to think about this is that the binding symbols in `let` are like\nlocal `def`s that are only available within `let`'s scope.\n\nIn addition to direct symbol binding, `let` supports a destructuring syntax to\n\"break apart\" collections into multiple symbols. This destructuring syntax is\nlike it's own [mini-language] and allows for succinct code.\n\n`let` is a wrapper over one of ClojureScript's [special forms] and is a\nfundamental building block of the language. Many macros rely on `let`s binding\nsyntax and scope rules.\n\n[mini-language]:http://blog.jayfields.com/2010/07/clojure-destructuring.html\n[special forms]:http://clojure.org/special_forms",
 :ns "cljs.core",
 :name "let",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/letfn" "cljs.core/if-let"],
 :full-name-encode "cljs.core/let",
 :source {:code "(defmacro let\n  [bindings & body]\n  (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (even? (count bindings)) \"an even number of forms in binding vector\")\n  `(let* ~(destructure bindings) ~@body))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/clj/cljs/core.clj",
          :lines [127 137]},
 :full-name "cljs.core/let",
 :clj-symbol "clojure.core/let",
 :docstring "binding => binding-form init-expr\n\nEvaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/let"]))
```

-->
