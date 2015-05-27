## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/val

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/val</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/val)
</td>
</tr>
</table>

 <samp>
(__val__ map-entry)<br>
</samp>

```
Returns the value in the map entry.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5499-5502](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5499-L5502)</ins>
</pre>

```clj
(defn val
  [map-entry]
  (-val map-entry))
```


---

```clj
{:ns "cljs.core",
 :name "val",
 :signature ["[map-entry]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_val",
 :source {:code "(defn val\n  [map-entry]\n  (-val map-entry))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5499 5502],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5499-L5502"},
 :full-name "cljs.core/val",
 :clj-symbol "clojure.core/val",
 :docstring "Returns the value in the map entry."}

```
