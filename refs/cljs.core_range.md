## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/range

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/range</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/range)
</td>
</tr>
</table>

 <samp>
(__range__)<br>
(__range__ end)<br>
(__range__ start end)<br>
(__range__ start end step)<br>
</samp>

```
Returns a lazy seq of nums from start (inclusive) to end
(exclusive), by step, where start defaults to 0, step to 1,
and end to infinity.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6049-6056](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6049-L6056)</ins>
</pre>

```clj
(defn range
  ([] (range 0 js/Number.MAX_VALUE 1))
  ([end] (range 0 end 1))
  ([start end] (range start end 1))
  ([start end step] (Range. nil start end step nil)))
```


---

```clj
{:ns "cljs.core",
 :name "range",
 :signature ["[]" "[end]" "[start end]" "[start end step]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_range",
 :source {:code "(defn range\n  ([] (range 0 js/Number.MAX_VALUE 1))\n  ([end] (range 0 end 1))\n  ([start end] (range start end 1))\n  ([start end step] (Range. nil start end step nil)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6049 6056],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6049-L6056"},
 :full-name "cljs.core/range",
 :clj-symbol "clojure.core/range",
 :docstring "Returns a lazy seq of nums from start (inclusive) to end\n(exclusive), by step, where start defaults to 0, step to 1,\nand end to infinity."}

```
