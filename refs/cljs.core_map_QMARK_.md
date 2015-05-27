## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/map?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/map?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/map?)
</td>
</tr>
</table>

 <samp>
(__map?__ x)<br>
</samp>

```
Return true if x satisfies IMap
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:936-941](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L936-L941)</ins>
</pre>

```clj
(defn ^boolean map?
  [x]
  (if (nil? x)
    false
    (satisfies? IMap x)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "map?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_map_QMARK_",
 :source {:code "(defn ^boolean map?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? IMap x)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [936 941],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L936-L941"},
 :full-name "cljs.core/map?",
 :clj-symbol "clojure.core/map?",
 :docstring "Return true if x satisfies IMap"}

```
