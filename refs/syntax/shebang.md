## #! shebang



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L114)
</td>
</tr>
</table>



Equivalent to [`comment`][doc:syntax/comment].

This is intended to allow executable ClojureScript files under Unix by allowing
the first line of the file to have a [shebang line](https://en.wikipedia.org/wiki/Shebang_(Unix)).

[doc:syntax/comment]:../syntax/comment.md

---

###### Examples:

```clj
#!/bin/cljs
;; waits for another form since #!/bin/cljs was ignored.

123 #! this is ignored
;;=> 123
```



---






Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader/impl/commons.clj#L112-L114):

```clj
(defn read-comment
  [rdr & _]
  (skip-line rdr _))
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
                            └── <ins>[commons.clj:112-114](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader/impl/commons.clj#L112-L114)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/shebang.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Equivalent to [doc:syntax/comment].\n\nThis is intended to allow executable ClojureScript files under Unix by allowing\nthe first line of the file to have a [shebang line](https://en.wikipedia.org/wiki/Shebang_(Unix)).",
 :ns "syntax",
 :name "shebang",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax/shebang",
 :extra-sources ({:code "(defn read-comment\n  [rdr & _]\n  (skip-line rdr _))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.6",
                  :filename "src/main/clojure/clojure/tools/reader/impl/commons.clj",
                  :lines [112 114]}
                 {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.6",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [564 575]}),
 :examples [{:id "de569a",
             :content "```clj\n#!/bin/cljs\n;; waits for another form since #!/bin/cljs was ignored.\n\n123 #! this is ignored\n;;=> 123\n```"}],
 :full-name "syntax/shebang",
 :display "#! shebang",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L114"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/shebang"]))
```

-->
