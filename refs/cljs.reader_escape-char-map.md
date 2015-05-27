## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/escape-char-map

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__escape-char-map__ c)<br>
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
            └── <ins>[reader.cljs:160-169](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L160-L169)</ins>
</pre>

```clj
(defn escape-char-map [c]
  (case c
    \t "\t"
    \r "\r"
    \n "\n"
    \\ \\
    \" \"
    \b "\b"
    \f "\f"
    nil))
```


---

```clj
{:full-name "cljs.reader/escape-char-map",
 :ns "cljs.reader",
 :name "escape-char-map",
 :type "function",
 :signature ["[c]"],
 :source {:code "(defn escape-char-map [c]\n  (case c\n    \\t \"\\t\"\n    \\r \"\\r\"\n    \\n \"\\n\"\n    \\\\ \\\\\n    \\\" \\\"\n    \\b \"\\b\"\n    \\f \"\\f\"\n    nil))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [160 169],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L160-L169"},
 :full-name-encode "cljs.reader_escape-char-map",
 :history [["+" "0.0-927"]]}

```
