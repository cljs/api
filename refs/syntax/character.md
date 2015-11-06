## \\ character



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#characters)
</td>
</tr>
</table>



A single character string.  Carried over from Clojure for
compatibility.  They are represented as single character JavaScript strings.

`\c` = `"c"`

| unicode characters  | constraints                                   |
|---------------------|-----------------------------------------------|
| `\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |
| `\oXXX`             | XXX is octal between 0 and 0377               |

| special characters  | result   |
|---------------------|----------|
| `\newline`          | `"\n"`   |
| `\space`            | `" "`    |
| `\tab`              | `"\t"`   |
| `\formfeed`         | `"\f"`   |
| `\backspace`        | `"\b"`   |
| `\return`           | `"\r"`   |



---

###### Examples:

```clj
\c
;;=> "c"

\A
;;=> "A"

\newline
;;=> "\n"

\u00a1
;;=> "¡"

\o256
;;=> "®"
```



---

###### See Also:

[`"" string`](../syntax/string.md)<br>
[`cljs.core/str`](../cljs.core/str.md)<br>

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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/character.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A single character string.  Carried over from Clojure for\ncompatibility.  They are represented as single character JavaScript strings.\n\n`\\c` = `\"c\"`\n\n| unicode characters  | constraints                                   |\n|---------------------|-----------------------------------------------|\n| `\\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |\n| `\\oXXX`             | XXX is octal between 0 and 0377               |\n\n| special characters  | result   |\n|---------------------|----------|\n| `\\newline`          | `\"\\n\"`   |\n| `\\space`            | `\" \"`    |\n| `\\tab`              | `\"\\t\"`   |\n| `\\formfeed`         | `\"\\f\"`   |\n| `\\backspace`        | `\"\\b\"`   |\n| `\\return`           | `\"\\r\"`   |",
 :ns "syntax",
 :name "character",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/string" "cljs.core/str"],
 :full-name-encode "syntax/character",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :examples [{:id "495a47",
             :content "```clj\n\\c\n;;=> \"c\"\n\n\\A\n;;=> \"A\"\n\n\\newline\n;;=> \"\\n\"\n\n\\u00a1\n;;=> \"¡\"\n\n\\o256\n;;=> \"®\"\n```"}],
 :edn-doc "https://github.com/edn-format/edn#characters",
 :full-name "syntax/character",
 :display "\\ character",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/character"]))
```

-->
