## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/partition

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partition</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partition)
</td>
</tr>
</table>

 <samp>
(__partition__ n coll)<br>
(__partition__ n step coll)<br>
(__partition__ n step pad coll)<br>
</samp>

```
Returns a lazy sequence of lists of n items each, at offsets step
apart. If step is not supplied, defaults to n, i.e. the partitions
do not overlap. If a pad collection is supplied, use its elements as
necessary to complete last partition upto n items. In case there are
not enough padding elements, return a partition with less than n items.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1831-1851](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1831-L1851)</ins>
</pre>

```clj
(defn partition
  ([n coll]
     (partition n n coll))
  ([n step coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (let [p (take n s)]
           (when (= n (count p))
             (cons p (partition n step (drop step s))))))))
  ([n step pad coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (let [p (take n s)]
           (if (= n (count p))
             (cons p (partition n step pad (drop step s)))
             (list (take n (concat p pad)))))))))
```


---

```clj
{:ns "cljs.core",
 :name "partition",
 :signature ["[n coll]" "[n step coll]" "[n step pad coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_partition",
 :source {:code "(defn partition\n  ([n coll]\n     (partition n n coll))\n  ([n step coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (let [p (take n s)]\n           (when (= n (count p))\n             (cons p (partition n step (drop step s))))))))\n  ([n step pad coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (let [p (take n s)]\n           (if (= n (count p))\n             (cons p (partition n step pad (drop step s)))\n             (list (take n (concat p pad)))))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1831 1851],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1831-L1851"},
 :full-name "cljs.core/partition",
 :clj-symbol "clojure.core/partition",
 :docstring "Returns a lazy sequence of lists of n items each, at offsets step\napart. If step is not supplied, defaults to n, i.e. the partitions\ndo not overlap. If a pad collection is supplied, use its elements as\nnecessary to complete last partition upto n items. In case there are\nnot enough padding elements, return a partition with less than n items."}

```
