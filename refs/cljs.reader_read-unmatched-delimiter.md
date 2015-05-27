## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-unmatched-delimiter

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-unmatched-delimiter__ rdr ch)<br>
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
            └── <ins>[reader.cljs:268-270](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/reader.cljs#L268-L270)</ins>
</pre>

```clj
(defn read-unmatched-delimiter
  [rdr ch]
  (reader-error rdr "Unmached delimiter " ch))
```


---

```clj
{:full-name "cljs.reader/read-unmatched-delimiter",
 :ns "cljs.reader",
 :name "read-unmatched-delimiter",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn read-unmatched-delimiter\n  [rdr ch]\n  (reader-error rdr \"Unmached delimiter \" ch))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [268 270],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/reader.cljs#L268-L270"},
 :full-name-encode "cljs.reader_read-unmatched-delimiter",
 :history [["+" "0.0-927"]]}

```
