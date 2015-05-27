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
clojurescript @ r1449
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:438-513](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L438-L513)</ins>
</pre>

```clj
(defmacro extend-type [tsym & impls]
  (let [resolve #(let [ret (:name (cljs.analyzer/resolve-var (dissoc &env :locals) %))]
                   (assert ret (core/str "Can't resolve: " %))
                   ret)
        impl-map (loop [ret {} s impls]
                   (if (seq s)
                     (recur (assoc ret (first s) (take-while seq? (next s)))
                            (drop-while seq? (next s)))
                     ret))
        warn-if-not-protocol #(when-not (= 'Object %)
                                (if cljs.analyzer/*cljs-warn-on-undeclared*
                                  (if-let [var (cljs.analyzer/resolve-existing-var (dissoc &env :locals) %)]
                                    (when-not (:protocol-symbol var)
                                      (cljs.analyzer/warning &env
                                        (core/str "WARNING: Symbol " % " is not a protocol")))
                                    (cljs.analyzer/warning &env
                                      (core/str "WARNING: Can't resolve protocol symbol " %)))))
        skip-flag (set (-> tsym meta :skip-protocol-flag))]
    (if (base-type tsym)
      (let [t (base-type tsym)
            assign-impls (fn [[p sigs]]
                           (warn-if-not-protocol p)
                           (let [psym (resolve p)
                                 pfn-prefix (subs (core/str psym) 0 (clojure.core/inc (.indexOf (core/str psym) "/")))]
                             (cons `(aset ~psym ~t true)
                                   (map (fn [[f & meths :as form]]
                                          `(aset ~(symbol (core/str pfn-prefix f)) ~t ~(with-meta `(fn ~@meths) (meta form))))
                                        sigs))))]
        `(do ~@(mapcat assign-impls impl-map)))
      (let [t (resolve tsym)
            prototype-prefix (fn [sym]
                               `(.. ~tsym -prototype ~(to-property sym)))
            assign-impls (fn [[p sigs]]
                           (warn-if-not-protocol p)
                           (let [psym (resolve p)
                                 pprefix (protocol-prefix psym)]
                             (if (= p 'Object)
                               (let [adapt-params (fn [[sig & body]]
                                                    (let [[tname & args] sig]
                                                      (list (vec args) (list* 'this-as (vary-meta tname assoc :tag t) body))))]
                                 (map (fn [[f & meths :as form]]
                                        `(set! ~(prototype-prefix f)
                                               ~(with-meta `(fn ~@(map adapt-params meths)) (meta form))))
                                      sigs))
                               (concat (when-not (skip-flag psym)
                                         [`(set! ~(prototype-prefix pprefix) true)])
                                       (mapcat (fn [[f & meths :as form]]
                                                 (if (= psym 'cljs.core/IFn)
                                                   (let [adapt-params (fn [[[targ & args :as sig] & body]]
                                                                        (let [this-sym (with-meta (gensym "this-sym") {:tag t})]
                                                                          `(~(vec (cons this-sym args))
                                                                            (this-as ~this-sym
                                                                                     (let [~targ ~this-sym]
                                                                                       ~@body)))))
                                                         meths (map adapt-params meths)
                                                         this-sym (with-meta (gensym "this-sym") {:tag t})
                                                         argsym (gensym "args")]
                                                     [`(set! ~(prototype-prefix 'call) ~(with-meta `(fn ~@meths) (meta form)))
                                                      `(set! ~(prototype-prefix 'apply)
                                                             ~(with-meta
                                                                `(fn ~[this-sym argsym]
                                                                   (.apply (.-call ~this-sym) ~this-sym
                                                                           (.concat (array ~this-sym) (aclone ~argsym))))
                                                                (meta form)))])
                                                   (let [pf (core/str pprefix f)
                                                         adapt-params (fn [[[targ & args :as sig] & body]]
                                                                        (cons (vec (cons (vary-meta targ assoc :tag t) args))
                                                                              body))]
                                                     (if (vector? (first meths))
                                                       [`(set! ~(prototype-prefix (core/str pf "$arity$" (count (first meths)))) ~(with-meta `(fn ~@(adapt-params meths)) (meta form)))]
                                                       (map (fn [[sig & body :as meth]]
                                                              `(set! ~(prototype-prefix (core/str pf "$arity$" (count sig)))
                                                                     ~(with-meta `(fn ~(adapt-params meth)) (meta form))))
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
 :source {:code "(defmacro extend-type [tsym & impls]\n  (let [resolve #(let [ret (:name (cljs.analyzer/resolve-var (dissoc &env :locals) %))]\n                   (assert ret (core/str \"Can't resolve: \" %))\n                   ret)\n        impl-map (loop [ret {} s impls]\n                   (if (seq s)\n                     (recur (assoc ret (first s) (take-while seq? (next s)))\n                            (drop-while seq? (next s)))\n                     ret))\n        warn-if-not-protocol #(when-not (= 'Object %)\n                                (if cljs.analyzer/*cljs-warn-on-undeclared*\n                                  (if-let [var (cljs.analyzer/resolve-existing-var (dissoc &env :locals) %)]\n                                    (when-not (:protocol-symbol var)\n                                      (cljs.analyzer/warning &env\n                                        (core/str \"WARNING: Symbol \" % \" is not a protocol\")))\n                                    (cljs.analyzer/warning &env\n                                      (core/str \"WARNING: Can't resolve protocol symbol \" %)))))\n        skip-flag (set (-> tsym meta :skip-protocol-flag))]\n    (if (base-type tsym)\n      (let [t (base-type tsym)\n            assign-impls (fn [[p sigs]]\n                           (warn-if-not-protocol p)\n                           (let [psym (resolve p)\n                                 pfn-prefix (subs (core/str psym) 0 (clojure.core/inc (.indexOf (core/str psym) \"/\")))]\n                             (cons `(aset ~psym ~t true)\n                                   (map (fn [[f & meths :as form]]\n                                          `(aset ~(symbol (core/str pfn-prefix f)) ~t ~(with-meta `(fn ~@meths) (meta form))))\n                                        sigs))))]\n        `(do ~@(mapcat assign-impls impl-map)))\n      (let [t (resolve tsym)\n            prototype-prefix (fn [sym]\n                               `(.. ~tsym -prototype ~(to-property sym)))\n            assign-impls (fn [[p sigs]]\n                           (warn-if-not-protocol p)\n                           (let [psym (resolve p)\n                                 pprefix (protocol-prefix psym)]\n                             (if (= p 'Object)\n                               (let [adapt-params (fn [[sig & body]]\n                                                    (let [[tname & args] sig]\n                                                      (list (vec args) (list* 'this-as (vary-meta tname assoc :tag t) body))))]\n                                 (map (fn [[f & meths :as form]]\n                                        `(set! ~(prototype-prefix f)\n                                               ~(with-meta `(fn ~@(map adapt-params meths)) (meta form))))\n                                      sigs))\n                               (concat (when-not (skip-flag psym)\n                                         [`(set! ~(prototype-prefix pprefix) true)])\n                                       (mapcat (fn [[f & meths :as form]]\n                                                 (if (= psym 'cljs.core/IFn)\n                                                   (let [adapt-params (fn [[[targ & args :as sig] & body]]\n                                                                        (let [this-sym (with-meta (gensym \"this-sym\") {:tag t})]\n                                                                          `(~(vec (cons this-sym args))\n                                                                            (this-as ~this-sym\n                                                                                     (let [~targ ~this-sym]\n                                                                                       ~@body)))))\n                                                         meths (map adapt-params meths)\n                                                         this-sym (with-meta (gensym \"this-sym\") {:tag t})\n                                                         argsym (gensym \"args\")]\n                                                     [`(set! ~(prototype-prefix 'call) ~(with-meta `(fn ~@meths) (meta form)))\n                                                      `(set! ~(prototype-prefix 'apply)\n                                                             ~(with-meta\n                                                                `(fn ~[this-sym argsym]\n                                                                   (.apply (.-call ~this-sym) ~this-sym\n                                                                           (.concat (array ~this-sym) (aclone ~argsym))))\n                                                                (meta form)))])\n                                                   (let [pf (core/str pprefix f)\n                                                         adapt-params (fn [[[targ & args :as sig] & body]]\n                                                                        (cons (vec (cons (vary-meta targ assoc :tag t) args))\n                                                                              body))]\n                                                     (if (vector? (first meths))\n                                                       [`(set! ~(prototype-prefix (core/str pf \"$arity$\" (count (first meths)))) ~(with-meta `(fn ~@(adapt-params meths)) (meta form)))]\n                                                       (map (fn [[sig & body :as meth]]\n                                                              `(set! ~(prototype-prefix (core/str pf \"$arity$\" (count sig)))\n                                                                     ~(with-meta `(fn ~(adapt-params meth)) (meta form))))\n                                                            meths)))))\n                                               sigs)))))]\n        `(do ~@(mapcat assign-impls impl-map))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [438 513],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/core.clj#L438-L513"},
 :full-name-encode "cljs.core_extend-type",
 :clj-symbol "clojure.core/extend-type",
 :history [["+" "0.0-927"]]}

```
