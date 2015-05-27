## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/replicate

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/replicate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/replicate)
</td>
</tr>
</table>

 <samp>
(__replicate__ n x)<br>
</samp>

```
Returns a lazy seq of n xs.
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2568-2570](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L2568-L2570)</ins>
</pre>

```clj
(defn replicate
  [n x] (take n (repeat x)))
```


---

```clj
{:ns "cljs.core",
 :name "replicate",
 :signature ["[n x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_replicate",
 :source {:code "(defn replicate\n  [n x] (take n (repeat x)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2568 2570],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L2568-L2570"},
 :full-name "cljs.core/replicate",
 :clj-symbol "clojure.core/replicate",
 :docstring "Returns a lazy seq of n xs."}

```
