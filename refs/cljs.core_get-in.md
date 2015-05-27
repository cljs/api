## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/get-in

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get-in</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-in)
</td>
</tr>
</table>

 <samp>
(__get-in__ m ks)<br>
(__get-in__ m ks not-found)<br>
</samp>

```
Returns the value in a nested associative structure,
where ks is a sequence of ke(ys. Returns nil if the key is not present,
or the not-found value if supplied.
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1892-1909](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1892-L1909)</ins>
</pre>

```clj
(defn get-in
  ([m ks]
     (reduce get m ks))
  ([m ks not-found]
     (loop [sentinel lookup-sentinel
            m m
            ks (seq ks)]
       (if ks
         (let [m (get m (first ks) sentinel)]
           (if (identical? sentinel m)
             not-found
             (recur sentinel m (next ks))))
         m))))
```


---

```clj
{:ns "cljs.core",
 :name "get-in",
 :signature ["[m ks]" "[m ks not-found]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_get-in",
 :source {:code "(defn get-in\n  ([m ks]\n     (reduce get m ks))\n  ([m ks not-found]\n     (loop [sentinel lookup-sentinel\n            m m\n            ks (seq ks)]\n       (if ks\n         (let [m (get m (first ks) sentinel)]\n           (if (identical? sentinel m)\n             not-found\n             (recur sentinel m (next ks))))\n         m))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1892 1909],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1892-L1909"},
 :full-name "cljs.core/get-in",
 :clj-symbol "clojure.core/get-in",
 :docstring "Returns the value in a nested associative structure,\nwhere ks is a sequence of ke(ys. Returns nil if the key is not present,\nor the not-found value if supplied."}

```
