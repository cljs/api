## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cons

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cons</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cons)
</td>
</tr>
</table>

 <samp>
(__cons__ x seq)<br>
</samp>

```
Returns a new seq where x is the first element and seq is the rest.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1184-1187](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1184-L1187)</ins>
</pre>

```clj
(defn cons
  [x seq]
  (Cons. nil x seq))
```


---

```clj
{:ns "cljs.core",
 :name "cons",
 :signature ["[x seq]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_cons",
 :source {:code "(defn cons\n  [x seq]\n  (Cons. nil x seq))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1184 1187],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1184-L1187"},
 :full-name "cljs.core/cons",
 :clj-symbol "clojure.core/cons",
 :docstring "Returns a new seq where x is the first element and seq is the rest."}

```
