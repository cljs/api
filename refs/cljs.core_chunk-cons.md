## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunk-cons

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunk-cons__ chunk rest)<br>
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
            └── <ins>[core.cljs:2178-2181](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2178-L2181)</ins>
</pre>

```clj
(defn chunk-cons [chunk rest]
  (if (zero? (-count chunk))
    rest
    (ChunkedCons. chunk rest nil nil)))
```


---

```clj
{:full-name "cljs.core/chunk-cons",
 :ns "cljs.core",
 :name "chunk-cons",
 :type "function",
 :signature ["[chunk rest]"],
 :source {:code "(defn chunk-cons [chunk rest]\n  (if (zero? (-count chunk))\n    rest\n    (ChunkedCons. chunk rest nil nil)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2178 2181],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2178-L2181"},
 :full-name-encode "cljs.core_chunk-cons",
 :history [["+" "0.0-1424"]]}

```
