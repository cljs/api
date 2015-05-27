## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Symbol

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Symbol.__ ns name str _hash _meta)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:344-372](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L344-L372)</ins>
</pre>

```clj
(deftype Symbol [ns name str ^:mutable _hash _meta]
  Object
  (toString [_] str)
  IEquiv
  (-equiv [_ other]
    (if (instance? Symbol other)
      (identical? str (.-str other))
      false))
  IFn
  (-invoke [sym coll]
    (-lookup coll sym nil))
  (-invoke [sym coll not-found]
    (-lookup coll sym not-found))
  IMeta
  (-meta [_] _meta)
  IWithMeta
  (-with-meta [_ new-meta] (Symbol. ns name str _hash new-meta))
  IHash
  (-hash [_]
    (if (== _hash -1)
      (do
        (set! _hash (hash-combine (hash ns) (hash name)))
        _hash)
      _hash))
  INamed
  (-name [_] name)
  (-namespace [_] ns)
  IPrintWithWriter
  (-pr-writer [o writer _] (-write writer str)))
```


---

```clj
{:full-name "cljs.core/Symbol",
 :ns "cljs.core",
 :name "Symbol",
 :type "type",
 :signature ["[ns name str _hash _meta]"],
 :source {:code "(deftype Symbol [ns name str ^:mutable _hash _meta]\n  Object\n  (toString [_] str)\n  IEquiv\n  (-equiv [_ other]\n    (if (instance? Symbol other)\n      (identical? str (.-str other))\n      false))\n  IFn\n  (-invoke [sym coll]\n    (-lookup coll sym nil))\n  (-invoke [sym coll not-found]\n    (-lookup coll sym not-found))\n  IMeta\n  (-meta [_] _meta)\n  IWithMeta\n  (-with-meta [_ new-meta] (Symbol. ns name str _hash new-meta))\n  IHash\n  (-hash [_]\n    (if (== _hash -1)\n      (do\n        (set! _hash (hash-combine (hash ns) (hash name)))\n        _hash)\n      _hash))\n  INamed\n  (-name [_] name)\n  (-namespace [_] ns)\n  IPrintWithWriter\n  (-pr-writer [o writer _] (-write writer str)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [344 372],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L344-L372"},
 :full-name-encode "cljs.core_Symbol",
 :history [["+" "0.0-1798"]]}

```
