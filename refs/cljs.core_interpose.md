## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/interpose

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/interpose</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/interpose)
</td>
</tr>
</table>

 <samp>
(__interpose__ sep coll)<br>
</samp>

```
Returns a lazy seq of the elements of coll separated by sep
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2598-2600](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L2598-L2600)</ins>
</pre>

```clj
(defn interpose
  [sep coll] (drop 1 (interleave (repeat sep) coll)))
```


---

```clj
{:ns "cljs.core",
 :name "interpose",
 :signature ["[sep coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_interpose",
 :source {:code "(defn interpose\n  [sep coll] (drop 1 (interleave (repeat sep) coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2598 2600],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L2598-L2600"},
 :full-name "cljs.core/interpose",
 :clj-symbol "clojure.core/interpose",
 :docstring "Returns a lazy seq of the elements of coll separated by sep"}

```
