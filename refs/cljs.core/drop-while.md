## cljs.core/drop-while



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/drop-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/drop-while)
</td>
</tr>
</table>


 <samp>
(__drop-while__ pred)<br>
</samp>
 <samp>
(__drop-while__ pred coll)<br>
</samp>

---

Returns a lazy sequence of the items in `coll` starting from the first item for
which `(pred item)` returns logical false.

Returns a stateful transducer when no collection is provided.



---


###### See Also:

[`cljs.core/take-while`](../cljs.core/take-while.md)<br>
[`cljs.core/split-with`](../cljs.core/split-with.md)<br>

---


Source docstring:

```
Returns a lazy sequence of the items in coll starting from the first
item for which (pred item) returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L1745-L1754):

```clj
(defn drop-while
  [pred coll]
  (let [step (fn [pred coll]
               (let [s (seq coll)]
                 (if (and s (pred (first s)))
                   (recur pred (rest s))
                   s)))]
    (lazy-seq (step pred coll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1745-1754](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L1745-L1754)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/drop-while` @ clojuredocs](http://clojuredocs.org/clojure.core/drop-while)<br>
[`clojure.core/drop-while` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/drop-while/)<br>
[`clojure.core/drop-while` @ crossclj](http://crossclj.info/fun/clojure.core/drop-while.html)<br>
[`cljs.core/drop-while` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/drop-while.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/drop-while.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of the items in `coll` starting from the first item for\nwhich `(pred item)` returns logical false.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "drop-while",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/take-while" "cljs.core/split-with"],
 :full-name-encode "cljs.core/drop-while",
 :source {:code "(defn drop-while\n  [pred coll]\n  (let [step (fn [pred coll]\n               (let [s (seq coll)]\n                 (if (and s (pred (first s)))\n                   (recur pred (rest s))\n                   s)))]\n    (lazy-seq (step pred coll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1745 1754]},
 :full-name "cljs.core/drop-while",
 :clj-symbol "clojure.core/drop-while",
 :docstring "Returns a lazy sequence of the items in coll starting from the first\nitem for which (pred item) returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/drop-while"]))
```

-->
