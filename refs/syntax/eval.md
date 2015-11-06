## #= eval



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L113)
</td>
</tr>
</table>

<samp>#=...</samp><br>

---


Allows the reader to evaluate the following form.

This feature is carried from tools.reader is not intended for use in ClojureScript,
though it works for basic forms not using symbols.



---

###### Examples:

```clj
#=123
;;=> 123

#="foo"
;;=> foo

(def foo 1)
#='foo
;;=> 1
```

The following is the output for the ClojureScript compiler on the JVM:

```clj
#=(+ 1 2)
;; java.lang.RuntimeException: Unable to resolve symbol: + in this context

#=(clojure.core/+ 1 2)
;;=> 3
```



---






Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.10/src/main/clojure/clojure/tools/reader.clj#L439-L443):

```clj
(defn- read-eval
  [rdr _]
  (when-not *read-eval*
    (reader-error rdr "#= not allowed when *read-eval* is false"))
  (eval (read rdr true nil true)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.8.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:439-443](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.10/src/main/clojure/clojure/tools/reader.clj#L439-L443)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.10/src/main/clojure/clojure/tools/reader.clj#L612-L623):

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
    nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.8.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:612-623](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.10/src/main/clojure/clojure/tools/reader.clj#L612-L623)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/eval.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Allows the reader to evaluate the following form.\n\nThis feature is carried from tools.reader is not intended for use in ClojureScript,\nthough it works for basic forms not using symbols.",
 :ns "syntax",
 :name "eval",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax/eval",
 :extra-sources ({:code "(defn- read-eval\n  [rdr _]\n  (when-not *read-eval*\n    (reader-error rdr \"#= not allowed when *read-eval* is false\"))\n  (eval (read rdr true nil true)))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.10",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [439 443]}
                 {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.10",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [612 623]}),
 :usage ["#=..."],
 :examples [{:id "ef1acd",
             :content "```clj\n#=123\n;;=> 123\n\n#=\"foo\"\n;;=> foo\n\n(def foo 1)\n#='foo\n;;=> 1\n```\n\nThe following is the output for the ClojureScript compiler on the JVM:\n\n```clj\n#=(+ 1 2)\n;; java.lang.RuntimeException: Unable to resolve symbol: + in this context\n\n#=(clojure.core/+ 1 2)\n;;=> 3\n```"}],
 :full-name "syntax/eval",
 :display "#= eval",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L113"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/eval"]))
```

-->
