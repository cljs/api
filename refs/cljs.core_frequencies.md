## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/frequencies

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/frequencies</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/frequencies)
</td>
</tr>
</table>

 <samp>
(__frequencies__ coll)<br>
</samp>

```
Returns a map from distinct items in coll to the number of times
they appear.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6081-6088](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6081-L6088)</ins>
</pre>

```clj
(defn frequencies
  [coll]
  (persistent!
   (reduce (fn [counts x]
             (assoc! counts x (inc (get counts x 0))))
           (transient {}) coll)))
```


---

```clj
{:ns "cljs.core",
 :name "frequencies",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_frequencies",
 :source {:code "(defn frequencies\n  [coll]\n  (persistent!\n   (reduce (fn [counts x]\n             (assoc! counts x (inc (get counts x 0))))\n           (transient {}) coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6081 6088],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6081-L6088"},
 :full-name "cljs.core/frequencies",
 :clj-symbol "clojure.core/frequencies",
 :docstring "Returns a map from distinct items in coll to the number of times\nthey appear."}

```
