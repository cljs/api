## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/dispatch-macros

 <table border="1">
<tr>
<td>var</td>
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
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:331-336](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/reader.cljs#L331-L336)</ins>
</pre>

```clj
(def dispatch-macros
  {"{" read-set
   "<" (throwing-reader "Unreadable form")
   "\"" read-regex
   "!" read-comment
   "_" read-discard})
```


---

```clj
{:full-name "cljs.reader/dispatch-macros",
 :ns "cljs.reader",
 :name "dispatch-macros",
 :type "var",
 :source {:code "(def dispatch-macros\n  {\"{\" read-set\n   \"<\" (throwing-reader \"Unreadable form\")\n   \"\\\"\" read-regex\n   \"!\" read-comment\n   \"_\" read-discard})",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [331 336],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/reader.cljs#L331-L336"},
 :full-name-encode "cljs.reader_dispatch-macros",
 :history [["+" "0.0-927"]]}

```
