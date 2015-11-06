## cljs.core/deftype



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/deftype</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/deftype)
</td>
</tr>
</table>


 <samp>
(__deftype__ t fields & impls)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L236-L257):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:236-257](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L236-L257)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/deftype` @ clojuredocs](http://clojuredocs.org/clojure.core/deftype)<br>
[`clojure.core/deftype` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/deftype/)<br>
[`clojure.core/deftype` @ crossclj](http://crossclj.info/fun/clojure.core/deftype.html)<br>
[`cljs.core/deftype` @ crossclj](http://crossclj.info/fun/cljs.core/deftype.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/deftype.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "deftype",
 :signature ["[t fields & impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/deftype",
 :source {:code "(defmacro deftype [t fields & impls]\n  (let [adorn-params (fn [sig]\n                       (cons (vary-meta (second sig) assoc :cljs.compiler/fields fields)\n                             (nnext sig)))\n        ;;reshape for extend-type\n        dt->et (fn [specs]\n                 (loop [ret [] s specs]\n                   (if (seq s)\n                     (recur (-> ret\n                                (conj (first s))\n                                (into\n                                 (reduce (fn [v [f sigs]]\n                                           (conj v (cons f (map adorn-params sigs))))\n                                         []\n                                         (group-by first (take-while seq? (next s))))))\n                            (drop-while seq? (next s)))\n                     ret)))]\n    (if (seq impls)\n      `(do\n         (deftype* ~t ~fields)\n         (extend-type ~t ~@(dt->et impls)))\n      `(deftype* ~t ~fields))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/clj/cljs/core.clj",
          :lines [236 257]},
 :full-name "cljs.core/deftype",
 :clj-symbol "clojure.core/deftype"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/deftype"]))
```

-->
