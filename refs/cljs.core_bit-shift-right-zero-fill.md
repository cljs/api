## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-shift-right-zero-fill

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__bit-shift-right-zero-fill__ x n)<br>
</samp>

```
Bitwise shift right with zero fill
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1196-1198](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1196-L1198)</ins>
</pre>

```clj
(defn bit-shift-right-zero-fill
  [x n] (cljs.core/bit-shift-right-zero-fill x n))
```


---

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:229-230](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L229-L230)</ins>
</pre>

```clj
(defmacro bit-shift-right-zero-fill [x n]
  (list 'js* "(~{} >>> ~{})" x n))
```

---

```clj
{:ns "cljs.core",
 :name "bit-shift-right-zero-fill",
 :signature ["[x n]"],
 :shadowed-sources ({:code "(defmacro bit-shift-right-zero-fill [x n]\n  (list 'js* \"(~{} >>> ~{})\" x n))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [229 230],
                     :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L229-L230"}),
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_bit-shift-right-zero-fill",
 :source {:code "(defn bit-shift-right-zero-fill\n  [x n] (cljs.core/bit-shift-right-zero-fill x n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1196 1198],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1196-L1198"},
 :full-name "cljs.core/bit-shift-right-zero-fill",
 :docstring "Bitwise shift right with zero fill"}

```
