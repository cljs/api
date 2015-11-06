## cljs.core/defprotocol



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defprotocol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defprotocol)
</td>
</tr>
</table>


 <samp>
(__defprotocol__ psym & doc+methods)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/core.clj#L1008-L1049):

```clj
(defmacro defprotocol [psym & doc+methods]
  (let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))
        psym (vary-meta psym assoc :protocol-symbol true)
        ns-name (-> &env :ns :name)
        fqn (fn [n] (symbol (core/str ns-name "." n)))
        prefix (protocol-prefix p)
        methods (if (core/string? (first doc+methods)) (next doc+methods) doc+methods)
        _ (core/doseq [[mname & arities] methods]
            (when (some #{0} (map count arities))
              (throw (Exception. (core/str "Invalid protocol, " psym " defines method " mname " with arity 0")))))
        expand-sig (fn [fname slot sig]
                     `(~sig
                       (if (and ~(first sig) (. ~(first sig) ~(symbol (core/str "-" slot)))) ;; Property access needed here.
                         (. ~(first sig) ~slot ~@sig)
                         (let [x# (if (nil? ~(first sig)) nil ~(first sig))]
                           ((or
                             (aget ~(fqn fname) (goog/typeOf x#))
                             (aget ~(fqn fname) "_")
                             (throw (missing-protocol
                                     ~(core/str psym "." fname) ~(first sig))))
                            ~@sig)))))
        psym   (vary-meta psym assoc-in [:protocol-info :methods]
                 (into {}
                   (map
                     (fn [[fname & sigs]]
                       (let [sigs (take-while vector? sigs)]
                         [fname (vec sigs)]))
                     methods)))
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
       (def ~psym (js-obj))
       ~@(map method methods)
       (set! ~'*unchecked-if* false))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2496
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1008-1049](https://github.com/clojure/clojurescript/blob/r2496/src/clj/cljs/core.clj#L1008-L1049)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/defprotocol` @ clojuredocs](http://clojuredocs.org/clojure.core/defprotocol)<br>
[`clojure.core/defprotocol` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defprotocol/)<br>
[`clojure.core/defprotocol` @ crossclj](http://crossclj.info/fun/clojure.core/defprotocol.html)<br>
[`cljs.core/defprotocol` @ crossclj](http://crossclj.info/fun/cljs.core/defprotocol.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defprotocol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "defprotocol",
 :signature ["[psym & doc+methods]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/defprotocol",
 :source {:code "(defmacro defprotocol [psym & doc+methods]\n  (let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))\n        psym (vary-meta psym assoc :protocol-symbol true)\n        ns-name (-> &env :ns :name)\n        fqn (fn [n] (symbol (core/str ns-name \".\" n)))\n        prefix (protocol-prefix p)\n        methods (if (core/string? (first doc+methods)) (next doc+methods) doc+methods)\n        _ (core/doseq [[mname & arities] methods]\n            (when (some #{0} (map count arities))\n              (throw (Exception. (core/str \"Invalid protocol, \" psym \" defines method \" mname \" with arity 0\")))))\n        expand-sig (fn [fname slot sig]\n                     `(~sig\n                       (if (and ~(first sig) (. ~(first sig) ~(symbol (core/str \"-\" slot)))) ;; Property access needed here.\n                         (. ~(first sig) ~slot ~@sig)\n                         (let [x# (if (nil? ~(first sig)) nil ~(first sig))]\n                           ((or\n                             (aget ~(fqn fname) (goog/typeOf x#))\n                             (aget ~(fqn fname) \"_\")\n                             (throw (missing-protocol\n                                     ~(core/str psym \".\" fname) ~(first sig))))\n                            ~@sig)))))\n        psym   (vary-meta psym assoc-in [:protocol-info :methods]\n                 (into {}\n                   (map\n                     (fn [[fname & sigs]]\n                       (let [sigs (take-while vector? sigs)]\n                         [fname (vec sigs)]))\n                     methods)))\n        method (fn [[fname & sigs]]\n                 (let [sigs (take-while vector? sigs)\n                       slot (symbol (core/str prefix (name fname)))\n                       fname (vary-meta fname assoc :protocol p)]\n                   `(defn ~fname ~@(map (fn [sig]\n                                          (expand-sig fname\n                                                      (symbol (core/str slot \"$arity$\" (count sig)))\n                                                      sig))\n                                        sigs))))]\n    `(do\n       (set! ~'*unchecked-if* true)\n       (def ~psym (js-obj))\n       ~@(map method methods)\n       (set! ~'*unchecked-if* false))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/clj/cljs/core.clj",
          :lines [1008 1049]},
 :full-name "cljs.core/defprotocol",
 :clj-symbol "clojure.core/defprotocol"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defprotocol"]))
```

-->
