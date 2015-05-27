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
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1335-1338](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L1335-L1338)</ins>
</pre>

```clj
(defn js-mod
  [n d]
  (cljs.core/js-mod n d))
```


---

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:293-294](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L293-L294)</ins>
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
                     :lines [293 294],
                     :link "https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L293-L294"}),
 :history [["+" "0.0-1552"]],
 :type "function",
 :full-name-encode "cljs.core_js-mod",
 :source {:code "(defn js-mod\n  [n d]\n  (cljs.core/js-mod n d))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1335 1338],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L1335-L1338"},
 :full-name "cljs.core/js-mod",
 :docstring "Modulus of num and div with original javascript behavior. i.e. bug for negative numbers"}

```
