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
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:395-417](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L395-L417)</ins>
</pre>

```clj
(defmacro defprotocol [psym & doc+methods]
  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))
        ns-name (-> &env :ns :name)
        fqn (fn [n] (symbol (str ns-name "." n)))
        prefix (protocol-prefix p)
        methods (if (string? (first doc+methods)) (next doc+methods) doc+methods)
        expand-sig (fn [fname slot sig]
                     `(~sig
                       (if (and ~(first sig) (. ~(first sig) ~(symbol (str "-" slot)))) ;; Property access needed here.
                         (. ~(first sig) ~slot ~@sig)
                         ((or
                           (aget ~(fqn fname) (goog.typeOf ~(first sig)))
                           (aget ~(fqn fname) "_")
                           (throw (missing-protocol
                                    ~(str psym "." fname) ~(first sig))))
                          ~@sig))))
        method (fn [[fname & sigs]]
                 (let [sigs (take-while vector? sigs)
                       slot (symbol (str prefix (name fname)))]
                   `(defn ~fname ~@(map #(expand-sig fname slot %) sigs))))]
    `(do
       (def ~psym (~'js* "{}"))
       ~@(map method methods))))
```


---

```clj
{:full-name "cljs.core/defprotocol",
 :ns "cljs.core",
 :name "defprotocol",
 :type "macro",
 :signature ["[psym & doc+methods]"],
 :source {:code "(defmacro defprotocol [psym & doc+methods]\n  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))\n        ns-name (-> &env :ns :name)\n        fqn (fn [n] (symbol (str ns-name \".\" n)))\n        prefix (protocol-prefix p)\n        methods (if (string? (first doc+methods)) (next doc+methods) doc+methods)\n        expand-sig (fn [fname slot sig]\n                     `(~sig\n                       (if (and ~(first sig) (. ~(first sig) ~(symbol (str \"-\" slot)))) ;; Property access needed here.\n                         (. ~(first sig) ~slot ~@sig)\n                         ((or\n                           (aget ~(fqn fname) (goog.typeOf ~(first sig)))\n                           (aget ~(fqn fname) \"_\")\n                           (throw (missing-protocol\n                                    ~(str psym \".\" fname) ~(first sig))))\n                          ~@sig))))\n        method (fn [[fname & sigs]]\n                 (let [sigs (take-while vector? sigs)\n                       slot (symbol (str prefix (name fname)))]\n                   `(defn ~fname ~@(map #(expand-sig fname slot %) sigs))))]\n    `(do\n       (def ~psym (~'js* \"{}\"))\n       ~@(map method methods))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [395 417],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L395-L417"},
 :full-name-encode "cljs.core_defprotocol",
 :clj-symbol "clojure.core/defprotocol",
 :history [["+" "0.0-927"]]}

```
