## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/iterate

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/iterate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/iterate)
</td>
</tr>
</table>

 <samp>
(__iterate__ f x)<br>
</samp>

```
Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2513-2516](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2513-L2516)</ins>
</pre>

```clj
(defn iterate
  [f x] (cons x (lazy-seq (iterate f (f x)))))
```


---

```clj
{:ns "cljs.core",
 :name "iterate",
 :signature ["[f x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_iterate",
 :source {:code "(defn iterate\n  [f x] (cons x (lazy-seq (iterate f (f x)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2513 2516],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2513-L2516"},
 :full-name "cljs.core/iterate",
 :clj-symbol "clojure.core/iterate",
 :docstring "Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects"}

```
