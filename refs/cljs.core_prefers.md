## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prefers

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prefers</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prefers)
</td>
</tr>
</table>

 <samp>
(__prefers__ multifn)<br>
</samp>

```
Given a multimethod, returns a map of preferred value -> set of other values
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3503-3505](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L3503-L3505)</ins>
</pre>

```clj
(defn prefers
  [multifn] (-prefers multifn))
```


---

```clj
{:ns "cljs.core",
 :name "prefers",
 :signature ["[multifn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_prefers",
 :source {:code "(defn prefers\n  [multifn] (-prefers multifn))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3503 3505],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L3503-L3505"},
 :full-name "cljs.core/prefers",
 :clj-symbol "clojure.core/prefers",
 :docstring "Given a multimethod, returns a map of preferred value -> set of other values"}

```
