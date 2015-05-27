## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/areduce

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/areduce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/areduce)
</td>
</tr>
</table>

 <samp>
(__areduce__ a idx ret init expr)<br>
</samp>

```
Reduces an expression across an array a, using an index named idx,
and return value named ret, initialized to init, setting ret to the 
evaluation of expr at each step, returning ret.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1008-1017](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L1008-L1017)</ins>
</pre>

```clj
(defmacro areduce
  [a idx ret init expr]
  `(let [a# ~a]
     (loop  [~idx 0 ~ret ~init]
       (if (< ~idx  (alength a#))
         (recur (inc ~idx) ~expr)
         ~ret))))
```


---

```clj
{:ns "cljs.core",
 :name "areduce",
 :signature ["[a idx ret init expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_areduce",
 :source {:code "(defmacro areduce\n  [a idx ret init expr]\n  `(let [a# ~a]\n     (loop  [~idx 0 ~ret ~init]\n       (if (< ~idx  (alength a#))\n         (recur (inc ~idx) ~expr)\n         ~ret))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1008 1017],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L1008-L1017"},
 :full-name "cljs.core/areduce",
 :clj-symbol "clojure.core/areduce",
 :docstring "Reduces an expression across an array a, using an index named idx,\nand return value named ret, initialized to init, setting ret to the \nevaluation of expr at each step, returning ret."}

```
