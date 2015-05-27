## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-past

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-past__ pred rdr)<br>
</samp>

```
Read until first character that doesn't match pred, returning
char.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:159-166](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/reader.cljs#L159-L166)</ins>
</pre>

```clj
(defn read-past
  [pred rdr]
  (loop [ch (read-char rdr)]
    (if (pred ch)
      (recur (read-char rdr))
      ch)))
```


---

```clj
{:full-name "cljs.reader/read-past",
 :ns "cljs.reader",
 :name "read-past",
 :docstring "Read until first character that doesn't match pred, returning\nchar.",
 :type "function",
 :signature ["[pred rdr]"],
 :source {:code "(defn read-past\n  [pred rdr]\n  (loop [ch (read-char rdr)]\n    (if (pred ch)\n      (recur (read-char rdr))\n      ch)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [159 166],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/reader.cljs#L159-L166"},
 :full-name-encode "cljs.reader_read-past",
 :history [["+" "0.0-927"]]}

```
