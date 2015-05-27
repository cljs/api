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
(__cons__ x coll)<br>
</samp>

```
Returns a new seq where x is the first element and seq is the rest.
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1922-1928](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1922-L1928)</ins>
</pre>

```clj
(defn cons
  [x coll]
  (if (or (nil? coll)
          (satisfies? ISeq coll false))
    (Cons. nil x coll nil)
    (Cons. nil x (seq coll) nil)))
```


---

```clj
{:ns "cljs.core",
 :name "cons",
 :signature ["[x coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_cons",
 :source {:code "(defn cons\n  [x coll]\n  (if (or (nil? coll)\n          (satisfies? ISeq coll false))\n    (Cons. nil x coll nil)\n    (Cons. nil x (seq coll) nil)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1922 1928],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1922-L1928"},
 :full-name "cljs.core/cons",
 :clj-symbol "clojure.core/cons",
 :docstring "Returns a new seq where x is the first element and seq is the rest."}

```
