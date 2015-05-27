## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defprotocol

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defprotocol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defprotocol)
</td>
</tr>
</table>

 <samp>
(__defprotocol__ psym & doc+methods)<br>
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
            └── <ins>[core.clj:796-827](https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L796-L827)</ins>
</pre>

```clj
(defmacro defprotocol [psym & doc+methods]
  (let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))
        psym (vary-meta psym assoc :protocol-symbol true)
        ns-name (-> &env :ns :name)
        fqn (fn [n] (symbol (core/str ns-name "." n)))
        prefix (protocol-prefix p)
        methods (if (core/string? (first doc+methods)) (next doc+methods) doc+methods)
        expand-sig (fn [fname slot sig]
                     `(~sig
                       (if (and ~(first sig) (. ~(first sig) ~(symbol (core/str "-" slot)))) ;; Property access needed here.
                         (. ~(first sig) ~slot ~@sig)
                         (let [x# (if (nil? ~(first sig)) nil ~(first sig))]
                           ((or
                             (aget ~(fqn fname) (goog.typeOf x#))
                             (aget ~(fqn fname) "_")
                             (throw (missing-protocol
                                     ~(core/str psym "." fname) ~(first sig))))
                            ~@sig)))))
        method (fn [[fname & sigs]]
                 (let [sigs (take-while vector? sigs)
                       slot (symbol (core/str prefix (name fname)))
                       fname (vary-meta fname assoc :protocol p)]
                   `(defn ~fname ~@(map (fn [sig]
                                          (expand-sig fname
                                                      (symbol (core/str slot "$arity$" (count sig)))
                                                      sig))
                                        sigs))))]
    `(do
       (set! ~'*unchecked-if* true)
       (def ~psym (~'js* "{}"))
       ~@(map method methods)
       (set! ~'*unchecked-if* false))))
```


---

```clj
{:full-name "cljs.core/defprotocol",
 :ns "cljs.core",
 :name "defprotocol",
 :type "macro",
 :signature ["[psym & doc+methods]"],
 :source {:code "(defmacro defprotocol [psym & doc+methods]\n  (let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))\n        psym (vary-meta psym assoc :protocol-symbol true)\n        ns-name (-> &env :ns :name)\n        fqn (fn [n] (symbol (core/str ns-name \".\" n)))\n        prefix (protocol-prefix p)\n        methods (if (core/string? (first doc+methods)) (next doc+methods) doc+methods)\n        expand-sig (fn [fname slot sig]\n                     `(~sig\n                       (if (and ~(first sig) (. ~(first sig) ~(symbol (core/str \"-\" slot)))) ;; Property access needed here.\n                         (. ~(first sig) ~slot ~@sig)\n                         (let [x# (if (nil? ~(first sig)) nil ~(first sig))]\n                           ((or\n                             (aget ~(fqn fname) (goog.typeOf x#))\n                             (aget ~(fqn fname) \"_\")\n                             (throw (missing-protocol\n                                     ~(core/str psym \".\" fname) ~(first sig))))\n                            ~@sig)))))\n        method (fn [[fname & sigs]]\n                 (let [sigs (take-while vector? sigs)\n                       slot (symbol (core/str prefix (name fname)))\n                       fname (vary-meta fname assoc :protocol p)]\n                   `(defn ~fname ~@(map (fn [sig]\n                                          (expand-sig fname\n                                                      (symbol (core/str slot \"$arity$\" (count sig)))\n                                                      sig))\n                                        sigs))))]\n    `(do\n       (set! ~'*unchecked-if* true)\n       (def ~psym (~'js* \"{}\"))\n       ~@(map method methods)\n       (set! ~'*unchecked-if* false))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [796 827],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L796-L827"},
 :full-name-encode "cljs.core_defprotocol",
 :clj-symbol "clojure.core/defprotocol",
 :history [["+" "0.0-927"]]}

```
