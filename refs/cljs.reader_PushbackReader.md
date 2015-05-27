## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/PushbackReader

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:12-15](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/reader.cljs#L12-L15)</ins>
</pre>

```clj
(defprotocol PushbackReader
  (read-char [reader] "Returns the next char from the Reader,
nil if the end of stream has been reached")
  (unread [reader ch] "Push back a single character on to the stream"))
```


---

```clj
{:ns "cljs.reader",
 :name "PushbackReader",
 :type "protocol",
 :full-name-encode "cljs.reader_PushbackReader",
 :source {:code "(defprotocol PushbackReader\n  (read-char [reader] \"Returns the next char from the Reader,\nnil if the end of stream has been reached\")\n  (unread [reader ch] \"Push back a single character on to the stream\"))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [12 15],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/reader.cljs#L12-L15"},
 :methods [{:name "read-char",
            :signature ["[reader]"],
            :docstring "Returns the next char from the Reader,\nnil if the end of stream has been reached"}
           {:name "unread",
            :signature ["[reader ch]"],
            :docstring "Push back a single character on to the stream"}],
 :full-name "cljs.reader/PushbackReader",
 :history [["+" "0.0-927"]]}

```
