## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reify

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reify</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reify)
</td>
</tr>
</table>

 <samp>
(__reify__ & impls)<br>
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
            └── <ins>[core.clj:299-314](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L299-L314)</ins>
</pre>

```clj
(defmacro reify [& impls]
  (let [t      (gensym "t")
        locals (keys (:locals &env))
        ns     (-> &env :ns :name)
        munge  cljs.compiler/munge
        ns-t   (list 'js* (core/str (munge ns) "." (munge t)))]
    `(do
       (when (undefined? ~ns-t)
         (deftype ~t [~@locals __meta#]
           cljs.core.IWithMeta
           (~'-with-meta [_# __meta#]
             (new ~t ~@locals __meta#))
           cljs.core.IMeta
           (~'-meta [_#] __meta#)
           ~@impls))
       (new ~t ~@locals nil))))
```


---

```clj
{:full-name "cljs.core/reify",
 :ns "cljs.core",
 :name "reify",
 :type "macro",
 :signature ["[& impls]"],
 :source {:code "(defmacro reify [& impls]\n  (let [t      (gensym \"t\")\n        locals (keys (:locals &env))\n        ns     (-> &env :ns :name)\n        munge  cljs.compiler/munge\n        ns-t   (list 'js* (core/str (munge ns) \".\" (munge t)))]\n    `(do\n       (when (undefined? ~ns-t)\n         (deftype ~t [~@locals __meta#]\n           cljs.core.IWithMeta\n           (~'-with-meta [_# __meta#]\n             (new ~t ~@locals __meta#))\n           cljs.core.IMeta\n           (~'-meta [_#] __meta#)\n           ~@impls))\n       (new ~t ~@locals nil))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [299 314],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L299-L314"},
 :full-name-encode "cljs.core_reify",
 :clj-symbol "clojure.core/reify",
 :history [["+" "0.0-927"]]}

```
