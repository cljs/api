## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/min-key

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/min-key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/min-key)
</td>
</tr>
</table>

 <samp>
(__min-key__ k x)<br>
(__min-key__ k x y)<br>
(__min-key__ k x y & more)<br>
</samp>

```
Returns the x for which (k x), a number, is least.
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5914-5919](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L5914-L5919)</ins>
</pre>

```clj
(defn min-key
  ([k x] x)
  ([k x y] (if (< (k x) (k y)) x y))
  ([k x y & more]
     (reduce #(min-key k %1 %2) (min-key k x y) more)))
```


---

```clj
{:ns "cljs.core",
 :name "min-key",
 :signature ["[k x]" "[k x y]" "[k x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_min-key",
 :source {:code "(defn min-key\n  ([k x] x)\n  ([k x y] (if (< (k x) (k y)) x y))\n  ([k x y & more]\n     (reduce #(min-key k %1 %2) (min-key k x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5914 5919],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L5914-L5919"},
 :full-name "cljs.core/min-key",
 :clj-symbol "clojure.core/min-key",
 :docstring "Returns the x for which (k x), a number, is least."}

```
