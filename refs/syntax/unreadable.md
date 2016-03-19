## #<> unreadable



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L115)
</td>
</tr>
</table>

<samp>#<...></samp><br>

---


A proper definition for something that cannot be read.

When certain values cannot be printed to a REPL using some literal syntax form,
it wraps a description of its value in a form defined as unreadable, `#<>`.  A
reader error will be thrown if this value is fed back into the REPL.

For example, `(atom 42)` will print `#<Atom: 42>` when evaluated in a REPL.
This communicates a human-readable form that is not intended to be reproduce
its value.

Oftentimes, evaluating JavaScript objects in a REPL will print the result
of its `.toString` method inside the unreadable form `#<>`.



---

###### Examples:

Unreadable forms will throw an exception when read:

```clj
#<foo>
;; clojure.lang.ExceptionInfo: Unreadable form
```

You can create an unreadable form for a custom type:

```clj
(deftype Foo [])
(Foo.)
;;=> #<[object Object]>

(deftype Foo [x]
  Object
  (toString [_]
    (str "Foo: " x)))
(Foo. 1)
;;=> #<Foo: 1>
```

Some examples of unreadable JavaScript values:

```clj
Math/sin
;;=> #<function sin() { [native code] }>

js/console
;;=> #<[object Object]>
```



---






Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L764-L776):

```clj
(defn- dispatch-macros [ch]
  (case ch
    \^ read-meta                ;deprecated
    \' (wrapping-reader 'var)
    \( read-fn
    \= read-eval
    \{ read-set
    \< (throwing-reader "Unreadable form")
    \" read-regex
    \! read-comment
    \_ read-discard
    \? read-cond
    nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-1.0.0-alpha3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:764-776](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L764-L776)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/unreadable.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A proper definition for something that cannot be read.\n\nWhen certain values cannot be printed to a REPL using some literal syntax form,\nit wraps a description of its value in a form defined as unreadable, `#<>`.  A\nreader error will be thrown if this value is fed back into the REPL.\n\nFor example, `(atom 42)` will print `#<Atom: 42>` when evaluated in a REPL.\nThis communicates a human-readable form that is not intended to be reproduce\nits value.\n\nOftentimes, evaluating JavaScript objects in a REPL will print the result\nof its `.toString` method inside the unreadable form `#<>`.",
 :ns "syntax",
 :name "unreadable",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax/unreadable",
 :extra-sources ({:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    \\? read-cond\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [764 776]}),
 :usage ["#<...>"],
 :examples [{:id "e0a6cd",
             :content "Unreadable forms will throw an exception when read:\n\n```clj\n#<foo>\n;; clojure.lang.ExceptionInfo: Unreadable form\n```\n\nYou can create an unreadable form for a custom type:\n\n```clj\n(deftype Foo [])\n(Foo.)\n;;=> #<[object Object]>\n\n(deftype Foo [x]\n  Object\n  (toString [_]\n    (str \"Foo: \" x)))\n(Foo. 1)\n;;=> #<Foo: 1>\n```\n\nSome examples of unreadable JavaScript values:\n\n```clj\nMath/sin\n;;=> #<function sin() { [native code] }>\n\njs/console\n;;=> #<[object Object]>\n```"}],
 :full-name "syntax/unreadable",
 :display "#<> unreadable",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L115"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/unreadable"]))
```

-->
