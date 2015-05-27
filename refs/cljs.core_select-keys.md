## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/select-keys

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/select-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/select-keys)
</td>
</tr>
</table>

 <samp>
(__select-keys__ map keyseq)<br>
</samp>

```
Returns a map containing only those entries in map whose key is in keys
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5528-5540](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L5528-L5540)</ins>
</pre>

```clj
(defn select-keys
  [map keyseq]
    (loop [ret {} keys (seq keyseq)]
      (if keys
        (let [key   (first keys)
              entry (get map key ::not-found)]
          (recur
           (if (not= entry ::not-found)
             (assoc ret key entry)
             ret)
           (next keys)))
        ret)))
```


---

```clj
{:ns "cljs.core",
 :name "select-keys",
 :signature ["[map keyseq]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_select-keys",
 :source {:code "(defn select-keys\n  [map keyseq]\n    (loop [ret {} keys (seq keyseq)]\n      (if keys\n        (let [key   (first keys)\n              entry (get map key ::not-found)]\n          (recur\n           (if (not= entry ::not-found)\n             (assoc ret key entry)\n             ret)\n           (next keys)))\n        ret)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5528 5540],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L5528-L5540"},
 :full-name "cljs.core/select-keys",
 :clj-symbol "clojure.core/select-keys",
 :docstring "Returns a map containing only those entries in map whose key is in keys"}

```
