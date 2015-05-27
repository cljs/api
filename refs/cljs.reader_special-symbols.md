## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/special-symbols

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__special-symbols__ t not-found)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:312-317](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/reader.cljs#L312-L317)</ins>
</pre>

```clj
(defn special-symbols [t not-found]
  (cond
   (identical? t "nil") nil
   (identical? t "true") true
   (identical? t "false") false
   :else not-found))
```


---

```clj
{:full-name "cljs.reader/special-symbols",
 :ns "cljs.reader",
 :name "special-symbols",
 :type "function",
 :signature ["[t not-found]"],
 :source {:code "(defn special-symbols [t not-found]\n  (cond\n   (identical? t \"nil\") nil\n   (identical? t \"true\") true\n   (identical? t \"false\") false\n   :else not-found))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [312 317],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/reader.cljs#L312-L317"},
 :full-name-encode "cljs.reader_special-symbols",
 :history [["+" "0.0-927"]]}

```
