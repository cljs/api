## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-seq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array-seq__ array)<br>
(__array-seq__ array i)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:724-728](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L724-L728)</ins>
</pre>

```clj
(defn array-seq
  ([array]
     (prim-seq array 0))
  ([array i]
     (prim-seq array i)))
```


---

```clj
{:full-name "cljs.core/array-seq",
 :ns "cljs.core",
 :name "array-seq",
 :type "function",
 :signature ["[array]" "[array i]"],
 :source {:code "(defn array-seq\n  ([array]\n     (prim-seq array 0))\n  ([array i]\n     (prim-seq array i)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [724 728],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L724-L728"},
 :full-name-encode "cljs.core_array-seq",
 :history [["+" "0.0-927"]]}

```
