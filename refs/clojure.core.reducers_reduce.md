## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/reduce

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/reduce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/reduce)
</td>
</tr>
</table>

 <samp>
(__reduce__ f coll)<br>
(__reduce__ f init coll)<br>
</samp>

```
Like core/reduce except:
  When init is not provided, (f) is used.
  Maps are reduced with reduce-kv
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:20-30](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/core/reducers.cljs#L20-L30)</ins>
</pre>

```clj
(defn reduce
  ([f coll] (reduce f (f) coll))
  ([f init coll]
     (if (map? coll)
       (-kv-reduce coll f init)
       (if-not (nil? coll)
         (-reduce coll f init)
         init))))
```


---

```clj
{:ns "clojure.core.reducers",
 :name "reduce",
 :signature ["[f coll]" "[f init coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_reduce",
 :source {:code "(defn reduce\n  ([f coll] (reduce f (f) coll))\n  ([f init coll]\n     (if (map? coll)\n       (-kv-reduce coll f init)\n       (if-not (nil? coll)\n         (-reduce coll f init)\n         init))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [20 30],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/core/reducers.cljs#L20-L30"},
 :full-name "clojure.core.reducers/reduce",
 :clj-symbol "clojure.core.reducers/reduce",
 :docstring "Like core/reduce except:\n  When init is not provided, (f) is used.\n  Maps are reduced with reduce-kv"}

```
