## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/false?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/false?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/false?)
</td>
</tr>
</table>

 <samp>
(__false?__ x)<br>
</samp>

```
Returns true if x is the value false, false otherwise.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:644-646](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L644-L646)</ins>
</pre>

```clj
(defn false?
  [x] (cljs.core/false? x))
```


---

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:48-49](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L48-L49)</ins>
</pre>

```clj
(defmacro false? [x]
  (list 'js* "~{} === false" x))
```

---

```clj
{:ns "cljs.core",
 :name "false?",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro false? [x]\n  (list 'js* \"~{} === false\" x))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [48 49],
                     :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L48-L49"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_false_QMARK_",
 :source {:code "(defn false?\n  [x] (cljs.core/false? x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [644 646],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L644-L646"},
 :full-name "cljs.core/false?",
 :clj-symbol "clojure.core/false?",
 :docstring "Returns true if x is the value false, false otherwise."}

```
