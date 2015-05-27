## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-meta

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-meta__ rdr _)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:287-295](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/reader.cljs#L287-L295)</ins>
</pre>

```clj
(defn read-meta
  [rdr _]
  (let [m (desugar-meta (read rdr true nil true))]
    (when-not (map? m)
      (reader-error rdr "Metadata must be Symbol,Keyword,String or Map"))
    (let [o (read rdr true nil true)]
      (if (satisfies? IWithMeta o)
        (with-meta o (merge (meta o) m))
        (reader-error rdr "Metadata can only be applied to IWithMetas")))))
```


---

```clj
{:full-name "cljs.reader/read-meta",
 :ns "cljs.reader",
 :name "read-meta",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-meta\n  [rdr _]\n  (let [m (desugar-meta (read rdr true nil true))]\n    (when-not (map? m)\n      (reader-error rdr \"Metadata must be Symbol,Keyword,String or Map\"))\n    (let [o (read rdr true nil true)]\n      (if (satisfies? IWithMeta o)\n        (with-meta o (merge (meta o) m))\n        (reader-error rdr \"Metadata can only be applied to IWithMetas\")))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [287 295],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/reader.cljs#L287-L295"},
 :full-name-encode "cljs.reader_read-meta",
 :history [["+" "0.0-927"]]}

```
