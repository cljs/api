## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ex-data

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ex-data</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ex-data)
</td>
</tr>
</table>

 <samp>
(__ex-data__ ex)<br>
</samp>

```
Alpha - subject to change.
Returns exception data (a map) if ex is an ExceptionInfo.
Otherwise returns nil.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7150-7156](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L7150-L7156)</ins>
</pre>

```clj
(defn ex-data
  [ex]
  (when (instance? ExceptionInfo ex)
    (.-data ex)))
```


---

```clj
{:ns "cljs.core",
 :name "ex-data",
 :signature ["[ex]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core_ex-data",
 :source {:code "(defn ex-data\n  [ex]\n  (when (instance? ExceptionInfo ex)\n    (.-data ex)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7150 7156],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L7150-L7156"},
 :full-name "cljs.core/ex-data",
 :clj-symbol "clojure.core/ex-data",
 :docstring "Alpha - subject to change.\nReturns exception data (a map) if ex is an ExceptionInfo.\nOtherwise returns nil."}

```
