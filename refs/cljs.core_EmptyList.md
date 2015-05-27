## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/EmptyList

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__EmptyList.__ meta)<br>
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
            └── <ins>[core.cljs:1406-1444](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1406-L1444)</ins>
</pre>

```clj
(deftype EmptyList [meta]
  IList
  
  Object
  (toString [this]
    (pr-str this))

  IWithMeta
  (-with-meta [coll meta] (EmptyList. meta))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] nil)
  (-rest [coll] nil)

  IStack
  (-peek [coll] nil)
  (-pop [coll] #_(throw (js/Error. "Can't pop empty list")))

  ICollection
  (-conj [coll o] (List. meta o nil 1 nil))

  IEmptyableCollection
  (-empty [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] 0)

  ISeqable
  (-seq [coll] nil)

  ICounted
  (-count [coll] 0))
```


---

```clj
{:full-name "cljs.core/EmptyList",
 :ns "cljs.core",
 :name "EmptyList",
 :type "type",
 :signature ["[meta]"],
 :source {:code "(deftype EmptyList [meta]\n  IList\n  \n  Object\n  (toString [this]\n    (pr-str this))\n\n  IWithMeta\n  (-with-meta [coll meta] (EmptyList. meta))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] nil)\n  (-rest [coll] nil)\n\n  IStack\n  (-peek [coll] nil)\n  (-pop [coll] #_(throw (js/Error. \"Can't pop empty list\")))\n\n  ICollection\n  (-conj [coll o] (List. meta o nil 1 nil))\n\n  IEmptyableCollection\n  (-empty [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] 0)\n\n  ISeqable\n  (-seq [coll] nil)\n\n  ICounted\n  (-count [coll] 0))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1406 1444],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1406-L1444"},
 :full-name-encode "cljs.core_EmptyList",
 :history [["+" "0.0-927"]]}

```
