## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dissoc!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dissoc!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dissoc!)
</td>
</tr>
</table>

 <samp>
(__dissoc!__ tcoll key)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2383-2384](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L2383-L2384)</ins>
</pre>

```clj
(defn dissoc! [tcoll key]
  (-dissoc! tcoll key))
```


---

```clj
{:full-name "cljs.core/dissoc!",
 :ns "cljs.core",
 :name "dissoc!",
 :type "function",
 :signature ["[tcoll key]"],
 :source {:code "(defn dissoc! [tcoll key]\n  (-dissoc! tcoll key))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2383 2384],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L2383-L2384"},
 :full-name-encode "cljs.core_dissoc_BANG_",
 :clj-symbol "clojure.core/dissoc!",
 :history [["+" "0.0-1211"]]}

```
