## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/identical?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/identical?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/identical?)
</td>
</tr>
</table>

 <samp>
(__identical?__ x y)<br>
</samp>

```
Tests if 2 arguments are the same object
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:43-46](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L43-L46)</ins>
</pre>

```clj
(defn ^boolean identical?
  [x y]
  (cljs.core/identical? x y))
```


---

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:208-209](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L208-L209)</ins>
</pre>

```clj
(defmacro identical? [a b]
  (bool-expr (list 'js* "(~{} === ~{})" a b)))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "identical?",
 :signature ["[x y]"],
 :shadowed-sources ({:code "(defmacro identical? [a b]\n  (bool-expr (list 'js* \"(~{} === ~{})\" a b)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [208 209],
                     :link "https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L208-L209"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_identical_QMARK_",
 :source {:code "(defn ^boolean identical?\n  [x y]\n  (cljs.core/identical? x y))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [43 46],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L43-L46"},
 :full-name "cljs.core/identical?",
 :clj-symbol "clojure.core/identical?",
 :docstring "Tests if 2 arguments are the same object"}

```
