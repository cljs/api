## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/to-array

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/to-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/to-array)
</td>
</tr>
</table>

 <samp>
(__to-array__ s)<br>
</samp>

```
Naive impl of to-array as a start.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1279-1287](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1279-L1287)</ins>
</pre>

```clj
(defn to-array
  [s]
  (let [ary (array)]
    (loop [s s]
      (if (seq s)
        (do (. ary push (first s))
            (recur (next s)))
        ary))))
```


---

```clj
{:ns "cljs.core",
 :name "to-array",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_to-array",
 :source {:code "(defn to-array\n  [s]\n  (let [ary (array)]\n    (loop [s s]\n      (if (seq s)\n        (do (. ary push (first s))\n            (recur (next s)))\n        ary))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1279 1287],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1279-L1287"},
 :full-name "cljs.core/to-array",
 :clj-symbol "clojure.core/to-array",
 :docstring "Naive impl of to-array as a start."}

```
