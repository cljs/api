## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cycle

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cycle</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cycle)
</td>
</tr>
</table>

 <samp>
(__cycle__ coll)<br>
</samp>

```
Returns a lazy (infinite!) sequence of repetitions of the items in coll.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1753-1757](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1753-L1757)</ins>
</pre>

```clj
(defn cycle
  [coll] (lazy-seq 
          (when-let [s (seq coll)] 
            (concat s (cycle s)))))
```


---

```clj
{:ns "cljs.core",
 :name "cycle",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_cycle",
 :source {:code "(defn cycle\n  [coll] (lazy-seq \n          (when-let [s (seq coll)] \n            (concat s (cycle s)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1753 1757],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1753-L1757"},
 :full-name "cljs.core/cycle",
 :clj-symbol "clojure.core/cycle",
 :docstring "Returns a lazy (infinite!) sequence of repetitions of the items in coll."}

```
