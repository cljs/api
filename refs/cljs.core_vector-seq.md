## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vector-seq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__vector-seq__ v offset)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2522-2540](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2522-L2540)</ins>
</pre>

```clj
(defn vector-seq [v offset]
  (let [c (-count v)]
    (when (pos? c)
      (reify
        IPrintable
        (-pr-seq [vseq opts] (pr-sequential pr-seq "(" " " ")" opts vseq))
        ISequential
        IEquiv
        (-equiv [vseq other] (equiv-sequential vseq other))
        ASeq
        ISeq
        (-first [_] (-nth v offset))
        (-rest [_]
          (let [offset (inc offset)]
            (if (< offset c)
              (vector-seq v offset)
              ())))
        ISeqable
        (-seq [vseq] vseq)))))
```


---

```clj
{:full-name "cljs.core/vector-seq",
 :ns "cljs.core",
 :name "vector-seq",
 :type "function",
 :signature ["[v offset]"],
 :source {:code "(defn vector-seq [v offset]\n  (let [c (-count v)]\n    (when (pos? c)\n      (reify\n        IPrintable\n        (-pr-seq [vseq opts] (pr-sequential pr-seq \"(\" \" \" \")\" opts vseq))\n        ISequential\n        IEquiv\n        (-equiv [vseq other] (equiv-sequential vseq other))\n        ASeq\n        ISeq\n        (-first [_] (-nth v offset))\n        (-rest [_]\n          (let [offset (inc offset)]\n            (if (< offset c)\n              (vector-seq v offset)\n              ())))\n        ISeqable\n        (-seq [vseq] vseq)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2522 2540],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2522-L2540"},
 :full-name-encode "cljs.core_vector-seq",
 :history [["+" "0.0-1211"]]}

```
