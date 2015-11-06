## cljs.core/\*3



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*3</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*3)
</td>
</tr>
</table>



Only usable from a REPL.

Holds the result of the third to last expression.



---

###### Examples:

```clj
(+ 1 2 3 4)
;;=> 10

(+ 4 8)
;;=> 12

(+ 1 2)
;;=> 3

*3
;;=> 10

(inc *3)
;;=> 11
```

Note that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of
remembered history:

```clj
:first
;;=> :first

:second
;;=> :second

:third
;;=> :third

*3
;;=> :first

*2
;;=> :second

*1
;;=> :third
```



---

###### See Also:

[`cljs.core/*1`](../cljs.core/STAR1.md)<br>
[`cljs.core/*2`](../cljs.core/STAR2.md)<br>
[``](../cljs.core/STARe.md)<br>

---


Source docstring:

```
bound in a repl thread to the third most recent value printed
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L49-L51):

```clj
(def
  ^{:doc "bound in a repl thread to the third most recent value printed"}
  *3)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:49-51](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L49-L51)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*3` @ clojuredocs](http://clojuredocs.org/clojure.core/*3)<br>
[`clojure.core/*3` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*3/)<br>
[`clojure.core/*3` @ crossclj](http://crossclj.info/fun/clojure.core/*3.html)<br>
[`cljs.core/*3` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*3.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STAR3.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Only usable from a REPL.\n\nHolds the result of the third to last expression.",
 :ns "cljs.core",
 :name "*3",
 :history [["+" "0.0-927"]],
 :type "var",
 :related ["cljs.core/*1" "cljs.core/*2" "cljs.core/*e"],
 :full-name-encode "cljs.core/STAR3",
 :source {:code "(def\n  ^{:doc \"bound in a repl thread to the third most recent value printed\"}\n  *3)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/cljs/core.cljs",
          :lines [49 51]},
 :examples [{:id "d7a6e9",
             :content "```clj\n(+ 1 2 3 4)\n;;=> 10\n\n(+ 4 8)\n;;=> 12\n\n(+ 1 2)\n;;=> 3\n\n*3\n;;=> 10\n\n(inc *3)\n;;=> 11\n```\n\nNote that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of\nremembered history:\n\n```clj\n:first\n;;=> :first\n\n:second\n;;=> :second\n\n:third\n;;=> :third\n\n*3\n;;=> :first\n\n*2\n;;=> :second\n\n*1\n;;=> :third\n```"}],
 :full-name "cljs.core/*3",
 :clj-symbol "clojure.core/*3",
 :docstring "bound in a repl thread to the third most recent value printed"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*3"]))
```

-->
