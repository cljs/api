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
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:403-433](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L403-L433)</ins>
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
                     ret)))
        r (:name (cljs.compiler/resolve-var (dissoc &env :locals) t))
        pmasks (prepare-protocol-masks &env t impls)]
    (if (seq impls)
      `(do
         (deftype* ~t ~fields ~pmasks)
         (set! (.-cljs$lang$type ~t) true)
         (set! (.-cljs$lang$ctorPrSeq ~t) (fn [this#] (list ~(core/str r))))
         (extend-type ~t ~@(dt->et impls))
         ~t)
      `(do
         (deftype* ~t ~fields ~pmasks)
         (set! (.-cljs$lang$type ~t) true)
         (set! (.-cljs$lang$ctorPrSeq ~t) (fn [this#] (list ~(core/str r))))
         ~t))))
```


---

```clj
{:full-name "cljs.core/deftype",
 :ns "cljs.core",
 :name "deftype",
 :type "macro",
 :signature ["[t fields & impls]"],
 :source {:code "(defmacro deftype [t fields & impls]\n  (let [adorn-params (fn [sig]\n                       (cons (vary-meta (second sig) assoc :cljs.compiler/fields fields)\n                             (nnext sig)))\n        ;;reshape for extend-type\n        dt->et (fn [specs]\n                 (loop [ret [] s specs]\n                   (if (seq s)\n                     (recur (-> ret\n                                (conj (first s))\n                                (into\n                                 (reduce (fn [v [f sigs]]\n                                           (conj v (cons f (map adorn-params sigs))))\n                                         []\n                                         (group-by first (take-while seq? (next s))))))\n                            (drop-while seq? (next s)))\n                     ret)))\n        r (:name (cljs.compiler/resolve-var (dissoc &env :locals) t))\n        pmasks (prepare-protocol-masks &env t impls)]\n    (if (seq impls)\n      `(do\n         (deftype* ~t ~fields ~pmasks)\n         (set! (.-cljs$lang$type ~t) true)\n         (set! (.-cljs$lang$ctorPrSeq ~t) (fn [this#] (list ~(core/str r))))\n         (extend-type ~t ~@(dt->et impls))\n         ~t)\n      `(do\n         (deftype* ~t ~fields ~pmasks)\n         (set! (.-cljs$lang$type ~t) true)\n         (set! (.-cljs$lang$ctorPrSeq ~t) (fn [this#] (list ~(core/str r))))\n         ~t))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [403 433],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L403-L433"},
 :full-name-encode "cljs.core_deftype",
 :clj-symbol "clojure.core/deftype",
 :history [["+" "0.0-927"]]}

```
