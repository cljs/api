## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/remove

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/remove</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/remove)
</td>
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
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:136-141](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/core/reducers.cljs#L136-L141)</ins>
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
{:ns "clojure.core.reducers",
 :name "remove",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_remove",
 :source {:code "(defcurried remove\n  \"Removes values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.\"\n  {}\n  [pred coll]\n  (filter (complement pred) coll))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [136 141],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/core/reducers.cljs#L136-L141"},
 :full-name "clojure.core.reducers/remove",
 :clj-symbol "clojure.core.reducers/remove",
 :docstring "Removes values in the reduction of coll for which (pred val)\n  returns logical true. Foldable."}

```
