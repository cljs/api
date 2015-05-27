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
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1323-1329](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1323-L1329)</ins>
</pre>

```clj
(defn +
  ([] 0)
  ([x] x)
  ([x y] (cljs.core/+ x y))
  ([x y & more]
    (reduce + (cljs.core/+ x y) more)))
```


---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:264-268](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L264-L268)</ins>
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
                     :lines [264 268],
                     :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L264-L268"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core__PLUS_",
 :source {:code "(defn +\n  ([] 0)\n  ([x] x)\n  ([x y] (cljs.core/+ x y))\n  ([x y & more]\n    (reduce + (cljs.core/+ x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1323 1329],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1323-L1329"},
 :full-name "cljs.core/+",
 :clj-symbol "clojure.core/+",
 :docstring "Returns the sum of nums. (+) returns 0."}

```
