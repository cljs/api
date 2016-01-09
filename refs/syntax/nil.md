## nil



 <table border="1">
<tr>
<td>special symbol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#nil)
</td>
</tr>
</table>



`nil` is a representation of nothing.

It is common for operations to safely handle `nil` without
causing exceptions.

Expressions evaluate to `nil` if there is no value to return.



---

###### Examples:

```clj
nil
;;=> nil
```

`nil` can sometimes mean "not found":

```clj
(:foo {})
;;=> nil
```

`nil` can also mean that the operation didn't make sense:

```clj
(:foo nil)
;;=> nil
```



---






Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha1/src/main/clojure/clojure/tools/reader.clj#L303-L329):

```clj
(defn- read-symbol
  [rdr initch]
  (let [[line column] (starting-line-col-info rdr)]
    (when-let [token (read-token rdr initch)]
      (case token

        ;; special symbols
        "nil" nil
        "true" true
        "false" false
        "/" '/
        "NaN" Double/NaN
        "-Infinity" Double/NEGATIVE_INFINITY
        ("Infinity" "+Infinity") Double/POSITIVE_INFINITY

        (or (when-let [p (parse-symbol token)]
              (with-meta (symbol (p 0) (p 1))
                (when line
                  (merge
                   (when-let [file (get-file-name rdr)]
                     {:file file})
                   (let [[end-line end-column] (ending-line-col-info rdr)]
                     {:line line
                      :column column
                      :end-line end-line
                      :end-column end-column})))))
            (reader-error rdr "Invalid token: " token))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-1.0.0-alpha1
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:303-329](https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha1/src/main/clojure/clojure/tools/reader.clj#L303-L329)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/nil.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`nil` is a representation of nothing.\n\nIt is common for operations to safely handle `nil` without\ncausing exceptions.\n\nExpressions evaluate to `nil` if there is no value to return.",
 :ns "syntax",
 :name "nil",
 :history [["+" "0.0-927"]],
 :type "special symbol",
 :full-name-encode "syntax/nil",
 :extra-sources [{:code "(defn- read-symbol\n  [rdr initch]\n  (let [[line column] (starting-line-col-info rdr)]\n    (when-let [token (read-token rdr initch)]\n      (case token\n\n        ;; special symbols\n        \"nil\" nil\n        \"true\" true\n        \"false\" false\n        \"/\" '/\n        \"NaN\" Double/NaN\n        \"-Infinity\" Double/NEGATIVE_INFINITY\n        (\"Infinity\" \"+Infinity\") Double/POSITIVE_INFINITY\n\n        (or (when-let [p (parse-symbol token)]\n              (with-meta (symbol (p 0) (p 1))\n                (when line\n                  (merge\n                   (when-let [file (get-file-name rdr)]\n                     {:file file})\n                   (let [[end-line end-column] (ending-line-col-info rdr)]\n                     {:line line\n                      :column column\n                      :end-line end-line\n                      :end-column end-column})))))\n            (reader-error rdr \"Invalid token: \" token))))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [303 329]}],
 :examples [{:id "17b92a",
             :content "```clj\nnil\n;;=> nil\n```\n\n`nil` can sometimes mean \"not found\":\n\n```clj\n(:foo {})\n;;=> nil\n```\n\n`nil` can also mean that the operation didn't make sense:\n\n```clj\n(:foo nil)\n;;=> nil\n```"}],
 :edn-doc "https://github.com/edn-format/edn#nil",
 :full-name "syntax/nil",
 :display "nil",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/nil"]))
```

-->
