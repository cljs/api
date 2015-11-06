## #"" regex



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>

<samp>#"..."</samp><br>

---


Signifies a regular expression. Represented as native [JavaScript regular expressions].

[JavaScript regular expressions]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions

An inline modifier can be included at the beginning of the regex:

|  modifier          | ClojureScript | JavaScript |
|--------------------|---------------|------------|
|  global match      | N/A           | `/foo/g`   |
|  case-insensitive  | `#"(?i)foo"`  | `/foo/i`   |
|  multi-line        | `#"(?m)f.*o"` | `/f.*o/m`  |

Global matches (i.e. multiple matches per line) can be achieved using `re-seq`.



---

###### Examples:

```clj
#"foo"
;;=> #"foo"

(re-seq #"foo" "FOO BAR foo bar")
;;=> ("foo")
```

Case-insensitive matching:

```clj
#"(?i)foo"
;;=> #"foo"

(re-seq #"(?i)foo" "FOO BAR foo bar")
;;=> ("FOO" "foo")
```



---

###### See Also:

[`cljs.core/re-pattern`](../cljs.core/re-pattern.md)<br>
[`cljs.core/re-find`](../cljs.core/re-find.md)<br>
[`cljs.core/re-seq`](../cljs.core/re-seq.md)<br>
[`cljs.core/re-matches`](../cljs.core/re-matches.md)<br>

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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/regex.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Signifies a regular expression. Represented as native [JavaScript regular expressions].\n\n[JavaScript regular expressions]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions\n\nAn inline modifier can be included at the beginning of the regex:\n\n|  modifier          | ClojureScript | JavaScript |\n|--------------------|---------------|------------|\n|  global match      | N/A           | `/foo/g`   |\n|  case-insensitive  | `#\"(?i)foo\"`  | `/foo/i`   |\n|  multi-line        | `#\"(?m)f.*o\"` | `/f.*o/m`  |\n\nGlobal matches (i.e. multiple matches per line) can be achieved using `re-seq`.",
 :ns "syntax",
 :name "regex",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/re-pattern"
           "cljs.core/re-find"
           "cljs.core/re-seq"
           "cljs.core/re-matches"],
 :full-name-encode "syntax/regex",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage ["#\"...\""],
 :examples [{:id "dacf80",
             :content "```clj\n#\"foo\"\n;;=> #\"foo\"\n\n(re-seq #\"foo\" \"FOO BAR foo bar\")\n;;=> (\"foo\")\n```\n\nCase-insensitive matching:\n\n```clj\n#\"(?i)foo\"\n;;=> #\"foo\"\n\n(re-seq #\"(?i)foo\" \"FOO BAR foo bar\")\n;;=> (\"FOO\" \"foo\")\n```"}],
 :full-name "syntax/regex",
 :display "#\"\" regex",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/regex"]))
```

-->
