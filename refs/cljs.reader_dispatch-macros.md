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
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:365-372](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L365-L372)</ins>
</pre>

```clj
(defn dispatch-macros [s]
  (case s
    "{" read-set
    "<" (throwing-reader "Unreadable form")
    "\"" read-regex
    "!" read-comment
    "_" read-discard
    nil))
```


---

```clj
{:full-name "cljs.reader/dispatch-macros",
 :ns "cljs.reader",
 :name "dispatch-macros",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn dispatch-macros [s]\n  (case s\n    \"{\" read-set\n    \"<\" (throwing-reader \"Unreadable form\")\n    \"\\\"\" read-regex\n    \"!\" read-comment\n    \"_\" read-discard\n    nil))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [365 372],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L365-L372"},
 :full-name-encode "cljs.reader_dispatch-macros",
 :history [["+" "0.0-927"]]}

```
