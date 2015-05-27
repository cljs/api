## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prim-seq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__prim-seq__ prim i)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:462-464](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L462-L464)</ins>
</pre>

```clj
(defn prim-seq [prim i]
  (when-not (zero? (.-length prim))
    (IndexedSeq. prim i)))
```


---

```clj
{:full-name "cljs.core/prim-seq",
 :ns "cljs.core",
 :name "prim-seq",
 :type "function",
 :signature ["[prim i]"],
 :source {:code "(defn prim-seq [prim i]\n  (when-not (zero? (.-length prim))\n    (IndexedSeq. prim i)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [462 464],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L462-L464"},
 :full-name-encode "cljs.core_prim-seq",
 :history [["+" "0.0-927"]]}

```
