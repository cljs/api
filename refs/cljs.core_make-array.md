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
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:81-85](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L81-L85)</ins>
</pre>

```clj
(defn make-array
  ([size]
     (js* "new Array(~{size})"))
  ([type size]
     (make-array size)))
```


---

```clj
{:full-name "cljs.core/make-array",
 :ns "cljs.core",
 :name "make-array",
 :type "function",
 :signature ["[size]" "[type size]"],
 :source {:code "(defn make-array\n  ([size]\n     (js* \"new Array(~{size})\"))\n  ([type size]\n     (make-array size)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [81 85],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L81-L85"},
 :full-name-encode "cljs.core_make-array",
 :clj-symbol "clojure.core/make-array",
 :history [["+" "0.0-1211"]]}

```
