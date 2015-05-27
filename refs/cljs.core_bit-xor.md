## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-xor

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-xor</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-xor)
</td>
</tr>
</table>

 <samp>
(__bit-xor__ x y)<br>
</samp>

```
Bitwise exclusive or
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:898-900](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L898-L900)</ins>
</pre>

```clj
(defn bit-xor
  [x y] (js* "(~{x} ^ ~{y})"))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:142-144](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L142-L144)</ins>
</pre>

```clj
(defmacro bit-xor
  ([x y] (list 'js* "(~{} ^ ~{})" x y))
  ([x y & more] `(bit-xor (bit-xor ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "bit-xor",
 :signature ["[x y]"],
 :shadowed-sources ({:code "(defmacro bit-xor\n  ([x y] (list 'js* \"(~{} ^ ~{})\" x y))\n  ([x y & more] `(bit-xor (bit-xor ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [142 144],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L142-L144"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-xor",
 :source {:code "(defn bit-xor\n  [x y] (js* \"(~{x} ^ ~{y})\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [898 900],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L898-L900"},
 :full-name "cljs.core/bit-xor",
 :clj-symbol "clojure.core/bit-xor",
 :docstring "Bitwise exclusive or"}

```
