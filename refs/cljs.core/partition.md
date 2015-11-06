## cljs.core/partition



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partition</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partition)
</td>
</tr>
</table>


 <samp>
(__partition__ n coll)<br>
</samp>
 <samp>
(__partition__ n step coll)<br>
</samp>
 <samp>
(__partition__ n step pad coll)<br>
</samp>

---

Returns a lazy sequence of lists of `n` items each, at offsets `step` apart.

If `step` is not supplied, defaults to `n`, i.e. the partitions do not overlap.

If a `pad` collection is supplied, its elements will be used as necessary to
complete the last partition up to `n` items.

Returns a partition with less than `n` items if there are not enough padding
elements.



---


###### See Also:

[`cljs.core/partition-all`](../cljs.core/partition-all.md)<br>
[`cljs.core/split-at`](../cljs.core/split-at.md)<br>
[`cljs.core/partition-by`](../cljs.core/partition-by.md)<br>

---


Source docstring:

```
Returns a lazy sequence of lists of n items each, at offsets step
apart. If step is not supplied, defaults to n, i.e. the partitions
do not overlap. If a pad collection is supplied, use its elements as
necessary to complete last partition up to n items. In case there are
not enough padding elements, return a partition with less than n items.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L4148-L4168):

```clj
(defn partition
  ([n coll]
     (partition n n coll))
  ([n step coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (let [p (take n s)]
           (when (== n (count p))
             (cons p (partition n step (drop step s))))))))
  ([n step pad coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (let [p (take n s)]
           (if (== n (count p))
             (cons p (partition n step pad (drop step s)))
             (list (take n (concat p pad)))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4148-4168](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L4148-L4168)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/partition` @ clojuredocs](http://clojuredocs.org/clojure.core/partition)<br>
[`clojure.core/partition` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/partition/)<br>
[`clojure.core/partition` @ crossclj](http://crossclj.info/fun/clojure.core/partition.html)<br>
[`cljs.core/partition` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/partition.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/partition.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of lists of `n` items each, at offsets `step` apart.\n\nIf `step` is not supplied, defaults to `n`, i.e. the partitions do not overlap.\n\nIf a `pad` collection is supplied, its elements will be used as necessary to\ncomplete the last partition up to `n` items.\n\nReturns a partition with less than `n` items if there are not enough padding\nelements.",
 :ns "cljs.core",
 :name "partition",
 :signature ["[n coll]" "[n step coll]" "[n step pad coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partition-all"
           "cljs.core/split-at"
           "cljs.core/partition-by"],
 :full-name-encode "cljs.core/partition",
 :source {:code "(defn partition\n  ([n coll]\n     (partition n n coll))\n  ([n step coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (let [p (take n s)]\n           (when (== n (count p))\n             (cons p (partition n step (drop step s))))))))\n  ([n step pad coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (let [p (take n s)]\n           (if (== n (count p))\n             (cons p (partition n step pad (drop step s)))\n             (list (take n (concat p pad)))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4148 4168]},
 :full-name "cljs.core/partition",
 :clj-symbol "clojure.core/partition",
 :docstring "Returns a lazy sequence of lists of n items each, at offsets step\napart. If step is not supplied, defaults to n, i.e. the partitions\ndo not overlap. If a pad collection is supplied, use its elements as\nnecessary to complete last partition up to n items. In case there are\nnot enough padding elements, return a partition with less than n items."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/partition"]))
```

-->
