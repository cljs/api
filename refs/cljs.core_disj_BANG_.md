## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/disj!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/disj!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/disj!)
</td>
</tr>
</table>

 <samp>
(__disj!__ tcoll val)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2071-2072](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2071-L2072)</ins>
</pre>

```clj
(defn disj! [tcoll val]
  (-disjoin! tcoll val))
```


---

```clj
{:full-name "cljs.core/disj!",
 :ns "cljs.core",
 :name "disj!",
 :type "function",
 :signature ["[tcoll val]"],
 :source {:code "(defn disj! [tcoll val]\n  (-disjoin! tcoll val))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2071 2072],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2071-L2072"},
 :full-name-encode "cljs.core_disj_BANG_",
 :clj-symbol "clojure.core/disj!",
 :history [["+" "0.0-1211"]]}

```
