## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/lazy-cat

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1803"><img valign="middle" alt="[+] 0.0-1803" src="https://img.shields.io/badge/+-0.0--1803-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/lazy-cat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/lazy-cat)
</td>
</tr>
</table>

 <samp>
(__lazy-cat__ & colls)<br>
</samp>

```
Expands to code which yields a lazy sequence of the concatenation
of the supplied colls.  Each coll expr is not evaluated until it is
needed. 

(lazy-cat xs ys zs) === (concat (lazy-seq xs) (lazy-seq ys) (lazy-seq zs))
```

---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1339-1346](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L1339-L1346)</ins>
</pre>

```clj
(defmacro lazy-cat
  [& colls]
  `(concat ~@(map #(list `lazy-seq %) colls)))
```


---

```clj
{:ns "cljs.core",
 :name "lazy-cat",
 :signature ["[& colls]"],
 :history [["+" "0.0-1803"]],
 :type "macro",
 :full-name-encode "cljs.core_lazy-cat",
 :source {:code "(defmacro lazy-cat\n  [& colls]\n  `(concat ~@(map #(list `lazy-seq %) colls)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1339 1346],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L1339-L1346"},
 :full-name "cljs.core/lazy-cat",
 :clj-symbol "clojure.core/lazy-cat",
 :docstring "Expands to code which yields a lazy sequence of the concatenation\nof the supplied colls.  Each coll expr is not evaluated until it is\nneeded. \n\n(lazy-cat xs ys zs) === (concat (lazy-seq xs) (lazy-seq ys) (lazy-seq zs))"}

```
