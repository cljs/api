## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/replace

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/replace)
</td>
</tr>
</table>

 <samp>
(__replace__ smap coll)<br>
</samp>

```
Given a map of replacement pairs and a vector/collection, returns a
vector/seq with any elements = a key in smap replaced with the
corresponding val in smap
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2530-2542](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2530-L2542)</ins>
</pre>

```clj
(defn replace
  [smap coll]
  (if (vector? coll)
    (let [n (count coll)]
      (reduce (fn [v i]
                (if-let [e (find smap (nth v i))]
                  (assoc v i (second e))
                  v))
              coll (take n (iterate inc 0))))
    (map #(if-let [e (find smap %)] (second e) %) coll)))
```


---

```clj
{:ns "cljs.core",
 :name "replace",
 :signature ["[smap coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_replace",
 :source {:code "(defn replace\n  [smap coll]\n  (if (vector? coll)\n    (let [n (count coll)]\n      (reduce (fn [v i]\n                (if-let [e (find smap (nth v i))]\n                  (assoc v i (second e))\n                  v))\n              coll (take n (iterate inc 0))))\n    (map #(if-let [e (find smap %)] (second e) %) coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2530 2542],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2530-L2542"},
 :full-name "cljs.core/replace",
 :clj-symbol "clojure.core/replace",
 :docstring "Given a map of replacement pairs and a vector/collection, returns a\nvector/seq with any elements = a key in smap replaced with the\ncorresponding val in smap"}

```
