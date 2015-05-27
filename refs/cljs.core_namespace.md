## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/namespace

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/namespace</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/namespace)
</td>
</tr>
</table>

 <samp>
(__namespace__ x)<br>
</samp>

```
Returns the namespace String of a symbol or keyword, or nil if not present.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5888-5895](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5888-L5895)</ins>
</pre>

```clj
(defn namespace
  [x]
  (if (or (keyword? x) (symbol? x))
    (let [i (.lastIndexOf x "/" (- (alength x) 2))]
      (when (> i -1)
        (subs x 2 i)))
    (throw (js/Error. (str "Doesn't support namespace: " x)))))
```


---

```clj
{:ns "cljs.core",
 :name "namespace",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_namespace",
 :source {:code "(defn namespace\n  [x]\n  (if (or (keyword? x) (symbol? x))\n    (let [i (.lastIndexOf x \"/\" (- (alength x) 2))]\n      (when (> i -1)\n        (subs x 2 i)))\n    (throw (js/Error. (str \"Doesn't support namespace: \" x)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5888 5895],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L5888-L5895"},
 :full-name "cljs.core/namespace",
 :clj-symbol "clojure.core/namespace",
 :docstring "Returns the namespace String of a symbol or keyword, or nil if not present."}

```
