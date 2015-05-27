## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted-map-by

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-map-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-map-by)
</td>
</tr>
</table>

 <samp>
(__sorted-map-by__ comparator & keyvals)<br>
</samp>

```
keyval => key val
Returns a new sorted map with supplied mappings, using the supplied comparator.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5474-5482](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5474-L5482)</ins>
</pre>

```clj
(defn sorted-map-by
  ([comparator & keyvals]
     (loop [in (seq keyvals)
            out (cljs.core.PersistentTreeMap. comparator nil 0 nil 0)]
       (if in
         (recur (nnext in) (assoc out (first in) (second in)))
         out))))
```


---

```clj
{:ns "cljs.core",
 :name "sorted-map-by",
 :signature ["[comparator & keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_sorted-map-by",
 :source {:code "(defn sorted-map-by\n  ([comparator & keyvals]\n     (loop [in (seq keyvals)\n            out (cljs.core.PersistentTreeMap. comparator nil 0 nil 0)]\n       (if in\n         (recur (nnext in) (assoc out (first in) (second in)))\n         out))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5474 5482],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5474-L5482"},
 :full-name "cljs.core/sorted-map-by",
 :clj-symbol "clojure.core/sorted-map-by",
 :docstring "keyval => key val\nReturns a new sorted map with supplied mappings, using the supplied comparator."}

```
