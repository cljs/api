## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-combine

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__hash-combine__ seed hash)<br>
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
            └── <ins>[core.cljs:1730-1734](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1730-L1734)</ins>
</pre>

```clj
(defn hash-combine [seed hash]
  ; a la boost
  (bit-xor seed (+ hash 0x9e3779b9
                   (bit-shift-left seed 6)
                   (bit-shift-right seed 2))))
```


---

```clj
{:full-name "cljs.core/hash-combine",
 :ns "cljs.core",
 :name "hash-combine",
 :type "function",
 :signature ["[seed hash]"],
 :source {:code "(defn hash-combine [seed hash]\n  ; a la boost\n  (bit-xor seed (+ hash 0x9e3779b9\n                   (bit-shift-left seed 6)\n                   (bit-shift-right seed 2))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1730 1734],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1730-L1734"},
 :full-name-encode "cljs.core_hash-combine",
 :history [["+" "0.0-927"]]}

```
