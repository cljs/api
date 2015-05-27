## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-shift-right

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-shift-right</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-shift-right)
</td>
</tr>
</table>

 <samp>
(__bit-shift-right__ x n)<br>
</samp>

```
Bitwise shift right
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1204-1206](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1204-L1206)</ins>
</pre>

```clj
(defn bit-shift-right
  [x n] (cljs.core/bit-shift-right x n))
```


---

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:227-228](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L227-L228)</ins>
</pre>

```clj
(defmacro bit-shift-right [x n]
  (list 'js* "(~{} >> ~{})" x n))
```

---

```clj
{:ns "cljs.core",
 :name "bit-shift-right",
 :signature ["[x n]"],
 :shadowed-sources ({:code "(defmacro bit-shift-right [x n]\n  (list 'js* \"(~{} >> ~{})\" x n))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [227 228],
                     :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L227-L228"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-shift-right",
 :source {:code "(defn bit-shift-right\n  [x n] (cljs.core/bit-shift-right x n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1204 1206],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1204-L1206"},
 :full-name "cljs.core/bit-shift-right",
 :clj-symbol "clojure.core/bit-shift-right",
 :docstring "Bitwise shift right"}

```
