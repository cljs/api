## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not=

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not=</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not=)
</td>
</tr>
</table>

 <samp>
(__not=__ x)<br>
(__not=__ x y)<br>
(__not=__ x y & more)<br>
</samp>

```
Same as (not (= obj1 obj2))
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1392-1397](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1392-L1397)</ins>
</pre>

```clj
(defn not=
  ([x] false)
  ([x y] (not (= x y)))
  ([x y & more]
   (not (apply = x y more))))
```


---

```clj
{:ns "cljs.core",
 :name "not=",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_not_EQ_",
 :source {:code "(defn not=\n  ([x] false)\n  ([x y] (not (= x y)))\n  ([x y & more]\n   (not (apply = x y more))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1392 1397],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1392-L1397"},
 :full-name "cljs.core/not=",
 :clj-symbol "clojure.core/not=",
 :docstring "Same as (not (= obj1 obj2))"}

```
