## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-unicode-char

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-unicode-char__ reader initch)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:145-147](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/reader.cljs#L145-L147)</ins>
</pre>

```clj
(defn read-unicode-char
  [reader initch]
  (reader-error reader "Unicode characters not supported by reader (yet)"))
```


---

```clj
{:full-name "cljs.reader/read-unicode-char",
 :ns "cljs.reader",
 :name "read-unicode-char",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-unicode-char\n  [reader initch]\n  (reader-error reader \"Unicode characters not supported by reader (yet)\"))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [145 147],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/reader.cljs#L145-L147"},
 :full-name-encode "cljs.reader_read-unicode-char",
 :history [["+" "0.0-927"]]}

```
