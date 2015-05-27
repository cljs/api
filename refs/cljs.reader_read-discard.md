## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-discard

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-discard__ rdr _)<br>
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
            └── <ins>[reader.cljs:305-308](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/reader.cljs#L305-L308)</ins>
</pre>

```clj
(defn read-discard
  [rdr _]
  (read rdr true nil true)
  rdr)
```


---

```clj
{:full-name "cljs.reader/read-discard",
 :ns "cljs.reader",
 :name "read-discard",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-discard\n  [rdr _]\n  (read rdr true nil true)\n  rdr)",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [305 308],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/reader.cljs#L305-L308"},
 :full-name-encode "cljs.reader_read-discard",
 :history [["+" "0.0-927"]]}

```
