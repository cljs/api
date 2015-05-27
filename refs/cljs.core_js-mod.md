## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-mod

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-mod__ n d)<br>
</samp>

```
Modulus of num and div with original javascript behavior. i.e. bug for negative numbers
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1592-1595](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1592-L1595)</ins>
</pre>

```clj
(defn js-mod
  [n d]
  (cljs.core/js-mod n d))
```


---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:399-400](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L399-L400)</ins>
</pre>

```clj
(defmacro js-mod [num div]
  (list 'js* "(~{} % ~{})" num div))
```

---

```clj
{:ns "cljs.core",
 :name "js-mod",
 :signature ["[n d]"],
 :shadowed-sources ({:code "(defmacro js-mod [num div]\n  (list 'js* \"(~{} % ~{})\" num div))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [399 400],
                     :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L399-L400"}),
 :history [["+" "0.0-1552"]],
 :type "function",
 :full-name-encode "cljs.core_js-mod",
 :source {:code "(defn js-mod\n  [n d]\n  (cljs.core/js-mod n d))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1592 1595],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1592-L1595"},
 :full-name "cljs.core/js-mod",
 :docstring "Modulus of num and div with original javascript behavior. i.e. bug for negative numbers"}

```
