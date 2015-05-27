## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/find

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/find</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/find)
</td>
</tr>
</table>

 <samp>
(__find__ coll k)<br>
</samp>

```
Returns the map entry for key, or nil if key not present.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1053-1059](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1053-L1059)</ins>
</pre>

```clj
(defn find
  [coll k]
  (when (and (not (nil? coll))
             (associative? coll)
             (contains? coll k))
    [k (-lookup coll k)]))
```


---

```clj
{:ns "cljs.core",
 :name "find",
 :signature ["[coll k]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_find",
 :source {:code "(defn find\n  [coll k]\n  (when (and (not (nil? coll))\n             (associative? coll)\n             (contains? coll k))\n    [k (-lookup coll k)]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1053 1059],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1053-L1059"},
 :full-name "cljs.core/find",
 :clj-symbol "clojure.core/find",
 :docstring "Returns the map entry for key, or nil if key not present."}

```
