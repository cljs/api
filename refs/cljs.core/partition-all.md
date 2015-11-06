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
partitions with fewer than n items at the end.  Returns a stateful
transducer when no collection is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L8336-L8365):

```clj
(defn partition-all
  ([n]
   (fn [rf]
     (let [a (array-list)]
       (fn
         ([] (rf))
         ([result]
            (let [result (if (.isEmpty a)
                           result
                           (let [v (vec (.toArray a))]
                             ;;clear first!
                             (.clear a)
                             (unreduced (rf result v))))]
              (rf result)))
         ([result input]
            (.add a input)
            (if (== n (.size a))
              (let [v (vec (.toArray a))]
                (.clear a)
                (rf result v))
              result))))))
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
clojurescript @ r1.7.170
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8336-8365](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L8336-L8365)</ins>
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
 :source {:code "(defn partition-all\n  ([n]\n   (fn [rf]\n     (let [a (array-list)]\n       (fn\n         ([] (rf))\n         ([result]\n            (let [result (if (.isEmpty a)\n                           result\n                           (let [v (vec (.toArray a))]\n                             ;;clear first!\n                             (.clear a)\n                             (unreduced (rf result v))))]\n              (rf result)))\n         ([result input]\n            (.add a input)\n            (if (== n (.size a))\n              (let [v (vec (.toArray a))]\n                (.clear a)\n                (rf result v))\n              result))))))\n  ([n coll]\n     (partition-all n n coll))\n  ([n step coll]\n     (lazy-seq\n      (when-let [s (seq coll)]\n        (cons (take n s) (partition-all n step (drop step s)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8336 8365]},
 :full-name "cljs.core/partition-all",
 :clj-symbol "clojure.core/partition-all",
 :docstring "Returns a lazy sequence of lists like partition, but may include\npartitions with fewer than n items at the end.  Returns a stateful\ntransducer when no collection is provided."}

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
