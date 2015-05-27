## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/assoc

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/assoc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/assoc)
</td>
</tr>
</table>

 <samp>
(__assoc__ coll k v)<br>
(__assoc__ coll k v & kvs)<br>
</samp>

```
assoc[iate]. When applied to a map, returns a new map of the
same (hashed/sorted) type, that contains the mapping of key(s) to
val(s). When applied to a vector, returns a new vector that
contains val at index.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:838-849](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L838-L849)</ins>
</pre>

```clj
(defn assoc
  ([coll k v]
     (-assoc coll k v))
  ([coll k v & kvs]
     (let [ret (assoc coll k v)]
       (if kvs
         (recur ret (first kvs) (second kvs) (nnext kvs))
         ret))))
```


---

```clj
{:ns "cljs.core",
 :name "assoc",
 :signature ["[coll k v]" "[coll k v & kvs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_assoc",
 :source {:code "(defn assoc\n  ([coll k v]\n     (-assoc coll k v))\n  ([coll k v & kvs]\n     (let [ret (assoc coll k v)]\n       (if kvs\n         (recur ret (first kvs) (second kvs) (nnext kvs))\n         ret))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [838 849],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L838-L849"},
 :full-name "cljs.core/assoc",
 :clj-symbol "clojure.core/assoc",
 :docstring "assoc[iate]. When applied to a map, returns a new map of the\nsame (hashed/sorted) type, that contains the mapping of key(s) to\nval(s). When applied to a vector, returns a new vector that\ncontains val at index."}

```
