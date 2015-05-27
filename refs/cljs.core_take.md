## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/take

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take)
</td>
</tr>
</table>

 <samp>
(__take__ n coll)<br>
</samp>

```
Returns a lazy sequence of the first n items in coll, or all items if
there are fewer than n.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2442-2449](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2442-L2449)</ins>
</pre>

```clj
(defn take
  [n coll]
  (lazy-seq
   (when (pos? n)
     (when-let [s (seq coll)]
      (cons (first s) (take (dec n) (rest s)))))))
```


---

```clj
{:ns "cljs.core",
 :name "take",
 :signature ["[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_take",
 :source {:code "(defn take\n  [n coll]\n  (lazy-seq\n   (when (pos? n)\n     (when-let [s (seq coll)]\n      (cons (first s) (take (dec n) (rest s)))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2442 2449],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2442-L2449"},
 :full-name "cljs.core/take",
 :clj-symbol "clojure.core/take",
 :docstring "Returns a lazy sequence of the first n items in coll, or all items if\nthere are fewer than n."}

```
