## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/remove-all-methods

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-all-methods</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-all-methods)
</td>
</tr>
</table>

 <samp>
(__remove-all-methods__ multifn)<br>
</samp>

```
Removes all of the methods of multimethod.
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6374-6377](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L6374-L6377)</ins>
</pre>

```clj
(defn remove-all-methods
 [multifn]
 (-reset multifn))
```


---

```clj
{:ns "cljs.core",
 :name "remove-all-methods",
 :signature ["[multifn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_remove-all-methods",
 :source {:code "(defn remove-all-methods\n [multifn]\n (-reset multifn))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6374 6377],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L6374-L6377"},
 :full-name "cljs.core/remove-all-methods",
 :clj-symbol "clojure.core/remove-all-methods",
 :docstring "Removes all of the methods of multimethod."}

```
