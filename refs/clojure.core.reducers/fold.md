## clojure.core.reducers/fold



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/fold</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/fold)
</td>
</tr>
</table>


 <samp>
(__fold__ reducef coll)<br>
</samp>
 <samp>
(__fold__ combinef reducef coll)<br>
</samp>
 <samp>
(__fold__ n combinef reducef coll)<br>
</samp>

---





Source docstring:

```
Reduces a collection using a (potentially parallel) reduce-combine
strategy. The collection is partitioned into groups of approximately
n (default 512), each of which is reduced with reducef (with a seed
value obtained by calling (combinef) with no arguments). The results
of these reductions are then reduced with combinef (default
reducef). combinef must be associative, and, when called with no
arguments, (combinef) must produce its identity element. These
operations may be performed in parallel, but the results will
preserve order.

Note: Performing operations in parallel is currently not implemented.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/clojure/core/reducers.cljs#L49-L64):

```clj
(defn fold
  ([reducef coll] (fold reducef reducef coll))
  ([combinef reducef coll] (fold 512 combinef reducef coll))
  ([n combinef reducef coll]
     (coll-fold coll n combinef reducef)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:49-64](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/clojure/core/reducers.cljs#L49-L64)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/fold` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/fold)<br>
[`clojure.core.reducers/fold` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/fold/)<br>
[`clojure.core.reducers/fold` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/fold.html)<br>
[`clojure.core.reducers/fold` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/fold.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/fold.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "fold",
 :signature ["[reducef coll]"
             "[combinef reducef coll]"
             "[n combinef reducef coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/fold",
 :source {:code "(defn fold\n  ([reducef coll] (fold reducef reducef coll))\n  ([combinef reducef coll] (fold 512 combinef reducef coll))\n  ([n combinef reducef coll]\n     (coll-fold coll n combinef reducef)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [49 64]},
 :full-name "clojure.core.reducers/fold",
 :clj-symbol "clojure.core.reducers/fold",
 :docstring "Reduces a collection using a (potentially parallel) reduce-combine\nstrategy. The collection is partitioned into groups of approximately\nn (default 512), each of which is reduced with reducef (with a seed\nvalue obtained by calling (combinef) with no arguments). The results\nof these reductions are then reduced with combinef (default\nreducef). combinef must be associative, and, when called with no\narguments, (combinef) must produce its identity element. These\noperations may be performed in parallel, but the results will\npreserve order.\n\nNote: Performing operations in parallel is currently not implemented."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/fold"]))
```

-->
