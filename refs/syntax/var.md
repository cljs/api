## #' var



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>

<samp>#'foo</samp><br>
<samp>#'foo/bar</samp><br>

---


`#'foo` is sugar for [`(var foo)`][doc:special/var].

Accesses the var attached to the given symbol.



---

###### Examples:

Access the metadata of a var:

```clj
(def x 123)
(meta #'x)
;;=> {:arglists (), :test nil, :name x, :column 1, :line 1, :file "<cljs repl>", :doc nil, :ns cljs.user}
```



---

###### See Also:

[``](../special/var.md)<br>

---





Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.9/src/main/clojure/clojure/tools/reader.clj#L624-L635):

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
tools.reader @ tools.reader-0.8.9
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:624-635](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.9/src/main/clojure/clojure/tools/reader.clj#L624-L635)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/var.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`#'foo` is sugar for [`(var foo)`][doc:special/var].\n\nAccesses the var attached to the given symbol.",
 :ns "syntax",
 :name "var",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["special/var"],
 :full-name-encode "syntax/var",
 :extra-sources ({:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.9",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [624 635]}),
 :usage ["#'foo" "#'foo/bar"],
 :examples [{:id "673ef6",
             :content "Access the metadata of a var:\n\n```clj\n(def x 123)\n(meta #'x)\n;;=> {:arglists (), :test nil, :name x, :column 1, :line 1, :file \"<cljs repl>\", :doc nil, :ns cljs.user}\n```"}],
 :full-name "syntax/var",
 :display "#' var",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/var"]))
```

-->
