## ` syntax quote



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

Prevent evaluation of the following form.

Adds namespace-qualification to any symbols inside the following form by
resolving them in the current context.

Any non-namespaced symbols ending with `#` are replaced with unique symbols.
See [`auto-gensym`][doc:syntax/auto-gensym].

[doc:syntax/auto-gensym]:../syntax/auto-gensym.md

---

###### Examples:

```clj
`foo
;;=> cljs.user/foo

`foo#
;;=> foo__20418__auto__

`(def foo 1)
;;=> (def cljs.user/foo 1)
```



---

###### See Also:

[`# auto-gensym`](../syntax/auto-gensym.md)<br>
[`' quote`](../syntax/quote.md)<br>
[`~ unquote`](../syntax/unquote.md)<br>
[`~@ unquote splicing`](../syntax/unquote-splicing.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.3/src/main/clojure/clojure/tools/reader.clj#L572-L576):

```clj
(defn- read-syntax-quote
  [rdr backquote]
  (binding [gensym-env {}]
    (-> (read rdr true nil true)
      syntax-quote*)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.8.3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:572-576](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.3/src/main/clojure/clojure/tools/reader.clj#L572-L576)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.3/src/main/clojure/clojure/tools/reader.clj#L578-L597):

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
tools.reader @ tools.reader-0.8.3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:578-597](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.3/src/main/clojure/clojure/tools/reader.clj#L578-L597)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/syntax-quote.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nPrevent evaluation of the following form.\n\nAdds namespace-qualification to any symbols inside the following form by\nresolving them in the current context.\n\nAny non-namespaced symbols ending with `#` are replaced with unique symbols.\nSee [doc:syntax/auto-gensym].",
 :ns "syntax",
 :name "syntax-quote",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/auto-gensym"
           "syntax/quote"
           "syntax/unquote"
           "syntax/unquote-splicing"],
 :full-name-encode "syntax/syntax-quote",
 :extra-sources ({:code "(defn- read-syntax-quote\n  [rdr backquote]\n  (binding [gensym-env {}]\n    (-> (read rdr true nil true)\n      syntax-quote*)))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [572 576]}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [578 597]}),
 :examples [{:id "bffbdf",
             :content "```clj\n`foo\n;;=> cljs.user/foo\n\n`foo#\n;;=> foo__20418__auto__\n\n`(def foo 1)\n;;=> (def cljs.user/foo 1)\n```"}],
 :full-name "syntax/syntax-quote",
 :display "` syntax quote",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/syntax-quote"]))
```

-->
