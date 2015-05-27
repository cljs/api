## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-count

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__bit-count__ v)<br>
</samp>

```
Counts the number of bits set in n
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1671-1676](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L1671-L1676)</ins>
</pre>

```clj
(defn bit-count
  [v]
  (let [v (- v (bit-and (bit-shift-right v 1) 0x55555555))
        v (+ (bit-and v 0x33333333) (bit-and (bit-shift-right v 2) 0x33333333))]
    (bit-shift-right (* (bit-and (+ v (bit-shift-right v 4)) 0xF0F0F0F) 0x1010101) 24)))
```


---

```clj
{:full-name "cljs.core/bit-count",
 :ns "cljs.core",
 :name "bit-count",
 :docstring "Counts the number of bits set in n",
 :type "function",
 :signature ["[v]"],
 :source {:code "(defn bit-count\n  [v]\n  (let [v (- v (bit-and (bit-shift-right v 1) 0x55555555))\n        v (+ (bit-and v 0x33333333) (bit-and (bit-shift-right v 2) 0x33333333))]\n    (bit-shift-right (* (bit-and (+ v (bit-shift-right v 4)) 0xF0F0F0F) 0x1010101) 24)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1671 1676],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L1671-L1676"},
 :full-name-encode "cljs.core_bit-count",
 :history [["+" "0.0-1211"]]}

```
