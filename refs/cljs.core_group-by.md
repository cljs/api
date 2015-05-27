## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/group-by

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/group-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/group-by)
</td>
</tr>
</table>

 <samp>
(__group-by__ f coll)<br>
</samp>

```
Returns a map of the elements of coll keyed by the result of
f on each element. The value at each key will be a vector of the
corresponding elements, in the order they appeared in coll.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7106-7115](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7106-L7115)</ins>
</pre>

```clj
(defn group-by
  [f coll]
  (reduce
   (fn [ret x]
     (let [k (f x)]
       (assoc ret k (conj (get ret k []) x))))
   {} coll))
```


---

```clj
{:ns "cljs.core",
 :name "group-by",
 :signature ["[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_group-by",
 :source {:code "(defn group-by\n  [f coll]\n  (reduce\n   (fn [ret x]\n     (let [k (f x)]\n       (assoc ret k (conj (get ret k []) x))))\n   {} coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7106 7115],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7106-L7115"},
 :full-name "cljs.core/group-by",
 :clj-symbol "clojure.core/group-by",
 :docstring "Returns a map of the elements of coll keyed by the result of\nf on each element. The value at each key will be a vector of the\ncorresponding elements, in the order they appeared in coll."}

```
