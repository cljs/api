## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-test

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-test</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-test)
</td>
</tr>
</table>

 <samp>
(__bit-test__ x n)<br>
</samp>

```
Test bit at index n
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1183-1186](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1183-L1186)</ins>
</pre>

```clj
(defn bit-test
  [x n]
  (cljs.core/bit-test x n))
```


---

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:220-221](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L220-L221)</ins>
</pre>

```clj
(defmacro bit-test [x n]
  (list 'js* "((~{} & (1 << ~{})) != 0)" x n))
```

---

```clj
{:ns "cljs.core",
 :name "bit-test",
 :signature ["[x n]"],
 :shadowed-sources ({:code "(defmacro bit-test [x n]\n  (list 'js* \"((~{} & (1 << ~{})) != 0)\" x n))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [220 221],
                     :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L220-L221"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-test",
 :source {:code "(defn bit-test\n  [x n]\n  (cljs.core/bit-test x n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1183 1186],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1183-L1186"},
 :full-name "cljs.core/bit-test",
 :clj-symbol "clojure.core/bit-test",
 :docstring "Test bit at index n"}

```
