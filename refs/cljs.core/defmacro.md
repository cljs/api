## cljs.core/defmacro



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defmacro</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defmacro)
</td>
</tr>
</table>


 <samp>
(__defmacro__ name doc-string? attr-map? \[params\*\] body)<br>
</samp>
 <samp>
(__defmacro__ name doc-string? attr-map? (\[params\*\] body) + attr-map?)<br>
</samp>

---

Defines a macro, which is essentially a function that runs at compile time.
Macros can be used to define syntactic constructs which would require
primitives or built-in support in other languages.

Using macros is as easy as using functions, but writing them is a little more
difficult.  Also, creating macros is generally discouraged if you can
accomplish the same goal with a function.

## Rules and Details

There is a strict rule for when you can use `defmacro` -- you can only use it
in what we call a _macro namespace_, effectively forcing you to separate your
compile time and runtime code.

A side effect of this is that you cannot use `defmacro` from a REPL.  Sorry!

This strict rule is due to the nature of differing compile time environments
for the optimized "ClojureScript JVM" compiler and the newer bootstrapped
"ClojureScript JS" compiler.

In order to create macros that are portable between either compiler version,
you must place macros in a `.cljc` file, but a `.clj` file is sufficient if no
[reader conditionals][doc:syntax/cond] are needed.  Why would they be needed?
Because ClojureScript macro namespaces may be handed off to Clojure for
evaluation, depending on the compiler version:

| compiler version  | macro namespaces evaluated by |
|-------------------|-------------------------------|
| ClojureScript JVM | Clojure                       |
| ClojureScript JS  | ClojureScript                 |

Please see the examples section below for a more concrete look.

[doc:syntax/cond]:../syntax/cond.md

---

###### Examples:

Here is a `str->int` macro that works for either ClojureScript compiler
version.  It simply expands to a `js/parseInt` call:

```clj
;; in macros.clj
(ns foo.macros)

;; expands to a runtime call
(defmacro str->int [s]
  `(js/parseInt s))
```

If we want to evaluate the conversion at _compile time_ instead of expanding it
to a runtime call, we must use reader conditionals (in a `.cljc` file) to
choose the function appropriate for each compiler's evaluation environment.

```clj
;; in macros.cljc
(ns foo.macros)

;; expands to the result of the conversion
(defmacro str->int [s]
  #?(:clj  (Integer/parseInt s)
     :cljs (js/parseInt s)))
```



---

###### See Also:

[`` syntax quote`](../syntax/syntax-quote.md)<br>
[`~ unquote`](../syntax/unquote.md)<br>
[`cljs.core/macroexpand`](../cljs.core/macroexpand.md)<br>
[`cljs.core/macroexpand-1`](../cljs.core/macroexpand-1.md)<br>

---


Source docstring:

