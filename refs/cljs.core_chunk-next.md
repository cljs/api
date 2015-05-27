## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunk-next

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunk-next__ s)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1908-1911](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1908-L1911)</ins>
</pre>

```clj
(defn chunk-next [s]
  (if (satisfies? IChunkedNext s)
    (-chunked-next s)
    (seq (-chunked-rest s))))
```


---

```clj
{:full-name "cljs.core/chunk-next",
 :ns "cljs.core",
 :name "chunk-next",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn chunk-next [s]\n  (if (satisfies? IChunkedNext s)\n    (-chunked-next s)\n    (seq (-chunked-rest s))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1908 1911],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1908-L1911"},
 :full-name-encode "cljs.core_chunk-next",
 :history [["+" "0.0-1424"]]}

```
