## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/missing-protocol

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__missing-protocol__ proto obj)<br>
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
            └── <ins>[core.cljs:93-100](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L93-L100)</ins>
</pre>

```clj
(defn missing-protocol [proto obj]
  (let [ty (type obj)
        ty (if (and ty (.-cljs$lang$type ty))
             (.-cljs$lang$ctorStr ty)
             (goog/typeOf obj))]
   (js/Error.
     (.join (array "No protocol method " proto
                   " defined for type " ty ": " obj) ""))))
```


---

```clj
{:full-name "cljs.core/missing-protocol",
 :ns "cljs.core",
 :name "missing-protocol",
 :type "function",
 :signature ["[proto obj]"],
 :source {:code "(defn missing-protocol [proto obj]\n  (let [ty (type obj)\n        ty (if (and ty (.-cljs$lang$type ty))\n             (.-cljs$lang$ctorStr ty)\n             (goog/typeOf obj))]\n   (js/Error.\n     (.join (array \"No protocol method \" proto\n                   \" defined for type \" ty \": \" obj) \"\"))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [93 100],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L93-L100"},
 :full-name-encode "cljs.core_missing-protocol",
 :history [["+" "0.0-927"]]}

```
