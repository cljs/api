## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/push-back-reader

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__push-back-reader__ s)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:30-32](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/reader.cljs#L30-L32)</ins>
</pre>

```clj
(defn push-back-reader [s]
  "Creates a StringPushbackReader from a given string"
  (StringPushbackReader. s (atom 0) (atom nil)))
```


---

```clj
{:full-name "cljs.reader/push-back-reader",
 :ns "cljs.reader",
 :name "push-back-reader",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn push-back-reader [s]\n  \"Creates a StringPushbackReader from a given string\"\n  (StringPushbackReader. s (atom 0) (atom nil)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [30 32],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/reader.cljs#L30-L32"},
 :full-name-encode "cljs.reader_push-back-reader",
 :history [["+" "0.0-927"]]}

```
