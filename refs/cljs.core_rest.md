## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rest

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rest</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rest)
</td>
</tr>
</table>

 <samp>
(__rest__ coll)<br>
</samp>

```
Returns a possibly empty seq of the items after the first. Calls seq on its
argument.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:419-423](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L419-L423)</ins>
</pre>

```clj
(defn rest
  [coll]
  (-rest (seq coll)))
```


---

```clj
{:ns "cljs.core",
 :name "rest",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_rest",
 :source {:code "(defn rest\n  [coll]\n  (-rest (seq coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [419 423],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L419-L423"},
 :full-name "cljs.core/rest",
 :clj-symbol "clojure.core/rest",
 :docstring "Returns a possibly empty seq of the items after the first. Calls seq on its\nargument."}

```
