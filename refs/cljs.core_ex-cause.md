## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ex-cause

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ex-cause__ ex)<br>
</samp>

```
Alpha - subject to change.
Returns exception cause (an Error / ExceptionInfo) if ex is an
ExceptionInfo.
Otherwise returns nil.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7344-7351](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L7344-L7351)</ins>
</pre>

```clj
(defn ex-cause
  [ex]
  (when (instance? ExceptionInfo ex)
    (.-cause ex)))
```


---

```clj
{:full-name "cljs.core/ex-cause",
 :ns "cljs.core",
 :name "ex-cause",
 :docstring "Alpha - subject to change.\nReturns exception cause (an Error / ExceptionInfo) if ex is an\nExceptionInfo.\nOtherwise returns nil.",
 :type "function",
 :signature ["[ex]"],
 :source {:code "(defn ex-cause\n  [ex]\n  (when (instance? ExceptionInfo ex)\n    (.-cause ex)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7344 7351],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L7344-L7351"},
 :full-name-encode "cljs.core_ex-cause",
 :history [["+" "0.0-1576"]]}

```
