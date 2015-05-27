## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IChunkedSeq

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:305-307](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L305-L307)</ins>
</pre>

```clj
(defprotocol IChunkedSeq
  (-chunked-first [coll])
  (-chunked-rest [coll]))
```


---

```clj
{:ns "cljs.core",
 :name "IChunkedSeq",
 :type "protocol",
 :full-name-encode "cljs.core_IChunkedSeq",
 :source {:code "(defprotocol IChunkedSeq\n  (-chunked-first [coll])\n  (-chunked-rest [coll]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [305 307],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L305-L307"},
 :methods [{:name "-chunked-first",
            :signature ["[coll]"],
            :docstring nil}
           {:name "-chunked-rest",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/IChunkedSeq",
 :history [["+" "0.0-1424"]]}

```
