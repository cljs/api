## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/inc

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/inc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/inc)
</td>
</tr>
</table>

 <samp>
(__inc__ x)<br>
</samp>

```
Returns a number one greater than num.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:267-269](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L267-L269)</ins>
</pre>

```clj
(defn inc
  [x] (js* "(~{x} + 1)"))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:106-107](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L106-L107)</ins>
</pre>

```clj
(defmacro inc [x]
  `(+ ~x 1))
```

---

```clj
{:ns "cljs.core",
 :name "inc",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro inc [x]\n  `(+ ~x 1))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [106 107],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L106-L107"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_inc",
 :source {:code "(defn inc\n  [x] (js* \"(~{x} + 1)\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [267 269],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L267-L269"},
 :full-name "cljs.core/inc",
 :clj-symbol "clojure.core/inc",
 :docstring "Returns a number one greater than num."}

```
