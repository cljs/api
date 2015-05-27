## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/max

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/max</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/max)
</td>
</tr>
</table>

 <samp>
(__max__ x)<br>
(__max__ x y)<br>
(__max__ x y & more)<br>
</samp>

```
Returns the greatest of the nums.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1306-1311](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1306-L1311)</ins>
</pre>

```clj
(defn max
  ([x] x)
  ([x y] (cljs.core/max x y))
  ([x y & more]
   (reduce max (cljs.core/max x y) more)))
```


---

 <pre>
clojurescript @ r1586
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:283-286](https://github.com/clojure/clojurescript/blob/r1586/src/clj/cljs/core.clj#L283-L286)</ins>
</pre>

```clj
(defmacro max
  ([x] x)
  ([x y] (list 'js* "((~{} > ~{}) ? ~{} : ~{})" x y x y))
  ([x y & more] `(max (max ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "max",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro max\n  ([x] x)\n  ([x y] (list 'js* \"((~{} > ~{}) ? ~{} : ~{})\" x y x y))\n  ([x y & more] `(max (max ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [283 286],
                     :link "https://github.com/clojure/clojurescript/blob/r1586/src/clj/cljs/core.clj#L283-L286"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_max",
 :source {:code "(defn max\n  ([x] x)\n  ([x y] (cljs.core/max x y))\n  ([x y & more]\n   (reduce max (cljs.core/max x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1306 1311],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1306-L1311"},
 :full-name "cljs.core/max",
 :clj-symbol "clojure.core/max",
 :docstring "Returns the greatest of the nums."}

```
