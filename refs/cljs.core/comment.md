## cljs.core/comment



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/comment</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/comment)
</td>
</tr>
</table>


 <samp>
(__comment__ & body)<br>
</samp>

---

Ignores all `body` forms (i.e. "commenting out"). Returns nil.

This is often used near the bottom of a file to hold expressions that test
different functions during development.  Specific expressions within the
`comment` can then be selected and evaluated from some editors.

You can also use `;` to "comment out" code until the end of a line.



---

###### Examples:

```clj
(comment 123)
;;=> nil

(comment
  (foo 1 2 3)
  (bar "hello"))
;;=> nil
```

Inner forms must still be syntactically correct:

```clj
(comment [1 2 3]])
;; Error: Unmatched delimiter ]

(comment a : b)
;; Error: Invalid token :
```



---



Source docstring:

```
Ignores body, yields nil
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L4531-L4534):

```clj
(defmacro comment
  [& body])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0-alpha6
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4531-4534](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L4531-L4534)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/comment` @ clojuredocs](http://clojuredocs.org/clojure.core/comment)<br>
[`clojure.core/comment` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/comment/)<br>
[`clojure.core/comment` @ crossclj](http://crossclj.info/fun/clojure.core/comment.html)<br>
[`cljs.core/comment` @ crossclj](http://crossclj.info/fun/cljs.core/comment.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/comment.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Ignores all `body` forms (i.e. \"commenting out\"). Returns nil.\n\nThis is often used near the bottom of a file to hold expressions that test\ndifferent functions during development.  Specific expressions within the\n`comment` can then be selected and evaluated from some editors.\n\nYou can also use `;` to \"comment out\" code until the end of a line.",
 :ns "cljs.core",
 :name "comment",
 :signature ["[& body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/comment",
 :source {:code "(defmacro comment\n  [& body])",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0-alpha6",
          :filename "src/clj/clojure/core.clj",
          :lines [4531 4534]},
 :examples [{:id "482fd7",
             :content "```clj\n(comment 123)\n;;=> nil\n\n(comment\n  (foo 1 2 3)\n  (bar \"hello\"))\n;;=> nil\n```\n\nInner forms must still be syntactically correct:\n\n```clj\n(comment [1 2 3]])\n;; Error: Unmatched delimiter ]\n\n(comment a : b)\n;; Error: Invalid token :\n```"}],
 :full-name "cljs.core/comment",
 :clj-symbol "clojure.core/comment",
 :docstring "Ignores body, yields nil"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/comment"]))
```

-->
