## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/append!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/append!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/append!)
</td>
</tr>
</table>

 <samp>
(__append!__ acc x)<br>
</samp>

```
.adds x to acc and returns acc
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:225-228](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/core/reducers.cljs#L225-L228)</ins>
</pre>

```clj
(defn append!
  [acc x]
  (doto acc (.add x)))
```


---

```clj
{:ns "clojure.core.reducers",
 :name "append!",
 :signature ["[acc x]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_append_BANG_",
 :source {:code "(defn append!\n  [acc x]\n  (doto acc (.add x)))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [225 228],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/core/reducers.cljs#L225-L228"},
 :full-name "clojure.core.reducers/append!",
 :clj-symbol "clojure.core.reducers/append!",
 :docstring ".adds x to acc and returns acc"}

```
