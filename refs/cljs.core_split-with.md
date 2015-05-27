## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/split-with

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/split-with</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/split-with)
</td>
</tr>
</table>

 <samp>
(__split-with__ pred coll)<br>
</samp>

```
Returns a vector of [(take-while pred coll) (drop-while pred coll)]
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2659-2662](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2659-L2662)</ins>
</pre>

```clj
(defn split-with
  [pred coll]
  [(take-while pred coll) (drop-while pred coll)])
```


---

```clj
{:ns "cljs.core",
 :name "split-with",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_split-with",
 :source {:code "(defn split-with\n  [pred coll]\n  [(take-while pred coll) (drop-while pred coll)])",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2659 2662],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2659-L2662"},
 :full-name "cljs.core/split-with",
 :clj-symbol "clojure.core/split-with",
 :docstring "Returns a vector of [(take-while pred coll) (drop-while pred coll)]"}

```
