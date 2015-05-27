## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not-empty

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not-empty</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not-empty)
</td>
</tr>
</table>

 <samp>
(__not-empty__ coll)<br>
</samp>

```
If coll is empty, returns nil, else coll
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2180-2182](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L2180-L2182)</ins>
</pre>

```clj
(defn not-empty
  [coll] (when (seq coll) coll))
```


---

```clj
{:ns "cljs.core",
 :name "not-empty",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_not-empty",
 :source {:code "(defn not-empty\n  [coll] (when (seq coll) coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2180 2182],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L2180-L2182"},
 :full-name "cljs.core/not-empty",
 :clj-symbol "clojure.core/not-empty",
 :docstring "If coll is empty, returns nil, else coll"}

```
