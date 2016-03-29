## ? predicate



 <table border="1">
<tr>
<td>convention</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/cheatsheet)
</td>
</tr>
</table>

<samp>foo?</samp><br>

---


A naming convention for predicate functions (unenforced).

A predicate function is one that returns `true` or `false`, and is presumably
pure (not having any side-effects on state).

Some predicate functions which use this convention:

- [`even?`][doc:cljs.core/even?]
- [`empty?`][doc:cljs.core/empty?]
- [`contains?`][doc:cljs.core/contains?]
- [`nil?`][doc:cljs.core/nil?]

It is sometimes used to name boolean values as well, not just predicate functions.

[doc:cljs.core/even?]:../cljs.core/evenQMARK.md
[doc:cljs.core/empty?]:../cljs.core/emptyQMARK.md
[doc:cljs.core/contains?]:../cljs.core/containsQMARK.md
[doc:cljs.core/nil?]:../cljs.core/nilQMARK.md

---

###### Examples:

Create a `divisible?` predicate:

```clj
(defn divisible? [n factor]
  (zero? (mod n factor)))

(divisible? 15 3)
;;=> true

(divisible? 15 2)
;;=> false

(filter #(divisible? 15 %) (range 15))
;;=> (1 3 5)
```



---

###### See Also:

[`! impure`](../syntax/impure.md)<br>

---








 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/predicate.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A naming convention for predicate functions (unenforced).\n\nA predicate function is one that returns `true` or `false`, and is presumably\npure (not having any side-effects on state).\n\nSome predicate functions which use this convention:\n\n- [doc:cljs.core/even?]\n- [doc:cljs.core/empty?]\n- [doc:cljs.core/contains?]\n- [doc:cljs.core/nil?]\n\nIt is sometimes used to name boolean values as well, not just predicate functions.",
 :syntax-equiv {:edn-url nil,
                :clj-url "http://clojure.org/cheatsheet"},
 :ns "syntax",
 :name "predicate",
 :name-encode "predicate",
 :history [["+" "0.0-927"]],
 :type "convention",
 :related ["syntax/impure"],
 :full-name-encode "syntax/predicate",
 :usage ["foo?"],
 :examples [{:id "5a85c7",
             :content "Create a `divisible?` predicate:\n\n```clj\n(defn divisible? [n factor]\n  (zero? (mod n factor)))\n\n(divisible? 15 3)\n;;=> true\n\n(divisible? 15 2)\n;;=> false\n\n(filter #(divisible? 15 %) (range 15))\n;;=> (1 3 5)\n```"}],
 :full-name "syntax/predicate",
 :display "? predicate",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/predicate.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/predicate"]))
```

-->
