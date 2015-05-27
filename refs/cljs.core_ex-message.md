## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ex-message

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ex-message__ ex)<br>
</samp>

```
Alpha - subject to change.
Returns the message attached to the given Error / ExceptionInfo object.
For non-Errors returns nil.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7432-7438](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L7432-L7438)</ins>
</pre>

```clj
(defn ex-message
  [ex]
  (when (instance? js/Error ex)
    (.-message ex)))
```


---

```clj
{:full-name "cljs.core/ex-message",
 :ns "cljs.core",
 :name "ex-message",
 :docstring "Alpha - subject to change.\nReturns the message attached to the given Error / ExceptionInfo object.\nFor non-Errors returns nil.",
 :type "function",
 :signature ["[ex]"],
 :source {:code "(defn ex-message\n  [ex]\n  (when (instance? js/Error ex)\n    (.-message ex)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7432 7438],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L7432-L7438"},
 :full-name-encode "cljs.core_ex-message",
 :history [["+" "0.0-1576"]]}

```
