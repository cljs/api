## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Atom

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Atom.__ state meta validator watches)<br>
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
            └── <ins>[core.cljs:6697-6727](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L6697-L6727)</ins>
</pre>

```clj
(deftype Atom [state meta validator watches]
  IEquiv
  (-equiv [o other] (identical? o other))

  IDeref
  (-deref [_] state)

  IMeta
  (-meta [_] meta)

  ^:deprecation-nowarn IPrintable
  (-pr-seq [a opts]
    (concat  ["#<Atom: "] (-pr-seq state opts) ">"))

  IPrintWithWriter
  (-pr-writer [a writer opts]
    (-write writer "#<Atom: ")
    (-pr-writer state writer opts)
    (-write writer ">"))

  IWatchable
  (-notify-watches [this oldval newval]
    (doseq [[key f] watches]
      (f key this oldval newval)))
  (-add-watch [this key f]
    (set! (.-watches this) (assoc watches key f)))
  (-remove-watch [this key]
    (set! (.-watches this) (dissoc watches key)))

  IHash
  (-hash [this] (goog.getUid this)))
```


---

```clj
{:full-name "cljs.core/Atom",
 :ns "cljs.core",
 :name "Atom",
 :type "type",
 :signature ["[state meta validator watches]"],
 :source {:code "(deftype Atom [state meta validator watches]\n  IEquiv\n  (-equiv [o other] (identical? o other))\n\n  IDeref\n  (-deref [_] state)\n\n  IMeta\n  (-meta [_] meta)\n\n  ^:deprecation-nowarn IPrintable\n  (-pr-seq [a opts]\n    (concat  [\"#<Atom: \"] (-pr-seq state opts) \">\"))\n\n  IPrintWithWriter\n  (-pr-writer [a writer opts]\n    (-write writer \"#<Atom: \")\n    (-pr-writer state writer opts)\n    (-write writer \">\"))\n\n  IWatchable\n  (-notify-watches [this oldval newval]\n    (doseq [[key f] watches]\n      (f key this oldval newval)))\n  (-add-watch [this key f]\n    (set! (.-watches this) (assoc watches key f)))\n  (-remove-watch [this key]\n    (set! (.-watches this) (dissoc watches key)))\n\n  IHash\n  (-hash [this] (goog.getUid this)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6697 6727],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L6697-L6727"},
 :full-name-encode "cljs.core_Atom",
 :history [["+" "0.0-927"]]}

```
