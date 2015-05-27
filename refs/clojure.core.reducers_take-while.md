## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/take-while

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__take-while__ pred)<br>
(__take-while__ pred coll)<br>
</samp>

```
Ends the reduction of coll when (pred val) returns logical false.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:141-151](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/core/reducers.cljs#L141-L151)</ins>
</pre>

```clj
(defcurried take-while
  "Ends the reduction of coll when (pred val) returns logical false."
  {}
  [pred coll]
  (reducer coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (if (pred k v)
               (f1 ret k v)
               (reduced ret)))))))
```


---

```clj
{:full-name "clojure.core.reducers/take-while",
 :ns "clojure.core.reducers",
 :name "take-while",
 :docstring "Ends the reduction of coll when (pred val) returns logical false.",
 :type "function",
 :signature ["[pred]" "[pred coll]"],
 :source {:code "(defcurried take-while\n  \"Ends the reduction of coll when (pred val) returns logical false.\"\n  {}\n  [pred coll]\n  (reducer coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (if (pred k v)\n               (f1 ret k v)\n               (reduced ret)))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [141 151],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/core/reducers.cljs#L141-L151"},
 :full-name-encode "clojure.core.reducers_take-while",
 :history [["+" "0.0-1236"]]}

```
