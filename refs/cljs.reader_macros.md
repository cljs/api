## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/macros

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__macros__ c)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:384-403](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/reader.cljs#L384-L403)</ins>
</pre>

```clj
(defn macros [c]
  (cond
   (identical? c \") read-string*
   (identical? c \:) read-keyword
   (identical? c \;) not-implemented ;; never hit this
   (identical? c \') (wrapping-reader 'quote)
   (identical? c \@) (wrapping-reader 'deref)
   (identical? c \^) read-meta
   (identical? c \`) not-implemented
   (identical? c \~) not-implemented
   (identical? c \() read-list
   (identical? c \)) read-unmatched-delimiter
   (identical? c \[) read-vector
   (identical? c \]) read-unmatched-delimiter
   (identical? c \{) read-map
   (identical? c \}) read-unmatched-delimiter
   (identical? c \\) read-char
   (identical? c \%) not-implemented
   (identical? c \#) read-dispatch
   :else nil))
```


---

```clj
{:full-name "cljs.reader/macros",
 :ns "cljs.reader",
 :name "macros",
 :type "function",
 :signature ["[c]"],
 :source {:code "(defn macros [c]\n  (cond\n   (identical? c \\\") read-string*\n   (identical? c \\:) read-keyword\n   (identical? c \\;) not-implemented ;; never hit this\n   (identical? c \\') (wrapping-reader 'quote)\n   (identical? c \\@) (wrapping-reader 'deref)\n   (identical? c \\^) read-meta\n   (identical? c \\`) not-implemented\n   (identical? c \\~) not-implemented\n   (identical? c \\() read-list\n   (identical? c \\)) read-unmatched-delimiter\n   (identical? c \\[) read-vector\n   (identical? c \\]) read-unmatched-delimiter\n   (identical? c \\{) read-map\n   (identical? c \\}) read-unmatched-delimiter\n   (identical? c \\\\) read-char\n   (identical? c \\%) not-implemented\n   (identical? c \\#) read-dispatch\n   :else nil))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [384 403],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/reader.cljs#L384-L403"},
 :full-name-encode "cljs.reader_macros",
 :history [["+" "0.0-927"]]}

```
