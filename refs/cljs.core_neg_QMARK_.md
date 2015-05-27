## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/neg?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/neg?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/neg?)
</td>
</tr>
</table>

 <samp>
(__neg?__ x)<br>
</samp>

```
Returns true if num is less than zero, else false
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1419-1421](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1419-L1421)</ins>
</pre>

```clj
(defn ^boolean neg?
  [x] (cljs.core/neg? x))
```


---

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:280-281](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L280-L281)</ins>
</pre>

```clj
(defmacro neg? [x]
  `(< ~x 0))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "neg?",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro neg? [x]\n  `(< ~x 0))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [280 281],
                     :link "https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L280-L281"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_neg_QMARK_",
 :source {:code "(defn ^boolean neg?\n  [x] (cljs.core/neg? x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1419 1421],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1419-L1421"},
 :full-name "cljs.core/neg?",
 :clj-symbol "clojure.core/neg?",
 :docstring "Returns true if num is less than zero, else false"}

```
