## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/dispatch-macros

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__dispatch-macros__ s)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:406-413](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L406-L413)</ins>
</pre>

```clj
(defn dispatch-macros [s]
  (cond
   (identical? s "{") read-set
   (identical? s "<") (throwing-reader "Unreadable form")
   (identical? s "\"") read-regex
   (identical? s"!") read-comment
   (identical? s "_") read-discard
   :else nil))
```


---

```clj
{:full-name "cljs.reader/dispatch-macros",
 :ns "cljs.reader",
 :name "dispatch-macros",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn dispatch-macros [s]\n  (cond\n   (identical? s \"{\") read-set\n   (identical? s \"<\") (throwing-reader \"Unreadable form\")\n   (identical? s \"\\\"\") read-regex\n   (identical? s\"!\") read-comment\n   (identical? s \"_\") read-discard\n   :else nil))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [406 413],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L406-L413"},
 :full-name-encode "cljs.reader_dispatch-macros",
 :history [["+" "0.0-927"]]}

```
