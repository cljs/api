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
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:670-672](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L670-L672)</ins>
</pre>

```clj
(defn keyword? [x]
  (and (goog/isString x)
       (= (.charAt x 0) \uFDD0)))
```


---

```clj
{:full-name "cljs.core/keyword?",
 :ns "cljs.core",
 :name "keyword?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn keyword? [x]\n  (and (goog/isString x)\n       (= (.charAt x 0) \\uFDD0)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [670 672],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L670-L672"},
 :full-name-encode "cljs.core_keyword_QMARK_",
 :clj-symbol "clojure.core/keyword?",
 :history [["+" "0.0-927"]]}

```
