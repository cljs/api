## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keyword?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keyword?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keyword?)
</td>
</tr>
</table>

 <samp>
(__keyword?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1103-1105](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1103-L1105)</ins>
</pre>

```clj
(defn ^boolean keyword? [x]
  (and ^boolean (goog/isString x)
       (identical? (.charAt x 0) \uFDD0)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "keyword?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_keyword_QMARK_",
 :source {:code "(defn ^boolean keyword? [x]\n  (and ^boolean (goog/isString x)\n       (identical? (.charAt x 0) \\uFDD0)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1103 1105],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1103-L1105"},
 :full-name "cljs.core/keyword?",
 :clj-symbol "clojure.core/keyword?"}

```
