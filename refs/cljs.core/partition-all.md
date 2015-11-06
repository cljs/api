## cljs.core/partition-all



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partition-all</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partition-all)
</td>
</tr>
</table>


 <samp>
(__partition-all__ n)<br>
</samp>
 <samp>
(__partition-all__ n coll)<br>
</samp>
 <samp>
(__partition-all__ n step coll)<br>
</samp>

---

Returns a lazy sequence of lists like `partition`, but may include partitions
with fewer than `n` items at the end.

Returns a stateful transducer when no collection is provided.



---


###### See Also:

[`cljs.core/partition`](../cljs.core/partition.md)<br>
[`cljs.core/partition-by`](../cljs.core/partition-by.md)<br>

---


Source docstring:

```
Returns a lazy sequence of lists like partition, but may include
partitions with fewer than n items at the end.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L6221-L6229):

```clj
(defn partition-all
  ([n coll]
     (partition-all n n coll))
  ([n step coll]
     (lazy-seq
      (when-let [s (seq coll)]
        (cons (take n s) (partition-all n step (drop step s)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6221-6229](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L6221-L6229)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/partition-all` @ clojuredocs](http://clojuredocs.org/clojure.core/partition-all)<br>
[`clojure.core/partition-all` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/partition-all/)<br>
[`clojure.core/partition-all` @ crossclj](http://crossclj.info/fun/clojure.core/partition-all.html)<br>
[`cljs.core/partition-all` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/partition-all.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/partition-all.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of lists like `partition`, but may include partitions\nwith fewer than `n` items at the end.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "partition-all",
 :signature ["[n]" "[n coll]" "[n step coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partition" "cljs.core/partition-by"],
 :full-name-encode "cljs.core/partition-all",
 :source {:code "(defn partition-all\n  ([n coll]\n     (partition-all n n coll))\n  ([n step coll]\n     (lazy-seq\n      (when-let [s (seq coll)]\n        (cons (take n s) (partition-all n step (drop step s)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6221 6229]},
 :full-name "cljs.core/partition-all",
 :clj-symbol "clojure.core/partition-all",
 :docstring "Returns a lazy sequence of lists like partition, but may include\npartitions with fewer than n items at the end."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/partition-all"]))
```

-->
