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
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2207-2216](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2207-L2216)</ins>
</pre>

```clj
(defn filter
  ([pred coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (let [f (first s) r (rest s)]
        (if (pred f)
          (cons f (filter pred r))
          (filter pred r)))))))
```


---

```clj
{:ns "cljs.core",
 :name "filter",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_filter",
 :source {:code "(defn filter\n  ([pred coll]\n   (lazy-seq\n    (when-let [s (seq coll)]\n      (let [f (first s) r (rest s)]\n        (if (pred f)\n          (cons f (filter pred r))\n          (filter pred r)))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2207 2216],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2207-L2216"},
 :full-name "cljs.core/filter",
 :clj-symbol "clojure.core/filter",
 :docstring "Returns a lazy sequence of the items in coll for which\n(pred item) returns true. pred must be free of side-effects."}

```
