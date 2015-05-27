## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ex-info

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ex-info</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ex-info)
</td>
</tr>
</table>

 <samp>
(__ex-info__ msg map)<br>
(__ex-info__ msg map cause)<br>
</samp>

```
Alpha - subject to change.
Create an instance of ExceptionInfo, an Error type that carries a
map of additional data.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7415-7422](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L7415-L7422)</ins>
</pre>

```clj
(defn ex-info
  ([msg map]
     (ExceptionInfo. msg map nil))
  ([msg map cause]
     (ExceptionInfo. msg map cause)))
```


---

```clj
{:ns "cljs.core",
 :name "ex-info",
 :signature ["[msg map]" "[msg map cause]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core_ex-info",
 :source {:code "(defn ex-info\n  ([msg map]\n     (ExceptionInfo. msg map nil))\n  ([msg map cause]\n     (ExceptionInfo. msg map cause)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7415 7422],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L7415-L7422"},
 :full-name "cljs.core/ex-info",
 :clj-symbol "clojure.core/ex-info",
 :docstring "Alpha - subject to change.\nCreate an instance of ExceptionInfo, an Error type that carries a\nmap of additional data."}

```
