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
clojurescript @ r1798
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:508-525](https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L508-L525)</ins>
</pre>

```clj
(defmacro reify [& impls]
  (let [t      (gensym "t")
        meta-sym (gensym "meta")
        this-sym (gensym "_")
        locals (keys (:locals &env))
        ns     (-> &env :ns :name)
        munge  cljs.compiler/munge
        ns-t   (list 'js* (core/str (munge ns) "." (munge t)))]
    `(do
       (when (undefined? ~ns-t)
         (deftype ~t [~@locals ~meta-sym]
           IWithMeta
           (~'-with-meta [~this-sym ~meta-sym]
             (new ~t ~@locals ~meta-sym))
           IMeta
           (~'-meta [~this-sym] ~meta-sym)
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
 :source {:code "(defmacro reify [& impls]\n  (let [t      (gensym \"t\")\n        meta-sym (gensym \"meta\")\n        this-sym (gensym \"_\")\n        locals (keys (:locals &env))\n        ns     (-> &env :ns :name)\n        munge  cljs.compiler/munge\n        ns-t   (list 'js* (core/str (munge ns) \".\" (munge t)))]\n    `(do\n       (when (undefined? ~ns-t)\n         (deftype ~t [~@locals ~meta-sym]\n           IWithMeta\n           (~'-with-meta [~this-sym ~meta-sym]\n             (new ~t ~@locals ~meta-sym))\n           IMeta\n           (~'-meta [~this-sym] ~meta-sym)\n           ~@impls))\n       (new ~t ~@locals nil))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [508 525],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L508-L525"},
 :full-name-encode "cljs.core_reify",
 :clj-symbol "clojure.core/reify",
 :history [["+" "0.0-927"]]}

```
