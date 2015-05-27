## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/compare-and-set!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/compare-and-set!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/compare-and-set!)
</td>
</tr>
</table>

 <samp>
(__compare-and-set!__ a oldval newval)<br>
</samp>

```
Atomically sets the value of atom to newval if and only if the
current value of the atom is identical to oldval. Returns true if
set happened, else false.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6462-6469](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L6462-L6469)</ins>
</pre>

```clj
(defn compare-and-set!
  [a oldval newval]
  (if (= (.-state a) oldval)
    (do (reset! a newval) true)
    false))
```


---

```clj
{:ns "cljs.core",
 :name "compare-and-set!",
 :signature ["[a oldval newval]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_compare-and-set_BANG_",
 :source {:code "(defn compare-and-set!\n  [a oldval newval]\n  (if (= (.-state a) oldval)\n    (do (reset! a newval) true)\n    false))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6462 6469],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L6462-L6469"},
 :full-name "cljs.core/compare-and-set!",
 :clj-symbol "clojure.core/compare-and-set!",
 :docstring "Atomically sets the value of atom to newval if and only if the\ncurrent value of the atom is identical to oldval. Returns true if\nset happened, else false."}

```
