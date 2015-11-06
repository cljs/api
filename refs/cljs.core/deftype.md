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







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/clj/cljs/core.clj#L707-L729):

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
         (set! (.-cljs$lang$ctorStr ~t) ~(core/str r))
         (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opt#] (-write writer# ~(core/str r))))
         (extend-type ~t ~@(dt->et t impls fields true))
         ~(build-positional-factory t r fields)
         ~t)
      `(do
         (deftype* ~t ~fields ~pmasks)
         (set! (.-cljs$lang$type ~t) true)
         (set! (.-cljs$lang$ctorStr ~t) ~(core/str r))
         (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opts#] (-write writer# ~(core/str r))))
         ~(build-positional-factory t r fields)
         ~t))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:707-729](https://github.com/clojure/clojurescript/blob/r1889/src/clj/cljs/core.clj#L707-L729)</ins>
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
 :source {:code "(defmacro deftype [t fields & impls]\n  (let [r (:name (cljs.analyzer/resolve-var (dissoc &env :locals) t))\n        [fpps pmasks] (prepare-protocol-masks &env t impls)\n        protocols (collect-protocols impls &env)\n        t (vary-meta t assoc\n            :protocols protocols\n            :skip-protocol-flag fpps) ]\n    (if (seq impls)\n      `(do\n         (deftype* ~t ~fields ~pmasks)\n         (set! (.-cljs$lang$type ~t) true)\n         (set! (.-cljs$lang$ctorStr ~t) ~(core/str r))\n         (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opt#] (-write writer# ~(core/str r))))\n         (extend-type ~t ~@(dt->et t impls fields true))\n         ~(build-positional-factory t r fields)\n         ~t)\n      `(do\n         (deftype* ~t ~fields ~pmasks)\n         (set! (.-cljs$lang$type ~t) true)\n         (set! (.-cljs$lang$ctorStr ~t) ~(core/str r))\n         (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opts#] (-write writer# ~(core/str r))))\n         ~(build-positional-factory t r fields)\n         ~t))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/clj/cljs/core.clj",
          :lines [707 729]},
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
