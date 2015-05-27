## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-token

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-token__ rdr initch)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:80-88](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/reader.cljs#L80-L88)</ins>
</pre>

```clj
(defn read-token
  [rdr initch]
  (loop [sb (gstring/StringBuffer. initch)
         ch (read-char rdr)]
    (if (or (nil? ch)
            (whitespace? ch)
            (macro-terminating? ch))
      (do (unread rdr ch) (. sb (toString)))
      (recur (do (.append sb ch) sb) (read-char rdr)))))
```


---

```clj
{:full-name "cljs.reader/read-token",
 :ns "cljs.reader",
 :name "read-token",
 :type "function",
 :signature ["[rdr initch]"],
 :source {:code "(defn read-token\n  [rdr initch]\n  (loop [sb (gstring/StringBuffer. initch)\n         ch (read-char rdr)]\n    (if (or (nil? ch)\n            (whitespace? ch)\n            (macro-terminating? ch))\n      (do (unread rdr ch) (. sb (toString)))\n      (recur (do (.append sb ch) sb) (read-char rdr)))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [80 88],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/reader.cljs#L80-L88"},
 :full-name-encode "cljs.reader_read-token",
 :history [["+" "0.0-927"]]}

```
