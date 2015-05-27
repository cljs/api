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
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1005-1007](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1005-L1007)</ins>
</pre>

```clj
(defn neg?
  [x] (cljs.core/neg? x))
```


---

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:124-125](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L124-L125)</ins>
</pre>

```clj
(defmacro neg? [x]
  `(< ~x 0))
```

---

```clj
{:ns "cljs.core",
 :name "neg?",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro neg? [x]\n  `(< ~x 0))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [124 125],
                     :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L124-L125"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_neg_QMARK_",
 :source {:code "(defn neg?\n  [x] (cljs.core/neg? x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1005 1007],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1005-L1007"},
 :full-name "cljs.core/neg?",
 :clj-symbol "clojure.core/neg?",
 :docstring "Returns true if num is less than zero, else false"}

```
