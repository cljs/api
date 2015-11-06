## #() function



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>

<samp>#(...)</samp><br>

---


Shorthand for creating an anonymous function:

`#(...)` = `(fn [args] (...))`

Use the following to access the implicit function arguments:

- `%` or `%1` for first argument.
- `%2`, `%3` and so on for subsequent arguments
- `%&` for the rest of the arguments after the highest individually referenced argument

Note that `#(1)` does not create a function that returns `1`, for the same
reason that `(1)` does evaluate to `1`.

`#()` forms cannot be nested, since this would create an ambiguity between the
automatically assigned `%` argument names.



---

###### Examples:

```clj
(map #(* 2 %) [1 2 3])
;;=> (2 4 6)

(def f #(println %1 %2 %&))
(f 1 2 3 4 5)
;; prints: 1 2 (3 4 5)
```



---

###### See Also:

[`% arg`](../syntax/arg.md)<br>
[`cljs.core/fn`](../cljs.core/fn.md)<br>
[`cljs.core/defn`](../cljs.core/defn.md)<br>
[`cljs.core/partial`](../cljs.core/partial.md)<br>

---




 @ [github](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/jvm/clojure/lang/LispReader.java#L):

```clj

```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.4.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/function.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Shorthand for creating an anonymous function:\n\n`#(...)` = `(fn [args] (...))`\n\nUse the following to access the implicit function arguments:\n\n- `%` or `%1` for first argument.\n- `%2`, `%3` and so on for subsequent arguments\n- `%&` for the rest of the arguments after the highest individually referenced argument\n\nNote that `#(1)` does not create a function that returns `1`, for the same\nreason that `(1)` does evaluate to `1`.\n\n`#()` forms cannot be nested, since this would create an ambiguity between the\nautomatically assigned `%` argument names.",
 :ns "syntax",
 :name "function",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/arg"
           "cljs.core/fn"
           "cljs.core/defn"
           "cljs.core/partial"],
 :full-name-encode "syntax/function",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage ["#(...)"],
 :examples [{:id "6a87de",
             :content "```clj\n(map #(* 2 %) [1 2 3])\n;;=> (2 4 6)\n\n(def f #(println %1 %2 %&))\n(f 1 2 3 4 5)\n;; prints: 1 2 (3 4 5)\n```"}],
 :full-name "syntax/function",
 :display "#() function",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/function"]))
```

-->
