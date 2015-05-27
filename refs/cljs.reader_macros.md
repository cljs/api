## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/macros

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__macros__ c)<br>
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
            └── <ins>[reader.cljs:343-362](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L343-L362)</ins>
</pre>

```clj
(defn macros [c]
  (case c
    \" read-string*
    \: read-keyword
    \; not-implemented ;; never hit this
    \' (wrapping-reader 'quote)
    \@ (wrapping-reader 'deref)
    \^ read-meta
    \` not-implemented
    \~ not-implemented
    \( read-list
    \) read-unmatched-delimiter
    \[ read-vector
    \] read-unmatched-delimiter
    \{ read-map
    \} read-unmatched-delimiter
    \\ read-char
    \% not-implemented
    \# read-dispatch
    nil))
```


---

```clj
{:full-name "cljs.reader/macros",
 :ns "cljs.reader",
 :name "macros",
 :type "function",
 :signature ["[c]"],
 :source {:code "(defn macros [c]\n  (case c\n    \\\" read-string*\n    \\: read-keyword\n    \\; not-implemented ;; never hit this\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'deref)\n    \\^ read-meta\n    \\` not-implemented\n    \\~ not-implemented\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char\n    \\% not-implemented\n    \\# read-dispatch\n    nil))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [343 362],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/reader.cljs#L343-L362"},
 :full-name-encode "cljs.reader_macros",
 :history [["+" "0.0-927"]]}

```
