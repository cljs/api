## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/not-implemented

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__not-implemented__ rdr ch)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:187-189](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/reader.cljs#L187-L189)</ins>
</pre>

```clj
(defn not-implemented
  [rdr ch]
  (reader-error rdr "Reader for " ch " not implemented yet"))
```


---

```clj
{:full-name "cljs.reader/not-implemented",
 :ns "cljs.reader",
 :name "not-implemented",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn not-implemented\n  [rdr ch]\n  (reader-error rdr \"Reader for \" ch \" not implemented yet\"))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [187 189],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/reader.cljs#L187-L189"},
 :full-name-encode "cljs.reader_not-implemented",
 :history [["+" "0.0-927"]]}

```
