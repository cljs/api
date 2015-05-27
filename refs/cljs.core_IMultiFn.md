## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IMultiFn

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
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
            └── <ins>[core.cljs:6301-6309](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L6301-L6309)</ins>
</pre>

```clj
(defprotocol IMultiFn
  (-reset [mf])
  (-add-method [mf dispatch-val method])
  (-remove-method [mf dispatch-val])
  (-prefer-method [mf dispatch-val dispatch-val-y])
  (-get-method [mf dispatch-val])
  (-methods [mf])
  (-prefers [mf])
  (-dispatch [mf args]))
```


---

```clj
{:ns "cljs.core",
 :name "IMultiFn",
 :type "protocol",
 :full-name-encode "cljs.core_IMultiFn",
 :source {:code "(defprotocol IMultiFn\n  (-reset [mf])\n  (-add-method [mf dispatch-val method])\n  (-remove-method [mf dispatch-val])\n  (-prefer-method [mf dispatch-val dispatch-val-y])\n  (-get-method [mf dispatch-val])\n  (-methods [mf])\n  (-prefers [mf])\n  (-dispatch [mf args]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6301 6309],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L6301-L6309"},
 :methods [{:name "-reset", :signature ["[mf]"], :docstring nil}
           {:name "-add-method",
            :signature ["[mf dispatch-val method]"],
            :docstring nil}
           {:name "-remove-method",
            :signature ["[mf dispatch-val]"],
            :docstring nil}
           {:name "-prefer-method",
            :signature ["[mf dispatch-val dispatch-val-y]"],
            :docstring nil}
           {:name "-get-method",
            :signature ["[mf dispatch-val]"],
            :docstring nil}
           {:name "-methods", :signature ["[mf]"], :docstring nil}
           {:name "-prefers", :signature ["[mf]"], :docstring nil}
           {:name "-dispatch",
            :signature ["[mf args]"],
            :docstring nil}],
 :full-name "cljs.core/IMultiFn",
 :history [["+" "0.0-927"]]}

```
