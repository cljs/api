## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/set-print-fn!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-print-fn!__ f)<br>
</samp>

```
Set *print-fn* to f.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:26-28](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L26-L28)</ins>
</pre>

```clj
(defn ^:export set-print-fn!
  [f] (set! *print-fn* f))
```


---

```clj
{:full-name "cljs.core/set-print-fn!",
 :ns "cljs.core",
 :name "set-print-fn!",
 :docstring "Set *print-fn* to f.",
 :type "function",
 :signature ["[f]"],
 :source {:code "(defn ^:export set-print-fn!\n  [f] (set! *print-fn* f))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [26 28],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L26-L28"},
 :full-name-encode "cljs.core_set-print-fn_BANG_",
 :history [["+" "0.0-1798"]]}

```
