## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/min

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/min</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/min)
</td>
</tr>
</table>

 <samp>
(__min__ x)<br>
(__min__ x y)<br>
(__min__ x y & more)<br>
</samp>

```
Returns the least of the nums.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1411-1416](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1411-L1416)</ins>
</pre>

```clj
(defn min
  ([x] x)
  ([x y] (cljs.core/min x y))
  ([x y & more]
   (reduce min (cljs.core/min x y) more)))
```


---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:389-392](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L389-L392)</ins>
</pre>

```clj
(defmacro min
  ([x] x)
  ([x y] (list 'js* "((~{} < ~{}) ? ~{} : ~{})" x y x y))
  ([x y & more] `(min (min ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "min",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro min\n  ([x] x)\n  ([x y] (list 'js* \"((~{} < ~{}) ? ~{} : ~{})\" x y x y))\n  ([x y & more] `(min (min ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [389 392],
                     :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L389-L392"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_min",
 :source {:code "(defn min\n  ([x] x)\n  ([x y] (cljs.core/min x y))\n  ([x y & more]\n   (reduce min (cljs.core/min x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1411 1416],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1411-L1416"},
 :full-name "cljs.core/min",
 :clj-symbol "clojure.core/min",
 :docstring "Returns the least of the nums."}

```
