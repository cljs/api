## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-delimited-list

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-delimited-list__ delim rdr recursive?)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:168-181](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/reader.cljs#L168-L181)</ins>
</pre>

```clj
(defn read-delimited-list
  [delim rdr recursive?]
  (loop [a []]
    (let [ch (read-past whitespace? rdr)]
      (when-not ch (reader-error rdr "EOF"))
      (if (= delim ch)
        a
        (if-let [macrofn (get macros ch)]
          (let [mret (macrofn rdr ch)]
            (recur (if (= mret rdr) a (conj a mret))))
          (do
            (unread rdr ch)
            (let [o (read rdr true nil recursive?)]
              (recur (if (= o rdr) a (conj a o))))))))))
```


---

```clj
{:full-name "cljs.reader/read-delimited-list",
 :ns "cljs.reader",
 :name "read-delimited-list",
 :type "function",
 :signature ["[delim rdr recursive?]"],
 :source {:code "(defn read-delimited-list\n  [delim rdr recursive?]\n  (loop [a []]\n    (let [ch (read-past whitespace? rdr)]\n      (when-not ch (reader-error rdr \"EOF\"))\n      (if (= delim ch)\n        a\n        (if-let [macrofn (get macros ch)]\n          (let [mret (macrofn rdr ch)]\n            (recur (if (= mret rdr) a (conj a mret))))\n          (do\n            (unread rdr ch)\n            (let [o (read rdr true nil recursive?)]\n              (recur (if (= o rdr) a (conj a o))))))))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [168 181],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/reader.cljs#L168-L181"},
 :full-name-encode "cljs.reader_read-delimited-list",
 :history [["+" "0.0-927"]]}

```
