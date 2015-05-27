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
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1827-1833](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L1827-L1833)</ins>
</pre>

```clj
(defn array-chunk
  ([arr]
     (array-chunk arr 0 (alength arr)))
  ([arr off]
     (array-chunk arr off (alength arr)))
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
 :source {:code "(defn array-chunk\n  ([arr]\n     (array-chunk arr 0 (alength arr)))\n  ([arr off]\n     (array-chunk arr off (alength arr)))\n  ([arr off end]\n     (ArrayChunk. arr off end)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1827 1833],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L1827-L1833"},
 :full-name-encode "cljs.core_array-chunk",
 :history [["+" "0.0-1424"]]}

```
