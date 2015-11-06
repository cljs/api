## cljs.core/simple-benchmark



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__simple-benchmark__ bindings expr iterations & {:keys \[print-fn\], :or {print-fn (quote println)}})<br>
</samp>

---





Source docstring:

```
Runs expr iterations times in the context of a let expression with
the given bindings, then prints out the bindings and the expr
followed by number of iterations and total time. The optional
argument print-fn, defaulting to println, sets function used to
print the result. expr's string representation will be produced
using pr-str in any case.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/core.clj#L1931-L1947):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:1931-1947](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/core.clj#L1931-L1947)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/simple-benchmark` @ crossclj](http://crossclj.info/fun/cljs.core/simple-benchmark.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/simple-benchmark.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "simple-benchmark",
 :signature ["[bindings expr iterations & {:keys [print-fn], :or {print-fn (quote println)}}]"],
 :history [["+" "0.0-1236"]],
 :type "macro",
 :full-name-encode "cljs.core/simple-benchmark",
 :source {:code "(defmacro simple-benchmark\n  [bindings expr iterations & {:keys [print-fn] :or {print-fn 'println}}]\n  (let [bs-str   (pr-str bindings)\n        expr-str (pr-str expr)]\n    `(let ~bindings\n       (let [start#   (.getTime (js/Date.))\n             ret#     (dotimes [_# ~iterations] ~expr)\n             end#     (.getTime (js/Date.))\n             elapsed# (- end# start#)]\n         (~print-fn (str ~bs-str \", \" ~expr-str \", \"\n                         ~iterations \" runs, \" elapsed# \" msecs\"))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/clojure/cljs/core.clj",
          :lines [1931 1947]},
 :full-name "cljs.core/simple-benchmark",
 :docstring "Runs expr iterations times in the context of a let expression with\nthe given bindings, then prints out the bindings and the expr\nfollowed by number of iterations and total time. The optional\nargument print-fn, defaulting to println, sets function used to\nprint the result. expr's string representation will be produced\nusing pr-str in any case."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/simple-benchmark"]))
```

-->
