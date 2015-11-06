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





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader/impl/commons.clj#L121-L136):

```clj
(defn read-regex
  [rdr ch]
  (let [sb (StringBuilder.)]
    (loop [ch (read-char rdr)]
      (if (identical? \" ch)
        (Pattern/compile (str sb))
        (if (nil? ch)
          (reader-error rdr "EOF while reading regex")
          (do
            (.append sb ch )
            (when (identical? \\ ch)
              (let [ch (read-char rdr)]
                (if (nil? ch)
                  (reader-error rdr "EOF while reading regex"))
                (.append sb ch)))
            (recur (read-char rdr))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.7.6
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── reader
                        └── impl
                            └── <ins>[commons.clj:121-136](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader/impl/commons.clj#L121-L136)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader.clj#L564-L575):

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
tools.reader @ tools.reader-0.7.6
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:564-575](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader.clj#L564-L575)</ins>
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
 :extra-sources ({:code "(defn read-regex\n  [rdr ch]\n  (let [sb (StringBuilder.)]\n    (loop [ch (read-char rdr)]\n      (if (identical? \\\" ch)\n        (Pattern/compile (str sb))\n        (if (nil? ch)\n          (reader-error rdr \"EOF while reading regex\")\n          (do\n            (.append sb ch )\n            (when (identical? \\\\ ch)\n              (let [ch (read-char rdr)]\n                (if (nil? ch)\n                  (reader-error rdr \"EOF while reading regex\"))\n                (.append sb ch)))\n            (recur (read-char rdr))))))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.6",
                  :filename "src/main/clojure/clojure/tools/reader/impl/commons.clj",
                  :lines [121 136]}
                 {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.6",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [564 575]}),
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
