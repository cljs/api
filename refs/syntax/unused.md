## _ unused



 <table border="1">
<tr>
<td>convention</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/cheatsheet)
</td>
</tr>
</table>



`_` is a valid symbol name that indicates an unused or disregarded value.
This is not enforced by the compiler.

For example, create a function whose first two arguments are ignored:

```clj
(fn [_ _ a]
  (println a))
```

Ignore the first and third value of a [destructured][doc:syntax/destructure-vector] sequence:

```clj
(let [ [_ a b _ c]
       [1 2 3 4 5] ]
  (println a b c))
;; 2 3 5
```

Ignore return values of debug statements in a [`let`][doc:cljs.core/let] block:

```clj
(let [a 1
      _ (println a)
      b (+ a 2)
      _ (println b)
      c (+ b 3)]
  ...)
```

Multiple `_`'s can be used in each of the previous examples because duplicate
names will shadow those previously occurring.  Thus, `_` actually holds the
value of its last binding, but using it should be strictly avoided to prevent
confusion.  This is the only encouraged use-case for duplicating parameter
names.

[doc:syntax/destructure-vector]:../syntax/destructure-vector.md
[doc:cljs.core/let]:../cljs.core/let.md

---

###### Examples:

It is common to use `_` to ignore all but the latest value of a changing atom
inside an [`add-watch`][doc:cljs.core/add-watch] callback:

```clj
(def a (atom 1))

(add-watch a :foo
  (fn [_ _ _ s]
    (println s)))

(reset! a 2)
;; 2
```

[doc:cljs.core/add-watch]:../cljs.core/add-watch.md

---









 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/unused.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`_` is a valid symbol name that indicates an unused or disregarded value.\nThis is not enforced by the compiler.\n\nFor example, create a function whose first two arguments are ignored:\n\n```clj\n(fn [_ _ a]\n  (println a))\n```\n\nIgnore the first and third value of a [destructured][doc:syntax/destructure-vector] sequence:\n\n```clj\n(let [ [_ a b _ c]\n       [1 2 3 4 5] ]\n  (println a b c))\n;; 2 3 5\n```\n\nIgnore return values of debug statements in a [doc:cljs.core/let] block:\n\n```clj\n(let [a 1\n      _ (println a)\n      b (+ a 2)\n      _ (println b)\n      c (+ b 3)]\n  ...)\n```\n\nMultiple `_`'s can be used in each of the previous examples because duplicate\nnames will shadow those previously occurring.  Thus, `_` actually holds the\nvalue of its last binding, but using it should be strictly avoided to prevent\nconfusion.  This is the only encouraged use-case for duplicating parameter\nnames.",
 :ns "syntax",
 :name "unused",
 :history [["+" "0.0-927"]],
 :type "convention",
 :full-name-encode "syntax/unused",
 :examples [{:id "705f5e",
             :content "It is common to use `_` to ignore all but the latest value of a changing atom\ninside an [doc:cljs.core/add-watch] callback:\n\n```clj\n(def a (atom 1))\n\n(add-watch a :foo\n  (fn [_ _ _ s]\n    (println s)))\n\n(reset! a 2)\n;; 2\n```"}],
 :full-name "syntax/unused",
 :display "_ unused",
 :clj-doc "http://clojure.org/cheatsheet"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/unused"]))
```

-->
