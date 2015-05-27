## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/empty

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/empty</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/empty)
</td>
</tr>
</table>

 <samp>
(__empty__ coll)<br>
</samp>

```
Returns an empty collection of the same category as coll, or nil
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:602-605](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L602-L605)</ins>
</pre>

```clj
(defn empty
  [coll]
  (-empty coll))
```


---

```clj
{:ns "cljs.core",
 :name "empty",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_empty",
 :source {:code "(defn empty\n  [coll]\n  (-empty coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [602 605],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L602-L605"},
 :full-name "cljs.core/empty",
 :clj-symbol "clojure.core/empty",
 :docstring "Returns an empty collection of the same category as coll, or nil"}

```
