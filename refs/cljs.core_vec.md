## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vec

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vec)
</td>
</tr>
</table>

 <samp>
(__vec__ coll)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3077-3081](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L3077-L3081)</ins>
</pre>

```clj
(defn vec [coll]
  (-persistent!
   (reduce -conj!
           (-as-transient cljs.core.PersistentVector/EMPTY)
           coll)))
```


---

```clj
{:full-name "cljs.core/vec",
 :ns "cljs.core",
 :name "vec",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn vec [coll]\n  (-persistent!\n   (reduce -conj!\n           (-as-transient cljs.core.PersistentVector/EMPTY)\n           coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3077 3081],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L3077-L3081"},
 :full-name-encode "cljs.core_vec",
 :clj-symbol "clojure.core/vec",
 :history [["+" "0.0-927"]]}

```
