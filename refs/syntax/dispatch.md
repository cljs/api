## # dispatch



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#-dispatch-character)
</td>
</tr>
</table>

<samp>#...</samp><br>

---


`#` is a prefix character that is called the dispatch macro, because it allows
the behavior of the reader to be dispatched to another table, indexed by the
character following the `#`.

Syntax forms prefixed with `#` are made to bear some similarity to their
original forms:

| original                           | with `#` prefix                                  | relation               |
|------------------------------------|--------------------------------------------------|------------------------|
| [`string`][doc:syntax/string]                    | [`regex`][doc:syntax/regex]                                   | string-related         |
| [`list`][doc:syntax/list]                      | [`function`][doc:syntax/function]                                | code-related           |
| [`map`][doc:syntax/map]                       | [`set`][doc:syntax/set]                                     | lookup-related         |
| [`quote`][doc:syntax/quote]                     | [`var`][doc:syntax/var]                                     | quote-related          |
| [`unused`][doc:syntax/unused]                    | [`ignore`][doc:syntax/ignore]                                  | ignore-related         |
| [`foo (symbol)`][doc:syntax/symbol]    | [`#foo (tagged literal)`][doc:syntax/tagged-literal] | name-related           |
| [`predicate`][doc:syntax/predicate]                 | [doc:syntax/cond]                                    | conditional-related    |

[doc:syntax/string]:../syntax/string.md
[doc:syntax/regex]:../syntax/regex.md
[doc:syntax/list]:../syntax/list.md
[doc:syntax/function]:../syntax/function.md
[doc:syntax/map]:../syntax/map.md
[doc:syntax/set]:../syntax/set.md
[doc:syntax/quote]:../syntax/quote.md
[doc:syntax/var]:../syntax/var.md
[doc:syntax/unused]:../syntax/unused.md
[doc:syntax/ignore]:../syntax/ignore.md
[doc:syntax/symbol]:../syntax/symbol.md
[doc:syntax/tagged-literal]:../syntax/tagged-literal.md
[doc:syntax/predicate]:../syntax/predicate.md

---

###### Examples:

The dispatch macro is not usable on its own.  Rather, it dispatches to other
syntax forms.

Regular expression:

```clj
#"[a-zA-Z0-9]+"
;;=> #"[a-zA-Z0-9]+"
```

Set:

```clj
#{:foo 1 2}
;;=> #{:foo 1 2}
```

Function:

```clj
#(foo 1 2)
;;=> #<function (){
;;   return cljs.user.foo.call(null,(1),(2));
;;   }>
```

Var reference:

```clj
(def a)
#'a
;;=> #'cljs.user/a
```

Ignore form:

```clj
#_foo
;; waits for next form since #_foo was ignored

#_123 456
;;=> 456
```

Tagged Literals:

```clj
#queue [1 2 3]
;;=> #queue [1 2 3]

#js {:foo 1}
;;=> #js {:foo 1}

#inst "2010-11-12T18:14:15.666-00:00"
;;=> #inst "2010-11-12T18:14:15.666-00:00"
```

Reader Conditional:

```clj
#?(:clj "Clojure" :cljs "ClojureScript")
;;=> "ClojureScript"
```



---

###### See Also:

[`#"" regex`](../syntax/regex.md)<br>
[`#() function`](../syntax/function.md)<br>
[`#{} set`](../syntax/set.md)<br>
[`#' var`](../syntax/var.md)<br>
[`#_ ignore`](../syntax/ignore.md)<br>
[`# tagged literal`](../syntax/tagged-literal.md)<br>
[``](../syntax/cond.md)<br>

---




 @ [github](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/jvm/clojure/lang/LispReader.java#L):

```clj

```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.5.1
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/jvm/clojure/lang/LispReader.java#L)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/dispatch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`#` is a prefix character that is called the dispatch macro, because it allows\nthe behavior of the reader to be dispatched to another table, indexed by the\ncharacter following the `#`.\n\nSyntax forms prefixed with `#` are made to bear some similarity to their\noriginal forms:\n\n| original                           | with `#` prefix                                  | relation               |\n|------------------------------------|--------------------------------------------------|------------------------|\n| [doc:syntax/string]                    | [doc:syntax/regex]                                   | string-related         |\n| [doc:syntax/list]                      | [doc:syntax/function]                                | code-related           |\n| [doc:syntax/map]                       | [doc:syntax/set]                                     | lookup-related         |\n| [doc:syntax/quote]                     | [doc:syntax/var]                                     | quote-related          |\n| [doc:syntax/unused]                    | [doc:syntax/ignore]                                  | ignore-related         |\n| [`foo (symbol)`][doc:syntax/symbol]    | [`#foo (tagged literal)`][doc:syntax/tagged-literal] | name-related           |\n| [doc:syntax/predicate]                 | [doc:syntax/cond]                                    | conditional-related    |",
 :ns "syntax",
 :name "dispatch",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/regex"
           "syntax/function"
           "syntax/set"
           "syntax/var"
           "syntax/ignore"
           "syntax/tagged-literal"
           "syntax/cond"],
 :full-name-encode "syntax/dispatch",
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage ["#..."],
 :examples [{:id "0a1f4c",
             :content "The dispatch macro is not usable on its own.  Rather, it dispatches to other\nsyntax forms.\n\nRegular expression:\n\n```clj\n#\"[a-zA-Z0-9]+\"\n;;=> #\"[a-zA-Z0-9]+\"\n```\n\nSet:\n\n```clj\n#{:foo 1 2}\n;;=> #{:foo 1 2}\n```\n\nFunction:\n\n```clj\n#(foo 1 2)\n;;=> #<function (){\n;;   return cljs.user.foo.call(null,(1),(2));\n;;   }>\n```\n\nVar reference:\n\n```clj\n(def a)\n#'a\n;;=> #'cljs.user/a\n```\n\nIgnore form:\n\n```clj\n#_foo\n;; waits for next form since #_foo was ignored\n\n#_123 456\n;;=> 456\n```\n\nTagged Literals:\n\n```clj\n#queue [1 2 3]\n;;=> #queue [1 2 3]\n\n#js {:foo 1}\n;;=> #js {:foo 1}\n\n#inst \"2010-11-12T18:14:15.666-00:00\"\n;;=> #inst \"2010-11-12T18:14:15.666-00:00\"\n```\n\nReader Conditional:\n\n```clj\n#?(:clj \"Clojure\" :cljs \"ClojureScript\")\n;;=> \"ClojureScript\"\n```"}],
 :edn-doc "https://github.com/edn-format/edn#-dispatch-character",
 :full-name "syntax/dispatch",
 :display "# dispatch",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/dispatch"]))
```

-->
