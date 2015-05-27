## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-4-chars

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-4-chars__ reader)<br>
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
            └── <ins>[reader.cljs:181-187](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/reader.cljs#L181-L187)</ins>
</pre>

```clj
(defn read-4-chars [reader]
  (.toString
    (gstring/StringBuffer.
      (read-char reader)
      (read-char reader)
      (read-char reader)
      (read-char reader))))
```


---

```clj
{:full-name "cljs.reader/read-4-chars",
 :ns "cljs.reader",
 :name "read-4-chars",
 :type "function",
 :signature ["[reader]"],
 :source {:code "(defn read-4-chars [reader]\n  (.toString\n    (gstring/StringBuffer.\n      (read-char reader)\n      (read-char reader)\n      (read-char reader)\n      (read-char reader))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [181 187],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/reader.cljs#L181-L187"},
 :full-name-encode "cljs.reader_read-4-chars",
 :history [["+" "0.0-1424"]]}

```
