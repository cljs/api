## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/memoize

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/memoize</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/memoize)
</td>
</tr>
</table>

 <samp>
(__memoize__ f)<br>
</samp>

```
Returns a memoized version of a referentially transparent function. The
memoized version of the function keeps a cache of the mapping from arguments
to results and, when calls with the same arguments are repeated often, has
higher performance at the expense of higher memory use.
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3448-3460](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3448-L3460)</ins>
</pre>

```clj
(defn memoize
  [f]
  (let [mem (atom {})]
    (fn [& args]
      (if-let [v (get @mem args)]
        v
        (let [ret (apply f args)]
          (swap! mem assoc args ret)
          ret)))))
```


---

```clj
{:ns "cljs.core",
 :name "memoize",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_memoize",
 :source {:code "(defn memoize\n  [f]\n  (let [mem (atom {})]\n    (fn [& args]\n      (if-let [v (get @mem args)]\n        v\n        (let [ret (apply f args)]\n          (swap! mem assoc args ret)\n          ret)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3448 3460],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3448-L3460"},
 :full-name "cljs.core/memoize",
 :clj-symbol "clojure.core/memoize",
 :docstring "Returns a memoized version of a referentially transparent function. The\nmemoized version of the function keeps a cache of the mapping from arguments\nto results and, when calls with the same arguments are repeated often, has\nhigher performance at the expense of higher memory use."}

```
