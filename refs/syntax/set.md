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




 @ [github](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/jvm/clojure/lang/LispReader.java#L):

```clj

```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.5.1
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/jvm/clojure/lang/LispReader.java#L)</ins>
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
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
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
