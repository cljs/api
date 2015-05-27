## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Delay

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Delay.__ f state)<br>
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
            └── <ins>[core.cljs:3192-3202](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L3192-L3202)</ins>
</pre>

```clj
(deftype Delay [f state]

  IDeref
  (-deref [_]
    (when-not @state
      (swap! state f))
    @state)

  IPending
  (-realized? [d]
    (not (nil? @state))))
```


---

```clj
{:full-name "cljs.core/Delay",
 :ns "cljs.core",
 :name "Delay",
 :type "type",
 :signature ["[f state]"],
 :source {:code "(deftype Delay [f state]\n\n  IDeref\n  (-deref [_]\n    (when-not @state\n      (swap! state f))\n    @state)\n\n  IPending\n  (-realized? [d]\n    (not (nil? @state))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3192 3202],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L3192-L3202"},
 :full-name-encode "cljs.core_Delay",
 :history [["+" "0.0-927"]]}

```
