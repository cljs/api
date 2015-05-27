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
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:62-65](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L62-L65)</ins>
</pre>

```clj
(defn missing-protocol [proto obj]
  (js/Error (js* "~{}+~{}+~{}+~{}+~{}+~{}"
                 "No protocol method " proto
                 " defined for type " (goog/typeOf obj) ": " obj)))
```


---

```clj
{:full-name "cljs.core/missing-protocol",
 :ns "cljs.core",
 :name "missing-protocol",
 :type "function",
 :signature ["[proto obj]"],
 :source {:code "(defn missing-protocol [proto obj]\n  (js/Error (js* \"~{}+~{}+~{}+~{}+~{}+~{}\"\n                 \"No protocol method \" proto\n                 \" defined for type \" (goog/typeOf obj) \": \" obj)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [62 65],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L62-L65"},
 :full-name-encode "cljs.core_missing-protocol",
 :history [["+" "0.0-927"]]}

```
