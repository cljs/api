## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IChunk

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
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:299-300](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L299-L300)</ins>
</pre>

```clj
(defprotocol IChunk
  (-drop-first [coll]))
```


---

```clj
{:ns "cljs.core",
 :name "IChunk",
 :type "protocol",
 :full-name-encode "cljs.core_IChunk",
 :source {:code "(defprotocol IChunk\n  (-drop-first [coll]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [299 300],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L299-L300"},
 :methods [{:name "-drop-first",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/IChunk",
 :history [["+" "0.0-1424"]]}

```
