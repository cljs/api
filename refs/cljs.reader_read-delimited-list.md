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
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:233-246](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/reader.cljs#L233-L246)</ins>
</pre>

```clj
(defn read-delimited-list
  [delim rdr recursive?]
  (loop [a (transient [])]
    (let [ch (read-past whitespace? rdr)]
      (when-not ch (reader-error rdr "EOF while reading"))
      (if (identical? delim ch)
        (persistent! a)
        (if-let [macrofn (macros ch)]
          (let [mret (macrofn rdr ch)]
            (recur (if (identical? mret rdr) a (conj! a mret))))
          (do
            (unread rdr ch)
            (let [o (read rdr true nil recursive?)]
              (recur (if (identical? o rdr) a (conj! a o))))))))))
```


---

```clj
{:full-name "cljs.reader/read-delimited-list",
 :ns "cljs.reader",
 :name "read-delimited-list",
 :type "function",
 :signature ["[delim rdr recursive?]"],
 :source {:code "(defn read-delimited-list\n  [delim rdr recursive?]\n  (loop [a (transient [])]\n    (let [ch (read-past whitespace? rdr)]\n      (when-not ch (reader-error rdr \"EOF while reading\"))\n      (if (identical? delim ch)\n        (persistent! a)\n        (if-let [macrofn (macros ch)]\n          (let [mret (macrofn rdr ch)]\n            (recur (if (identical? mret rdr) a (conj! a mret))))\n          (do\n            (unread rdr ch)\n            (let [o (read rdr true nil recursive?)]\n              (recur (if (identical? o rdr) a (conj! a o))))))))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [233 246],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/reader.cljs#L233-L246"},
 :full-name-encode "cljs.reader_read-delimited-list",
 :history [["+" "0.0-927"]]}

```
