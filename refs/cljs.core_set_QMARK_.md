## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/set?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set?)
</td>
</tr>
</table>

 <samp>
(__set?__ x)<br>
</samp>

```
Returns true if x satisfies ISet
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:876-881](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L876-L881)</ins>
</pre>

```clj
(defn ^boolean set?
  [x]
  (if (nil? x)
    false
    (satisfies? ISet x)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "set?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_set_QMARK_",
 :source {:code "(defn ^boolean set?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? ISet x)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [876 881],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L876-L881"},
 :full-name "cljs.core/set?",
 :clj-symbol "clojure.core/set?",
 :docstring "Returns true if x satisfies ISet"}

```
