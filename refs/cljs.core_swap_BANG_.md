## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/swap!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/swap!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/swap!)
</td>
</tr>
</table>

 <samp>
(__swap!__ a f)<br>
(__swap!__ a f x)<br>
(__swap!__ a f x y)<br>
(__swap!__ a f x y z)<br>
(__swap!__ a f x y z & more)<br>
</samp>

```
Atomically swaps the value of atom to be:
(apply f current-value-of-atom args). Note that f may be called
multiple times, and thus should be free of side effects.  Returns
the value that was swapped in.
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3079-3093](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L3079-L3093)</ins>
</pre>

```clj
(defn swap!
  ([a f]
     (reset! a (f (.-state a))))
  ([a f x]
     (reset! a (f (.-state a) x)))
  ([a f x y]
     (reset! a (f (.-state a) x y)))
  ([a f x y z]
     (reset! a (f (.-state a) x y z)))
  ([a f x y z & more]
     (reset! a (apply f (.-state a) x y z more))))
```


---

```clj
{:ns "cljs.core",
 :name "swap!",
 :signature ["[a f]"
             "[a f x]"
             "[a f x y]"
             "[a f x y z]"
             "[a f x y z & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_swap_BANG_",
 :source {:code "(defn swap!\n  ([a f]\n     (reset! a (f (.-state a))))\n  ([a f x]\n     (reset! a (f (.-state a) x)))\n  ([a f x y]\n     (reset! a (f (.-state a) x y)))\n  ([a f x y z]\n     (reset! a (f (.-state a) x y z)))\n  ([a f x y z & more]\n     (reset! a (apply f (.-state a) x y z more))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3079 3093],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L3079-L3093"},
 :full-name "cljs.core/swap!",
 :clj-symbol "clojure.core/swap!",
 :docstring "Atomically swaps the value of atom to be:\n(apply f current-value-of-atom args). Note that f may be called\nmultiple times, and thus should be free of side effects.  Returns\nthe value that was swapped in."}

```
