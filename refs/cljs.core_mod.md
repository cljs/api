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
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1122-1125](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1122-L1125)</ins>
</pre>

```clj
(defn mod
  [n d]
  (cljs.core/mod n d))
```


---

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:187-188](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L187-L188)</ins>
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
                     :lines [187 188],
                     :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L187-L188"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_mod",
 :source {:code "(defn mod\n  [n d]\n  (cljs.core/mod n d))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1122 1125],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1122-L1125"},
 :full-name "cljs.core/mod",
 :clj-symbol "clojure.core/mod",
 :docstring "Modulus of num and div. Truncates toward negative infinity."}

```
