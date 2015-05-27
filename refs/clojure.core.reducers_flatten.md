## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/flatten

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__flatten__)<br>
(__flatten__ coll)<br>
</samp>

```
Takes any nested combination of sequential things (lists, vectors,
  etc.) and returns their contents as a single, flat foldable
  collection.
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:119-132](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/core/reducers.cljs#L119-L132)</ins>
</pre>

```clj
(defcurried flatten
  "Takes any nested combination of sequential things (lists, vectors,
  etc.) and returns their contents as a single, flat foldable
  collection."
  {}
  [coll]
  (folder coll
   (fn [f1]
     (fn
       ([] (f1))
       ([ret v]
          (if (sequential? v)
            (-reduce (flatten v) f1 ret)
            (f1 ret v)))))))
```


---

```clj
{:full-name "clojure.core.reducers/flatten",
 :ns "clojure.core.reducers",
 :name "flatten",
 :docstring "Takes any nested combination of sequential things (lists, vectors,\n  etc.) and returns their contents as a single, flat foldable\n  collection.",
 :type "function",
 :signature ["[]" "[coll]"],
 :source {:code "(defcurried flatten\n  \"Takes any nested combination of sequential things (lists, vectors,\n  etc.) and returns their contents as a single, flat foldable\n  collection.\"\n  {}\n  [coll]\n  (folder coll\n   (fn [f1]\n     (fn\n       ([] (f1))\n       ([ret v]\n          (if (sequential? v)\n            (-reduce (flatten v) f1 ret)\n            (f1 ret v)))))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [119 132],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/core/reducers.cljs#L119-L132"},
 :full-name-encode "clojure.core.reducers_flatten",
 :history [["+" "0.0-1236"]]}

```
