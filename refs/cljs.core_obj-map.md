## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/obj-map

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__obj-map__ & keyvals)<br>
</samp>

```
keyval => key val
Returns a new object map with supplied mappings.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5452-5463](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L5452-L5463)</ins>
</pre>

```clj
(defn obj-map
  [& keyvals]
  (let [ks  (array)
        obj (js-obj)]
    (loop [kvs (seq keyvals)]
      (if kvs
        (do (.push ks (first kvs))
            (aset obj (first kvs) (second kvs))
            (recur (nnext kvs)))
        (cljs.core.ObjMap/fromObject ks obj)))))
```


---

```clj
{:full-name "cljs.core/obj-map",
 :ns "cljs.core",
 :name "obj-map",
 :docstring "keyval => key val\nReturns a new object map with supplied mappings.",
 :type "function",
 :signature ["[& keyvals]"],
 :source {:code "(defn obj-map\n  [& keyvals]\n  (let [ks  (array)\n        obj (js-obj)]\n    (loop [kvs (seq keyvals)]\n      (if kvs\n        (do (.push ks (first kvs))\n            (aset obj (first kvs) (second kvs))\n            (recur (nnext kvs)))\n        (cljs.core.ObjMap/fromObject ks obj)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5452 5463],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L5452-L5463"},
 :full-name-encode "cljs.core_obj-map",
 :history [["+" "0.0-1443"]]}

```
