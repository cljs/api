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
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2185-2193](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L2185-L2193)</ins>
</pre>

```clj
(defn ^boolean complement
  [f]
  (fn
    ([] (not (f)))
    ([x] (not (f x)))
    ([x y] (not (f x y)))
    ([x y & zs] (not (apply f x y zs)))))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "complement",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_complement",
 :source {:code "(defn ^boolean complement\n  [f]\n  (fn\n    ([] (not (f)))\n    ([x] (not (f x)))\n    ([x y] (not (f x y)))\n    ([x y & zs] (not (apply f x y zs)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2185 2193],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L2185-L2193"},
 :full-name "cljs.core/complement",
 :clj-symbol "clojure.core/complement",
 :docstring "Takes a fn f and returns a fn that takes the same arguments as f,\nhas the same effects, if any, and returns the opposite truth value."}

```
