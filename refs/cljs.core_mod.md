## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mod

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mod</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mod)
</td>
</tr>
</table>

 <samp>
(__mod__ n d)<br>
</samp>

```
Modulus of num and div. Truncates toward negative infinity.
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1134-1137](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1134-L1137)</ins>
</pre>

```clj
(defn mod
  [n d]
  (cljs.core/mod n d))
```


---

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:188-189](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L188-L189)</ins>
</pre>

```clj
(defmacro mod [num div]
  (list 'js* "(~{} % ~{})" num div))
```

---

```clj
{:ns "cljs.core",
 :name "mod",
 :signature ["[n d]"],
 :shadowed-sources ({:code "(defmacro mod [num div]\n  (list 'js* \"(~{} % ~{})\" num div))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [188 189],
                     :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L188-L189"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_mod",
 :source {:code "(defn mod\n  [n d]\n  (cljs.core/mod n d))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1134 1137],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1134-L1137"},
 :full-name "cljs.core/mod",
 :clj-symbol "clojure.core/mod",
 :docstring "Modulus of num and div. Truncates toward negative infinity."}

```
