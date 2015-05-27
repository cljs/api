## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/folder

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/folder</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/folder)
</td>
</tr>
</table>

 <samp>
(__folder__ coll xf)<br>
</samp>

```
Given a foldable collection, and a transformation function xf,
returns a foldable collection, where any supplied reducing
fn will be transformed by xf. xf is a function of reducing fn to
reducing fn.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:68-85](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/core/reducers.cljs#L68-L85)</ins>
</pre>

```clj
(defn folder
  ([coll xf]
     (reify
       cljs.core/IReduce
       (-reduce [_ f1]
         (-reduce coll (xf f1) (f1)))
       (-reduce [_ f1 init]
         (-reduce coll (xf f1) init))

       #_
       CollFold
       #_
       (coll-fold [_ n combinef reducef]
         (coll-fold coll n combinef (xf reducef))))))
```


---

```clj
{:ns "clojure.core.reducers",
 :name "folder",
 :signature ["[coll xf]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_folder",
 :source {:code "(defn folder\n  ([coll xf]\n     (reify\n       cljs.core/IReduce\n       (-reduce [_ f1]\n         (-reduce coll (xf f1) (f1)))\n       (-reduce [_ f1 init]\n         (-reduce coll (xf f1) init))\n\n       #_\n       CollFold\n       #_\n       (coll-fold [_ n combinef reducef]\n         (coll-fold coll n combinef (xf reducef))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [68 85],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/core/reducers.cljs#L68-L85"},
 :full-name "clojure.core.reducers/folder",
 :clj-symbol "clojure.core.reducers/folder",
 :docstring "Given a foldable collection, and a transformation function xf,\nreturns a foldable collection, where any supplied reducing\nfn will be transformed by xf. xf is a function of reducing fn to\nreducing fn."}

```
