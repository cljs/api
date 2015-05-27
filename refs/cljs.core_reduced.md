## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduced

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
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
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1174-1177](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1174-L1177)</ins>
</pre>

```clj
(defn reduced
  [x]
  (Reduced. x))
```


---

```clj
{:full-name "cljs.core/reduced",
 :ns "cljs.core",
 :name "reduced",
 :docstring "Wraps x in a way such that a reduce will terminate with the value x",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn reduced\n  [x]\n  (Reduced. x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1174 1177],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1174-L1177"},
 :full-name-encode "cljs.core_reduced",
 :history [["+" "0.0-1211"]]}

```
