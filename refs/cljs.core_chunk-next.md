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
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2128-2131](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2128-L2131)</ins>
</pre>

```clj
(defn chunk-next [s]
  (if (satisfies? IChunkedNext s false)
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
 :source {:code "(defn chunk-next [s]\n  (if (satisfies? IChunkedNext s false)\n    (-chunked-next s)\n    (seq (-chunked-rest s))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2128 2131],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2128-L2131"},
 :full-name-encode "cljs.core_chunk-next",
 :history [["+" "0.0-1424"]]}

```
