## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/map-invert

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/map-invert</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/map-invert)
</td>
</tr>
</table>

 <samp>
(__map-invert__ m)<br>
</samp>

```
Returns the map with the vals mapped to the keys.
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:98-100](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/set.cljs#L98-L100)</ins>
</pre>

```clj
(defn map-invert
  [m] (reduce (fn [m [k v]] (assoc m v k)) {} m))
```


---

```clj
{:ns "clojure.set",
 :name "map-invert",
 :signature ["[m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_map-invert",
 :source {:code "(defn map-invert\n  [m] (reduce (fn [m [k v]] (assoc m v k)) {} m))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [98 100],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/set.cljs#L98-L100"},
 :full-name "clojure.set/map-invert",
 :clj-symbol "clojure.set/map-invert",
 :docstring "Returns the map with the vals mapped to the keys."}

```
