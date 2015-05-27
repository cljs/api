## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/escape-char

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__escape-char__ buffer reader)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:201-222](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L201-L222)</ins>
</pre>

```clj
(defn escape-char
  [buffer reader]
  (let [ch (read-char reader)
        mapresult (escape-char-map ch)]
    (if mapresult
      mapresult
      (cond
        (identical? ch \x)
        (->> (read-2-chars reader)
          (validate-unicode-escape unicode-2-pattern reader ch)
          (make-unicode-char))

        (identical? ch \u)
        (->> (read-4-chars reader)
          (validate-unicode-escape unicode-4-pattern reader ch)
          (make-unicode-char))

        (numeric? ch)
        (.fromCharCode js/String ch)

        :else
        (reader-error reader "Unexpected unicode escape \\" ch )))))
```


---

```clj
{:full-name "cljs.reader/escape-char",
 :ns "cljs.reader",
 :name "escape-char",
 :type "function",
 :signature ["[buffer reader]"],
 :source {:code "(defn escape-char\n  [buffer reader]\n  (let [ch (read-char reader)\n        mapresult (escape-char-map ch)]\n    (if mapresult\n      mapresult\n      (cond\n        (identical? ch \\x)\n        (->> (read-2-chars reader)\n          (validate-unicode-escape unicode-2-pattern reader ch)\n          (make-unicode-char))\n\n        (identical? ch \\u)\n        (->> (read-4-chars reader)\n          (validate-unicode-escape unicode-4-pattern reader ch)\n          (make-unicode-char))\n\n        (numeric? ch)\n        (.fromCharCode js/String ch)\n\n        :else\n        (reader-error reader \"Unexpected unicode escape \\\\\" ch )))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [201 222],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L201-L222"},
 :full-name-encode "cljs.reader_escape-char",
 :history [["+" "0.0-927"]]}

```
