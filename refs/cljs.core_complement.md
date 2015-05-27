## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/complement

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/complement</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/complement)
</td>
</tr>
</table>

 <samp>
(__complement__ f)<br>
</samp>

```
Takes a fn f and returns a fn that takes the same arguments as f,
has the same effects, if any, and returns the opposite truth value.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1486-1494](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1486-L1494)</ins>
</pre>

```clj
(defn complement
  [f]
  (fn
    ([] (not (f)))
    ([x] (not (f x)))
    ([x y] (not (f x y)))
    ([x y & zs] (not (apply f x y zs)))))
```


---

```clj
{:ns "cljs.core",
 :name "complement",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_complement",
 :source {:code "(defn complement\n  [f]\n  (fn\n    ([] (not (f)))\n    ([x] (not (f x)))\n    ([x y] (not (f x y)))\n    ([x y & zs] (not (apply f x y zs)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1486 1494],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1486-L1494"},
 :full-name "cljs.core/complement",
 :clj-symbol "clojure.core/complement",
 :docstring "Takes a fn f and returns a fn that takes the same arguments as f,\nhas the same effects, if any, and returns the opposite truth value."}

```
