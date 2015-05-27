## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sorted-map

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sorted-map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sorted-map)
</td>
</tr>
</table>

 <samp>
(__sorted-map__ & keyvals)<br>
</samp>

```
keyval => key val
Returns a new sorted map with supplied mappings.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5552-5559](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L5552-L5559)</ins>
</pre>

```clj
(defn sorted-map
  ([& keyvals]
     (loop [in (seq keyvals) out cljs.core.PersistentTreeMap/EMPTY]
       (if in
         (recur (nnext in) (assoc out (first in) (second in)))
         out))))
```


---

```clj
{:ns "cljs.core",
 :name "sorted-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_sorted-map",
 :source {:code "(defn sorted-map\n  ([& keyvals]\n     (loop [in (seq keyvals) out cljs.core.PersistentTreeMap/EMPTY]\n       (if in\n         (recur (nnext in) (assoc out (first in) (second in)))\n         out))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5552 5559],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L5552-L5559"},
 :full-name "cljs.core/sorted-map",
 :clj-symbol "clojure.core/sorted-map",
 :docstring "keyval => key val\nReturns a new sorted map with supplied mappings."}

```
