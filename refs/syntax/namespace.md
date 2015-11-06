## / namespace slash



 <table border="1">
<tr>
<td>special character</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/cheatsheet)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#symbols)
</td>
</tr>
</table>

<samp>foo/baz</samp><br>
<samp>foo.bar/baz</samp><br>

---


`/` can appear once inside a symbol. The left side of `/` must always be a namespace.
The right side completes the reference to the symbol.

It should be noted that this __differs from Clojure__.  For example,
notice `/` appearing before `PersistentVector` in Clojure:

- Clojure: `clojure.lang.PersistentVector/EMPTY`
- ClojureScript: `cljs.core/PersistentVector.EMPTY`

[`/`][doc:cljs.core//] is the division function if it is by itself.

See [`dot`][doc:syntax/dot] for usage of dots on either side of `/`

[doc:cljs.core//]:../cljs.core/SLASH.md
[doc:syntax/dot]:../syntax/dot.md

---


###### See Also:

[`. dot`](../syntax/dot.md)<br>

---








 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/namespace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`/` can appear once inside a symbol. The left side of `/` must always be a namespace.\nThe right side completes the reference to the symbol.\n\nIt should be noted that this __differs from Clojure__.  For example,\nnotice `/` appearing before `PersistentVector` in Clojure:\n\n- Clojure: `clojure.lang.PersistentVector/EMPTY`\n- ClojureScript: `cljs.core/PersistentVector.EMPTY`\n\n[doc:cljs.core//] is the division function if it is by itself.\n\nSee [doc:syntax/dot] for usage of dots on either side of `/`",
 :ns "syntax",
 :name "namespace",
 :history [["+" "0.0-927"]],
 :type "special character",
 :related ["syntax/dot"],
 :full-name-encode "syntax/namespace",
 :usage ["foo/baz" "foo.bar/baz"],
 :edn-doc "https://github.com/edn-format/edn#symbols",
 :full-name "syntax/namespace",
 :display "/ namespace slash",
 :clj-doc "http://clojure.org/cheatsheet"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/namespace"]))
```

-->
