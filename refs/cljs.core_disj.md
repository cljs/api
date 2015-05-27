## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/disj

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/disj</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/disj)
</td>
</tr>
</table>

 <samp>
(__disj__ coll)<br>
(__disj__ coll k)<br>
(__disj__ coll k & ks)<br>
</samp>

```
disj[oin]. Returns a new set of the same (hashed/sorted) type, that
does not contain key(s).
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:888-898](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L888-L898)</ins>
</pre>

```clj
(defn disj
  ([coll] coll)
  ([coll k]
     (-disjoin coll k))
  ([coll k & ks]
     (let [ret (disj coll k)]
       (if ks
         (recur ret (first ks) (next ks))
         ret))))
```


---

```clj
{:ns "cljs.core",
 :name "disj",
 :signature ["[coll]" "[coll k]" "[coll k & ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_disj",
 :source {:code "(defn disj\n  ([coll] coll)\n  ([coll k]\n     (-disjoin coll k))\n  ([coll k & ks]\n     (let [ret (disj coll k)]\n       (if ks\n         (recur ret (first ks) (next ks))\n         ret))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [888 898],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L888-L898"},
 :full-name "cljs.core/disj",
 :clj-symbol "clojure.core/disj",
 :docstring "disj[oin]. Returns a new set of the same (hashed/sorted) type, that\ndoes not contain key(s)."}

```
