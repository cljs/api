## @ deref



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>

<samp>@foo</samp><br>

---


`@foo` is sugar for [`(deref foo)`][doc:cljs.core/deref].

Retrieve the underlying value of a reference.  References can be created by
[`atom`][doc:cljs.core/atom] or [`delay`][doc:cljs.core/delay].

[doc:cljs.core/deref]:../cljs.core/deref.md
[doc:cljs.core/atom]:../cljs.core/atom.md
[doc:cljs.core/delay]:../cljs.core/delay.md

---

###### Examples:

```clj
(def a (atom 1))
@a
;;=> 1

(deref a)
;;=> 1
```



---

###### See Also:

[`cljs.core/deref`](../cljs.core/deref.md)<br>
[`cljs.core/atom`](../cljs.core/atom.md)<br>
[`cljs.core/delay`](../cljs.core/delay.md)<br>

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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/deref.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`@foo` is sugar for [`(deref foo)`][doc:cljs.core/deref].\n\nRetrieve the underlying value of a reference.  References can be created by\n[doc:cljs.core/atom] or [doc:cljs.core/delay].",
 :syntax-equiv {:edn-url nil,
                :clj-url "http://clojure.org/reader#toc2"},
 :ns "syntax",
 :name "deref",
 :name-encode "deref",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/deref" "cljs.core/atom" "cljs.core/delay"],
 :full-name-encode "syntax/deref",
 :extra-sources ({:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-beta1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [743 762],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-beta1/src/main/clojure/clojure/tools/reader.clj#L743-L762"}),
 :usage ["@foo"],
 :examples [{:id "08f886",
             :content "```clj\n(def a (atom 1))\n@a\n;;=> 1\n\n(deref a)\n;;=> 1\n```"}],
 :full-name "syntax/deref",
 :display "@ deref",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/deref.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/deref"]))
```

-->
