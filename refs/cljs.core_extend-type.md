## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/extend-type

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/extend-type</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend-type)
</td>
</tr>
</table>

 <samp>
(__extend-type__ tsym & impls)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:288-345](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L288-L345)</ins>
</pre>

```clj
(defmacro extend-type [tsym & impls]
  (let [resolve #(let [ret (:name (cljs.compiler/resolve-var (dissoc &env :locals) %))]
                   (assert ret (core/str "Can't resolve: " %))
                   ret)
        impl-map (loop [ret {} s impls]
                   (if (seq s)
                     (recur (assoc ret (first s) (take-while seq? (next s)))
                            (drop-while seq? (next s)))
                     ret))]
    (if (base-type tsym)
      (let [t (base-type tsym)
            assign-impls (fn [[p sigs]]
                           (let [psym (resolve p)
                                 pfn-prefix (subs (core/str psym) 0 (clojure.core/inc (.lastIndexOf (core/str psym) ".")))]
                             (cons `(aset ~psym ~t true)
                                   (map (fn [[f & meths]]
                                          `(aset ~(symbol (core/str pfn-prefix f)) ~t (fn ~@meths)))
                                        sigs))))]
        `(do ~@(mapcat assign-impls impl-map)))
      (let [t (resolve tsym)
            prototype-prefix (core/str t ".prototype.")
            assign-impls (fn [[p sigs]]
                           (let [psym (resolve p)
                                 pprefix (protocol-prefix psym)]
                             (if (= p 'Object)
                               (let [adapt-params (fn [[sig & body]]
                                                    (let [[tname & args] sig]
                                                      (list (with-meta (vec args) (meta sig))
                                                            (list* 'this-as tname body))))]
                                 (map (fn [[f & meths]]
                                        `(set! ~(symbol (core/str prototype-prefix f)) (fn ~@(map adapt-params meths))))
                                      sigs))
                               (cons `(set! ~(symbol (core/str prototype-prefix pprefix)) true)
                                     (mapcat (fn [[f & meths]]
                                               (if (= psym 'cljs.core.IFn)
                                                 (let [adapt-params (fn [[[targ & args :as sig] & body]]
                                                                      (let [tsym (gensym "tsym")]
                                                                        `(~(with-meta (vec (cons tsym args)) (meta sig))
                                                                          (this-as ~tsym
                                                                                   (let [~targ ~tsym]
                                                                                     ~@body)))))
                                                       meths (map adapt-params meths)
                                                       tsym (gensym "tsym")
                                                       argsym (gensym "args")]
                                                    [`(set! ~(symbol (core/str prototype-prefix 'call)) (fn ~@meths))
                                                     `(set! ~(symbol (core/str prototype-prefix 'apply))
                                                            (fn ~(with-meta [tsym argsym] (meta (first meths)))
                                                              (.apply (.-call ~tsym) ~tsym
                                                                      (.concat (array ~tsym) (aclone ~argsym)))))])
                                                 (let [pf (core/str prototype-prefix pprefix f)]
                                                   (if (vector? (first meths))
                                                     [`(set! ~(symbol (core/str pf "$arity$" (count (first meths)))) (fn ~@meths))]
                                                     (map (fn [[sig & body :as meth]]
                                                            `(set! ~(symbol (core/str pf "$arity$" (count sig)))
                                                                   (fn ~meth)))
                                                          meths)))))
                                             sigs)))))]
        `(do ~@(mapcat assign-impls impl-map))))))
```


---

```clj
{:full-name "cljs.core/extend-type",
 :ns "cljs.core",
 :name "extend-type",
 :type "macro",
 :signature ["[tsym & impls]"],
 :source {:code "(defmacro extend-type [tsym & impls]\n  (let [resolve #(let [ret (:name (cljs.compiler/resolve-var (dissoc &env :locals) %))]\n                   (assert ret (core/str \"Can't resolve: \" %))\n                   ret)\n        impl-map (loop [ret {} s impls]\n                   (if (seq s)\n                     (recur (assoc ret (first s) (take-while seq? (next s)))\n                            (drop-while seq? (next s)))\n                     ret))]\n    (if (base-type tsym)\n      (let [t (base-type tsym)\n            assign-impls (fn [[p sigs]]\n                           (let [psym (resolve p)\n                                 pfn-prefix (subs (core/str psym) 0 (clojure.core/inc (.lastIndexOf (core/str psym) \".\")))]\n                             (cons `(aset ~psym ~t true)\n                                   (map (fn [[f & meths]]\n                                          `(aset ~(symbol (core/str pfn-prefix f)) ~t (fn ~@meths)))\n                                        sigs))))]\n        `(do ~@(mapcat assign-impls impl-map)))\n      (let [t (resolve tsym)\n            prototype-prefix (core/str t \".prototype.\")\n            assign-impls (fn [[p sigs]]\n                           (let [psym (resolve p)\n                                 pprefix (protocol-prefix psym)]\n                             (if (= p 'Object)\n                               (let [adapt-params (fn [[sig & body]]\n                                                    (let [[tname & args] sig]\n                                                      (list (with-meta (vec args) (meta sig))\n                                                            (list* 'this-as tname body))))]\n                                 (map (fn [[f & meths]]\n                                        `(set! ~(symbol (core/str prototype-prefix f)) (fn ~@(map adapt-params meths))))\n                                      sigs))\n                               (cons `(set! ~(symbol (core/str prototype-prefix pprefix)) true)\n                                     (mapcat (fn [[f & meths]]\n                                               (if (= psym 'cljs.core.IFn)\n                                                 (let [adapt-params (fn [[[targ & args :as sig] & body]]\n                                                                      (let [tsym (gensym \"tsym\")]\n                                                                        `(~(with-meta (vec (cons tsym args)) (meta sig))\n                                                                          (this-as ~tsym\n                                                                                   (let [~targ ~tsym]\n                                                                                     ~@body)))))\n                                                       meths (map adapt-params meths)\n                                                       tsym (gensym \"tsym\")\n                                                       argsym (gensym \"args\")]\n                                                    [`(set! ~(symbol (core/str prototype-prefix 'call)) (fn ~@meths))\n                                                     `(set! ~(symbol (core/str prototype-prefix 'apply))\n                                                            (fn ~(with-meta [tsym argsym] (meta (first meths)))\n                                                              (.apply (.-call ~tsym) ~tsym\n                                                                      (.concat (array ~tsym) (aclone ~argsym)))))])\n                                                 (let [pf (core/str prototype-prefix pprefix f)]\n                                                   (if (vector? (first meths))\n                                                     [`(set! ~(symbol (core/str pf \"$arity$\" (count (first meths)))) (fn ~@meths))]\n                                                     (map (fn [[sig & body :as meth]]\n                                                            `(set! ~(symbol (core/str pf \"$arity$\" (count sig)))\n                                                                   (fn ~meth)))\n                                                          meths)))))\n                                             sigs)))))]\n        `(do ~@(mapcat assign-impls impl-map))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [288 345],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L288-L345"},
 :full-name-encode "cljs.core_extend-type",
 :clj-symbol "clojure.core/extend-type",
 :history [["+" "0.0-927"]]}

```
