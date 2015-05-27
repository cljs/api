## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-map

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/array-map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/array-map)
</td>
</tr>
</table>

 <samp>
(__array-map__ & keyvals)<br>
</samp>

```
keyval => key val
Returns a new array map with supplied mappings.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5541-5545](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5541-L5545)</ins>
</pre>

```clj
(defn array-map
  [& keyvals]
  (PersistentArrayMap. nil (quot (count keyvals) 2) (apply array keyvals) nil))
```


---

```clj
{:ns "cljs.core",
 :name "array-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_array-map",
 :source {:code "(defn array-map\n  [& keyvals]\n  (PersistentArrayMap. nil (quot (count keyvals) 2) (apply array keyvals) nil))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5541 5545],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5541-L5545"},
 :full-name "cljs.core/array-map",
 :clj-symbol "clojure.core/array-map",
 :docstring "keyval => key val\nReturns a new array map with supplied mappings."}

```
