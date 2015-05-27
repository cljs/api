## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-and-not

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-and-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-and-not)
</td>
</tr>
</table>

 <samp>
(__bit-and-not__ x y)<br>
</samp>

```
Bitwise and
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:910-912](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L910-L912)</ins>
</pre>

```clj
(defn bit-and-not
  [x y] (js* "(~{x} & ~~{y})"))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:146-148](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L146-L148)</ins>
</pre>

```clj
(defmacro bit-and-not
  ([x y] (list 'js* "(~{} & ~~{})" x y))
  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "bit-and-not",
 :signature ["[x y]"],
 :shadowed-sources ({:code "(defmacro bit-and-not\n  ([x y] (list 'js* \"(~{} & ~~{})\" x y))\n  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [146 148],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L146-L148"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-and-not",
 :source {:code "(defn bit-and-not\n  [x y] (js* \"(~{x} & ~~{y})\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [910 912],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L910-L912"},
 :full-name "cljs.core/bit-and-not",
 :clj-symbol "clojure.core/bit-and-not",
 :docstring "Bitwise and"}

```
