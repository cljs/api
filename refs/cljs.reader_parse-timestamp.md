## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/parse-timestamp

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__parse-timestamp__ ts)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:497-504](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L497-L504)</ins>
</pre>

```clj
(defn parse-timestamp
  [ts]
  (if-let [[years months days hours minutes seconds ms offset]
           (parse-and-validate-timestamp ts)]
    (js/Date.
     (- (.UTC js/Date years (dec months) days hours minutes seconds ms)
        (* offset 60 1000)))
    (reader-error nil (str "Unrecognized date/time syntax: " ts))))
```


---

```clj
{:full-name "cljs.reader/parse-timestamp",
 :ns "cljs.reader",
 :name "parse-timestamp",
 :type "function",
 :signature ["[ts]"],
 :source {:code "(defn parse-timestamp\n  [ts]\n  (if-let [[years months days hours minutes seconds ms offset]\n           (parse-and-validate-timestamp ts)]\n    (js/Date.\n     (- (.UTC js/Date years (dec months) days hours minutes seconds ms)\n        (* offset 60 1000)))\n    (reader-error nil (str \"Unrecognized date/time syntax: \" ts))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [497 504],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L497-L504"},
 :full-name-encode "cljs.reader_parse-timestamp",
 :history [["+" "0.0-1424"]]}

```
