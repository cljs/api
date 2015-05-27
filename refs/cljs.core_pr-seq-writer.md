## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-seq-writer

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-seq-writer__ objs writer opts)<br>
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
            └── <ins>[core.cljs:6328-6332](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L6328-L6332)</ins>
</pre>

```clj
(defn pr-seq-writer [objs writer opts]
  (pr-writer (first objs) writer opts)
  (doseq [obj (next objs)]
    (-write writer " ")
    (pr-writer obj writer opts)))
```


---

```clj
{:full-name "cljs.core/pr-seq-writer",
 :ns "cljs.core",
 :name "pr-seq-writer",
 :type "function",
 :signature ["[objs writer opts]"],
 :source {:code "(defn pr-seq-writer [objs writer opts]\n  (pr-writer (first objs) writer opts)\n  (doseq [obj (next objs)]\n    (-write writer \" \")\n    (pr-writer obj writer opts)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6328 6332],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L6328-L6332"},
 :full-name-encode "cljs.core_pr-seq-writer",
 :history [["+" "0.0-1503"]]}

```
