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
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:897-902](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L897-L902)</ins>
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
clojurescript @ r1011
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:133-136](https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/core.clj#L133-L136)</ins>
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
                     :lines [133 136],
                     :link "https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/core.clj#L133-L136"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_min",
 :source {:code "(defn min\n  ([x] x)\n  ([x y] (cljs.core/min x y))\n  ([x y & more]\n   (reduce min (cljs.core/min x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [897 902],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L897-L902"},
 :full-name "cljs.core/min",
 :clj-symbol "clojure.core/min",
 :docstring "Returns the least of the nums."}

```
