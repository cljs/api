## cljs.core/reify



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reify</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reify)
</td>
</tr>
</table>


 <samp>
(__reify__ & impls)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L299-L314):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:299-314](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L299-L314)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reify` @ clojuredocs](http://clojuredocs.org/clojure.core/reify)<br>
[`clojure.core/reify` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reify/)<br>
[`clojure.core/reify` @ crossclj](http://crossclj.info/fun/clojure.core/reify.html)<br>
[`cljs.core/reify` @ crossclj](http://crossclj.info/fun/cljs.core/reify.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reify.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "reify",
 :signature ["[& impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/reify",
 :source {:code "(defmacro reify [& impls]\n  (let [t      (gensym \"t\")\n        locals (keys (:locals &env))\n        ns     (-> &env :ns :name)\n        munge  cljs.compiler/munge\n        ns-t   (list 'js* (core/str (munge ns) \".\" (munge t)))]\n    `(do\n       (when (undefined? ~ns-t)\n         (deftype ~t [~@locals __meta#]\n           cljs.core.IWithMeta\n           (~'-with-meta [_# __meta#]\n             (new ~t ~@locals __meta#))\n           cljs.core.IMeta\n           (~'-meta [_#] __meta#)\n           ~@impls))\n       (new ~t ~@locals nil))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/core.clj",
          :lines [299 314]},
 :full-name "cljs.core/reify",
 :clj-symbol "clojure.core/reify"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reify"]))
```

-->
