## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/keywordize-keys

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/keywordize-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/keywordize-keys)
</td>
</tr>
</table>

 <samp>
(__keywordize-keys__ m)<br>
</samp>

```
Recursively transforms all map keys from strings to keywords.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:64-70](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/walk.cljs#L64-L70)</ins>
</pre>

```clj
(defn keywordize-keys
  [m]
  (let [f (fn [[k v]] (if (string? k) [(keyword k) v] [k v]))]
    ;; only apply to maps
    (postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))
```


---

```clj
{:ns "clojure.walk",
 :name "keywordize-keys",
 :signature ["[m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_keywordize-keys",
 :source {:code "(defn keywordize-keys\n  [m]\n  (let [f (fn [[k v]] (if (string? k) [(keyword k) v] [k v]))]\n    ;; only apply to maps\n    (postwalk (fn [x] (if (map? x) (into {} (map f x)) x)) m)))",
          :filename "clojurescript/src/cljs/clojure/walk.cljs",
          :lines [64 70],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/walk.cljs#L64-L70"},
 :full-name "clojure.walk/keywordize-keys",
 :clj-symbol "clojure.walk/keywordize-keys",
 :docstring "Recursively transforms all map keys from strings to keywords."}

```
