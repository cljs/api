## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/deftype

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/deftype</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/deftype)
</td>
</tr>
</table>

 <samp>
(__deftype__ t fields & impls)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:236-257](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L236-L257)</ins>
</pre>

```clj
(defmacro deftype [t fields & impls]
  (let [adorn-params (fn [sig]
                       (cons (vary-meta (second sig) assoc :cljs.compiler/fields fields)
                             (nnext sig)))
        ;;reshape for extend-type
        dt->et (fn [specs]
                 (loop [ret [] s specs]
                   (if (seq s)
                     (recur (-> ret
                                (conj (first s))
                                (into
                                 (reduce (fn [v [f sigs]]
                                           (conj v (cons f (map adorn-params sigs))))
                                         []
                                         (group-by first (take-while seq? (next s))))))
                            (drop-while seq? (next s)))
                     ret)))]
    (if (seq impls)
      `(do
         (deftype* ~t ~fields)
         (extend-type ~t ~@(dt->et impls)))
      `(deftype* ~t ~fields))))
```


---

```clj
{:full-name "cljs.core/deftype",
 :ns "cljs.core",
 :name "deftype",
 :type "macro",
 :signature ["[t fields & impls]"],
 :source {:code "(defmacro deftype [t fields & impls]\n  (let [adorn-params (fn [sig]\n                       (cons (vary-meta (second sig) assoc :cljs.compiler/fields fields)\n                             (nnext sig)))\n        ;;reshape for extend-type\n        dt->et (fn [specs]\n                 (loop [ret [] s specs]\n                   (if (seq s)\n                     (recur (-> ret\n                                (conj (first s))\n                                (into\n                                 (reduce (fn [v [f sigs]]\n                                           (conj v (cons f (map adorn-params sigs))))\n                                         []\n                                         (group-by first (take-while seq? (next s))))))\n                            (drop-while seq? (next s)))\n                     ret)))]\n    (if (seq impls)\n      `(do\n         (deftype* ~t ~fields)\n         (extend-type ~t ~@(dt->et impls)))\n      `(deftype* ~t ~fields))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [236 257],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L236-L257"},
 :full-name-encode "cljs.core_deftype",
 :clj-symbol "clojure.core/deftype",
 :history [["+" "0.0-927"]]}

```
