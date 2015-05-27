## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ChunkBuffer

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ChunkBuffer.__ buf end)<br>
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
            └── <ins>[core.cljs:2088-2100](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L2088-L2100)</ins>
</pre>

```clj
(deftype ChunkBuffer [^:mutable buf ^:mutable end]
  Object
  (add [_ o]
    (aset buf end o)
    (set! end (inc end)))

  (chunk [_ o]
    (let [ret (ArrayChunk. buf 0 end)]
      (set! buf nil)
      ret))

  ICounted
  (-count [_] end))
```


---

```clj
{:full-name "cljs.core/ChunkBuffer",
 :ns "cljs.core",
 :name "ChunkBuffer",
 :type "type",
 :signature ["[buf end]"],
 :source {:code "(deftype ChunkBuffer [^:mutable buf ^:mutable end]\n  Object\n  (add [_ o]\n    (aset buf end o)\n    (set! end (inc end)))\n\n  (chunk [_ o]\n    (let [ret (ArrayChunk. buf 0 end)]\n      (set! buf nil)\n      ret))\n\n  ICounted\n  (-count [_] end))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2088 2100],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L2088-L2100"},
 :full-name-encode "cljs.core_ChunkBuffer",
 :history [["+" "0.0-1424"]]}

```
