## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash-set

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-set)
</td>
</tr>
</table>

 <samp>
(__hash-set__)<br>
(__hash-set__ & keys)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6080-6100](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L6080-L6100)</ins>
</pre>

```clj
(defn hash-set
  ([] cljs.core.PersistentHashSet/EMPTY)
  ([& ^not-native keys]
     (if (and (instance? IndexedSeq keys)
              (< (alength (.-arr keys)) cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD))
       (let [karr (.-arr keys)
             klen (alength karr)
             alen (* 2 klen)
             arr  (make-array alen)]
         (loop [ki 0]
           (if (< ki klen)
             (let [ai (* 2 ki)]
               (aset arr ai (aget karr ki))
               (aset arr (inc ai) nil)
               (recur (inc ki)))
             (cljs.core.PersistentHashSet/fromArray arr true))))
       (loop [in keys
              ^not-native out (-as-transient cljs.core.PersistentHashSet/EMPTY)]
         (if-not (nil? in)
           (recur (-next in) (-conj! out (-first in)))
           (-persistent! out))))))
```


---

```clj
{:full-name "cljs.core/hash-set",
 :ns "cljs.core",
 :name "hash-set",
 :type "function",
 :signature ["[]" "[& keys]"],
 :source {:code "(defn hash-set\n  ([] cljs.core.PersistentHashSet/EMPTY)\n  ([& ^not-native keys]\n     (if (and (instance? IndexedSeq keys)\n              (< (alength (.-arr keys)) cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD))\n       (let [karr (.-arr keys)\n             klen (alength karr)\n             alen (* 2 klen)\n             arr  (make-array alen)]\n         (loop [ki 0]\n           (if (< ki klen)\n             (let [ai (* 2 ki)]\n               (aset arr ai (aget karr ki))\n               (aset arr (inc ai) nil)\n               (recur (inc ki)))\n             (cljs.core.PersistentHashSet/fromArray arr true))))\n       (loop [in keys\n              ^not-native out (-as-transient cljs.core.PersistentHashSet/EMPTY)]\n         (if-not (nil? in)\n           (recur (-next in) (-conj! out (-first in)))\n           (-persistent! out))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6080 6100],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L6080-L6100"},
 :full-name-encode "cljs.core_hash-set",
 :clj-symbol "clojure.core/hash-set",
 :history [["+" "0.0-1443"]]}

```
