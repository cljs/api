## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/take-while

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take-while)
</td>
</tr>
</table>

 <samp>
(__take-while__ pred coll)<br>
</samp>

```
Returns a lazy sequence of successive items from coll while
(pred item) returns true. pred must be free of side-effects.
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5796-5803](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L5796-L5803)</ins>
</pre>

```clj
(defn take-while
  [pred coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (when (pred (first s))
       (cons (first s) (take-while pred (rest s)))))))
```


---

```clj
{:ns "cljs.core",
 :name "take-while",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_take-while",
 :source {:code "(defn take-while\n  [pred coll]\n  (lazy-seq\n   (when-let [s (seq coll)]\n     (when (pred (first s))\n       (cons (first s) (take-while pred (rest s)))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5796 5803],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L5796-L5803"},
 :full-name "cljs.core/take-while",
 :clj-symbol "clojure.core/take-while",
 :docstring "Returns a lazy sequence of successive items from coll while\n(pred item) returns true. pred must be free of side-effects."}

```
