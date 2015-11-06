## cljs.core/flatten



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/flatten</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/flatten)
</td>
</tr>
</table>


 <samp>
(__flatten__ x)<br>
</samp>

---

Takes any nested combination of sequential things (lists, vectors, etc.) and
returns their contents as a single, flat sequence.

`(flatten nil)` returns nil.



---




Source docstring:

```
Takes any nested combination of sequential things (lists, vectors,
etc.) and returns their contents as a single, flat sequence.
(flatten nil) returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L4311-L4317):

```clj
(defn flatten
  [x]
  (filter #(not (sequential? %))
          (rest (tree-seq sequential? seq x))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4311-4317](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L4311-L4317)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/flatten` @ clojuredocs](http://clojuredocs.org/clojure.core/flatten)<br>
[`clojure.core/flatten` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/flatten/)<br>
[`clojure.core/flatten` @ crossclj](http://crossclj.info/fun/clojure.core/flatten.html)<br>
[`cljs.core/flatten` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/flatten.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/flatten.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Takes any nested combination of sequential things (lists, vectors, etc.) and\nreturns their contents as a single, flat sequence.\n\n`(flatten nil)` returns nil.",
 :ns "cljs.core",
 :name "flatten",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/flatten",
 :source {:code "(defn flatten\n  [x]\n  (filter #(not (sequential? %))\n          (rest (tree-seq sequential? seq x))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4311 4317]},
 :full-name "cljs.core/flatten",
 :clj-symbol "clojure.core/flatten",
 :docstring "Takes any nested combination of sequential things (lists, vectors,\netc.) and returns their contents as a single, flat sequence.\n(flatten nil) returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/flatten"]))
```

-->
