## cljs.core/\*1



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*1</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*1)
</td>
</tr>
</table>



Only usable from a REPL.

Holds the result of the last expression.



---

###### Examples:

```clj
(+ 1 2 3 4)
;;=> 10

*1
;;=> 10

(inc *1)
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

[`cljs.core/*2`](../cljs.core/STAR2.md)<br>
[`cljs.core/*3`](../cljs.core/STAR3.md)<br>
[``](../cljs.core/STARe.md)<br>

---


Source docstring:

```
bound in a repl thread to the most recent value printed
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2156/src/cljs/cljs/core.cljs#L57-L59):

```clj
(def
  ^{:doc "bound in a repl thread to the most recent value printed"}
  *1)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2156
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:57-59](https://github.com/clojure/clojurescript/blob/r2156/src/cljs/cljs/core.cljs#L57-L59)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*1` @ clojuredocs](http://clojuredocs.org/clojure.core/*1)<br>
[`clojure.core/*1` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*1/)<br>
[`clojure.core/*1` @ crossclj](http://crossclj.info/fun/clojure.core/*1.html)<br>
[`cljs.core/*1` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*1.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STAR1.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Only usable from a REPL.\n\nHolds the result of the last expression.",
 :ns "cljs.core",
 :name "*1",
 :history [["+" "0.0-927"]],
 :type "var",
 :related ["cljs.core/*2" "cljs.core/*3" "cljs.core/*e"],
 :full-name-encode "cljs.core/STAR1",
 :source {:code "(def\n  ^{:doc \"bound in a repl thread to the most recent value printed\"}\n  *1)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2156",
          :filename "src/cljs/cljs/core.cljs",
          :lines [57 59]},
 :examples [{:id "30a861",
             :content "```clj\n(+ 1 2 3 4)\n;;=> 10\n\n*1\n;;=> 10\n\n(inc *1)\n;;=> 11\n```\n\nNote that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of\nremembered history:\n\n```clj\n:first\n;;=> :first\n\n:second\n;;=> :second\n\n:third\n;;=> :third\n\n*3\n;;=> :first\n\n*2\n;;=> :second\n\n*1\n;;=> :third\n```"}],
 :full-name "cljs.core/*1",
 :clj-symbol "clojure.core/*1",
 :docstring "bound in a repl thread to the most recent value printed"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*1"]))
```

-->
