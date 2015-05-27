## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-keys

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-keys__ obj)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:979-982](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L979-L982)</ins>
</pre>

```clj
(defn js-keys [obj]
  (let [keys (array)]
    (goog.object/forEach obj (fn [val key obj] (.push keys key)))
    keys))
```


---

```clj
{:full-name "cljs.core/js-keys",
 :ns "cljs.core",
 :name "js-keys",
 :type "function",
 :signature ["[obj]"],
 :source {:code "(defn js-keys [obj]\n  (let [keys (array)]\n    (goog.object/forEach obj (fn [val key obj] (.push keys key)))\n    keys))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [979 982],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L979-L982"},
 :full-name-encode "cljs.core_js-keys",
 :history [["+" "0.0-927"]]}

```
