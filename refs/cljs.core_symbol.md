## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/symbol

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol)
</td>
</tr>
</table>

 <samp>
(__symbol__ name)<br>
(__symbol__ ns name)<br>
</samp>

```
Returns a Symbol with the given namespace and name.
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1482-1489](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L1482-L1489)</ins>
</pre>

```clj
(defn symbol
  ([name]
     (cond
      (symbol? name) name
      (keyword? name) (str* "\uFDD1" "'" (subs name 2))
      :else (str* "\uFDD1" "'" name)))
  ([ns name] (symbol (str* ns "/" name))))
```


---

```clj
{:ns "cljs.core",
 :name "symbol",
 :signature ["[name]" "[ns name]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_symbol",
 :source {:code "(defn symbol\n  ([name]\n     (cond\n      (symbol? name) name\n      (keyword? name) (str* \"\\uFDD1\" \"'\" (subs name 2))\n      :else (str* \"\\uFDD1\" \"'\" name)))\n  ([ns name] (symbol (str* ns \"/\" name))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1482 1489],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L1482-L1489"},
 :full-name "cljs.core/symbol",
 :clj-symbol "clojure.core/symbol",
 :docstring "Returns a Symbol with the given namespace and name."}

```
