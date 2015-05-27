## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/printf

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/printf</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/printf)
</td>
</tr>
</table>

 <samp>
(__printf__ fmt & args)<br>
</samp>

```
Prints formatted output, as per format
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6418-6421](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6418-L6421)</ins>
</pre>

```clj
(defn printf
  [fmt & args]
  (print (apply format fmt args)))
```


---

```clj
{:ns "cljs.core",
 :name "printf",
 :signature ["[fmt & args]"],
 :history [["+" "0.0-1443"]],
 :type "function",
 :full-name-encode "cljs.core_printf",
 :source {:code "(defn printf\n  [fmt & args]\n  (print (apply format fmt args)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6418 6421],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6418-L6421"},
 :full-name "cljs.core/printf",
 :clj-symbol "clojure.core/printf",
 :docstring "Prints formatted output, as per format"}

```
