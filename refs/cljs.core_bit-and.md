## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-and

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-and</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-and)
</td>
</tr>
</table>

 <samp>
(__bit-and__ x y)<br>
</samp>

```
Bitwise and
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1344-1346](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1344-L1346)</ins>
</pre>

```clj
(defn bit-and
  [x y] (cljs.core/bit-and x y))
```


---

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:299-301](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L299-L301)</ins>
</pre>

```clj
(defmacro bit-and
  ([x y] (list 'js* "(~{} & ~{})" x y))
  ([x y & more] `(bit-and (bit-and ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "bit-and",
 :signature ["[x y]"],
 :shadowed-sources ({:code "(defmacro bit-and\n  ([x y] (list 'js* \"(~{} & ~{})\" x y))\n  ([x y & more] `(bit-and (bit-and ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [299 301],
                     :link "https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L299-L301"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-and",
 :source {:code "(defn bit-and\n  [x y] (cljs.core/bit-and x y))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1344 1346],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1344-L1346"},
 :full-name "cljs.core/bit-and",
 :clj-symbol "clojure.core/bit-and",
 :docstring "Bitwise and"}

```
