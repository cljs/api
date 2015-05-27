## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keep-indexed

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keep-indexed</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keep-indexed)
</td>
</tr>
</table>

 <samp>
(__keep-indexed__ f coll)<br>
</samp>

```
Returns a lazy sequence of the non-nil results of (f index item). Note,
this means false return values will be included.  f must be free of
side-effects.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2304-2325](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2304-L2325)</ins>
</pre>

```clj
(defn keep-indexed
  ([f coll]
     (letfn [(keepi [idx coll]
               (lazy-seq
                (when-let [s (seq coll)]
                  (if (chunked-seq? s)
                    (let [c (chunk-first s)
                          size (count c)
                          b (chunk-buffer size)]
                      (dotimes [i size]
                        (let [x (f (+ idx i) (-nth c i))]
                          (when-not (nil? x)
                            (chunk-append b x))))
                      (chunk-cons (chunk b) (keepi (+ idx size) (chunk-rest s))))
                    (let [x (f idx (first s))]
                      (if (nil? x)
                        (keepi (inc idx) (rest s))
                        (cons x (keepi (inc idx) (rest s)))))))))]
       (keepi 0 coll))))
```


---

```clj
{:ns "cljs.core",
 :name "keep-indexed",
 :signature ["[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_keep-indexed",
 :source {:code "(defn keep-indexed\n  ([f coll]\n     (letfn [(keepi [idx coll]\n               (lazy-seq\n                (when-let [s (seq coll)]\n                  (if (chunked-seq? s)\n                    (let [c (chunk-first s)\n                          size (count c)\n                          b (chunk-buffer size)]\n                      (dotimes [i size]\n                        (let [x (f (+ idx i) (-nth c i))]\n                          (when-not (nil? x)\n                            (chunk-append b x))))\n                      (chunk-cons (chunk b) (keepi (+ idx size) (chunk-rest s))))\n                    (let [x (f idx (first s))]\n                      (if (nil? x)\n                        (keepi (inc idx) (rest s))\n                        (cons x (keepi (inc idx) (rest s)))))))))]\n       (keepi 0 coll))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2304 2325],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2304-L2325"},
 :full-name "cljs.core/keep-indexed",
 :clj-symbol "clojure.core/keep-indexed",
 :docstring "Returns a lazy sequence of the non-nil results of (f index item). Note,\nthis means false return values will be included.  f must be free of\nside-effects."}

```
