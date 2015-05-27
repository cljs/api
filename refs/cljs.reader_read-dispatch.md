## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-dispatch

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-dispatch__ rdr _)<br>
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
            └── <ins>[reader.cljs:258-266](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L258-L266)</ins>
</pre>

```clj
(defn read-dispatch
  [rdr _]
  (let [ch (read-char rdr)
        dm (dispatch-macros ch)]
    (if dm
      (dm rdr _)
      (if-let [obj (maybe-read-tagged-type rdr ch)]
        obj
        (reader-error rdr "No dispatch macro for " ch)))))
```


---

```clj
{:full-name "cljs.reader/read-dispatch",
 :ns "cljs.reader",
 :name "read-dispatch",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-dispatch\n  [rdr _]\n  (let [ch (read-char rdr)\n        dm (dispatch-macros ch)]\n    (if dm\n      (dm rdr _)\n      (if-let [obj (maybe-read-tagged-type rdr ch)]\n        obj\n        (reader-error rdr \"No dispatch macro for \" ch)))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [258 266],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L258-L266"},
 :full-name-encode "cljs.reader_read-dispatch",
 :history [["+" "0.0-927"]]}

```
