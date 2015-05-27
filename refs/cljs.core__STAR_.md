## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*)
</td>
</tr>
</table>

 <samp>
(__\*__)<br>
(__\*__ x)<br>
(__\*__ x y)<br>
(__\*__ x y & more)<br>
</samp>

```
Returns the product of nums. (*) returns 1.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:787-792](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L787-L792)</ins>
</pre>

```clj
(defn *
  ([] 1)
  ([x] x)
  ([x y] (js* "(~{x} * ~{y})"))
  ([x y & more] (reduce * (* x y) more)))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:66-70](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L66-L70)</ins>
</pre>

```clj
(defmacro *
  ([] 1)
  ([x] x)
  ([x y] (list 'js* "(~{} * ~{})" x y))
  ([x y & more] `(* (* ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "*",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro *\n  ([] 1)\n  ([x] x)\n  ([x y] (list 'js* \"(~{} * ~{})\" x y))\n  ([x y & more] `(* (* ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [66 70],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L66-L70"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core__STAR_",
 :source {:code "(defn *\n  ([] 1)\n  ([x] x)\n  ([x y] (js* \"(~{x} * ~{y})\"))\n  ([x y & more] (reduce * (* x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [787 792],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L787-L792"},
 :full-name "cljs.core/*",
 :clj-symbol "clojure.core/*",
 :docstring "Returns the product of nums. (*) returns 1."}

```
