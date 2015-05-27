## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/filter

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/filter</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/filter)
</td>
</tr>
</table>

 <samp>
(__filter__ pred coll)<br>
</samp>

```
Returns a lazy sequence of the items in coll for which
(pred item) returns true. pred must be free of side-effects.
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2801-2818](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2801-L2818)</ins>
</pre>

```clj
(defn filter
  ([pred coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (if (chunked-seq? s)
        (let [c (chunk-first s)
              size (count c)
              b (chunk-buffer size)]
          (dotimes [i size]
              (when (pred (-nth c i))
                (chunk-append b (-nth c i))))
          (chunk-cons (chunk b) (filter pred (chunk-rest s))))
        (let [f (first s) r (rest s)]
          (if (pred f)
            (cons f (filter pred r))
            (filter pred r))))))))
```


---

```clj
{:ns "cljs.core",
 :name "filter",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_filter",
 :source {:code "(defn filter\n  ([pred coll]\n   (lazy-seq\n    (when-let [s (seq coll)]\n      (if (chunked-seq? s)\n        (let [c (chunk-first s)\n              size (count c)\n              b (chunk-buffer size)]\n          (dotimes [i size]\n              (when (pred (-nth c i))\n                (chunk-append b (-nth c i))))\n          (chunk-cons (chunk b) (filter pred (chunk-rest s))))\n        (let [f (first s) r (rest s)]\n          (if (pred f)\n            (cons f (filter pred r))\n            (filter pred r))))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2801 2818],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2801-L2818"},
 :full-name "cljs.core/filter",
 :clj-symbol "clojure.core/filter",
 :docstring "Returns a lazy sequence of the items in coll for which\n(pred item) returns true. pred must be free of side-effects."}

```
