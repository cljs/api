## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prim-seq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__prim-seq__ prim)<br>
(__prim-seq__ prim i)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:711-716](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L711-L716)</ins>
</pre>

```clj
(defn prim-seq
  ([prim]
     (prim-seq prim 0))
  ([prim i]
     (when (< i (alength prim))
       (IndexedSeq. prim i))))
```


---

```clj
{:full-name "cljs.core/prim-seq",
 :ns "cljs.core",
 :name "prim-seq",
 :type "function",
 :signature ["[prim]" "[prim i]"],
 :source {:code "(defn prim-seq\n  ([prim]\n     (prim-seq prim 0))\n  ([prim i]\n     (when (< i (alength prim))\n       (IndexedSeq. prim i))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [711 716],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L711-L716"},
 :full-name-encode "cljs.core_prim-seq",
 :history [["+" "0.0-927"]]}

```
