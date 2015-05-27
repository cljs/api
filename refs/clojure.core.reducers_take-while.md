## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/take-while

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/take-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/take-while)
</td>
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
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:143-153](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/core/reducers.cljs#L143-L153)</ins>
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
{:ns "clojure.core.reducers",
 :name "take-while",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_take-while",
 :source {:code "(defcurried take-while\n  \"Ends the reduction of coll when (pred val) returns logical false.\"\n  {}\n  [pred coll]\n  (reducer coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (if (pred k v)\n               (f1 ret k v)\n               (reduced ret)))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [143 153],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/core/reducers.cljs#L143-L153"},
 :full-name "clojure.core.reducers/take-while",
 :clj-symbol "clojure.core.reducers/take-while",
 :docstring "Ends the reduction of coll when (pred val) returns logical false."}

```
