## #{} set



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#sets)
</td>
</tr>
</table>

<samp>#{...}</samp><br>

---


Create a literal set.  Values must be unique.



---

###### Examples:

```clj
#{1 2 3}
;;=> #{1 2 3}
```

Duplicate values will cause an error:

```clj
#{1 1 2 3}
;; Error: Duplicate key: 1
```



---

###### See Also:

[`cljs.core/hash-set`](../cljs.core/hash-set.md)<br>
[`cljs.core/sorted-set`](../cljs.core/sorted-set.md)<br>
[`cljs.core/sorted-set-by`](../cljs.core/sorted-set-by.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L381-L396):

```clj
(defn- read-set
  [rdr _ opts pending-forms]
  (let [[start-line start-column] (starting-line-col-info rdr)
        ;; subtract 1 from start-column so it includes the # in the leading #{
        start-column (if start-column (int (dec start-column)))
        the-set (PersistentHashSet/createWithCheck (read-delimited \} rdr opts pending-forms))
        [end-line end-column] (ending-line-col-info rdr)]
    (with-meta the-set
      (when start-line
        (merge
         (when-let [file (get-file-name rdr)]
           {:file file})
         {:line start-line
          :column start-column
          :end-line end-line
          :end-column end-column})))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.9.2
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:381-396](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L381-L396)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L753-L765):

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
    \? read-cond
    nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.9.2
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:753-765](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L753-L765)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/set.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Create a literal set.  Values must be unique.",
 :ns "syntax",
 :name "set",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/hash-set"
           "cljs.core/sorted-set"
           "cljs.core/sorted-set-by"],
 :full-name-encode "syntax/set",
 :extra-sources ({:code "(defn- read-set\n  [rdr _ opts pending-forms]\n  (let [[start-line start-column] (starting-line-col-info rdr)\n        ;; subtract 1 from start-column so it includes the # in the leading #{\n        start-column (if start-column (int (dec start-column)))\n        the-set (PersistentHashSet/createWithCheck (read-delimited \\} rdr opts pending-forms))\n        [end-line end-column] (ending-line-col-info rdr)]\n    (with-meta the-set\n      (when start-line\n        (merge\n         (when-let [file (get-file-name rdr)]\n           {:file file})\n         {:line start-line\n          :column start-column\n          :end-line end-line\n          :end-column end-column})))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.9.2",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [381 396]}
                 {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    \\? read-cond\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.9.2",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [753 765]}),
 :usage ["#{...}"],
 :examples [{:id "f11ab6",
             :content "```clj\n#{1 2 3}\n;;=> #{1 2 3}\n```\n\nDuplicate values will cause an error:\n\n```clj\n#{1 1 2 3}\n;; Error: Duplicate key: 1\n```"}],
 :edn-doc "https://github.com/edn-format/edn#sets",
 :full-name "syntax/set",
 :display "#{} set",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/set"]))
```

-->
