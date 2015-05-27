## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/quot

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/quot</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/quot)
</td>
</tr>
</table>

 <samp>
(__quot__ n d)<br>
</samp>

```
quot[ient] of dividing numerator by denominator.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1296-1300](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1296-L1300)</ins>
</pre>

```clj
(defn quot
  [n d]
  (let [rem (mod n d)]
    (fix (/ (- n rem) d))))
```


---

```clj
{:ns "cljs.core",
 :name "quot",
 :signature ["[n d]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_quot",
 :source {:code "(defn quot\n  [n d]\n  (let [rem (mod n d)]\n    (fix (/ (- n rem) d))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1296 1300],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1296-L1300"},
 :full-name "cljs.core/quot",
 :clj-symbol "clojure.core/quot",
 :docstring "quot[ient] of dividing numerator by denominator."}

```
