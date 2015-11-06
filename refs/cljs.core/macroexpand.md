## cljs.core/macroexpand



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3165"><img valign="middle" alt="[+] 0.0-3165" title="Added in 0.0-3165" src="https://img.shields.io/badge/+-0.0--3165-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/macroexpand</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/macroexpand)
</td>
</tr>
</table>


 <samp>
(__macroexpand__ quoted)<br>
</samp>

---

(only intended as a REPL utility)

If the given quoted form is a macro call, expand it once, then repeat until a
subsequent result is _not_ a macro call.  NOTE: nested forms are _not_ expanded.

See [`macroexpand-1`][doc:cljs.core/macroexpand-1] if you only wish to expand a form once.

[doc:cljs.core/macroexpand-1]:../cljs.core/macroexpand-1.md

---

###### Examples:

See how [`when`][doc:cljs.core/when] expands to [`if`][doc:special/if]:

```clj
(macroexpand '(when true :foo))
;;=> (if true (do :foo))
```

The following goes through three expansion steps, but you can use
[`macroexpand-1`][doc:cljs.core/macroexpand-1] to do one at a time instead.

```clj
(macroexpand '(-> 2 inc))
;;=> (js* "(~{} + ~{})" 2 1)
```

Notice how the nested `inc` form is not expanded:

```clj
(macroexpand '(inc (inc 2)))
;;=> (js* "(~{} + ~{})" (inc 2) 1)
```

[doc:cljs.core/when]:../cljs.core/when.md
[doc:special/if]:../special/if.md
[doc:cljs.core/macroexpand-1]:../cljs.core/macroexpand-1.md

---

###### See Also:

[`cljs.core/macroexpand-1`](../cljs.core/macroexpand-1.md)<br>
[`cljs.core/defmacro`](../cljs.core/defmacro.md)<br>

---


Source docstring:

```
Repeatedly calls macroexpand-1 on form until it no longer
represents a macro form, then returns it.  Note neither
macroexpand-1 nor macroexpand expand macros in subforms.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/core.clj#L2045-L2057):

```clj
(defmacro macroexpand
  [quoted]
  (core/assert (core/= (core/first quoted) 'quote)
    "Argument to macroexpand must be quoted")
  (core/let [form (second quoted)
             env &env]
    (core/loop [form form form' (ana/macroexpand-1 env form)]
      (core/if-not (core/identical? form form')
        (recur form' (ana/macroexpand-1 env form'))
        `(quote ~form')))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:2045-2057](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/core.clj#L2045-L2057)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/macroexpand` @ clojuredocs](http://clojuredocs.org/clojure.core/macroexpand)<br>
[`clojure.core/macroexpand` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/macroexpand/)<br>
[`clojure.core/macroexpand` @ crossclj](http://crossclj.info/fun/clojure.core/macroexpand.html)<br>
[`cljs.core/macroexpand` @ crossclj](http://crossclj.info/fun/cljs.core/macroexpand.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/macroexpand.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "(only intended as a REPL utility)\n\nIf the given quoted form is a macro call, expand it once, then repeat until a\nsubsequent result is _not_ a macro call.  NOTE: nested forms are _not_ expanded.\n\nSee [doc:cljs.core/macroexpand-1] if you only wish to expand a form once.",
 :ns "cljs.core",
 :name "macroexpand",
 :signature ["[quoted]"],
 :history [["+" "0.0-3165"]],
 :type "macro",
 :related ["cljs.core/macroexpand-1" "cljs.core/defmacro"],
 :full-name-encode "cljs.core/macroexpand",
 :source {:code "(defmacro macroexpand\n  [quoted]\n  (core/assert (core/= (core/first quoted) 'quote)\n    \"Argument to macroexpand must be quoted\")\n  (core/let [form (second quoted)\n             env &env]\n    (core/loop [form form form' (ana/macroexpand-1 env form)]\n      (core/if-not (core/identical? form form')\n        (recur form' (ana/macroexpand-1 env form'))\n        `(quote ~form')))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/clojure/cljs/core.clj",
          :lines [2045 2057]},
 :examples [{:id "b773af",
             :content "See how [doc:cljs.core/when] expands to [doc:special/if]:\n\n```clj\n(macroexpand '(when true :foo))\n;;=> (if true (do :foo))\n```\n\nThe following goes through three expansion steps, but you can use\n[doc:cljs.core/macroexpand-1] to do one at a time instead.\n\n```clj\n(macroexpand '(-> 2 inc))\n;;=> (js* \"(~{} + ~{})\" 2 1)\n```\n\nNotice how the nested `inc` form is not expanded:\n\n```clj\n(macroexpand '(inc (inc 2)))\n;;=> (js* \"(~{} + ~{})\" (inc 2) 1)\n```"}],
 :full-name "cljs.core/macroexpand",
 :clj-symbol "clojure.core/macroexpand",
 :docstring "Repeatedly calls macroexpand-1 on form until it no longer\nrepresents a macro form, then returns it.  Note neither\nmacroexpand-1 nor macroexpand expand macros in subforms."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/macroexpand"]))
```

-->
