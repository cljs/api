## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-not

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-not)
</td>
</tr>
</table>

 <samp>
(__bit-not__ x)<br>
</samp>

```
Bitwise complement
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1639-1641](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1639-L1641)</ins>
</pre>

```clj
(defn bit-not
  [x] (cljs.core/bit-not x))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:397-398](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L397-L398)</ins>
</pre>

```clj
(defmacro bit-not [x]
  (list 'js* "(~ ~{})" x))
```

---

```clj
{:ns "cljs.core",
 :name "bit-not",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro bit-not [x]\n  (list 'js* \"(~ ~{})\" x))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [397 398],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L397-L398"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-not",
 :source {:code "(defn bit-not\n  [x] (cljs.core/bit-not x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1639 1641],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1639-L1641"},
 :full-name "cljs.core/bit-not",
 :clj-symbol "clojure.core/bit-not",
 :docstring "Bitwise complement"}

```
