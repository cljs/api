## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/maybe-read-tagged-type

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__maybe-read-tagged-type__ rdr initch)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:530-537](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/reader.cljs#L530-L537)</ins>
</pre>

```clj
(defn maybe-read-tagged-type
  [rdr initch]
  (let [tag  (read-symbol rdr initch)]
    (if-let [pfn (get @*tag-table* (name tag))]
      (pfn (read rdr true nil false))
      (reader-error rdr
                    "Could not find tag parser for " (name tag)
                    " in " (pr-str (keys @*tag-table*))))))
```


---

```clj
{:full-name "cljs.reader/maybe-read-tagged-type",
 :ns "cljs.reader",
 :name "maybe-read-tagged-type",
 :type "function",
 :signature ["[rdr initch]"],
 :source {:code "(defn maybe-read-tagged-type\n  [rdr initch]\n  (let [tag  (read-symbol rdr initch)]\n    (if-let [pfn (get @*tag-table* (name tag))]\n      (pfn (read rdr true nil false))\n      (reader-error rdr\n                    \"Could not find tag parser for \" (name tag)\n                    \" in \" (pr-str (keys @*tag-table*))))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [530 537],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/reader.cljs#L530-L537"},
 :full-name-encode "cljs.reader_maybe-read-tagged-type",
 :history [["+" "0.0-1236"]]}

```
