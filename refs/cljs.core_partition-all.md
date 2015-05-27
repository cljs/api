## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/partition-all

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partition-all</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partition-all)
</td>
</tr>
</table>

 <samp>
(__partition-all__ n coll)<br>
(__partition-all__ n step coll)<br>
</samp>

```
Returns a lazy sequence of lists like partition, but may include
partitions with fewer than n items at the end.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2800-2808](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L2800-L2808)</ins>
</pre>

```clj
(defn partition-all
  ([n coll]
     (partition-all n n coll))
  ([n step coll]
     (lazy-seq
      (when-let [s (seq coll)]
        (cons (take n s) (partition-all n step (drop step s)))))))
```


---

```clj
{:ns "cljs.core",
 :name "partition-all",
 :signature ["[n coll]" "[n step coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_partition-all",
 :source {:code "(defn partition-all\n  ([n coll]\n     (partition-all n n coll))\n  ([n step coll]\n     (lazy-seq\n      (when-let [s (seq coll)]\n        (cons (take n s) (partition-all n step (drop step s)))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2800 2808],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L2800-L2808"},
 :full-name "cljs.core/partition-all",
 :clj-symbol "clojure.core/partition-all",
 :docstring "Returns a lazy sequence of lists like partition, but may include\npartitions with fewer than n items at the end."}

```
