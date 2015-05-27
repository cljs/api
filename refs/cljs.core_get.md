## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/get

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get)
</td>
</tr>
</table>

 <samp>
(__get__ o k)<br>
(__get__ o k not-found)<br>
</samp>

```
Returns the value mapped to key, not-found or nil if key not present.
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:810-815](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L810-L815)</ins>
</pre>

```clj
(defn get
  ([o k]
     (-lookup o k))
  ([o k not-found]
     (-lookup o k not-found)))
```


---

 <pre>
clojurescript @ r1503
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:358-362](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/core.clj#L358-L362)</ins>
</pre>

```clj
(defmacro get
  ([coll k]
     `(-lookup ~coll ~k nil))
  ([coll k not-found]
     `(-lookup ~coll ~k ~not-found)))
```

---

```clj
{:ns "cljs.core",
 :name "get",
 :signature ["[o k]" "[o k not-found]"],
 :shadowed-sources ({:code "(defmacro get\n  ([coll k]\n     `(-lookup ~coll ~k nil))\n  ([coll k not-found]\n     `(-lookup ~coll ~k ~not-found)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [358 362],
                     :link "https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/core.clj#L358-L362"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_get",
 :source {:code "(defn get\n  ([o k]\n     (-lookup o k))\n  ([o k not-found]\n     (-lookup o k not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [810 815],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L810-L815"},
 :full-name "cljs.core/get",
 :clj-symbol "clojure.core/get",
 :docstring "Returns the value mapped to key, not-found or nil if key not present."}

```
