## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/concat

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/concat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/concat)
</td>
</tr>
</table>

 <samp>
(__concat__)<br>
(__concat__ x)<br>
(__concat__ x y)<br>
(__concat__ x y & zs)<br>
</samp>

```
Returns a lazy seq representing the concatenation of the elements in the supplied colls.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2053-2076](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L2053-L2076)</ins>
</pre>

```clj
(defn concat
  ([] (lazy-seq nil))
  ([x] (lazy-seq x))
  ([x y]
    (lazy-seq
      (let [s (seq x)]
        (if s
          (if (chunked-seq? s)
            (chunk-cons (chunk-first s) (concat (chunk-rest s) y))
            (cons (first s) (concat (rest s) y)))
          y))))
  ([x y & zs]
     (let [cat (fn cat [xys zs]
                 (lazy-seq
                   (let [xys (seq xys)]
                     (if xys
                       (if (chunked-seq? xys)
                         (chunk-cons (chunk-first xys)
                                     (cat (chunk-rest xys) zs))
                         (cons (first xys) (cat (rest xys) zs)))
                       (when zs
                         (cat (first zs) (next zs)))))))]
       (cat (concat x y) zs))))
```


---

```clj
{:ns "cljs.core",
 :name "concat",
 :signature ["[]" "[x]" "[x y]" "[x y & zs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_concat",
 :source {:code "(defn concat\n  ([] (lazy-seq nil))\n  ([x] (lazy-seq x))\n  ([x y]\n    (lazy-seq\n      (let [s (seq x)]\n        (if s\n          (if (chunked-seq? s)\n            (chunk-cons (chunk-first s) (concat (chunk-rest s) y))\n            (cons (first s) (concat (rest s) y)))\n          y))))\n  ([x y & zs]\n     (let [cat (fn cat [xys zs]\n                 (lazy-seq\n                   (let [xys (seq xys)]\n                     (if xys\n                       (if (chunked-seq? xys)\n                         (chunk-cons (chunk-first xys)\n                                     (cat (chunk-rest xys) zs))\n                         (cons (first xys) (cat (rest xys) zs)))\n                       (when zs\n                         (cat (first zs) (next zs)))))))]\n       (cat (concat x y) zs))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2053 2076],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L2053-L2076"},
 :full-name "cljs.core/concat",
 :clj-symbol "clojure.core/concat",
 :docstring "Returns a lazy seq representing the concatenation of the elements in the supplied colls."}

```
