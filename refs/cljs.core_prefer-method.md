## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prefer-method

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prefer-method</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prefer-method)
</td>
</tr>
</table>

 <samp>
(__prefer-method__ multifn dispatch-val-x dispatch-val-y)<br>
</samp>

```
Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y
when there is a conflict
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3749-3753](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3749-L3753)</ins>
</pre>

```clj
(defn prefer-method
  [multifn dispatch-val-x dispatch-val-y]
  (-prefer-method multifn dispatch-val-x dispatch-val-y))
```


---

```clj
{:ns "cljs.core",
 :name "prefer-method",
 :signature ["[multifn dispatch-val-x dispatch-val-y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_prefer-method",
 :source {:code "(defn prefer-method\n  [multifn dispatch-val-x dispatch-val-y]\n  (-prefer-method multifn dispatch-val-x dispatch-val-y))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3749 3753],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3749-L3753"},
 :full-name "cljs.core/prefer-method",
 :clj-symbol "clojure.core/prefer-method",
 :docstring "Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y\nwhen there is a conflict"}

```
