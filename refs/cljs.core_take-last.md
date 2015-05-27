## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/take-last

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take-last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take-last)
</td>
</tr>
</table>

 <samp>
(__take-last__ n coll)<br>
</samp>

```
Returns a seq of the last n items in coll.  Depending on the type
of coll may be no better than linear time.  For vectors, see also subvec.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2776-2783](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2776-L2783)</ins>
</pre>

```clj
(defn take-last
  [n coll]
  (loop [s (seq coll), lead (seq (drop n coll))]
    (if lead
      (recur (next s) (next lead))
      s)))
```


---

```clj
{:ns "cljs.core",
 :name "take-last",
 :signature ["[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_take-last",
 :source {:code "(defn take-last\n  [n coll]\n  (loop [s (seq coll), lead (seq (drop n coll))]\n    (if lead\n      (recur (next s) (next lead))\n      s)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2776 2783],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2776-L2783"},
 :full-name "cljs.core/take-last",
 :clj-symbol "clojure.core/take-last",
 :docstring "Returns a seq of the last n items in coll.  Depending on the type\nof coll may be no better than linear time.  For vectors, see also subvec."}

```
