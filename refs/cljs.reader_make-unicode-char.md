## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/make-unicode-char

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__make-unicode-char__ code-str)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:197-199](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/reader.cljs#L197-L199)</ins>
</pre>

```clj
(defn make-unicode-char [code-str]
    (let [code (js/parseInt code-str 16)]
      (.fromCharCode js/String code)))
```


---

```clj
{:full-name "cljs.reader/make-unicode-char",
 :ns "cljs.reader",
 :name "make-unicode-char",
 :type "function",
 :signature ["[code-str]"],
 :source {:code "(defn make-unicode-char [code-str]\n    (let [code (js/parseInt code-str 16)]\n      (.fromCharCode js/String code)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [197 199],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/reader.cljs#L197-L199"},
 :full-name-encode "cljs.reader_make-unicode-char",
 :history [["+" "0.0-1424"]]}

```
