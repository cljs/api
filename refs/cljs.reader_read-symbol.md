## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-symbol

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-symbol__ reader initch)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:319-325](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/reader.cljs#L319-L325)</ins>
</pre>

```clj
(defn read-symbol
  [reader initch]
  (let [token (read-token reader initch)]
    (if (gstring/contains token "/")
      (symbol (subs token 0 (.indexOf token "/"))
              (subs token (inc (.indexOf token "/")) (.-length token)))
      (special-symbols token (symbol token)))))
```


---

```clj
{:full-name "cljs.reader/read-symbol",
 :ns "cljs.reader",
 :name "read-symbol",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-symbol\n  [reader initch]\n  (let [token (read-token reader initch)]\n    (if (gstring/contains token \"/\")\n      (symbol (subs token 0 (.indexOf token \"/\"))\n              (subs token (inc (.indexOf token \"/\")) (.-length token)))\n      (special-symbols token (symbol token)))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [319 325],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/reader.cljs#L319-L325"},
 :full-name-encode "cljs.reader_read-symbol",
 :history [["+" "0.0-927"]]}

```
