## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/drop-while

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/drop-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/drop-while)
</td>
</tr>
</table>

 <samp>
(__drop-while__ pred coll)<br>
</samp>

```
Returns a lazy sequence of the items in coll starting from the first
item for which (pred item) returns nil.
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2112-2121](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L2112-L2121)</ins>
</pre>

```clj
(defn drop-while
  [pred coll]
  (let [step (fn [pred coll]
               (let [s (seq coll)]
                 (if (and s (pred (first s)))
                   (recur pred (rest s))
                   s)))]
    (lazy-seq (step pred coll))))
```


---

```clj
{:ns "cljs.core",
 :name "drop-while",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_drop-while",
 :source {:code "(defn drop-while\n  [pred coll]\n  (let [step (fn [pred coll]\n               (let [s (seq coll)]\n                 (if (and s (pred (first s)))\n                   (recur pred (rest s))\n                   s)))]\n    (lazy-seq (step pred coll))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2112 2121],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L2112-L2121"},
 :full-name "cljs.core/drop-while",
 :clj-symbol "clojure.core/drop-while",
 :docstring "Returns a lazy sequence of the items in coll starting from the first\nitem for which (pred item) returns nil."}

```
