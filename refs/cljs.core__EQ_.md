## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/=

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/=</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/=)
</td>
</tr>
</table>

 <samp>
(__=__ x)<br>
(__=__ x y)<br>
(__=__ x y & more)<br>
</samp>

```
Equality. Returns true if x equals y, false if not. Compares
numbers and collections in a type-independent manner.  Clojure's immutable data
structures define -equiv (and thus =) as a value, not an identity,
comparison.
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:290-302](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L290-L302)</ins>
</pre>

```clj
(defn ^boolean =
  ([x] true)
  ([x y] (or (identical? x y) (-equiv x y)))
  ([x y & more]
     (if (= x y)
       (if (next more)
         (recur y (first more) (next more))
         (= y (first more)))
       false)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "=",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core__EQ_",
 :source {:code "(defn ^boolean =\n  ([x] true)\n  ([x y] (or (identical? x y) (-equiv x y)))\n  ([x y & more]\n     (if (= x y)\n       (if (next more)\n         (recur y (first more) (next more))\n         (= y (first more)))\n       false)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [290 302],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L290-L302"},
 :full-name "cljs.core/=",
 :clj-symbol "clojure.core/=",
 :docstring "Equality. Returns true if x equals y, false if not. Compares\nnumbers and collections in a type-independent manner.  Clojure's immutable data\nstructures define -equiv (and thus =) as a value, not an identity,\ncomparison."}

```
