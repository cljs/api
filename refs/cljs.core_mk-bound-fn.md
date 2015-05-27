## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mk-bound-fn

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__mk-bound-fn__ sc test key)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5942-5946](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5942-L5946)</ins>
</pre>

```clj
(defn mk-bound-fn
  [sc test key]
  (fn [e]
    (let [comp (-comparator sc)]
      (test (comp (-entry-key sc e) key) 0))))
```


---

```clj
{:full-name "cljs.core/mk-bound-fn",
 :ns "cljs.core",
 :name "mk-bound-fn",
 :type "function",
 :signature ["[sc test key]"],
 :source {:code "(defn mk-bound-fn\n  [sc test key]\n  (fn [e]\n    (let [comp (-comparator sc)]\n      (test (comp (-entry-key sc e) key) 0))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5942 5946],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5942-L5946"},
 :full-name-encode "cljs.core_mk-bound-fn",
 :history [["+" "0.0-1211"]]}

```
