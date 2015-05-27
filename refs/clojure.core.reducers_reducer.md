## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/reducer

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__reducer__ coll xf)<br>
</samp>

```
Given a reducible collection, and a transformation function xf,
returns a reducible collection, where any supplied reducing
fn will be transformed by xf. xf is a function of reducing fn to
reducing fn.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:53-64](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/core/reducers.cljs#L53-L64)</ins>
</pre>

```clj
(defn reducer
  ([coll xf]
     (reify
       cljs.core/IReduce
       (-reduce [this f1]
         (-reduce this f1 (f1)))
       (-reduce [_ f1 init]
         (-reduce coll (xf f1) init)))))
```


---

```clj
{:full-name "clojure.core.reducers/reducer",
 :ns "clojure.core.reducers",
 :name "reducer",
 :docstring "Given a reducible collection, and a transformation function xf,\nreturns a reducible collection, where any supplied reducing\nfn will be transformed by xf. xf is a function of reducing fn to\nreducing fn.",
 :type "function",
 :signature ["[coll xf]"],
 :source {:code "(defn reducer\n  ([coll xf]\n     (reify\n       cljs.core/IReduce\n       (-reduce [this f1]\n         (-reduce this f1 (f1)))\n       (-reduce [_ f1 init]\n         (-reduce coll (xf f1) init)))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [53 64],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/core/reducers.cljs#L53-L64"},
 :full-name-encode "clojure.core.reducers_reducer",
 :history [["+" "0.0-1236"]]}

```
