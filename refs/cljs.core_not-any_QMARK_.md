## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not-any?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not-any?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not-any?)
</td>
</tr>
</table>

 <samp>
(__not-any?__ pred coll)<br>
</samp>

```
Returns false if (pred x) is logical true for any x in coll,
else true.
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1465-1468](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1465-L1468)</ins>
</pre>

```clj
(defn not-any?
  [pred coll] (not (some pred coll)))
```


---

```clj
{:ns "cljs.core",
 :name "not-any?",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_not-any_QMARK_",
 :source {:code "(defn not-any?\n  [pred coll] (not (some pred coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1465 1468],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1465-L1468"},
 :full-name "cljs.core/not-any?",
 :clj-symbol "clojure.core/not-any?",
 :docstring "Returns false if (pred x) is logical true for any x in coll,\nelse true."}

```
