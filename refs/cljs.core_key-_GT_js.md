## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/key->js

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__key->js__ k)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6827-6835](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6827-L6835)</ins>
</pre>

```clj
(defn key->js [k]
  (if (satisfies? IEncodeJS k)
    (-clj->js k)
    (if (or (string? k)
            (number? k)
            (keyword? k)
            (symbol? k))
      (clj->js k)
      (pr-str k))))
```


---

```clj
{:full-name "cljs.core/key->js",
 :ns "cljs.core",
 :name "key->js",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn key->js [k]\n  (if (satisfies? IEncodeJS k)\n    (-clj->js k)\n    (if (or (string? k)\n            (number? k)\n            (keyword? k)\n            (symbol? k))\n      (clj->js k)\n      (pr-str k))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6827 6835],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6827-L6835"},
 :full-name-encode "cljs.core_key-_GT_js",
 :history [["+" "0.0-1798"]]}

```
