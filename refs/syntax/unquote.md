## ~ unquote



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>



(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Intended for use inside a [`syntax-quote`][doc:syntax/syntax-quote].

Forces evaluation of the following form.

[doc:syntax/syntax-quote]:../syntax/syntax-quote.md

---

###### Examples:

```clj
(def foo 1)
`~foo
;;=> 1

`(def foo ~foo)
;;=> (def cljs.user/foo 1)
```



---

###### See Also:

[`` syntax quote`](../syntax/syntax-quote.md)<br>
[`~@ unquote splicing`](../syntax/unquote-splicing.md)<br>

---





Reader code @ [github]():

```clj
(defn- read-unquote
  [rdr comma opts pending-forms]
  (if-let [ch (peek-char rdr)]
    (if (identical? \@ ch)
      ((wrapping-reader 'clojure.core/unquote-splicing) (doto rdr read-char) \@ opts pending-forms)
      ((wrapping-reader 'clojure.core/unquote) rdr \~ opts pending-forms))))
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/unquote.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nIntended for use inside a [doc:syntax/syntax-quote].\n\nForces evaluation of the following form.",
 :syntax-equiv {:edn-url nil,
                :clj-url "http://clojure.org/reader#toc2"},
 :ns "syntax",
 :name "unquote",
 :name-encode "unquote",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/syntax-quote" "syntax/unquote-splicing"],
 :full-name-encode "syntax/unquote",
 :extra-sources ({:code "(defn- read-unquote\n  [rdr comma opts pending-forms]\n  (if-let [ch (peek-char rdr)]\n    (if (identical? \\@ ch)\n      ((wrapping-reader 'clojure.core/unquote-splicing) (doto rdr read-char) \\@ opts pending-forms)\n      ((wrapping-reader 'clojure.core/unquote) rdr \\~ opts pending-forms))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-beta1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [588 593],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-beta1/src/main/clojure/clojure/tools/reader.clj#L588-L593"}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-beta1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [743 762],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-beta1/src/main/clojure/clojure/tools/reader.clj#L743-L762"}),
 :examples [{:id "1ff51e",
             :content "```clj\n(def foo 1)\n`~foo\n;;=> 1\n\n`(def foo ~foo)\n;;=> (def cljs.user/foo 1)\n```"}],
 :full-name "syntax/unquote",
 :display "~ unquote",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/unquote.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/unquote"]))
```

-->
