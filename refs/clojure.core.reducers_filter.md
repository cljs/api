## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/filter

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__filter__ pred)<br>
(__filter__ pred coll)<br>
</samp>

```
Retains values in the reduction of coll for which (pred val)
  returns logical true. Foldable.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:106-117](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/core/reducers.cljs#L106-L117)</ins>
</pre>

```clj
(defcurried filter
  "Retains values in the reduction of coll for which (pred val)
  returns logical true. Foldable."
  {}
  [pred coll]
  (folder coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (if (pred k v)
               (f1 ret k v)
               ret))))))
```


---

```clj
{:full-name "clojure.core.reducers/filter",
 :ns "clojure.core.reducers",
 :name "filter",
 :docstring "Retains values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.",
 :type "function",
 :signature ["[pred]" "[pred coll]"],
 :source {:code "(defcurried filter\n  \"Retains values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.\"\n  {}\n  [pred coll]\n  (folder coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (if (pred k v)\n               (f1 ret k v)\n               ret))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [106 117],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/core/reducers.cljs#L106-L117"},
 :full-name-encode "clojure.core.reducers_filter",
 :history [["+" "0.0-1236"]]}

```
