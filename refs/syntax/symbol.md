## symbol literal



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#symbols)
</td>
</tr>
</table>

<samp>foo</samp><br>
<samp>foo/bar</samp><br>

---


A symbol represents a name.  When evaluated, its result will be the value that the symbol
is bound to.

Some naming rules:

- must not begin with a number
- can contain special characters `. * + ! - _ ? $ % & = < > : #`, as long as:
  - if starting with `-`, `+`, or `.`, next character cannot be numeric (would be interpreted as number)
  - cannot start with `:` and `#`
- symbols starting or ending with a decimal are reserved for interop purposes (see [`dot`][doc:syntax/dot])

Symbols can use a single `/` for an optional namespace. See [`namespace`][doc:syntax/namespace]:

- `foo/bar` => value of `bar` in the `foo` namespace

To access symbols in the global JavaScript context, use the [`js-namespace`][doc:syntax/js-namespace]:

- `js/document` => global `document` JavaScript object

Dots can also be included in symbols for direct JS property access, see [`dot`][doc:syntax/dot]:

- `js/console.log` => the `console.log` JavaScript function

[doc:syntax/dot]:../syntax/dot.md
[doc:syntax/namespace]:../syntax/namespace.md
[doc:syntax/js-namespace]:../syntax/js-namespace.md
[doc:syntax/dot]:../syntax/dot.md

---

###### Examples:

The following has two symbols, `def` and `a`:

```clj
(def a 1)
```

The evaluation of the symbols is controlled by the evaluation of the list `(def
a 1)`.  `def` evaluates to a special form, which suppresses the evaluation of
`a` since it is just being used as a name for the bound value `1`.

When a symbol is by itself, it will evaluated to 1:

```clj
a
;;=> 1
```

To signify an unevaluated symbol, precede it with a quote:

```clj
'a
;;=> a
```



---

###### See Also:

[`cljs.core/symbol`](../cljs.core/symbol.md)<br>
[`cljs.core/symbol?`](../cljs.core/symbolQMARK.md)<br>

---




 @ [github](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L):

```clj

```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.3.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
</pre>

-->

---




 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/symbol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A symbol represents a name.  When evaluated, its result will be the value that the symbol\nis bound to.\n\nSome naming rules:\n\n- must not begin with a number\n- can contain special characters `. * + ! - _ ? $ % & = < > : #`, as long as:\n  - if starting with `-`, `+`, or `.`, next character cannot be numeric (would be interpreted as number)\n  - cannot start with `:` and `#`\n- symbols starting or ending with a decimal are reserved for interop purposes (see [doc:syntax/dot])\n\nSymbols can use a single `/` for an optional namespace. See [doc:syntax/namespace]:\n\n- `foo/bar` => value of `bar` in the `foo` namespace\n\nTo access symbols in the global JavaScript context, use the [doc:syntax/js-namespace]:\n\n- `js/document` => global `document` JavaScript object\n\nDots can also be included in symbols for direct JS property access, see [doc:syntax/dot]:\n\n- `js/console.log` => the `console.log` JavaScript function",
 :ns "syntax",
 :name "symbol",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/symbol" "cljs.core/symbol?"],
 :full-name-encode "syntax/symbol",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage ["foo" "foo/bar"],
 :examples [{:id "cd60a5",
             :content "The following has two symbols, `def` and `a`:\n\n```clj\n(def a 1)\n```\n\nThe evaluation of the symbols is controlled by the evaluation of the list `(def\na 1)`.  `def` evaluates to a special form, which suppresses the evaluation of\n`a` since it is just being used as a name for the bound value `1`.\n\nWhen a symbol is by itself, it will evaluated to 1:\n\n```clj\na\n;;=> 1\n```\n\nTo signify an unevaluated symbol, precede it with a quote:\n\n```clj\n'a\n;;=> a\n```"}],
 :edn-doc "https://github.com/edn-format/edn#symbols",
 :full-name "syntax/symbol",
 :display "symbol literal",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/symbol"]))
```

-->
