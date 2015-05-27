## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/max-key

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/max-key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/max-key)
</td>
</tr>
</table>

 <samp>
(__max-key__ k x)<br>
(__max-key__ k x y)<br>
(__max-key__ k x y & more)<br>
</samp>

```
Returns the x for which (k x), a number, is greatest.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5857-5862](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L5857-L5862)</ins>
</pre>

```clj
(defn max-key
  ([k x] x)
  ([k x y] (if (> (k x) (k y)) x y))
  ([k x y & more]
   (reduce #(max-key k %1 %2) (max-key k x y) more)))
```


---

```clj
{:ns "cljs.core",
 :name "max-key",
 :signature ["[k x]" "[k x y]" "[k x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_max-key",
 :source {:code "(defn max-key\n  ([k x] x)\n  ([k x y] (if (> (k x) (k y)) x y))\n  ([k x y & more]\n   (reduce #(max-key k %1 %2) (max-key k x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5857 5862],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L5857-L5862"},
 :full-name "cljs.core/max-key",
 :clj-symbol "clojure.core/max-key",
 :docstring "Returns the x for which (k x), a number, is greatest."}

```
