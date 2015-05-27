## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rand-nth

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand-nth</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand-nth)
</td>
</tr>
</table>

 <samp>
(__rand-nth__ coll)<br>
</samp>

```
Return a random element of the (sequential) collection. Will have
the same performance characteristics as nth for the given
collection.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6828-6833](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L6828-L6833)</ins>
</pre>

```clj
(defn rand-nth
  [coll]
  (nth coll (rand-int (count coll))))
```


---

```clj
{:ns "cljs.core",
 :name "rand-nth",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_rand-nth",
 :source {:code "(defn rand-nth\n  [coll]\n  (nth coll (rand-int (count coll))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6828 6833],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L6828-L6833"},
 :full-name "cljs.core/rand-nth",
 :clj-symbol "clojure.core/rand-nth",
 :docstring "Return a random element of the (sequential) collection. Will have\nthe same performance characteristics as nth for the given\ncollection."}

```
