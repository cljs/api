## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/skip-line

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__skip-line__ reader _)<br>
</samp>

```
Advances the reader to the end of a line. Returns the reader
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:90-97](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/reader.cljs#L90-L97)</ins>
</pre>

```clj
(defn skip-line
  [reader _]
  (loop []
    (let [ch (read-char reader)]
      (if (or (identical? ch \n) (identical? ch \r) (nil? ch))
        reader
        (recur)))))
```


---

```clj
{:full-name "cljs.reader/skip-line",
 :ns "cljs.reader",
 :name "skip-line",
 :docstring "Advances the reader to the end of a line. Returns the reader",
 :type "function",
 :signature ["[reader _]"],
 :source {:code "(defn skip-line\n  [reader _]\n  (loop []\n    (let [ch (read-char reader)]\n      (if (or (identical? ch \\n) (identical? ch \\r) (nil? ch))\n        reader\n        (recur)))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [90 97],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/reader.cljs#L90-L97"},
 :full-name-encode "cljs.reader_skip-line",
 :history [["+" "0.0-927"]]}

```
