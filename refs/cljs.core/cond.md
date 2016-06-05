## cljs.core/cond



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cond</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cond)
</td>
</tr>
</table>

<samp>(cond & clauses)</samp><br>

---

 <samp>
(__cond__ & clauses)<br>
</samp>

---

`clauses` must be an even number of forms, ie: `(cond t1 e1, t2 e2, t3 e3)`.
Each test `t` is evaluated one at a time. If a test returns logical true, `cond`
evaluates and returns the corresponding expression `e` and does not evaluate any
of the other tests or expressions.

It is idiomatic to provide a default case as the last test pair using the
keyword `:else` (a keyword always evaluates to logical true).

`(cond)` returns nil.



---

###### Examples:

```
(def a 42)
(cond
  (< a 10) "a is less than 10"
  (= a 10) "a is 10"
  (> a 10) "a is bigger than 10"
  :else "a is not a number!")
;;=> "a is bigger than 10"
```



---

###### See Also:

[`cljs.core/condp`](../cljs.core/condp.md)<br>
[`cljs.core/case`](../cljs.core/case.md)<br>
[`if`](../special/if.md)<br>

---


Source docstring:

```
Takes a set of test/expr pairs. It evaluates each test one at a
time.  If a test returns logical true, cond evaluates and returns
the value of the corresponding expr and doesn't evaluate any of the
other tests or exprs. (cond) returns nil.
```


Source code @ [github]():

```clj
(defmacro cond
  [& clauses]
    (when clauses
      (list 'if (first clauses)
            (if (next clauses)
                (second clauses)
                (throw (IllegalArgumentException.
                         "cond requires an even number of forms")))
            (cons 'clojure.core/cond (next (next clauses))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/cond` @ clojuredocs](http://clojuredocs.org/clojure.core/cond)<br>
[`clojure.core/cond` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/cond/)<br>
[`clojure.core/cond` @ crossclj](http://crossclj.info/fun/clojure.core/cond.html)<br>
[`cljs.core/cond` @ crossclj](http://crossclj.info/fun/cljs.core/cond.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/cond.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`clauses` must be an even number of forms, ie: `(cond t1 e1, t2 e2, t3 e3)`.\nEach test `t` is evaluated one at a time. If a test returns logical true, `cond`\nevaluates and returns the corresponding expression `e` and does not evaluate any\nof the other tests or expressions.\n\nIt is idiomatic to provide a default case as the last test pair using the\nkeyword `:else` (a keyword always evaluates to logical true).\n\n`(cond)` returns nil.",
 :ns "cljs.core",
 :name "cond",
 :signature ["[& clauses]"],
 :name-encode "cond",
 :history [["+" "0.0-927"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/cond",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cond"},
 :related ["cljs.core/condp" "cljs.core/case" "special/if"],
 :full-name-encode "cljs.core/cond",
 :source {:code "(defmacro cond\n  [& clauses]\n    (when clauses\n      (list 'if (first clauses)\n            (if (next clauses)\n                (second clauses)\n                (throw (IllegalArgumentException.\n                         \"cond requires an even number of forms\")))\n            (cons 'clojure.core/cond (next (next clauses))))))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.9.0-alpha4",
          :filename "src/clj/clojure/core.clj",
          :lines [580 593],
          :url "https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/clj/clojure/core.clj#L580-L593"},
 :usage ["(cond & clauses)"],
 :examples [{:id "0cc9ac",
             :content "```\n(def a 42)\n(cond\n  (< a 10) \"a is less than 10\"\n  (= a 10) \"a is 10\"\n  (> a 10) \"a is bigger than 10\"\n  :else \"a is not a number!\")\n;;=> \"a is bigger than 10\"\n```"}],
 :full-name "cljs.core/cond",
 :docstring "Takes a set of test/expr pairs. It evaluates each test one at a\ntime.  If a test returns logical true, cond evaluates and returns\nthe value of the corresponding expr and doesn't evaluate any of the\nother tests or exprs. (cond) returns nil.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/cond.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cond"]))
```

-->
