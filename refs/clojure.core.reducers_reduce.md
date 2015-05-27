## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/reduce

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
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
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:20-28](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/core/reducers.cljs#L20-L28)</ins>
</pre>

```clj
(defn reduce
  ([f coll] (reduce f (f) coll))
  ([f init coll]
     (if (map? coll)
       (-kv-reduce coll f init)
       (-reduce coll f init))))
```


---

```clj
{:full-name "clojure.core.reducers/reduce",
 :ns "clojure.core.reducers",
 :name "reduce",
 :docstring "Like core/reduce except:\n  When init is not provided, (f) is used.\n  Maps are reduced with reduce-kv",
 :type "function",
 :signature ["[f coll]" "[f init coll]"],
 :source {:code "(defn reduce\n  ([f coll] (reduce f (f) coll))\n  ([f init coll]\n     (if (map? coll)\n       (-kv-reduce coll f init)\n       (-reduce coll f init))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [20 28],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/core/reducers.cljs#L20-L28"},
 :full-name-encode "clojure.core.reducers_reduce",
 :history [["+" "0.0-1236"]]}

```
