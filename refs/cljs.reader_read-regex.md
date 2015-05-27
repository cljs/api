## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-regex

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-regex__ rdr ch)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:301-303](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/reader.cljs#L301-L303)</ins>
</pre>

```clj
(defn read-regex
  [rdr ch]
  (-> (read-string rdr ch) re-pattern))
```


---

```clj
{:full-name "cljs.reader/read-regex",
 :ns "cljs.reader",
 :name "read-regex",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn read-regex\n  [rdr ch]\n  (-> (read-string rdr ch) re-pattern))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [301 303],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/reader.cljs#L301-L303"},
 :full-name-encode "cljs.reader_read-regex",
 :history [["+" "0.0-927"]]}

```
