## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/fnext

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fnext</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fnext)
</td>
</tr>
</table>

 <samp>
(__fnext__ coll)<br>
</samp>

```
Same as (first (next x))
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:742-745](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L742-L745)</ins>
</pre>

```clj
(defn fnext
  [coll]
  (first (next coll)))
```


---

```clj
{:ns "cljs.core",
 :name "fnext",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_fnext",
 :source {:code "(defn fnext\n  [coll]\n  (first (next coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [742 745],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L742-L745"},
 :full-name "cljs.core/fnext",
 :clj-symbol "clojure.core/fnext",
 :docstring "Same as (first (next x))"}

```
