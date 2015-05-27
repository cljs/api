## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-list

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-list__ rdr _)<br>
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
            └── <ins>[reader.cljs:272-274](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L272-L274)</ins>
</pre>

```clj
(defn read-list
  [rdr _]
  (apply list (read-delimited-list ")" rdr true)))
```


---

```clj
{:full-name "cljs.reader/read-list",
 :ns "cljs.reader",
 :name "read-list",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-list\n  [rdr _]\n  (apply list (read-delimited-list \")\" rdr true)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [272 274],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L272-L274"},
 :full-name-encode "cljs.reader_read-list",
 :history [["+" "0.0-927"]]}

```
