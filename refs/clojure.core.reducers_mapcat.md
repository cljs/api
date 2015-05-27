## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/mapcat

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/mapcat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/mapcat)
</td>
</tr>
</table>

 <samp>
(__mapcat__ f)<br>
(__mapcat__ f coll)<br>
</samp>

```
Applies f to every value in the reduction of coll, concatenating the result
  colls of (f val). Foldable.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:97-106](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/core/reducers.cljs#L97-L106)</ins>
</pre>

```clj
(defcurried mapcat
  "Applies f to every value in the reduction of coll, concatenating the result
  colls of (f val). Foldable."
  {}
  [f coll]
  (folder coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (reduce f1 ret (f k v)))))))
```


---

```clj
{:ns "clojure.core.reducers",
 :name "mapcat",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_mapcat",
 :source {:code "(defcurried mapcat\n  \"Applies f to every value in the reduction of coll, concatenating the result\n  colls of (f val). Foldable.\"\n  {}\n  [f coll]\n  (folder coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (reduce f1 ret (f k v)))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [97 106],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/core/reducers.cljs#L97-L106"},
 :full-name "clojure.core.reducers/mapcat",
 :clj-symbol "clojure.core.reducers/mapcat",
 :docstring "Applies f to every value in the reduction of coll, concatenating the result\n  colls of (f val). Foldable."}

```
