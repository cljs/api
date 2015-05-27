## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vals

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vals</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vals)
</td>
</tr>
</table>

 <samp>
(__vals__ hash-map)<br>
</samp>

```
Returns a sequence of the map's values.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5537-5540](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L5537-L5540)</ins>
</pre>

```clj
(defn vals
  [hash-map]
  (seq (map second hash-map)))
```


---

```clj
{:ns "cljs.core",
 :name "vals",
 :signature ["[hash-map]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_vals",
 :source {:code "(defn vals\n  [hash-map]\n  (seq (map second hash-map)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5537 5540],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L5537-L5540"},
 :full-name "cljs.core/vals",
 :clj-symbol "clojure.core/vals",
 :docstring "Returns a sequence of the map's values."}

```
