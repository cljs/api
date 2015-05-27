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
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:674-676](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L674-L676)</ins>
</pre>

```clj
(defn symbol? [x]
  (and (goog/isString x)
       (= (.charAt x 0) \uFDD1)))
```


---

```clj
{:full-name "cljs.core/symbol?",
 :ns "cljs.core",
 :name "symbol?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn symbol? [x]\n  (and (goog/isString x)\n       (= (.charAt x 0) \\uFDD1)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [674 676],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L674-L676"},
 :full-name-encode "cljs.core_symbol_QMARK_",
 :clj-symbol "clojure.core/symbol?",
 :history [["+" "0.0-927"]]}

```
