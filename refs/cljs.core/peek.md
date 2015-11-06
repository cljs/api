## cljs.core/peek



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/peek</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/peek)
</td>
</tr>
</table>


 <samp>
(__peek__ coll)<br>
</samp>

---

Returns the first element of a list; same as `first`.

Returns the last element of a vector, and much more efficient than using `last`.

Returns nil if `coll` is empty.



---

###### Examples:

With vectors:

```clj
(peek [1 2 3])
;;=> 3

(peek [1 2])
;;=> 2

(peek [1])
;;=> 1

(peek [])
;;=> nil
```



---
###### Examples:

With lists:

```clj
(peek '(1 2 3))
;;=> 1

(peek '(1 2))
;;=> 1

(peek '(1))
;;=> 1

(peek '())
;;=> nil
```



---

###### See Also:

[`cljs.core/first`](../cljs.core/first.md)<br>
[`cljs.core/pop`](../cljs.core/pop.md)<br>
[`cljs.core/conj`](../cljs.core/conj.md)<br>

---


Source docstring:

```
For a list or queue, same as first, for a vector, same as, but much
more efficient than, last. If the collection is empty, returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/core.cljs#L1024-L1028):

```clj
(defn peek
  [coll]
  (-peek coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2027
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1024-1028](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/core.cljs#L1024-L1028)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/peek` @ clojuredocs](http://clojuredocs.org/clojure.core/peek)<br>
[`clojure.core/peek` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/peek/)<br>
[`clojure.core/peek` @ crossclj](http://crossclj.info/fun/clojure.core/peek.html)<br>
[`cljs.core/peek` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/peek.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/peek.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the first element of a list; same as `first`.\n\nReturns the last element of a vector, and much more efficient than using `last`.\n\nReturns nil if `coll` is empty.",
 :ns "cljs.core",
 :name "peek",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first" "cljs.core/pop" "cljs.core/conj"],
 :full-name-encode "cljs.core/peek",
 :source {:code "(defn peek\n  [coll]\n  (-peek coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1024 1028]},
 :examples [{:id "4abc4c",
             :content "With vectors:\n\n```clj\n(peek [1 2 3])\n;;=> 3\n\n(peek [1 2])\n;;=> 2\n\n(peek [1])\n;;=> 1\n\n(peek [])\n;;=> nil\n```"}
            {:id "d50bd0",
             :content "With lists:\n\n```clj\n(peek '(1 2 3))\n;;=> 1\n\n(peek '(1 2))\n;;=> 1\n\n(peek '(1))\n;;=> 1\n\n(peek '())\n;;=> nil\n```"}],
 :full-name "cljs.core/peek",
 :clj-symbol "clojure.core/peek",
 :docstring "For a list or queue, same as first, for a vector, same as, but much\nmore efficient than, last. If the collection is empty, returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/peek"]))
```

-->
