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
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:201-204](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L201-L204)</ins>
</pre>

```clj
(defn identical?
  [x y]
  (cljs.core/identical? x y))
```


---

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:54-55](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L54-L55)</ins>
</pre>

```clj
(defmacro identical? [a b]
  (list 'js* "(~{} === ~{})" a b))
```

---

```clj
{:ns "cljs.core",
 :name "identical?",
 :signature ["[x y]"],
 :shadowed-sources ({:code "(defmacro identical? [a b]\n  (list 'js* \"(~{} === ~{})\" a b))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [54 55],
                     :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L54-L55"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_identical_QMARK_",
 :source {:code "(defn identical?\n  [x y]\n  (cljs.core/identical? x y))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [201 204],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L201-L204"},
 :full-name "cljs.core/identical?",
 :clj-symbol "clojure.core/identical?",
 :docstring "Tests if 2 arguments are the same object"}

```
