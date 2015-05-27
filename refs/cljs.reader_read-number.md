## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-number

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-number__ reader initch)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:289-299](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L289-L299)</ins>
</pre>

```clj
(defn read-number
  [reader initch]
  (loop [buffer (gstring/StringBuffer. initch)
         ch (read-char reader)]
    (if (or (nil? ch) (whitespace? ch) (macros ch))
      (do
        (unread reader ch)
        (let [s (. buffer (toString))]
          (or (match-number s)
              (reader-error reader "Invalid number format [" s "]"))))
      (recur (do (.append buffer ch) buffer) (read-char reader)))))
```


---

```clj
{:full-name "cljs.reader/read-number",
 :ns "cljs.reader",
 :name "read-number",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-number\n  [reader initch]\n  (loop [buffer (gstring/StringBuffer. initch)\n         ch (read-char reader)]\n    (if (or (nil? ch) (whitespace? ch) (macros ch))\n      (do\n        (unread reader ch)\n        (let [s (. buffer (toString))]\n          (or (match-number s)\n              (reader-error reader \"Invalid number format [\" s \"]\"))))\n      (recur (do (.append buffer ch) buffer) (read-char reader)))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [289 299],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L289-L299"},
 :full-name-encode "cljs.reader_read-number",
 :history [["+" "0.0-927"]]}

```
