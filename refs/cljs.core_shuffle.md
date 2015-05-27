## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/shuffle

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/shuffle</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/shuffle)
</td>
</tr>
</table>

 <samp>
(__shuffle__ coll)<br>
</samp>

```
Return a random permutation of coll
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1165-1170](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L1165-L1170)</ins>
</pre>

```clj
(defn shuffle
  [coll]
  (let [a (to-array coll)]
    (garray/shuffle a)
    (vec a)))
```


---

```clj
{:ns "cljs.core",
 :name "shuffle",
 :signature ["[coll]"],
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core_shuffle",
 :source {:code "(defn shuffle\n  [coll]\n  (let [a (to-array coll)]\n    (garray/shuffle a)\n    (vec a)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1165 1170],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L1165-L1170"},
 :full-name "cljs.core/shuffle",
 :clj-symbol "clojure.core/shuffle",
 :docstring "Return a random permutation of coll"}

```
