## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/make-array

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/make-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/make-array)
</td>
</tr>
</table>

 <samp>
(__make-array__ size)<br>
(__make-array__ type size)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:131-135](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L131-L135)</ins>
</pre>

```clj
(defn make-array
  ([size]
     (js/Array. size))
  ([type size]
     (make-array size)))
```


---

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1175-1177](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L1175-L1177)</ins>
</pre>

```clj
(defmacro make-array
  [size]
  `(js/Array. ~size))
```

---

```clj
{:ns "cljs.core",
 :name "make-array",
 :signature ["[size]" "[type size]"],
 :shadowed-sources ({:code "(defmacro make-array\n  [size]\n  `(js/Array. ~size))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [1175 1177],
                     :link "https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L1175-L1177"}),
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_make-array",
 :source {:code "(defn make-array\n  ([size]\n     (js/Array. size))\n  ([type size]\n     (make-array size)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [131 135],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L131-L135"},
 :full-name "cljs.core/make-array",
 :clj-symbol "clojure.core/make-array"}

```
