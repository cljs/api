## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reductions

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reductions</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reductions)
</td>
</tr>
</table>

 <samp>
(__reductions__ f coll)<br>
(__reductions__ f init coll)<br>
</samp>

```
Returns a lazy seq of the intermediate values of the reduction (as
per reduce) of coll by f, starting with init.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5994-6006](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5994-L6006)</ins>
</pre>

```clj
(defn reductions
  ([f coll]
     (lazy-seq
      (if-let [s (seq coll)]
        (reductions f (first s) (rest s))
        (list (f)))))
  ([f init coll]
     (cons init
           (lazy-seq
            (when-let [s (seq coll)]
              (reductions f (f init (first s)) (rest s)))))))
```


---

```clj
{:ns "cljs.core",
 :name "reductions",
 :signature ["[f coll]" "[f init coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_reductions",
 :source {:code "(defn reductions\n  ([f coll]\n     (lazy-seq\n      (if-let [s (seq coll)]\n        (reductions f (first s) (rest s))\n        (list (f)))))\n  ([f init coll]\n     (cons init\n           (lazy-seq\n            (when-let [s (seq coll)]\n              (reductions f (f init (first s)) (rest s)))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5994 6006],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5994-L6006"},
 :full-name "cljs.core/reductions",
 :clj-symbol "clojure.core/reductions",
 :docstring "Returns a lazy seq of the intermediate values of the reduction (as\nper reduce) of coll by f, starting with init."}

```
