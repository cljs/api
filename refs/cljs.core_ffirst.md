## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ffirst

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ffirst</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ffirst)
</td>
</tr>
</table>

 <samp>
(__ffirst__ coll)<br>
</samp>

```
Same as (first (first x))
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:784-787](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L784-L787)</ins>
</pre>

```clj
(defn ffirst
  [coll]
  (first (first coll)))
```


---

```clj
{:ns "cljs.core",
 :name "ffirst",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_ffirst",
 :source {:code "(defn ffirst\n  [coll]\n  (first (first coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [784 787],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L784-L787"},
 :full-name "cljs.core/ffirst",
 :clj-symbol "clojure.core/ffirst",
 :docstring "Same as (first (first x))"}

```
