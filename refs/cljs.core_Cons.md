## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Cons

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Cons.__ meta first rest)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1196-1221](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1196-L1221)</ins>
</pre>

```clj
(deftype Cons [meta first rest]
  IWithMeta
  (-with-meta [coll meta] (Cons. meta first rest))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest))

  ICollection
  (-conj [coll o] (Cons. nil o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll] coll))
```


---

```clj
{:full-name "cljs.core/Cons",
 :ns "cljs.core",
 :name "Cons",
 :type "type",
 :signature ["[meta first rest]"],
 :source {:code "(deftype Cons [meta first rest]\n  IWithMeta\n  (-with-meta [coll meta] (Cons. meta first rest))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] first)\n  (-rest [coll] (if (nil? rest) () rest))\n\n  ICollection\n  (-conj [coll o] (Cons. nil o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll] coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1196 1221],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1196-L1221"},
 :full-name-encode "cljs.core_Cons",
 :history [["+" "0.0-927"]]}

```
