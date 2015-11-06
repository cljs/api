## cljs.core/TransientHashSet



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/TransientHashSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashSet.java)
</td>
</tr>
</table>


 <samp>
(__TransientHashSet.__ transient-map)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L7066-L7101):

```clj
(deftype TransientHashSet [^:mutable transient-map]
  ITransientCollection
  (-conj! [tcoll o]
    (set! transient-map (assoc! transient-map o nil))
    tcoll)

  (-persistent! [tcoll]
    (PersistentHashSet. nil (persistent! transient-map) nil))

  ITransientSet
  (-disjoin! [tcoll v]
    (set! transient-map (dissoc! transient-map v))
    tcoll)

  ICounted
  (-count [tcoll] (count transient-map))

  ILookup
  (-lookup [tcoll v]
    (-lookup tcoll v nil))

  (-lookup [tcoll v not-found]
    (if (identical? (-lookup transient-map v lookup-sentinel) lookup-sentinel)
      not-found
      v))

  IFn
  (-invoke [tcoll k]
    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)
      nil
      k))

  (-invoke [tcoll k not-found]
    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)
      not-found
      k)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7066-7101](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L7066-L7101)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/TransientHashSet` @ clojuredocs](http://clojuredocs.org/clojure.lang/TransientHashSet)<br>
[`clojure.lang/TransientHashSet` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/TransientHashSet/)<br>
[`clojure.lang/TransientHashSet` @ crossclj](http://crossclj.info/fun/clojure.lang/TransientHashSet.html)<br>
[`cljs.core/TransientHashSet` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/TransientHashSet.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/TransientHashSet.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "TransientHashSet",
 :signature ["[transient-map]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/TransientHashSet",
 :source {:code "(deftype TransientHashSet [^:mutable transient-map]\n  ITransientCollection\n  (-conj! [tcoll o]\n    (set! transient-map (assoc! transient-map o nil))\n    tcoll)\n\n  (-persistent! [tcoll]\n    (PersistentHashSet. nil (persistent! transient-map) nil))\n\n  ITransientSet\n  (-disjoin! [tcoll v]\n    (set! transient-map (dissoc! transient-map v))\n    tcoll)\n\n  ICounted\n  (-count [tcoll] (count transient-map))\n\n  ILookup\n  (-lookup [tcoll v]\n    (-lookup tcoll v nil))\n\n  (-lookup [tcoll v not-found]\n    (if (identical? (-lookup transient-map v lookup-sentinel) lookup-sentinel)\n      not-found\n      v))\n\n  IFn\n  (-invoke [tcoll k]\n    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)\n      nil\n      k))\n\n  (-invoke [tcoll k not-found]\n    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)\n      not-found\n      k)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7066 7101]},
 :full-name "cljs.core/TransientHashSet",
 :clj-symbol "clojure.lang/TransientHashSet"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/TransientHashSet"]))
```

-->
