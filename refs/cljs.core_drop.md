## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/drop

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/drop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/drop)
</td>
</tr>
</table>

 <samp>
(__drop__ n coll)<br>
</samp>

```
Returns a lazy sequence of all but the first n items in coll.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1718-1726](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1718-L1726)</ins>
</pre>

```clj
(defn drop
  [n coll]
  (let [step (fn [n coll]
               (let [s (seq coll)]
                 (if (and (pos? n) s)
                   (recur (dec n) (rest s))
                   s)))]
    (lazy-seq (step n coll))))
```


---

```clj
{:ns "cljs.core",
 :name "drop",
 :signature ["[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_drop",
 :source {:code "(defn drop\n  [n coll]\n  (let [step (fn [n coll]\n               (let [s (seq coll)]\n                 (if (and (pos? n) s)\n                   (recur (dec n) (rest s))\n                   s)))]\n    (lazy-seq (step n coll))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1718 1726],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1718-L1726"},
 :full-name "cljs.core/drop",
 :clj-symbol "clojure.core/drop",
 :docstring "Returns a lazy sequence of all but the first n items in coll."}

```
