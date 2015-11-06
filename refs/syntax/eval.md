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
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
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
