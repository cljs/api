## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-shift-left

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-shift-left</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-shift-left)
</td>
</tr>
</table>

 <samp>
(__bit-shift-left__ x n)<br>
</samp>

```
Bitwise shift left
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1188-1190](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1188-L1190)</ins>
</pre>

```clj
(defn bit-shift-left
  [x n] (cljs.core/bit-shift-left x n))
```


---

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:223-224](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L223-L224)</ins>
</pre>

```clj
(defmacro bit-shift-left [x n]
  (list 'js* "(~{} << ~{})" x n))
```

---

```clj
{:ns "cljs.core",
 :name "bit-shift-left",
 :signature ["[x n]"],
 :shadowed-sources ({:code "(defmacro bit-shift-left [x n]\n  (list 'js* \"(~{} << ~{})\" x n))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [223 224],
                     :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L223-L224"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-shift-left",
 :source {:code "(defn bit-shift-left\n  [x n] (cljs.core/bit-shift-left x n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1188 1190],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1188-L1190"},
 :full-name "cljs.core/bit-shift-left",
 :clj-symbol "clojure.core/bit-shift-left",
 :docstring "Bitwise shift left"}

```
