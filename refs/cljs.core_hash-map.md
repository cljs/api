## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-map

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-map)
</td>
</tr>
</table>

 <samp>
(__hash-map__ & keyvals)<br>
</samp>

```
keyval => key val
Returns a new hash map with supplied mappings.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2411-2418](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2411-L2418)</ins>
</pre>

```clj
(defn hash-map
  [& keyvals]
  (loop [in (seq keyvals), out cljs.core.HashMap/EMPTY]
    (if in
      (recur (nnext in) (assoc out (first in) (second in)))
      out)))
```


---

```clj
{:ns "cljs.core",
 :name "hash-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_hash-map",
 :source {:code "(defn hash-map\n  [& keyvals]\n  (loop [in (seq keyvals), out cljs.core.HashMap/EMPTY]\n    (if in\n      (recur (nnext in) (assoc out (first in) (second in)))\n      out)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2411 2418],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2411-L2418"},
 :full-name "cljs.core/hash-map",
 :clj-symbol "clojure.core/hash-map",
 :docstring "keyval => key val\nReturns a new hash map with supplied mappings."}

```
