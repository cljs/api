## : keyword



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#keywords)
</td>
</tr>
</table>

<samp>:foo</samp><br>
<samp>:foo/bar</samp><br>

---


A keyword is a string-like datatype that evaluates to itself.  Keywords are often used
as enums or keys for maps.  Keywords should not start with a number.

Keywords can have an optional namespace. For example, `:foo/bar`. This is useful
for functions in a namespace to prevent key collisions on a globally accessible
map.



---

###### Examples:

```clj
:foo
;;=> :foo

:a/foo
;;=> :a/foo
```



---
###### Examples:

A keyword is also callable for retrieving values from a map:

```clj
(def m {:foo 1})
(:foo m)
;;=> 1

(def things [{:foo 1 :bar 2}
             {:foo 3 :bar 4}
             {:foo 5 :bar 6}])
(map :foo things)
;;=> (1 3 5)
```



---

###### See Also:

[`:: keyword`](../syntax/keyword-qualify.md)<br>
[`cljs.core/keyword`](../cljs.core/keyword.md)<br>
[`cljs.core/keyword?`](../cljs.core/keywordQMARK.md)<br>

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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/keyword.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A keyword is a string-like datatype that evaluates to itself.  Keywords are often used\nas enums or keys for maps.  Keywords should not start with a number.\n\nKeywords can have an optional namespace. For example, `:foo/bar`. This is useful\nfor functions in a namespace to prevent key collisions on a globally accessible\nmap.",
 :ns "syntax",
 :name "keyword",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/keyword-qualify"
           "cljs.core/keyword"
           "cljs.core/keyword?"],
 :full-name-encode "syntax/keyword",
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage [":foo" ":foo/bar"],
 :examples [{:id "e5fdbe",
             :content "```clj\n:foo\n;;=> :foo\n\n:a/foo\n;;=> :a/foo\n```"}
            {:id "9765fe",
             :content "A keyword is also callable for retrieving values from a map:\n\n```clj\n(def m {:foo 1})\n(:foo m)\n;;=> 1\n\n(def things [{:foo 1 :bar 2}\n             {:foo 3 :bar 4}\n             {:foo 5 :bar 6}])\n(map :foo things)\n;;=> (1 3 5)\n```"}],
 :edn-doc "https://github.com/edn-format/edn#keywords",
 :full-name "syntax/keyword",
 :display ": keyword",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/keyword"]))
```

-->
