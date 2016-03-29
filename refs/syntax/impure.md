## ! impure



 <table border="1">
<tr>
<td>convention</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/cheatsheet)
</td>
</tr>
</table>

<samp>foo!</samp><br>

---


A naming convention for impure functions (unenforced).

Impure functions are those that have side-effects on some state.

Some impure functions which use this convention:

- [`set!`][doc:special/set!]
- [`swap!`][doc:cljs.core/swap!]
- [`conj!`][doc:cljs.core/conj!]
- [`specify!`][doc:cljs.core/specify!]

[doc:special/set!]:../special/setBANG.md
[doc:cljs.core/swap!]:../cljs.core/swapBANG.md
[doc:cljs.core/conj!]:../cljs.core/conjBANG.md
[doc:cljs.core/specify!]:../cljs.core/specifyBANG.md

---

###### Examples:

The following causes a side-effect in the state of `a`:

```clj
(def a (atom 1))
@a
;;=> 1

(reset! a 2)
@a
;;=> 2
```



---

###### See Also:

[`? predicate`](../syntax/predicate.md)<br>

---








 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/impure.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A naming convention for impure functions (unenforced).\n\nImpure functions are those that have side-effects on some state.\n\nSome impure functions which use this convention:\n\n- [doc:special/set!]\n- [doc:cljs.core/swap!]\n- [doc:cljs.core/conj!]\n- [doc:cljs.core/specify!]",
 :syntax-equiv {:edn-url nil,
                :clj-url "http://clojure.org/cheatsheet"},
 :ns "syntax",
 :name "impure",
 :name-encode "impure",
 :history [["+" "0.0-927"]],
 :type "convention",
 :related ["syntax/predicate"],
 :full-name-encode "syntax/impure",
 :usage ["foo!"],
 :examples [{:id "c1dbc0",
             :content "The following causes a side-effect in the state of `a`:\n\n```clj\n(def a (atom 1))\n@a\n;;=> 1\n\n(reset! a 2)\n@a\n;;=> 2\n```"}],
 :full-name "syntax/impure",
 :display "! impure",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/impure.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/impure"]))
```

-->
