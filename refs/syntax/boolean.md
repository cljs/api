## boolean literal



 <table border="1">
<tr>
<td>special symbol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#booleans)
</td>
</tr>
</table>

<samp>true</samp><br>
<samp>false</samp><br>

---


Special symbols representing the boolean literals `true` and `false`.
Both evaluate to themselves.



---

###### Examples:

```clj
true
;;=> true

false
;;=> false
```



---

###### See Also:

[`cljs.core/boolean`](../cljs.core/boolean.md)<br>
[`if`](../special/if.md)<br>
[`cljs.core/not`](../cljs.core/not.md)<br>
[`cljs.core/true?`](../cljs.core/trueQMARK.md)<br>
[`cljs.core/false?`](../cljs.core/falseQMARK.md)<br>

---




 @ [github](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L):

```clj

```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.3.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/boolean.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Special symbols representing the boolean literals `true` and `false`.\nBoth evaluate to themselves.",
 :ns "syntax",
 :name "boolean",
 :history [["+" "0.0-927"]],
 :type "special symbol",
 :related ["cljs.core/boolean"
           "special/if"
           "cljs.core/not"
           "cljs.core/true?"
           "cljs.core/false?"],
 :full-name-encode "syntax/boolean",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage ["true" "false"],
 :examples [{:id "1afc59",
             :content "```clj\ntrue\n;;=> true\n\nfalse\n;;=> false\n```"}],
 :edn-doc "https://github.com/edn-format/edn#booleans",
 :full-name "syntax/boolean",
 :display "boolean literal",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/boolean"]))
```

-->
