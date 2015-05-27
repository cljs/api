## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/take

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__take__ n)<br>
(__take__ n coll)<br>
</samp>

```
Ends the reduction of coll after consuming n values.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:153-165](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/core/reducers.cljs#L153-L165)</ins>
</pre>

```clj
(defcurried take
  "Ends the reduction of coll after consuming n values."
  {}
  [n coll]
  (reducer coll
   (fn [f1]
     (let [cnt (atom n)]
       (rfn [f1 k]
         ([ret k v]
            (swap! cnt dec)
            (if (neg? @cnt)
              (reduced ret)
              (f1 ret k v))))))))
```


---

```clj
{:full-name "clojure.core.reducers/take",
 :ns "clojure.core.reducers",
 :name "take",
 :docstring "Ends the reduction of coll after consuming n values.",
 :type "function",
 :signature ["[n]" "[n coll]"],
 :source {:code "(defcurried take\n  \"Ends the reduction of coll after consuming n values.\"\n  {}\n  [n coll]\n  (reducer coll\n   (fn [f1]\n     (let [cnt (atom n)]\n       (rfn [f1 k]\n         ([ret k v]\n            (swap! cnt dec)\n            (if (neg? @cnt)\n              (reduced ret)\n              (f1 ret k v))))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [153 165],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/core/reducers.cljs#L153-L165"},
 :full-name-encode "clojure.core.reducers_take",
 :history [["+" "0.0-1236"]]}

```
