## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/UUID

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__UUID.__ uuid)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7289-7308](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L7289-L7308)</ins>
</pre>

```clj
(deftype UUID [uuid]
  Object
  (toString [this]
    (pr-str this))

  IEquiv
  (-equiv [_ other]
    (and (instance? UUID other) (identical? uuid (.-uuid other))))

  ^:deprecation-nowarn IPrintable
  (-pr-seq [_ _]
    (list (str "#uuid \"" uuid "\"")))

  IPrintWithWriter
  (-pr-writer [_ writer _]
    (-write writer (str "#uuid \"" uuid "\"")))

  IHash
  (-hash [this]
    (goog.string/hashCode (pr-str this))))
```


---

```clj
{:full-name "cljs.core/UUID",
 :ns "cljs.core",
 :name "UUID",
 :type "type",
 :signature ["[uuid]"],
 :source {:code "(deftype UUID [uuid]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  IEquiv\n  (-equiv [_ other]\n    (and (instance? UUID other) (identical? uuid (.-uuid other))))\n\n  ^:deprecation-nowarn IPrintable\n  (-pr-seq [_ _]\n    (list (str \"#uuid \\\"\" uuid \"\\\"\")))\n\n  IPrintWithWriter\n  (-pr-writer [_ writer _]\n    (-write writer (str \"#uuid \\\"\" uuid \"\\\"\")))\n\n  IHash\n  (-hash [this]\n    (goog.string/hashCode (pr-str this))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7289 7308],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L7289-L7308"},
 :full-name-encode "cljs.core_UUID",
 :history [["+" "0.0-1424"]]}

```
