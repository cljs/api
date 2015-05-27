## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/filterv

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/filterv</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/filterv)
</td>
</tr>
</table>

 <samp>
(__filterv__ pred coll)<br>
</samp>

```
Returns a vector of the items in coll for which
(pred item) returns true. pred must be free of side-effects.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2670-2677](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L2670-L2677)</ins>
</pre>

```clj
(defn filterv
  [pred coll]
  (-> (reduce (fn [v o] (if (pred o) (conj! v o) v))
              (transient [])
              coll)
      persistent!))
```


---

```clj
{:ns "cljs.core",
 :name "filterv",
 :signature ["[pred coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_filterv",
 :source {:code "(defn filterv\n  [pred coll]\n  (-> (reduce (fn [v o] (if (pred o) (conj! v o) v))\n              (transient [])\n              coll)\n      persistent!))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2670 2677],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L2670-L2677"},
 :full-name "cljs.core/filterv",
 :clj-symbol "clojure.core/filterv",
 :docstring "Returns a vector of the items in coll for which\n(pred item) returns true. pred must be free of side-effects."}

```
