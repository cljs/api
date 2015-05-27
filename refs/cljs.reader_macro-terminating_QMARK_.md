## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/macro-terminating?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__macro-terminating?__ ch)<br>
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
            └── <ins>[reader.cljs:74-78](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L74-L78)</ins>
</pre>

```clj
(defn ^boolean macro-terminating? [ch]
  (and (not (identical? ch "#"))
       (not (identical? ch \'))
       (not (identical? ch ":"))
       (macros ch)))
```


---

```clj
{:full-name "cljs.reader/macro-terminating?",
 :ns "cljs.reader",
 :name "macro-terminating?",
 :type "function",
 :signature ["[ch]"],
 :return-type boolean,
 :source {:code "(defn ^boolean macro-terminating? [ch]\n  (and (not (identical? ch \"#\"))\n       (not (identical? ch \\'))\n       (not (identical? ch \":\"))\n       (macros ch)))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [74 78],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L74-L78"},
 :full-name-encode "cljs.reader_macro-terminating_QMARK_",
 :history [["+" "0.0-927"]]}

```
