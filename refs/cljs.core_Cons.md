## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Cons

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Cons.__ meta first rest __hash)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1643-1678](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1643-L1678)</ins>
</pre>

```clj
(deftype Cons [meta first rest ^:mutable __hash]
  IList
  
  Object
  (toString [this]
    (pr-str this))

  IWithMeta
  (-with-meta [coll meta] (Cons. meta first rest __hash))

  IMeta
  (-meta [coll] meta)

  ASeq
  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest))

  INext
  (-next [coll] (if (nil? rest) nil (-seq rest)))

  ICollection
  (-conj [coll o] (Cons. nil o coll __hash))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll] coll))
```


---

```clj
{:full-name "cljs.core/Cons",
 :ns "cljs.core",
 :name "Cons",
 :type "type",
 :signature ["[meta first rest __hash]"],
 :source {:code "(deftype Cons [meta first rest ^:mutable __hash]\n  IList\n  \n  Object\n  (toString [this]\n    (pr-str this))\n\n  IWithMeta\n  (-with-meta [coll meta] (Cons. meta first rest __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ASeq\n  ISeq\n  (-first [coll] first)\n  (-rest [coll] (if (nil? rest) () rest))\n\n  INext\n  (-next [coll] (if (nil? rest) nil (-seq rest)))\n\n  ICollection\n  (-conj [coll o] (Cons. nil o coll __hash))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  ISeqable\n  (-seq [coll] coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1643 1678],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1643-L1678"},
 :full-name-encode "cljs.core_Cons",
 :history [["+" "0.0-927"]]}

```
