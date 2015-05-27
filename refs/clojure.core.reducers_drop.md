## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/drop

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__drop__ n)<br>
(__drop__ n coll)<br>
</samp>

```
Elides the first n values from the reduction of coll.
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:167-179](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/core/reducers.cljs#L167-L179)</ins>
</pre>

```clj
(defcurried drop
  "Elides the first n values from the reduction of coll."
  {}
  [n coll]
  (reducer coll
   (fn [f1]
     (let [cnt (atom n)]
       (rfn [f1 k]
         ([ret k v]
            (swap! cnt dec)
            (if (neg? @cnt)
              (f1 ret k v)
              ret)))))))
```


---

```clj
{:full-name "clojure.core.reducers/drop",
 :ns "clojure.core.reducers",
 :name "drop",
 :docstring "Elides the first n values from the reduction of coll.",
 :type "function",
 :signature ["[n]" "[n coll]"],
 :source {:code "(defcurried drop\n  \"Elides the first n values from the reduction of coll.\"\n  {}\n  [n coll]\n  (reducer coll\n   (fn [f1]\n     (let [cnt (atom n)]\n       (rfn [f1 k]\n         ([ret k v]\n            (swap! cnt dec)\n            (if (neg? @cnt)\n              (f1 ret k v)\n              ret)))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [167 179],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/core/reducers.cljs#L167-L179"},
 :full-name-encode "clojure.core.reducers_drop",
 :history [["+" "0.0-1236"]]}

```
