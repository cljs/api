## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array-chunk

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array-chunk__ arr)<br>
(__array-chunk__ arr off)<br>
(__array-chunk__ arr off end)<br>
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
            └── <ins>[core.cljs:2129-2135](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L2129-L2135)</ins>
</pre>

```clj
(defn array-chunk
  ([arr]
     (ArrayChunk. arr 0 (alength arr)))
  ([arr off]
     (ArrayChunk. arr off (alength arr)))
  ([arr off end]
     (ArrayChunk. arr off end)))
```


---

```clj
{:full-name "cljs.core/array-chunk",
 :ns "cljs.core",
 :name "array-chunk",
 :type "function",
 :signature ["[arr]" "[arr off]" "[arr off end]"],
 :source {:code "(defn array-chunk\n  ([arr]\n     (ArrayChunk. arr 0 (alength arr)))\n  ([arr off]\n     (ArrayChunk. arr off (alength arr)))\n  ([arr off end]\n     (ArrayChunk. arr off end)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2129 2135],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L2129-L2135"},
 :full-name-encode "cljs.core_array-chunk",
 :history [["+" "0.0-1424"]]}

```
