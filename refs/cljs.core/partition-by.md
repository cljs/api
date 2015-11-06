## cljs.core/partition-by



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partition-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partition-by)
</td>
</tr>
</table>


 <samp>
(__partition-by__ f)<br>
</samp>
 <samp>
(__partition-by__ f coll)<br>
</samp>

---

Applies `f` to each value in `coll`, splitting it each time `f` returns a new
value. Returns a lazy sequence of partitions.

Returns a stateful transducer when no collection is provided.



---


###### See Also:

[`cljs.core/partition`](../cljs.core/partition.md)<br>
[`cljs.core/partition-all`](../cljs.core/partition-all.md)<br>
[`cljs.core/group-by`](../cljs.core/group-by.md)<br>

---


Source docstring:

```
Applies f to each value in coll, splitting it each time f returns
a new value.  Returns a lazy seq of partitions.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L6368-L6377):

```clj
(defn partition-by
  [f coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (let [fst (first s)
           fv (f fst)
           run (cons fst (take-while #(= fv (f %)) (next s)))]
       (cons run (partition-by f (seq (drop (count run) s))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6368-6377](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L6368-L6377)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/partition-by` @ clojuredocs](http://clojuredocs.org/clojure.core/partition-by)<br>
[`clojure.core/partition-by` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/partition-by/)<br>
[`clojure.core/partition-by` @ crossclj](http://crossclj.info/fun/clojure.core/partition-by.html)<br>
[`cljs.core/partition-by` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/partition-by.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/partition-by.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Applies `f` to each value in `coll`, splitting it each time `f` returns a new\nvalue. Returns a lazy sequence of partitions.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "partition-by",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partition"
           "cljs.core/partition-all"
           "cljs.core/group-by"],
 :full-name-encode "cljs.core/partition-by",
 :source {:code "(defn partition-by\n  [f coll]\n  (lazy-seq\n   (when-let [s (seq coll)]\n     (let [fst (first s)\n           fv (f fst)\n           run (cons fst (take-while #(= fv (f %)) (next s)))]\n       (cons run (partition-by f (seq (drop (count run) s))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6368 6377]},
 :full-name "cljs.core/partition-by",
 :clj-symbol "clojure.core/partition-by",
 :docstring "Applies f to each value in coll, splitting it each time f returns\na new value.  Returns a lazy seq of partitions."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/partition-by"]))
```

-->
