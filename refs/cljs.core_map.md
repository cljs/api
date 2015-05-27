## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/map

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/map)
</td>
</tr>
</table>

 <samp>
(__map__ f coll)<br>
(__map__ f c1 c2)<br>
(__map__ f c1 c2 c3)<br>
(__map__ f c1 c2 c3 & colls)<br>
</samp>

```
Returns a lazy sequence consisting of the result of applying f to the
set of first items of each coll, followed by applying f to the set
of second items in each coll, until any one of the colls is
exhausted.  Any remaining items in other colls are ignored. Function
f should accept number-of-colls arguments.
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2648-2683](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2648-L2683)</ins>
</pre>

```clj
(defn map
  ([f coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (if (chunked-seq? s)
        (let [c (chunk-first s)
              size (count c)
              b (chunk-buffer size)]
          (dotimes [i size]
              (chunk-append b (f (-nth c i))))
          (chunk-cons (chunk b) (map f (chunk-rest s))))
        (cons (f (first s)) (map f (rest s)))))))
  ([f c1 c2]
   (lazy-seq
    (let [s1 (seq c1) s2 (seq c2)]
      (when (and s1 s2)
        (cons (f (first s1) (first s2))
              (map f (rest s1) (rest s2)))))))
  ([f c1 c2 c3]
   (lazy-seq
    (let [s1 (seq c1) s2 (seq c2) s3 (seq c3)]
      (when (and  s1 s2 s3)
        (cons (f (first s1) (first s2) (first s3))
              (map f (rest s1) (rest s2) (rest s3)))))))
  ([f c1 c2 c3 & colls]
   (let [step (fn step [cs]
                 (lazy-seq
                  (let [ss (map seq cs)]
                    (when (every? identity ss)
                      (cons (map first ss) (step (map rest ss)))))))]
     (map #(apply f %) (step (conj colls c3 c2 c1))))))
```


---

```clj
{:ns "cljs.core",
 :name "map",
 :signature ["[f coll]"
             "[f c1 c2]"
             "[f c1 c2 c3]"
             "[f c1 c2 c3 & colls]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_map",
 :source {:code "(defn map\n  ([f coll]\n   (lazy-seq\n    (when-let [s (seq coll)]\n      (if (chunked-seq? s)\n        (let [c (chunk-first s)\n              size (count c)\n              b (chunk-buffer size)]\n          (dotimes [i size]\n              (chunk-append b (f (-nth c i))))\n          (chunk-cons (chunk b) (map f (chunk-rest s))))\n        (cons (f (first s)) (map f (rest s)))))))\n  ([f c1 c2]\n   (lazy-seq\n    (let [s1 (seq c1) s2 (seq c2)]\n      (when (and s1 s2)\n        (cons (f (first s1) (first s2))\n              (map f (rest s1) (rest s2)))))))\n  ([f c1 c2 c3]\n   (lazy-seq\n    (let [s1 (seq c1) s2 (seq c2) s3 (seq c3)]\n      (when (and  s1 s2 s3)\n        (cons (f (first s1) (first s2) (first s3))\n              (map f (rest s1) (rest s2) (rest s3)))))))\n  ([f c1 c2 c3 & colls]\n   (let [step (fn step [cs]\n                 (lazy-seq\n                  (let [ss (map seq cs)]\n                    (when (every? identity ss)\n                      (cons (map first ss) (step (map rest ss)))))))]\n     (map #(apply f %) (step (conj colls c3 c2 c1))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2648 2683],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2648-L2683"},
 :full-name "cljs.core/map",
 :clj-symbol "clojure.core/map",
 :docstring "Returns a lazy sequence consisting of the result of applying f to the\nset of first items of each coll, followed by applying f to the set\nof second items in each coll, until any one of the colls is\nexhausted.  Any remaining items in other colls are ignored. Function\nf should accept number-of-colls arguments."}

```
