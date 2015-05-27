## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/+

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/+</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/+)
</td>
</tr>
</table>

 <samp>
(__+__)<br>
(__+__ x)<br>
(__+__ x y)<br>
(__+__ x y & more)<br>
</samp>

```
Returns the sum of nums. (+) returns 0.
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1025-1030](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1025-L1030)</ins>
</pre>

```clj
(defn +
  ([] 0)
  ([x] x)
  ([x y] (cljs.core/+ x y))
  ([x y & more] (reduce + (cljs.core/+ x y) more)))
```


---

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:116-120](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L116-L120)</ins>
</pre>

```clj
(defmacro +
  ([] 0)
  ([x] x)
  ([x y] (list 'js* "(~{} + ~{})" x y))
  ([x y & more] `(+ (+ ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "+",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro +\n  ([] 0)\n  ([x] x)\n  ([x y] (list 'js* \"(~{} + ~{})\" x y))\n  ([x y & more] `(+ (+ ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [116 120],
                     :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L116-L120"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core__PLUS_",
 :source {:code "(defn +\n  ([] 0)\n  ([x] x)\n  ([x y] (cljs.core/+ x y))\n  ([x y & more] (reduce + (cljs.core/+ x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1025 1030],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1025-L1030"},
 :full-name "cljs.core/+",
 :clj-symbol "clojure.core/+",
 :docstring "Returns the sum of nums. (+) returns 0."}

```
