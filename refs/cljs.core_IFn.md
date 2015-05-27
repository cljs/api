## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IFn

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-971"><img valign="middle" alt="[+] 0.0-971" src="https://img.shields.io/badge/+-0.0--971-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:131-153](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L131-L153)</ins>
</pre>

```clj
(defprotocol IFn
  (-invoke
    [this]
    [this a]
    [this a b]
    [this a b c]
    [this a b c d]
    [this a b c d e]
    [this a b c d e f]
    [this a b c d e f g]
    [this a b c d e f g h]
    [this a b c d e f g h i]
    [this a b c d e f g h i j]
    [this a b c d e f g h i j k]
    [this a b c d e f g h i j k l]
    [this a b c d e f g h i j k l m]
    [this a b c d e f g h i j k l m n]
    [this a b c d e f g h i j k l m n o]
    [this a b c d e f g h i j k l m n o p]
    [this a b c d e f g h i j k l m n o p q]
    [this a b c d e f g h i j k l m n o p q s]
    [this a b c d e f g h i j k l m n o p q s t]
    [this a b c d e f g h i j k l m n o p q s t rest]))
```


---

```clj
{:ns "cljs.core",
 :name "IFn",
 :type "protocol",
 :full-name-encode "cljs.core_IFn",
 :source {:code "(defprotocol IFn\n  (-invoke\n    [this]\n    [this a]\n    [this a b]\n    [this a b c]\n    [this a b c d]\n    [this a b c d e]\n    [this a b c d e f]\n    [this a b c d e f g]\n    [this a b c d e f g h]\n    [this a b c d e f g h i]\n    [this a b c d e f g h i j]\n    [this a b c d e f g h i j k]\n    [this a b c d e f g h i j k l]\n    [this a b c d e f g h i j k l m]\n    [this a b c d e f g h i j k l m n]\n    [this a b c d e f g h i j k l m n o]\n    [this a b c d e f g h i j k l m n o p]\n    [this a b c d e f g h i j k l m n o p q]\n    [this a b c d e f g h i j k l m n o p q s]\n    [this a b c d e f g h i j k l m n o p q s t]\n    [this a b c d e f g h i j k l m n o p q s t rest]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [131 153],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L131-L153"},
 :methods [{:name "-invoke",
            :signature ["[this]"
                        "[this a]"
                        "[this a b]"
                        "[this a b c]"
                        "[this a b c d]"
                        "[this a b c d e]"
                        "[this a b c d e f]"
                        "[this a b c d e f g]"
                        "[this a b c d e f g h]"
                        "[this a b c d e f g h i]"
                        "[this a b c d e f g h i j]"
                        "[this a b c d e f g h i j k]"
                        "[this a b c d e f g h i j k l]"
                        "[this a b c d e f g h i j k l m]"
                        "[this a b c d e f g h i j k l m n]"
                        "[this a b c d e f g h i j k l m n o]"
                        "[this a b c d e f g h i j k l m n o p]"
                        "[this a b c d e f g h i j k l m n o p q]"
                        "[this a b c d e f g h i j k l m n o p q s]"
                        "[this a b c d e f g h i j k l m n o p q s t]"
                        "[this a b c d e f g h i j k l m n o p q s t rest]"],
            :docstring nil}],
 :full-name "cljs.core/IFn",
 :history [["+" "0.0-971"]]}

```
