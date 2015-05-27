## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/register-default-tag-parser!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__register-default-tag-parser!__ f)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:559-563](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L559-L563)</ins>
</pre>

```clj
(defn register-default-tag-parser!
  [f]
  (let [old-parser @*default-data-reader-fn*]
    (swap! *default-data-reader-fn* (fn [_] f))
    old-parser))
```


---

```clj
{:full-name "cljs.reader/register-default-tag-parser!",
 :ns "cljs.reader",
 :name "register-default-tag-parser!",
 :type "function",
 :signature ["[f]"],
 :source {:code "(defn register-default-tag-parser!\n  [f]\n  (let [old-parser @*default-data-reader-fn*]\n    (swap! *default-data-reader-fn* (fn [_] f))\n    old-parser))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [559 563],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L559-L563"},
 :full-name-encode "cljs.reader_register-default-tag-parser_BANG_",
 :history [["+" "0.0-1576"]]}

```
