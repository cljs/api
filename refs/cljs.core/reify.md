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







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/core.clj#L613-L629):

```clj
(defmacro reify [& impls]
  (let [t        (with-meta (gensym "t") {:anonymous true})
        meta-sym (gensym "meta")
        this-sym (gensym "_")
        locals   (keys (:locals &env))
        ns       (-> &env :ns :name)
        munge    cljs.compiler/munge]
    `(do
       (when-not (exists? ~(symbol (core/str ns) (core/str t)))
         (deftype ~t [~@locals ~meta-sym]
           IWithMeta
           (~'-with-meta [~this-sym ~meta-sym]
             (new ~t ~@locals ~meta-sym))
           IMeta
           (~'-meta [~this-sym] ~meta-sym)
           ~@impls))
       (new ~t ~@locals ~(meta &form)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:613-629](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/core.clj#L613-L629)</ins>
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
 :source {:code "(defmacro reify [& impls]\n  (let [t        (with-meta (gensym \"t\") {:anonymous true})\n        meta-sym (gensym \"meta\")\n        this-sym (gensym \"_\")\n        locals   (keys (:locals &env))\n        ns       (-> &env :ns :name)\n        munge    cljs.compiler/munge]\n    `(do\n       (when-not (exists? ~(symbol (core/str ns) (core/str t)))\n         (deftype ~t [~@locals ~meta-sym]\n           IWithMeta\n           (~'-with-meta [~this-sym ~meta-sym]\n             (new ~t ~@locals ~meta-sym))\n           IMeta\n           (~'-meta [~this-sym] ~meta-sym)\n           ~@impls))\n       (new ~t ~@locals ~(meta &form)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/clj/cljs/core.clj",
          :lines [613 629]},
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
