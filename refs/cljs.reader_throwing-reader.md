## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/throwing-reader

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__throwing-reader__ msg)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:356-359](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/reader.cljs#L356-L359)</ins>
</pre>

```clj
(defn throwing-reader
  [msg]
  (fn [rdr _]
    (reader-error rdr msg)))
```


---

```clj
{:full-name "cljs.reader/throwing-reader",
 :ns "cljs.reader",
 :name "throwing-reader",
 :type "function",
 :signature ["[msg]"],
 :source {:code "(defn throwing-reader\n  [msg]\n  (fn [rdr _]\n    (reader-error rdr msg)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [356 359],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/reader.cljs#L356-L359"},
 :full-name-encode "cljs.reader_throwing-reader",
 :history [["+" "0.0-927"]]}

```
