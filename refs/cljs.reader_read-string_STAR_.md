## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-string\*

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-string\*__ reader _)<br>
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
            └── <ins>[reader.cljs:301-310](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L301-L310)</ins>
</pre>

```clj
(defn read-string*
  [reader _]
  (loop [buffer (gstring/StringBuffer.)
         ch (read-char reader)]
    (cond
     (nil? ch) (reader-error reader "EOF while reading")
     (identical? "\\" ch) (recur (do (.append buffer (escape-char buffer reader)) buffer)
                        (read-char reader))
     (identical? \" ch) (. buffer (toString))
     :default (recur (do (.append buffer ch) buffer) (read-char reader)))))
```


---

```clj
{:full-name "cljs.reader/read-string*",
 :ns "cljs.reader",
 :name "read-string*",
 :type "function",
 :signature ["[reader _]"],
 :source {:code "(defn read-string*\n  [reader _]\n  (loop [buffer (gstring/StringBuffer.)\n         ch (read-char reader)]\n    (cond\n     (nil? ch) (reader-error reader \"EOF while reading\")\n     (identical? \"\\\\\" ch) (recur (do (.append buffer (escape-char buffer reader)) buffer)\n                        (read-char reader))\n     (identical? \\\" ch) (. buffer (toString))\n     :default (recur (do (.append buffer ch) buffer) (read-char reader)))))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [301 310],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/reader.cljs#L301-L310"},
 :full-name-encode "cljs.reader_read-string_STAR_",
 :history [["+" "0.0-1236"]]}

```
