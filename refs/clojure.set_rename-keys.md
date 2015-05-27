## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/rename-keys

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/rename-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/rename-keys)
</td>
</tr>
</table>

 <samp>
(__rename-keys__ map kmap)<br>
</samp>

```
Returns the map with the keys in kmap renamed to the vals in kmap
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:72-81](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/set.cljs#L72-L81)</ins>
</pre>

```clj
(defn rename-keys
  [map kmap]
    (reduce 
     (fn [m [old new]]
       (if (and (not= old new)
                (contains? m old))
         (-> m (assoc new (get m old)) (dissoc old))
         m)) 
     map kmap))
```


---

```clj
{:ns "clojure.set",
 :name "rename-keys",
 :signature ["[map kmap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_rename-keys",
 :source {:code "(defn rename-keys\n  [map kmap]\n    (reduce \n     (fn [m [old new]]\n       (if (and (not= old new)\n                (contains? m old))\n         (-> m (assoc new (get m old)) (dissoc old))\n         m)) \n     map kmap))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [72 81],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/set.cljs#L72-L81"},
 :full-name "clojure.set/rename-keys",
 :clj-symbol "clojure.set/rename-keys",
 :docstring "Returns the map with the keys in kmap renamed to the vals in kmap"}

```
