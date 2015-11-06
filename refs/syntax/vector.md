## \[\] vector



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#vectors)
</td>
</tr>
</table>

<samp>\[...\]</samp><br>

---


Creates a vector.  A vector is the most commonly used form for creating literal
sequences, and supports random-access and inserting at the end via [`conj`][doc:cljs.core/conj]:

```clj
(def a [1 2 3 4 5])
```

Vectors also serve an important language role as the convention for signaling a
_binding form_, that is, when local names are created and bound to values.
Examples:

- `[a b]` as function arg bindings in [`(fn [a b] ...)`][doc:cljs.core/fn]
- `[a 1 b 2]` as let bindings in [`(let [a 1 b 2] ...)`][doc:cljs.core/let]

This helps differentiate binding forms from the parentheses of [callable forms][doc:syntax/list].

See [`PersistentVector`][doc:cljs.core/PersistentVector] for data structure details.

[doc:cljs.core/conj]:../cljs.core/conj.md
[doc:cljs.core/fn]:../cljs.core/fn.md
[doc:cljs.core/let]:../cljs.core/let.md
[doc:syntax/list]:../syntax/list.md
[doc:cljs.core/PersistentVector]:../cljs.core/PersistentVector.md

---

###### Examples:

```clj
[1 2 3]
;;=> [1 2 3]
```



---

###### See Also:

[`cljs.core/vector`](../cljs.core/vector.md)<br>
[`cljs.core/vec`](../cljs.core/vec.md)<br>

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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/vector.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a vector.  A vector is the most commonly used form for creating literal\nsequences, and supports random-access and inserting at the end via [doc:cljs.core/conj]:\n\n```clj\n(def a [1 2 3 4 5])\n```\n\nVectors also serve an important language role as the convention for signaling a\n_binding form_, that is, when local names are created and bound to values.\nExamples:\n\n- `[a b]` as function arg bindings in [`(fn [a b] ...)`][doc:cljs.core/fn]\n- `[a 1 b 2]` as let bindings in [`(let [a 1 b 2] ...)`][doc:cljs.core/let]\n\nThis helps differentiate binding forms from the parentheses of [callable forms][doc:syntax/list].\n\nSee [doc:cljs.core/PersistentVector] for data structure details.",
 :ns "syntax",
 :name "vector",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/vector" "cljs.core/vec"],
 :full-name-encode "syntax/vector",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage ["[...]"],
 :examples [{:id "18e143",
             :content "```clj\n[1 2 3]\n;;=> [1 2 3]\n```"}],
 :edn-doc "https://github.com/edn-format/edn#vectors",
 :full-name "syntax/vector",
 :display "[] vector",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/vector"]))
```

-->
