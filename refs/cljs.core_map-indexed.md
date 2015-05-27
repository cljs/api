## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/map-indexed

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/map-indexed</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/map-indexed)
</td>
</tr>
</table>

 <samp>
(__map-indexed__ f coll)<br>
</samp>

```
Returns a lazy sequence consisting of the result of applying f to 0
and the first item of coll, followed by applying f to 1 and the second
item in coll, etc, until coll is exhausted. Thus function f should
accept 2 arguments, index and item.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2574-2591](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2574-L2591)</ins>
</pre>

```clj
(defn map-indexed
  [f coll]
  (letfn [(mapi [idx coll]
            (lazy-seq
             (when-let [s (seq coll)]
               (if (chunked-seq? s)
                 (let [c (chunk-first s)
                       size (count c)
                       b (chunk-buffer size)]
                   (dotimes [i size]
                     (chunk-append b (f (+ idx i) (-nth c i))))
                   (chunk-cons (chunk b) (mapi (+ idx size) (chunk-rest s))))
                 (cons (f idx (first s)) (mapi (inc idx) (rest s)))))))]
    (mapi 0 coll)))
```


---

```clj
{:ns "cljs.core",
 :name "map-indexed",
 :signature ["[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_map-indexed",
 :source {:code "(defn map-indexed\n  [f coll]\n  (letfn [(mapi [idx coll]\n            (lazy-seq\n             (when-let [s (seq coll)]\n               (if (chunked-seq? s)\n                 (let [c (chunk-first s)\n                       size (count c)\n                       b (chunk-buffer size)]\n                   (dotimes [i size]\n                     (chunk-append b (f (+ idx i) (-nth c i))))\n                   (chunk-cons (chunk b) (mapi (+ idx size) (chunk-rest s))))\n                 (cons (f idx (first s)) (mapi (inc idx) (rest s)))))))]\n    (mapi 0 coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2574 2591],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2574-L2591"},
 :full-name "cljs.core/map-indexed",
 :clj-symbol "clojure.core/map-indexed",
 :docstring "Returns a lazy sequence consisting of the result of applying f to 0\nand the first item of coll, followed by applying f to 1 and the second\nitem in coll, etc, until coll is exhausted. Thus function f should\naccept 2 arguments, index and item."}

```
