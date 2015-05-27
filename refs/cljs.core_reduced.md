## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduced

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reduced</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reduced)
</td>
</tr>
</table>

 <samp>
(__reduced__ x)<br>
</samp>

```
Wraps x in a way such that a reduce will terminate with the value x
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:537-540](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L537-L540)</ins>
</pre>

```clj
(defn reduced
  [x]
  (Reduced. x))
```


---

```clj
{:ns "cljs.core",
 :name "reduced",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reduced",
 :source {:code "(defn reduced\n  [x]\n  (Reduced. x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [537 540],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L537-L540"},
 :full-name "cljs.core/reduced",
 :clj-symbol "clojure.core/reduced",
 :docstring "Wraps x in a way such that a reduce will terminate with the value x"}

```
