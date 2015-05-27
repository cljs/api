## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/into-array

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/into-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/into-array)
</td>
</tr>
</table>

 <samp>
(__into-array__ aseq)<br>
(__into-array__ type aseq)<br>
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
            └── <ins>[core.cljs:160-164](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L160-L164)</ins>
</pre>

```clj
(defn into-array
  ([aseq]
     (into-array nil aseq))
  ([type aseq]
     (reduce (fn [a x] (.push a x) a) (array) aseq)))
```


---

```clj
{:full-name "cljs.core/into-array",
 :ns "cljs.core",
 :name "into-array",
 :type "function",
 :signature ["[aseq]" "[type aseq]"],
 :source {:code "(defn into-array\n  ([aseq]\n     (into-array nil aseq))\n  ([type aseq]\n     (reduce (fn [a x] (.push a x) a) (array) aseq)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [160 164],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L160-L164"},
 :full-name-encode "cljs.core_into-array",
 :clj-symbol "clojure.core/into-array",
 :history [["+" "0.0-1211"]]}

```
