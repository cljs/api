## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/persistent-array-map-seq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__persistent-array-map-seq__ arr i _meta)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4033-4035](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L4033-L4035)</ins>
</pre>

```clj
(defn persistent-array-map-seq [arr i _meta]
  (when (<= i (- (alength arr) 2))
    (PersistentArrayMapSeq. arr i _meta)))
```


---

```clj
{:full-name "cljs.core/persistent-array-map-seq",
 :ns "cljs.core",
 :name "persistent-array-map-seq",
 :type "function",
 :signature ["[arr i _meta]"],
 :source {:code "(defn persistent-array-map-seq [arr i _meta]\n  (when (<= i (- (alength arr) 2))\n    (PersistentArrayMapSeq. arr i _meta)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [4033 4035],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L4033-L4035"},
 :full-name-encode "cljs.core_persistent-array-map-seq",
 :history [["+" "0.0-1820"]]}

```
