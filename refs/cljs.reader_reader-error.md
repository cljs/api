## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/reader-error

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__reader-error__ rdr & msg)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:69-71](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/reader.cljs#L69-L71)</ins>
</pre>

```clj
(defn reader-error
  [rdr & msg]
  (throw (apply str msg)))
```


---

```clj
{:full-name "cljs.reader/reader-error",
 :ns "cljs.reader",
 :name "reader-error",
 :type "function",
 :signature ["[rdr & msg]"],
 :source {:code "(defn reader-error\n  [rdr & msg]\n  (throw (apply str msg)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [69 71],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/reader.cljs#L69-L71"},
 :full-name-encode "cljs.reader_reader-error",
 :history [["+" "0.0-927"]]}

```
