## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nfirst

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nfirst</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nfirst)
</td>
</tr>
</table>

 <samp>
(__nfirst__ coll)<br>
</samp>

```
Same as (next (first x))
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:741-744](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L741-L744)</ins>
</pre>

```clj
(defn nfirst
  [coll]
  (next (first coll)))
```


---

```clj
{:ns "cljs.core",
 :name "nfirst",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_nfirst",
 :source {:code "(defn nfirst\n  [coll]\n  (next (first coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [741 744],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L741-L744"},
 :full-name "cljs.core/nfirst",
 :clj-symbol "clojure.core/nfirst",
 :docstring "Same as (next (first x))"}

```
