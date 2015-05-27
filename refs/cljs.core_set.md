## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/set

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set)
</td>
</tr>
</table>

 <samp>
(__set__ coll)<br>
</samp>

```
Returns a set of the distinct elements of coll.
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5243-5250](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L5243-L5250)</ins>
</pre>

```clj
(defn set
  [coll]
  (loop [in (seq coll)
         out (transient cljs.core.PersistentHashSet/EMPTY)]
    (if (seq in)
      (recur (next in) (conj! out (first in)))
      (persistent! out))))
```


---

```clj
{:ns "cljs.core",
 :name "set",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_set",
 :source {:code "(defn set\n  [coll]\n  (loop [in (seq coll)\n         out (transient cljs.core.PersistentHashSet/EMPTY)]\n    (if (seq in)\n      (recur (next in) (conj! out (first in)))\n      (persistent! out))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5243 5250],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L5243-L5250"},
 :full-name "cljs.core/set",
 :clj-symbol "clojure.core/set",
 :docstring "Returns a set of the distinct elements of coll."}

```
