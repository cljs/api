## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/coll?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/coll?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/coll?)
</td>
</tr>
</table>

 <samp>
(__coll?__ x)<br>
</samp>

```
Returns true if x satisfies ICollection
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:588-593](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L588-L593)</ins>
</pre>

```clj
(defn coll?
  [x]
  (if (nil? x)
    false
    (satisfies? ICollection x)))
```


---

```clj
{:ns "cljs.core",
 :name "coll?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_coll_QMARK_",
 :source {:code "(defn coll?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? ICollection x)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [588 593],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L588-L593"},
 :full-name "cljs.core/coll?",
 :clj-symbol "clojure.core/coll?",
 :docstring "Returns true if x satisfies ICollection"}

```
