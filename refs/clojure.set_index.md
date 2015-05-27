## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/index

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/index</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/index)
</td>
</tr>
</table>

 <samp>
(__index__ xrel ks)<br>
</samp>

```
Returns a map of the distinct values of ks in the xrel mapped to a
set of the maps in xrel with the corresponding values of ks.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:88-96](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/set.cljs#L88-L96)</ins>
</pre>

```clj
(defn index
  [xrel ks]
    (reduce
     (fn [m x]
       (let [ik (select-keys x ks)]
         (assoc m ik (conj (get m ik #{}) x))))
     {} xrel))
```


---

```clj
{:ns "clojure.set",
 :name "index",
 :signature ["[xrel ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_index",
 :source {:code "(defn index\n  [xrel ks]\n    (reduce\n     (fn [m x]\n       (let [ik (select-keys x ks)]\n         (assoc m ik (conj (get m ik #{}) x))))\n     {} xrel))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [88 96],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/set.cljs#L88-L96"},
 :full-name "clojure.set/index",
 :clj-symbol "clojure.set/index",
 :docstring "Returns a map of the distinct values of ks in the xrel mapped to a\nset of the maps in xrel with the corresponding values of ks."}

```
