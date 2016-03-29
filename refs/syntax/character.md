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





Reader code @ [github]():

```clj
(defn- read-char*
  [rdr backslash opts pending-forms]
  (let [ch (read-char rdr)]
    (if-not (nil? ch)
      (let [token (if (or (macro-terminating? ch)
                          (whitespace? ch))
                    (str ch)
                    (read-token rdr ch))
            token-len (count token)]
        (cond

         (== 1 token-len)  (Character/valueOf (nth token 0))

         (= token "newline") \newline
         (= token "space") \space
         (= token "tab") \tab
         (= token "backspace") \backspace
         (= token "formfeed") \formfeed
         (= token "return") \return

         (.startsWith token "u")
         (let [c (read-unicode-char token 1 4 16)
               ic (int c)]
           (if (and (> ic upper-limit)
                    (< ic lower-limit))
             (reader-error rdr "Invalid character constant: \\u" (Integer/toString ic 16))
             c))

         (.startsWith token "o")
         (let [len (dec token-len)]
           (if (> len 3)
             (reader-error rdr "Invalid octal escape sequence length: " len)
             (let [uc (read-unicode-char token 1 len 8)]
               (if (> (int uc) 0377)
                 (reader-error rdr "Octal escape sequence must be in range [0, 377]")
                 uc))))

         :else (reader-error rdr "Unsupported character: \\" token)))
      (reader-error rdr "EOF while reading character"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Reader table @ [github]():

```clj
(defn- macros [ch]
  (case ch
    \" read-string*
    \: read-keyword
    \; read-comment
    \' (wrapping-reader 'quote)
    \@ (wrapping-reader 'clojure.core/deref)
    \^ read-meta
    \` read-syntax-quote ;;(wrapping-reader 'syntax-quote)
    \~ read-unquote
    \( read-list
    \) read-unmatched-delimiter
    \[ read-vector
    \] read-unmatched-delimiter
    \{ read-map
    \} read-unmatched-delimiter
    \\ read-char*
    \% read-arg
    \# read-dispatch
    nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>

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
 :syntax-equiv {:edn-url "https://github.com/edn-format/edn#characters",
                :clj-url "http://clojure.org/reader#toc1"},
 :ns "syntax",
 :name "character",
 :name-encode "character",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/string" "cljs.core/str"],
 :full-name-encode "syntax/character",
 :extra-sources ({:code "(defn- read-char*\n  [rdr backslash opts pending-forms]\n  (let [ch (read-char rdr)]\n    (if-not (nil? ch)\n      (let [token (if (or (macro-terminating? ch)\n                          (whitespace? ch))\n                    (str ch)\n                    (read-token rdr ch))\n            token-len (count token)]\n        (cond\n\n         (== 1 token-len)  (Character/valueOf (nth token 0))\n\n         (= token \"newline\") \\newline\n         (= token \"space\") \\space\n         (= token \"tab\") \\tab\n         (= token \"backspace\") \\backspace\n         (= token \"formfeed\") \\formfeed\n         (= token \"return\") \\return\n\n         (.startsWith token \"u\")\n         (let [c (read-unicode-char token 1 4 16)\n               ic (int c)]\n           (if (and (> ic upper-limit)\n                    (< ic lower-limit))\n             (reader-error rdr \"Invalid character constant: \\\\u\" (Integer/toString ic 16))\n             c))\n\n         (.startsWith token \"o\")\n         (let [len (dec token-len)]\n           (if (> len 3)\n             (reader-error rdr \"Invalid octal escape sequence length: \" len)\n             (let [uc (read-unicode-char token 1 len 8)]\n               (if (> (int uc) 0377)\n                 (reader-error rdr \"Octal escape sequence must be in range [0, 377]\")\n                 uc))))\n\n         :else (reader-error rdr \"Unsupported character: \\\\\" token)))\n      (reader-error rdr \"EOF while reading character\"))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [135 174],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L135-L174"}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [743 762],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L743-L762"}),
 :examples [{:id "495a47",
             :content "```clj\n\\c\n;;=> \"c\"\n\n\\A\n;;=> \"A\"\n\n\\newline\n;;=> \"\\n\"\n\n\\u00a1\n;;=> \"¡\"\n\n\\o256\n;;=> \"®\"\n```"}],
 :full-name "syntax/character",
 :display "\\ character",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/character.cljsdoc"}

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
