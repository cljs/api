## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/desugar-meta

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__desugar-meta__ f)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:343-349](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L343-L349)</ins>
</pre>

```clj
(defn desugar-meta
  [f]
  (cond
   (symbol? f) {:tag f}
   (string? f) {:tag f}
   (keyword? f) {f true}
   :else f))
```


---

```clj
{:full-name "cljs.reader/desugar-meta",
 :ns "cljs.reader",
 :name "desugar-meta",
 :type "function",
 :signature ["[f]"],
 :source {:code "(defn desugar-meta\n  [f]\n  (cond\n   (symbol? f) {:tag f}\n   (string? f) {:tag f}\n   (keyword? f) {f true}\n   :else f))",
          :filename "clojurescript/src/cljs/cljs/reader.cljs",
          :lines [343 349],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/reader.cljs#L343-L349"},
 :full-name-encode "cljs.reader_desugar-meta",
 :history [["+" "0.0-927"]]}

```
