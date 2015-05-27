## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/stringify-keys

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/stringify-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/stringify-keys)
</td>
</tr>
</table>

 <samp>
(__stringify-keys__ m)<br>
</samp>

```
Recursively transforms all map keys from keywords to strings.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:72-78](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/walk.cljs#L72-L78)</ins>
</pre>

```clj
(defn stringify-keys
  [m]
  (let [f (fn [[k v]] (if (keyword? k) [(name k) v] [k v]))]
    ;; only apply to maps
    (postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))
```


---

```clj
{:ns "clojure.walk",
 :name "stringify-keys",
 :signature ["[m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_stringify-keys",
 :source {:code "(defn stringify-keys\n  [m]\n  (let [f (fn [[k v]] (if (keyword? k) [(name k) v] [k v]))]\n    ;; only apply to maps\n    (postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))",
          :filename "clojurescript/src/cljs/clojure/walk.cljs",
          :lines [72 78],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/walk.cljs#L72-L78"},
 :full-name "clojure.walk/stringify-keys",
 :clj-symbol "clojure.walk/stringify-keys",
 :docstring "Recursively transforms all map keys from keywords to strings."}

```
