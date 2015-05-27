## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/map

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__map__ f)<br>
(__map__ f coll)<br>
</samp>

```
Applies f to every value in the reduction of coll. Foldable.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:85-93](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/core/reducers.cljs#L85-L93)</ins>
</pre>

```clj
(defcurried map
  "Applies f to every value in the reduction of coll. Foldable."
  {}
  [f coll]
  (folder coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (f1 ret (f k v)))))))
```


---

```clj
{:full-name "clojure.core.reducers/map",
 :ns "clojure.core.reducers",
 :name "map",
 :docstring "Applies f to every value in the reduction of coll. Foldable.",
 :type "function",
 :signature ["[f]" "[f coll]"],
 :source {:code "(defcurried map\n  \"Applies f to every value in the reduction of coll. Foldable.\"\n  {}\n  [f coll]\n  (folder coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (f1 ret (f k v)))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [85 93],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/core/reducers.cljs#L85-L93"},
 :full-name-encode "clojure.core.reducers_map",
 :history [["+" "0.0-1236"]]}

```
