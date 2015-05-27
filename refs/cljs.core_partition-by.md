## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/partition-by

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partition-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partition-by)
</td>
</tr>
</table>

 <samp>
(__partition-by__ f coll)<br>
</samp>

```
Applies f to each value in coll, splitting it each time f returns
a new value.  Returns a lazy seq of partitions.
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6064-6073](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6064-L6073)</ins>
</pre>

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


---

```clj
{:ns "cljs.core",
 :name "partition-by",
 :signature ["[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_partition-by",
 :source {:code "(defn partition-by\n  [f coll]\n  (lazy-seq\n   (when-let [s (seq coll)]\n     (let [fst (first s)\n           fv (f fst)\n           run (cons fst (take-while #(= fv (f %)) (next s)))]\n       (cons run (partition-by f (seq (drop (count run) s))))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6064 6073],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6064-L6073"},
 :full-name "cljs.core/partition-by",
 :clj-symbol "clojure.core/partition-by",
 :docstring "Applies f to each value in coll, splitting it each time f returns\na new value.  Returns a lazy seq of partitions."}

```
