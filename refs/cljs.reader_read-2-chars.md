## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-2-chars

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-2-chars__ reader)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:175-179](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/reader.cljs#L175-L179)</ins>
</pre>

```clj
(defn read-2-chars [reader]
  (.toString
    (gstring/StringBuffer.
      (read-char reader)
      (read-char reader))))
```


---

```clj
{:full-name "cljs.reader/read-2-chars",
 :ns "cljs.reader",
 :name "read-2-chars",
 :type "function",
 :signature ["[reader]"],
 :source {:code "(defn read-2-chars [reader]\n  (.toString\n    (gstring/StringBuffer.\n      (read-char reader)\n      (read-char reader))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [175 179],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/reader.cljs#L175-L179"},
 :full-name-encode "cljs.reader_read-2-chars",
 :history [["+" "0.0-1424"]]}

```
