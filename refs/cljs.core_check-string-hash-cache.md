## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/check-string-hash-cache

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__check-string-hash-cache__ k)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1036-1043](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1036-L1043)</ins>
</pre>

```clj
(defn check-string-hash-cache [k]
  (when (> string-hash-cache-count 255)
    (set! string-hash-cache (js-obj))
    (set! string-hash-cache-count 0))
  (let [h (aget string-hash-cache k)]
    (if (number? h)
      h
      (add-to-string-hash-cache k))))
```


---

```clj
{:full-name "cljs.core/check-string-hash-cache",
 :ns "cljs.core",
 :name "check-string-hash-cache",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn check-string-hash-cache [k]\n  (when (> string-hash-cache-count 255)\n    (set! string-hash-cache (js-obj))\n    (set! string-hash-cache-count 0))\n  (let [h (aget string-hash-cache k)]\n    (if (number? h)\n      h\n      (add-to-string-hash-cache k))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1036 1043],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1036-L1043"},
 :full-name-encode "cljs.core_check-string-hash-cache",
 :history [["+" "0.0-1424"]]}

```
