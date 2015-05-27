## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dissoc

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dissoc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dissoc)
</td>
</tr>
</table>

 <samp>
(__dissoc__ coll)<br>
(__dissoc__ coll k)<br>
(__dissoc__ coll k & ks)<br>
</samp>

```
dissoc[iate]. Returns a new map of the same (hashed/sorted) type,
that does not contain a mapping for key(s).
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:851-861](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L851-L861)</ins>
</pre>

```clj
(defn dissoc
  ([coll] coll)
  ([coll k]
     (-dissoc coll k))
  ([coll k & ks]
     (let [ret (dissoc coll k)]
       (if ks
         (recur ret (first ks) (next ks))
         ret))))
```


---

```clj
{:ns "cljs.core",
 :name "dissoc",
 :signature ["[coll]" "[coll k]" "[coll k & ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_dissoc",
 :source {:code "(defn dissoc\n  ([coll] coll)\n  ([coll k]\n     (-dissoc coll k))\n  ([coll k & ks]\n     (let [ret (dissoc coll k)]\n       (if ks\n         (recur ret (first ks) (next ks))\n         ret))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [851 861],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L851-L861"},
 :full-name "cljs.core/dissoc",
 :clj-symbol "clojure.core/dissoc",
 :docstring "dissoc[iate]. Returns a new map of the same (hashed/sorted) type,\nthat does not contain a mapping for key(s)."}

```
