## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/remove-method

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-method</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-method)
</td>
</tr>
</table>

 <samp>
(__remove-method__ multifn dispatch-val)<br>
</samp>

```
Removes the method of multimethod associated with dispatch-value.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7196-7199](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L7196-L7199)</ins>
</pre>

```clj
(defn remove-method
 [multifn dispatch-val]
 (-remove-method multifn dispatch-val))
```


---

```clj
{:ns "cljs.core",
 :name "remove-method",
 :signature ["[multifn dispatch-val]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_remove-method",
 :source {:code "(defn remove-method\n [multifn dispatch-val]\n (-remove-method multifn dispatch-val))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7196 7199],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L7196-L7199"},
 :full-name "cljs.core/remove-method",
 :clj-symbol "clojure.core/remove-method",
 :docstring "Removes the method of multimethod associated with dispatch-value."}

```
