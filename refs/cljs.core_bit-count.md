## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-count

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__bit-count__ n)<br>
</samp>

```
Counts the number of bits set in n
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1212-1218](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1212-L1218)</ins>
</pre>

```clj
(defn bit-count
  [n]
  (loop [c 0 n n]
    (if (zero? n)
      c
      (recur (inc c) (bit-and n (dec n))))))
```


---

```clj
{:full-name "cljs.core/bit-count",
 :ns "cljs.core",
 :name "bit-count",
 :docstring "Counts the number of bits set in n",
 :type "function",
 :signature ["[n]"],
 :source {:code "(defn bit-count\n  [n]\n  (loop [c 0 n n]\n    (if (zero? n)\n      c\n      (recur (inc c) (bit-and n (dec n))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1212 1218],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1212-L1218"},
 :full-name-encode "cljs.core_bit-count",
 :history [["+" "0.0-1211"]]}

```
