## cljs.core/defrecord



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defrecord</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defrecord)
</td>
</tr>
</table>


 <samp>
(__defrecord__ rsym fields & impls)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2280/src/clj/cljs/core.clj#L978-L990):

```clj
(defmacro defrecord [rsym fields & impls]
  (let [rsym (vary-meta rsym assoc :internal-ctor true)
        r    (vary-meta
               (:name (cljs.analyzer/resolve-var (dissoc &env :locals) rsym))
               assoc :internal-ctor true)]
    `(let []
       ~(emit-defrecord &env rsym r fields impls)
       (set! (.-cljs$lang$type ~r) true)
       (set! (.-cljs$lang$ctorPrSeq ~r) (fn [this#] (core/list ~(core/str r))))
       (set! (.-cljs$lang$ctorPrWriter ~r) (fn [this# writer#] (-write writer# ~(core/str r))))
       ~(build-positional-factory rsym r fields)
       ~(build-map-factory rsym r fields)
       ~r)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2280
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:978-990](https://github.com/clojure/clojurescript/blob/r2280/src/clj/cljs/core.clj#L978-L990)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/defrecord` @ clojuredocs](http://clojuredocs.org/clojure.core/defrecord)<br>
[`clojure.core/defrecord` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defrecord/)<br>
[`clojure.core/defrecord` @ crossclj](http://crossclj.info/fun/clojure.core/defrecord.html)<br>
[`cljs.core/defrecord` @ crossclj](http://crossclj.info/fun/cljs.core/defrecord.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defrecord.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "defrecord",
 :signature ["[rsym fields & impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/defrecord",
 :source {:code "(defmacro defrecord [rsym fields & impls]\n  (let [rsym (vary-meta rsym assoc :internal-ctor true)\n        r    (vary-meta\n               (:name (cljs.analyzer/resolve-var (dissoc &env :locals) rsym))\n               assoc :internal-ctor true)]\n    `(let []\n       ~(emit-defrecord &env rsym r fields impls)\n       (set! (.-cljs$lang$type ~r) true)\n       (set! (.-cljs$lang$ctorPrSeq ~r) (fn [this#] (core/list ~(core/str r))))\n       (set! (.-cljs$lang$ctorPrWriter ~r) (fn [this# writer#] (-write writer# ~(core/str r))))\n       ~(build-positional-factory rsym r fields)\n       ~(build-map-factory rsym r fields)\n       ~r)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/clj/cljs/core.clj",
          :lines [978 990]},
 :full-name "cljs.core/defrecord",
 :clj-symbol "clojure.core/defrecord"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defrecord"]))
```

-->
