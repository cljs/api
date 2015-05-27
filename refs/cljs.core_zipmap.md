## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/zipmap

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/zipmap</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/zipmap)
</td>
</tr>
</table>

 <samp>
(__zipmap__ keys vals)<br>
</samp>

```
Returns a map with the keys mapped to the corresponding vals.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2540-2550](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2540-L2550)</ins>
</pre>

```clj
(defn zipmap
  [keys vals]
    (loop [map {}
           ks (seq keys)
           vs (seq vals)]
      (if (and ks vs)
        (recur (assoc map (first ks) (first vs))
               (next ks)
               (next vs))
        map)))
```


---

```clj
{:ns "cljs.core",
 :name "zipmap",
 :signature ["[keys vals]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_zipmap",
 :source {:code "(defn zipmap\n  [keys vals]\n    (loop [map {}\n           ks (seq keys)\n           vs (seq vals)]\n      (if (and ks vs)\n        (recur (assoc map (first ks) (first vs))\n               (next ks)\n               (next vs))\n        map)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2540 2550],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2540-L2550"},
 :full-name "cljs.core/zipmap",
 :clj-symbol "clojure.core/zipmap",
 :docstring "Returns a map with the keys mapped to the corresponding vals."}

```
