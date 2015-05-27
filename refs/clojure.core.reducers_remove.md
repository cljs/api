## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/remove

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__remove__ pred)<br>
(__remove__ pred coll)<br>
</samp>

```
Removes values in the reduction of coll for which (pred val)
  returns logical true. Foldable.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:134-139](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/core/reducers.cljs#L134-L139)</ins>
</pre>

```clj
(defcurried remove
  "Removes values in the reduction of coll for which (pred val)
  returns logical true. Foldable."
  {}
  [pred coll]
  (filter (complement pred) coll))
```


---

```clj
{:full-name "clojure.core.reducers/remove",
 :ns "clojure.core.reducers",
 :name "remove",
 :docstring "Removes values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.",
 :type "function",
 :signature ["[pred]" "[pred coll]"],
 :source {:code "(defcurried remove\n  \"Removes values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.\"\n  {}\n  [pred coll]\n  (filter (complement pred) coll))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [134 139],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/core/reducers.cljs#L134-L139"},
 :full-name-encode "clojure.core.reducers_remove",
 :history [["+" "0.0-1236"]]}

```
