## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mod

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mod</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mod)
</td>
</tr>
</table>

 <samp>
(__mod__ n d)<br>
</samp>

```
Modulus of num and div. Truncates toward negative infinity.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1549-1552](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1549-L1552)</ins>
</pre>

```clj
(defn mod
  [n d]
  (js-mod (+ (js-mod n d) d) d))
```


---

```clj
{:ns "cljs.core",
 :name "mod",
 :signature ["[n d]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_mod",
 :source {:code "(defn mod\n  [n d]\n  (js-mod (+ (js-mod n d) d) d))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1549 1552],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1549-L1552"},
 :full-name "cljs.core/mod",
 :clj-symbol "clojure.core/mod",
 :docstring "Modulus of num and div. Truncates toward negative infinity."}

```
