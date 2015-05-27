## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/assoc-in

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/assoc-in</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/assoc-in)
</td>
</tr>
</table>

 <samp>
(__assoc-in__ m [k & ks] v)<br>
</samp>

```
Associates a value in a nested associative structure, where ks is a
sequence of keys and v is the new value and returns a new nested structure.
If any levels do not exist, hash-maps will be created.
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2927-2934](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2927-L2934)</ins>
</pre>

```clj
(defn assoc-in
  [m [k & ks] v]
  (if ks
    (assoc m k (assoc-in (get m k) ks v))
    (assoc m k v)))
```


---

```clj
{:ns "cljs.core",
 :name "assoc-in",
 :signature ["[m [k & ks] v]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_assoc-in",
 :source {:code "(defn assoc-in\n  [m [k & ks] v]\n  (if ks\n    (assoc m k (assoc-in (get m k) ks v))\n    (assoc m k v)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2927 2934],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L2927-L2934"},
 :full-name "cljs.core/assoc-in",
 :clj-symbol "clojure.core/assoc-in",
 :docstring "Associates a value in a nested associative structure, where ks is a\nsequence of keys and v is the new value and returns a new nested structure.\nIf any levels do not exist, hash-maps will be created."}

```
