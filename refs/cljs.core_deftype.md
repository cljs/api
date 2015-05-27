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
clojurescript @ r1586
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:572-592](https://github.com/clojure/clojurescript/blob/r1586/src/clj/cljs/core.clj#L572-L592)</ins>
</pre>

```clj
(defmacro deftype [t fields & impls]
  (let [r (:name (cljs.analyzer/resolve-var (dissoc &env :locals) t))
        [fpps pmasks] (prepare-protocol-masks &env t impls)
        protocols (collect-protocols impls &env)
        t (vary-meta t assoc
            :protocols protocols
            :skip-protocol-flag fpps) ]
    (if (seq impls)
      `(do
         (deftype* ~t ~fields ~pmasks)
         (set! (.-cljs$lang$type ~t) true)
         (set! (.-cljs$lang$ctorPrSeq ~t) (fn [this#] (list ~(core/str r))))
         (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opt#] (-write writer# ~(core/str r))))
         (extend-type ~t ~@(dt->et t impls fields true))
         ~t)
      `(do
         (deftype* ~t ~fields ~pmasks)
         (set! (.-cljs$lang$type ~t) true)
         (set! (.-cljs$lang$ctorPrSeq ~t) (fn [this#] (list ~(core/str r))))
         (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opts#] (-write writer# ~(core/str r))))
         ~t))))
```


---

```clj
{:full-name "cljs.core/deftype",
 :ns "cljs.core",
 :name "deftype",
 :type "macro",
 :signature ["[t fields & impls]"],
 :source {:code "(defmacro deftype [t fields & impls]\n  (let [r (:name (cljs.analyzer/resolve-var (dissoc &env :locals) t))\n        [fpps pmasks] (prepare-protocol-masks &env t impls)\n        protocols (collect-protocols impls &env)\n        t (vary-meta t assoc\n            :protocols protocols\n            :skip-protocol-flag fpps) ]\n    (if (seq impls)\n      `(do\n         (deftype* ~t ~fields ~pmasks)\n         (set! (.-cljs$lang$type ~t) true)\n         (set! (.-cljs$lang$ctorPrSeq ~t) (fn [this#] (list ~(core/str r))))\n         (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opt#] (-write writer# ~(core/str r))))\n         (extend-type ~t ~@(dt->et t impls fields true))\n         ~t)\n      `(do\n         (deftype* ~t ~fields ~pmasks)\n         (set! (.-cljs$lang$type ~t) true)\n         (set! (.-cljs$lang$ctorPrSeq ~t) (fn [this#] (list ~(core/str r))))\n         (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opts#] (-write writer# ~(core/str r))))\n         ~t))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [572 592],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/clj/cljs/core.clj#L572-L592"},
 :full-name-encode "cljs.core_deftype",
 :clj-symbol "clojure.core/deftype",
 :history [["+" "0.0-927"]]}

```
