## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vector?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vector?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vector?)
</td>
</tr>
</table>

 <samp>
(__vector?__ x)<br>
</samp>

```
Return true if x satisfies IVector
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:621-623](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L621-L623)</ins>
</pre>

```clj
(defn vector?
  [x] (satisfies? IVector x))
```


---

```clj
{:ns "cljs.core",
 :name "vector?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_vector_QMARK_",
 :source {:code "(defn vector?\n  [x] (satisfies? IVector x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [621 623],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L621-L623"},
 :full-name "cljs.core/vector?",
 :clj-symbol "clojure.core/vector?",
 :docstring "Return true if x satisfies IVector"}

```