```
Like defn, but the resulting function name is declared as a
macro and will be used as a macro by the compiler when it is
called.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/clojure/cljs/core.cljc#L2878-L2919):

```clj
(core/defn defmacro
  [&form &env name & args]
  (core/let [prefix (core/loop [p (core/list (vary-meta name assoc :macro true)) args args]
                      (core/let [f (first args)]
                        (if (core/string? f)
                          (recur (cons f p) (next args))
                          (if (map? f)
                            (recur (cons f p) (next args))
                            p))))
             fdecl (core/loop [fd args]
                     (if (core/string? (first fd))
                       (recur (next fd))
                       (if (map? (first fd))
                         (recur (next fd))
                         fd)))
             fdecl (if (vector? (first fdecl))
                     (core/list fdecl)
                     fdecl)
             add-implicit-args (core/fn [fd]
                                 (core/let [args (first fd)]
                                   (cons (vec (cons '&form (cons '&env args))) (next fd))))
             add-args (core/fn [acc ds]
                        (if (core/nil? ds)
                          acc
                          (core/let [d (first ds)]
                            (if (map? d)
                              (conj acc d)
                              (recur (conj acc (add-implicit-args d)) (next ds))))))
             fdecl (seq (add-args [] fdecl))
             decl (core/loop [p prefix d fdecl]
                    (if p
                      (recur (next p) (cons (first p) d))
                      d))]
    (core/list 'do
      (cons `defn decl)
      (core/list 'set! `(. ~name ~'-cljs$lang$macro) true))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:2878-2919](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/clojure/cljs/core.cljc#L2878-L2919)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/defmacro` @ clojuredocs](http://clojuredocs.org/clojure.core/defmacro)<br>
[`clojure.core/defmacro` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defmacro/)<br>
[`clojure.core/defmacro` @ crossclj](http://crossclj.info/fun/clojure.core/defmacro.html)<br>
[`cljs.core/defmacro` @ crossclj](http://crossclj.info/fun/cljs.core/defmacro.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defmacro.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Defines a macro, which is essentially a function that runs at compile time.\nMacros can be used to define syntactic constructs which would require\nprimitives or built-in support in other languages.\n\nUsing macros is as easy as using functions, but writing them is a little more\ndifficult.  Also, creating macros is generally discouraged if you can\naccomplish the same goal with a function.\n\n## Rules and Details\n\nThere is a strict rule for when you can use `defmacro` -- you can only use it\nin what we call a _macro namespace_, effectively forcing you to separate your\ncompile time and runtime code.\n\nA side effect of this is that you cannot use `defmacro` from a REPL.  Sorry!\n\nThis strict rule is due to the nature of differing compile time environments\nfor the optimized \"ClojureScript JVM\" compiler and the newer bootstrapped\n\"ClojureScript JS\" compiler.\n\nIn order to create macros that are portable between either compiler version,\nyou must place macros in a `.cljc` file, but a `.clj` file is sufficient if no\n[reader conditionals][doc:syntax/cond] are needed.  Why would they be needed?\nBecause ClojureScript macro namespaces may be handed off to Clojure for\nevaluation, depending on the compiler version:\n\n| compiler version  | macro namespaces evaluated by |\n|-------------------|-------------------------------|\n| ClojureScript JVM | Clojure                       |\n| ClojureScript JS  | ClojureScript                 |\n\nPlease see the examples section below for a more concrete look.",
 :ns "cljs.core",
 :name "defmacro",
 :signature ["[name doc-string? attr-map? [params*] body]"
             "[name doc-string? attr-map? ([params*] body) + attr-map?]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["syntax/syntax-quote"
           "syntax/unquote"
           "cljs.core/macroexpand"
           "cljs.core/macroexpand-1"],
 :full-name-encode "cljs.core/defmacro",
 :source {:code "(core/defn defmacro\n  [&form &env name & args]\n  (core/let [prefix (core/loop [p (core/list (vary-meta name assoc :macro true)) args args]\n                      (core/let [f (first args)]\n                        (if (core/string? f)\n                          (recur (cons f p) (next args))\n                          (if (map? f)\n                            (recur (cons f p) (next args))\n                            p))))\n             fdecl (core/loop [fd args]\n                     (if (core/string? (first fd))\n                       (recur (next fd))\n                       (if (map? (first fd))\n                         (recur (next fd))\n                         fd)))\n             fdecl (if (vector? (first fdecl))\n                     (core/list fdecl)\n                     fdecl)\n             add-implicit-args (core/fn [fd]\n                                 (core/let [args (first fd)]\n                                   (cons (vec (cons '&form (cons '&env args))) (next fd))))\n             add-args (core/fn [acc ds]\n                        (if (core/nil? ds)\n                          acc\n                          (core/let [d (first ds)]\n                            (if (map? d)\n                              (conj acc d)\n                              (recur (conj acc (add-implicit-args d)) (next ds))))))\n             fdecl (seq (add-args [] fdecl))\n             decl (core/loop [p prefix d fdecl]\n                    (if p\n                      (recur (next p) (cons (first p) d))\n                      d))]\n    (core/list 'do\n      (cons `defn decl)\n      (core/list 'set! `(. ~name ~'-cljs$lang$macro) true))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [2878 2919]},
 :examples [{:id "8040c8",
             :content "Here is a `str->int` macro that works for either ClojureScript compiler\nversion.  It simply expands to a `js/parseInt` call:\n\n```clj\n;; in macros.clj\n(ns foo.macros)\n\n;; expands to a runtime call\n(defmacro str->int [s]\n  `(js/parseInt s))\n```\n\nIf we want to evaluate the conversion at _compile time_ instead of expanding it\nto a runtime call, we must use reader conditionals (in a `.cljc` file) to\nchoose the function appropriate for each compiler's evaluation environment.\n\n```clj\n;; in macros.cljc\n(ns foo.macros)\n\n;; expands to the result of the conversion\n(defmacro str->int [s]\n  #?(:clj  (Integer/parseInt s)\n     :cljs (js/parseInt s)))\n```"}],
 :full-name "cljs.core/defmacro",
 :clj-symbol "clojure.core/defmacro",
 :docstring "Like defn, but the resulting function name is declared as a\nmacro and will be used as a macro by the compiler when it is\ncalled."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defmacro"]))
```

-->
