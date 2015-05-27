## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-set

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-set)
</td>
</tr>
</table>

 <samp>
(__hash-set__)<br>
(__hash-set__ & keys)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5817-5824](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L5817-L5824)</ins>
</pre>

```clj
(defn hash-set
  ([] cljs.core.PersistentHashSet/EMPTY)
  ([& keys]
    (loop [in (seq keys)
           out (transient cljs.core.PersistentHashSet/EMPTY)]
      (if (seq in)
        (recur (next in) (conj! out (first in)))
        (persistent! out)))))
```


---

```clj
{:full-name "cljs.core/hash-set",
 :ns "cljs.core",
 :name "hash-set",
 :type "function",
 :signature ["[]" "[& keys]"],
 :source {:code "(defn hash-set\n  ([] cljs.core.PersistentHashSet/EMPTY)\n  ([& keys]\n    (loop [in (seq keys)\n           out (transient cljs.core.PersistentHashSet/EMPTY)]\n      (if (seq in)\n        (recur (next in) (conj! out (first in)))\n        (persistent! out)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5817 5824],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L5817-L5824"},
 :full-name-encode "cljs.core_hash-set",
 :clj-symbol "clojure.core/hash-set",
 :history [["+" "0.0-1443"]]}

```
