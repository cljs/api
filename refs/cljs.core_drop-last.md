## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/drop-last

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/drop-last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/drop-last)
</td>
</tr>
</table>

 <samp>
(__drop-last__ s)<br>
(__drop-last__ n s)<br>
</samp>

```
Return a lazy sequence of all but the last n (default 1) items in coll
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2713-2716](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L2713-L2716)</ins>
</pre>

```clj
(defn drop-last
  ([s] (drop-last 1 s))
  ([n s] (map (fn [x _] x) s (drop n s))))
```


---

```clj
{:ns "cljs.core",
 :name "drop-last",
 :signature ["[s]" "[n s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_drop-last",
 :source {:code "(defn drop-last\n  ([s] (drop-last 1 s))\n  ([n s] (map (fn [x _] x) s (drop n s))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2713 2716],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L2713-L2716"},
 :full-name "cljs.core/drop-last",
 :clj-symbol "clojure.core/drop-last",
 :docstring "Return a lazy sequence of all but the last n (default 1) items in coll"}

```
