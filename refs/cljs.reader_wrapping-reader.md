## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/wrapping-reader

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__wrapping-reader__ sym)<br>
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
            └── <ins>[reader.cljs:351-354](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/reader.cljs#L351-L354)</ins>
</pre>

```clj
(defn wrapping-reader
  [sym]
  (fn [rdr _]
    (list sym (read rdr true nil true))))
```


---

```clj
{:full-name "cljs.reader/wrapping-reader",
 :ns "cljs.reader",
 :name "wrapping-reader",
 :type "function",
 :signature ["[sym]"],
 :source {:code "(defn wrapping-reader\n  [sym]\n  (fn [rdr _]\n    (list sym (read rdr true nil true))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [351 354],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/reader.cljs#L351-L354"},
 :full-name-encode "cljs.reader_wrapping-reader",
 :history [["+" "0.0-927"]]}

```
