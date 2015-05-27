## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/Cat

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Cat.__ cnt left right)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:182-202](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/core/reducers.cljs#L182-L202)</ins>
</pre>

```clj
(deftype Cat [cnt left right]
  cljs.core/ICounted
  (-count [_] cnt)

  cljs.core/ISeqable
  (-seq [_] (concat (seq left) (seq right)))
  
  cljs.core/IReduce
  (-reduce [this f1] (-reduce this f1 (f1)))
  (-reduce
    [_  f1 init]
    (-reduce
     right f1
     (-reduce left f1 init)))

  #_
  CollFold
  #_
  (coll-fold
    [this n combinef reducef]
    (-reduce this reducef)))
```


---

```clj
{:full-name "clojure.core.reducers/Cat",
 :ns "clojure.core.reducers",
 :name "Cat",
 :type "type",
 :signature ["[cnt left right]"],
 :source {:code "(deftype Cat [cnt left right]\n  cljs.core/ICounted\n  (-count [_] cnt)\n\n  cljs.core/ISeqable\n  (-seq [_] (concat (seq left) (seq right)))\n  \n  cljs.core/IReduce\n  (-reduce [this f1] (-reduce this f1 (f1)))\n  (-reduce\n    [_  f1 init]\n    (-reduce\n     right f1\n     (-reduce left f1 init)))\n\n  #_\n  CollFold\n  #_\n  (coll-fold\n    [this n combinef reducef]\n    (-reduce this reducef)))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [182 202],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/core/reducers.cljs#L182-L202"},
 :full-name-encode "clojure.core.reducers_Cat",
 :history [["+" "0.0-1236"]]}

```
