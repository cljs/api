## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/List

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__List.__ meta first rest count)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1119-1151](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1119-L1151)</ins>
</pre>

```clj
(deftype List [meta first rest count]
  IWithMeta
  (-with-meta [coll meta] (List. meta first rest count))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] first)
  (-rest [coll] rest)

  IStack
  (-peek [coll] first)
  (-pop [coll] (-rest coll))

  ICollection
  (-conj [coll o] (List. meta o coll (inc count)))

  IEmptyableCollection
  (-empty [coll] cljs.core.List/EMPTY)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll] coll)

  ICounted
  (-count [coll] count))
```


---

```clj
{:full-name "cljs.core/List",
 :ns "cljs.core",
 :name "List",
 :type "type",
 :signature ["[meta first rest count]"],
 :source {:code "(deftype List [meta first rest count]\n  IWithMeta\n  (-with-meta [coll meta] (List. meta first rest count))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] first)\n  (-rest [coll] rest)\n\n  IStack\n  (-peek [coll] first)\n  (-pop [coll] (-rest coll))\n\n  ICollection\n  (-conj [coll o] (List. meta o coll (inc count)))\n\n  IEmptyableCollection\n  (-empty [coll] cljs.core.List/EMPTY)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ICounted\n  (-count [coll] count))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1119 1151],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1119-L1151"},
 :full-name-encode "cljs.core_List",
 :history [["+" "0.0-927"]]}

```
