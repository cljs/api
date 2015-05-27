## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/validate-unicode-escape

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__validate-unicode-escape__ unicode-pattern reader escape-char unicode-str)<br>
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
            └── <ins>[reader.cljs:192-195](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L192-L195)</ins>
</pre>

```clj
(defn validate-unicode-escape [unicode-pattern reader escape-char unicode-str]
  (if (re-matches unicode-pattern unicode-str)
    unicode-str
    (reader-error reader "Unexpected unicode escape \\" escape-char unicode-str)))
```


---

```clj
{:full-name "cljs.reader/validate-unicode-escape",
 :ns "cljs.reader",
 :name "validate-unicode-escape",
 :type "function",
 :signature ["[unicode-pattern reader escape-char unicode-str]"],
 :source {:code "(defn validate-unicode-escape [unicode-pattern reader escape-char unicode-str]\n  (if (re-matches unicode-pattern unicode-str)\n    unicode-str\n    (reader-error reader \"Unexpected unicode escape \\\\\" escape-char unicode-str)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [192 195],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L192-L195"},
 :full-name-encode "cljs.reader_validate-unicode-escape",
 :history [["+" "0.0-1424"]]}

```
