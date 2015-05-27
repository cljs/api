## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/merge-with

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/merge-with</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/merge-with)
</td>
</tr>
</table>

 <samp>
(__merge-with__ f & maps)<br>
</samp>

```
Returns a map that consists of the rest of the maps conj-ed onto
the first.  If a key occurs in more than one map, the mapping(s)
from the latter (left-to-right) will be combined with the mapping in
the result by calling (f val-in-result val-in-latter).
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5606-5620](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L5606-L5620)</ins>
</pre>

```clj
(defn merge-with
  [f & maps]
  (when (some identity maps)
    (let [merge-entry (fn [m e]
                        (let [k (first e) v (second e)]
                          (if (contains? m k)
                            (assoc m k (f (get m k) v))
                            (assoc m k v))))
          merge2 (fn [m1 m2]
                   (reduce merge-entry (or m1 {}) (seq m2)))]
      (reduce merge2 maps))))
```


---

```clj
{:ns "cljs.core",
 :name "merge-with",
 :signature ["[f & maps]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_merge-with",
 :source {:code "(defn merge-with\n  [f & maps]\n  (when (some identity maps)\n    (let [merge-entry (fn [m e]\n                        (let [k (first e) v (second e)]\n                          (if (contains? m k)\n                            (assoc m k (f (get m k) v))\n                            (assoc m k v))))\n          merge2 (fn [m1 m2]\n                   (reduce merge-entry (or m1 {}) (seq m2)))]\n      (reduce merge2 maps))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5606 5620],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L5606-L5620"},
 :full-name "cljs.core/merge-with",
 :clj-symbol "clojure.core/merge-with",
 :docstring "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping(s)\nfrom the latter (left-to-right) will be combined with the mapping in\nthe result by calling (f val-in-result val-in-latter)."}

```
