## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/even?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/even?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/even?)
</td>
</tr>
</table>

 <samp>
(__even?__ n)<br>
</samp>

```
Returns true if n is even, throws an exception if n is not an integer
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1853-1857](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1853-L1857)</ins>
</pre>

```clj
(defn ^boolean even?
   [n] (if (integer? n)
        (zero? (bit-and n 1))
        (throw (js/Error. (str "Argument must be an integer: " n)))))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "even?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_even_QMARK_",
 :source {:code "(defn ^boolean even?\n   [n] (if (integer? n)\n        (zero? (bit-and n 1))\n        (throw (js/Error. (str \"Argument must be an integer: \" n)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1853 1857],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1853-L1857"},
 :full-name "cljs.core/even?",
 :clj-symbol "clojure.core/even?",
 :docstring "Returns true if n is even, throws an exception if n is not an integer"}

```
