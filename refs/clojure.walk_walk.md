## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/walk

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/walk</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/walk)
</td>
</tr>
</table>

 <samp>
(__walk__ inner outer form)<br>
</samp>

```
Traverses form, an arbitrary data structure.  inner and outer are
functions.  Applies inner to each element of form, building up a
data structure of the same type, then applies outer to the result.
Recognizes all Clojure data structures. Consumes seqs as with doall.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:37-48](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/clojure/walk.cljs#L37-L48)</ins>
</pre>

```clj
(defn walk
  [inner outer form]
  (cond
   (seq? form) (outer (doall (map inner form)))
   (coll? form) (outer (into (empty form) (map inner form)))
   :else (outer form)))
```


---

```clj
{:ns "clojure.walk",
 :name "walk",
 :signature ["[inner outer form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_walk",
 :source {:code "(defn walk\n  [inner outer form]\n  (cond\n   (seq? form) (outer (doall (map inner form)))\n   (coll? form) (outer (into (empty form) (map inner form)))\n   :else (outer form)))",
          :filename "clojurescript/src/cljs/clojure/walk.cljs",
          :lines [37 48],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/clojure/walk.cljs#L37-L48"},
 :full-name "clojure.walk/walk",
 :clj-symbol "clojure.walk/walk",
 :docstring "Traverses form, an arbitrary data structure.  inner and outer are\nfunctions.  Applies inner to each element of form, building up a\ndata structure of the same type, then applies outer to the result.\nRecognizes all Clojure data structures. Consumes seqs as with doall."}

```
