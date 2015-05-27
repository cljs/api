## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/comparator

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1586"><img valign="middle" alt="[+] 0.0-1586" src="https://img.shields.io/badge/+-0.0--1586-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/comparator</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/comparator)
</td>
</tr>
</table>

 <samp>
(__comparator__ pred)<br>
</samp>

```
Returns an JavaScript compatible comparator based upon pred.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7446-7450](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7446-L7450)</ins>
</pre>

```clj
(defn comparator
  [pred]
  (fn [x y]
    (cond (pred x y) -1 (pred y x) 1 :else 0)))
```


---

```clj
{:ns "cljs.core",
 :name "comparator",
 :signature ["[pred]"],
 :history [["+" "0.0-1586"]],
 :type "function",
 :full-name-encode "cljs.core_comparator",
 :source {:code "(defn comparator\n  [pred]\n  (fn [x y]\n    (cond (pred x y) -1 (pred y x) 1 :else 0)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7446 7450],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7446-L7450"},
 :full-name "cljs.core/comparator",
 :clj-symbol "clojure.core/comparator",
 :docstring "Returns an JavaScript compatible comparator based upon pred."}

```
