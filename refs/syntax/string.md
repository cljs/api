## "" string



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#strings)
</td>
</tr>
</table>

<samp>"..."</samp><br>

---


Create a string.  ClojureScript strings are the same as [JavaScript strings].

[JavaScript strings]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String

Strings may span multiple lines.

Standard escape characters such as `\"` are supported, as well as unicode
escape characters:

| unicode characters  | constraints                                   |
|---------------------|-----------------------------------------------|
| `\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |
| `\oXXX`             | XXX is octal between 0 and 0377               |



---

###### Examples:

```clj
"foo"
;;=> "foo"

"hello
     world"
;;=> "hello\n     world"
```

Characters can be escaped:

```clj
(println "foo\nbar")
;; prints:
;;   foo
;;   bar
```



---

###### See Also:

[`cljs.core/str`](../cljs.core/str.md)<br>

---




 @ [github](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/jvm/clojure/lang/LispReader.java#L):

```clj

```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.4.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/string.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Create a string.  ClojureScript strings are the same as [JavaScript strings].\n\n[JavaScript strings]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String\n\nStrings may span multiple lines.\n\nStandard escape characters such as `\\\"` are supported, as well as unicode\nescape characters:\n\n| unicode characters  | constraints                                   |\n|---------------------|-----------------------------------------------|\n| `\\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |\n| `\\oXXX`             | XXX is octal between 0 and 0377               |",
 :ns "syntax",
 :name "string",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/str"],
 :full-name-encode "syntax/string",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage ["\"...\""],
 :examples [{:id "eb97ac",
             :content "```clj\n\"foo\"\n;;=> \"foo\"\n\n\"hello\n     world\"\n;;=> \"hello\\n     world\"\n```\n\nCharacters can be escaped:\n\n```clj\n(println \"foo\\nbar\")\n;; prints:\n;;   foo\n;;   bar\n```"}],
 :edn-doc "https://github.com/edn-format/edn#strings",
 :full-name "syntax/string",
 :display "\"\" string",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/string"]))
```

-->
