## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/add-to-string-hash-cache

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__add-to-string-hash-cache__ k)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:842-846](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L842-L846)</ins>
</pre>

```clj
(defn add-to-string-hash-cache [k]
  (let [h (goog.string/hashCode k)]
    (aset string-hash-cache k h)
    (set! string-hash-cache-count (inc string-hash-cache-count))
    h))
```


---

```clj
{:full-name "cljs.core/add-to-string-hash-cache",
 :ns "cljs.core",
 :name "add-to-string-hash-cache",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn add-to-string-hash-cache [k]\n  (let [h (goog.string/hashCode k)]\n    (aset string-hash-cache k h)\n    (set! string-hash-cache-count (inc string-hash-cache-count))\n    h))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [842 846],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L842-L846"},
 :full-name-encode "cljs.core_add-to-string-hash-cache",
 :history [["+" "0.0-1424"]]}

```
