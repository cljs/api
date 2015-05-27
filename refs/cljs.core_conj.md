## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/conj

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/conj</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/conj)
</td>
</tr>
</table>

 <samp>
(__conj__ coll x)<br>
(__conj__ coll x & xs)<br>
</samp>

```
conj[oin]. Returns a new collection with the xs
'added'. (conj nil item) returns (item).  The 'addition' may
happen at different 'places' depending on the concrete type.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:816-827](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L816-L827)</ins>
</pre>

```clj
(defn conj
  ([coll x]
    (if-not (nil? coll)
      (-conj coll x)
      (list x)))
  ([coll x & xs]
    (if xs
      (recur (conj coll x) (first xs) (next xs))
      (conj coll x))))
```


---

```clj
{:ns "cljs.core",
 :name "conj",
 :signature ["[coll x]" "[coll x & xs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_conj",
 :source {:code "(defn conj\n  ([coll x]\n    (if-not (nil? coll)\n      (-conj coll x)\n      (list x)))\n  ([coll x & xs]\n    (if xs\n      (recur (conj coll x) (first xs) (next xs))\n      (conj coll x))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [816 827],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L816-L827"},
 :full-name "cljs.core/conj",
 :clj-symbol "clojure.core/conj",
 :docstring "conj[oin]. Returns a new collection with the xs\n'added'. (conj nil item) returns (item).  The 'addition' may\nhappen at different 'places' depending on the concrete type."}

```
