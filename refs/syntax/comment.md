## ; comment



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#comments)
</td>
</tr>
</table>



"Comments out" everything after `;` on the current line.



---

###### Examples:

Add comments to code:

```clj
(def a 1) ; this is a comment
```

It is common to use `;;` for comments that have their own line:

```clj
;; this comment is on its own line
```



---

###### See Also:

[`#_ ignore`](../syntax/ignore.md)<br>
[`cljs.core/comment`](../cljs.core/comment.md)<br>
[`#! shebang`](../syntax/shebang.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader/impl/commons.clj#L123-L125):

```clj
(defn read-comment
  [rdr & _]
  (skip-line rdr))
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
                    └── reader
                        └── impl
                            └── <ins>[commons.clj:123-125](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader/impl/commons.clj#L123-L125)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L743-L762):

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
tools.reader @ tools.reader-1.0.0-alpha3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:743-762](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L743-L762)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/comment.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "\"Comments out\" everything after `;` on the current line.",
 :ns "syntax",
 :name "comment",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/ignore" "cljs.core/comment" "syntax/shebang"],
 :full-name-encode "syntax/comment",
 :extra-sources ({:code "(defn read-comment\n  [rdr & _]\n  (skip-line rdr))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha3",
                  :filename "src/main/clojure/clojure/tools/reader/impl/commons.clj",
                  :lines [123 125]}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [743 762]}),
 :examples [{:id "ab62d2",
             :content "Add comments to code:\n\n```clj\n(def a 1) ; this is a comment\n```\n\nIt is common to use `;;` for comments that have their own line:\n\n```clj\n;; this comment is on its own line\n```"}],
 :edn-doc "https://github.com/edn-format/edn#comments",
 :full-name "syntax/comment",
 :display "; comment",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/comment"]))
```

-->
