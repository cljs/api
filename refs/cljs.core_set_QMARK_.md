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
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:595-600](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L595-L600)</ins>
</pre>

```clj
(defn set?
  [x]
  (if (nil? x)
    false
    (satisfies? ISet x)))
```


---

```clj
{:ns "cljs.core",
 :name "set?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_set_QMARK_",
 :source {:code "(defn set?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? ISet x)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [595 600],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L595-L600"},
 :full-name "cljs.core/set?",
 :clj-symbol "clojure.core/set?",
 :docstring "Returns true if x satisfies ISet"}

```
