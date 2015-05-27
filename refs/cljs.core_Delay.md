## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Delay

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Delay.__ state f)<br>
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
            └── <ins>[core.cljs:6681-6691](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6681-L6691)</ins>
</pre>

```clj
(deftype Delay [state f]
  IDeref
  (-deref [_]
    (:value (swap! state (fn [{:keys [done] :as curr-state}]
                           (if done
                             curr-state,
                             {:done true :value (f)})))))

  IPending
  (-realized? [d]
    (:done @state)))
```


---

```clj
{:full-name "cljs.core/Delay",
 :ns "cljs.core",
 :name "Delay",
 :type "type",
 :signature ["[state f]"],
 :source {:code "(deftype Delay [state f]\n  IDeref\n  (-deref [_]\n    (:value (swap! state (fn [{:keys [done] :as curr-state}]\n                           (if done\n                             curr-state,\n                             {:done true :value (f)})))))\n\n  IPending\n  (-realized? [d]\n    (:done @state)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6681 6691],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6681-L6691"},
 :full-name-encode "cljs.core_Delay",
 :history [["+" "0.0-927"]]}

```
