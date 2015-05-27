## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/deregister-default-tag-parser!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__deregister-default-tag-parser!__)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:565-569](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/reader.cljs#L565-L569)</ins>
</pre>

```clj
(defn deregister-default-tag-parser!
  []
  (let [old-parser @*default-data-reader-fn*]
    (swap! *default-data-reader-fn* (fn [_] nil))
    old-parser))
```


---

```clj
{:full-name "cljs.reader/deregister-default-tag-parser!",
 :ns "cljs.reader",
 :name "deregister-default-tag-parser!",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn deregister-default-tag-parser!\n  []\n  (let [old-parser @*default-data-reader-fn*]\n    (swap! *default-data-reader-fn* (fn [_] nil))\n    old-parser))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [565 569],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/reader.cljs#L565-L569"},
 :full-name-encode "cljs.reader_deregister-default-tag-parser_BANG_",
 :history [["+" "0.0-1576"]]}

```
