## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/deregister-tag-parser!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__deregister-tag-parser!__ tag)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:546-551](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L546-L551)</ins>
</pre>

```clj
(defn deregister-tag-parser!
  [tag]
  (let [tag (name tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* dissoc tag)
    old-parser))
```


---

```clj
{:full-name "cljs.reader/deregister-tag-parser!",
 :ns "cljs.reader",
 :name "deregister-tag-parser!",
 :type "function",
 :signature ["[tag]"],
 :source {:code "(defn deregister-tag-parser!\n  [tag]\n  (let [tag (name tag)\n        old-parser (get @*tag-table* tag)]\n    (swap! *tag-table* dissoc tag)\n    old-parser))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [546 551],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L546-L551"},
 :full-name-encode "cljs.reader_deregister-tag-parser_BANG_",
 :history [["+" "0.0-1424"]]}

```
