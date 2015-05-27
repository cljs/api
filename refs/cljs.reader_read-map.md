## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-map

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-map__ rdr _)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:213-218](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/reader.cljs#L213-L218)</ins>
</pre>

```clj
(defn read-map
  [rdr _]
  (let [l (read-delimited-list "}" rdr true)]
    (when (odd? (count l))
      (reader-error rdr "Map literal must contain an even number of forms"))
    (apply hash-map l)))
```


---

```clj
{:full-name "cljs.reader/read-map",
 :ns "cljs.reader",
 :name "read-map",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-map\n  [rdr _]\n  (let [l (read-delimited-list \"}\" rdr true)]\n    (when (odd? (count l))\n      (reader-error rdr \"Map literal must contain an even number of forms\"))\n    (apply hash-map l)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [213 218],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/reader.cljs#L213-L218"},
 :full-name-encode "cljs.reader_read-map",
 :history [["+" "0.0-927"]]}

```
