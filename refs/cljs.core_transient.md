## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/transient

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/transient</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/transient)
</td>
</tr>
</table>

 <samp>
(__transient__ coll)<br>
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
            └── <ins>[core.cljs:2371-2372](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L2371-L2372)</ins>
</pre>

```clj
(defn transient [coll]
  (-as-transient coll))
```


---

```clj
{:full-name "cljs.core/transient",
 :ns "cljs.core",
 :name "transient",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn transient [coll]\n  (-as-transient coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2371 2372],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L2371-L2372"},
 :full-name-encode "cljs.core_transient",
 :clj-symbol "clojure.core/transient",
 :history [["+" "0.0-1211"]]}

```
