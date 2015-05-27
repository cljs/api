## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-vector

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-vector__ rdr _)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:278-280](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/reader.cljs#L278-L280)</ins>
</pre>

```clj
(defn read-vector
  [rdr _]
  (read-delimited-list "]" rdr true))
```


---

```clj
{:full-name "cljs.reader/read-vector",
 :ns "cljs.reader",
 :name "read-vector",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-vector\n  [rdr _]\n  (read-delimited-list \"]\" rdr true))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [278 280],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/reader.cljs#L278-L280"},
 :full-name-encode "cljs.reader_read-vector",
 :history [["+" "0.0-927"]]}

```
