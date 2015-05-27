## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/symbol?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol?)
</td>
</tr>
</table>

 <samp>
(__symbol?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1042-1044](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1042-L1044)</ins>
</pre>

```clj
(defn ^boolean symbol? [x]
  (and ^boolean (goog/isString x)
       (identical? (.charAt x 0) \uFDD1)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "symbol?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_symbol_QMARK_",
 :source {:code "(defn ^boolean symbol? [x]\n  (and ^boolean (goog/isString x)\n       (identical? (.charAt x 0) \\uFDD1)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1042 1044],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1042-L1044"},
 :full-name "cljs.core/symbol?",
 :clj-symbol "clojure.core/symbol?"}

```
