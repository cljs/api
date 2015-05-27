## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/simple-benchmark

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__simple-benchmark__ bindings expr iterations & {:keys [print-fn], :or {print-fn (quote println)}})<br>
</samp>

```
Runs expr iterations times in the context of a let expression with
the given bindings, then prints out the bindings and the expr
followed by number of iterations and total time. The optional
argument print-fn, defaulting to println, sets function used to
print the result. expr's string representation will be produced
using pr-str in any case.
```

---

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1115-1131](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L1115-L1131)</ins>
</pre>

```clj
(defmacro simple-benchmark
  [bindings expr iterations & {:keys [print-fn] :or {print-fn 'println}}]
  (let [bs-str   (pr-str bindings)
        expr-str (pr-str expr)]
    `(let ~bindings
       (let [start#   (.getTime (js/Date.))
             ret#     (dotimes [_# ~iterations] ~expr)
             end#     (.getTime (js/Date.))
             elapsed# (- end# start#)]
         (~print-fn (str ~bs-str ", " ~expr-str ", "
                         ~iterations " runs, " elapsed# " msecs"))))))
```


---

```clj
{:full-name "cljs.core/simple-benchmark",
 :ns "cljs.core",
 :name "simple-benchmark",
 :docstring "Runs expr iterations times in the context of a let expression with\nthe given bindings, then prints out the bindings and the expr\nfollowed by number of iterations and total time. The optional\nargument print-fn, defaulting to println, sets function used to\nprint the result. expr's string representation will be produced\nusing pr-str in any case.",
 :type "macro",
 :signature ["[bindings expr iterations & {:keys [print-fn], :or {print-fn (quote println)}}]"],
 :source {:code "(defmacro simple-benchmark\n  [bindings expr iterations & {:keys [print-fn] :or {print-fn 'println}}]\n  (let [bs-str   (pr-str bindings)\n        expr-str (pr-str expr)]\n    `(let ~bindings\n       (let [start#   (.getTime (js/Date.))\n             ret#     (dotimes [_# ~iterations] ~expr)\n             end#     (.getTime (js/Date.))\n             elapsed# (- end# start#)]\n         (~print-fn (str ~bs-str \", \" ~expr-str \", \"\n                         ~iterations \" runs, \" elapsed# \" msecs\"))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1115 1131],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L1115-L1131"},
 :full-name-encode "cljs.core_simple-benchmark",
 :history [["+" "0.0-1236"]]}

```
