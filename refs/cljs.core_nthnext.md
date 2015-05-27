## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nthnext

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nthnext</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nthnext)
</td>
</tr>
</table>

 <samp>
(__nthnext__ coll n)<br>
</samp>

```
Returns the nth next of coll, (seq coll) when n is 0.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1402-1408](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L1402-L1408)</ins>
</pre>

```clj
(defn nthnext
  [coll n]
  (loop [n n xs (seq coll)]
    (if (and xs (pos? n))
      (recur (dec n) (next xs))
      xs)))
```


---

```clj
{:ns "cljs.core",
 :name "nthnext",
 :signature ["[coll n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_nthnext",
 :source {:code "(defn nthnext\n  [coll n]\n  (loop [n n xs (seq coll)]\n    (if (and xs (pos? n))\n      (recur (dec n) (next xs))\n      xs)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1402 1408],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L1402-L1408"},
 :full-name "cljs.core/nthnext",
 :clj-symbol "clojure.core/nthnext",
 :docstring "Returns the nth next of coll, (seq coll) when n is 0."}

```
