## cljs.core/PersistentQueue



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentQueue</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentQueue.java)
</td>
</tr>
</table>


 <samp>
(__PersistentQueue.__ meta count front rear __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L3734-L3781):

```clj
(deftype PersistentQueue [meta count front rear ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))

  IWithMeta
  (-with-meta [coll meta] (PersistentQueue. meta count front rear __hash))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (first front))
  (-rest [coll] (rest (seq coll)))

  IStack
  (-peek [coll] (first front))
  (-pop [coll]
    (if front
      (if-let [f1 (next front)]
        (PersistentQueue. meta (dec count) f1 rear nil)
        (PersistentQueue. meta (dec count) (seq rear) [] nil))
      coll))

  ICollection
  (-conj [coll o]
    (if front
      (PersistentQueue. meta (inc count) front (conj (or rear []) o) nil)
      (PersistentQueue. meta (inc count) (conj front o) [] nil)))

  IEmptyableCollection
  (-empty [coll] cljs.core.PersistentQueue/EMPTY)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll]
    (let [rear (seq rear)]
      (if (or front rear)
        (PersistentQueueSeq. nil front (seq rear) nil))))

  ICounted
  (-count [coll] count))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3734-3781](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L3734-L3781)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentQueue` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentQueue)<br>
[`clojure.lang/PersistentQueue` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentQueue/)<br>
[`clojure.lang/PersistentQueue` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentQueue.html)<br>
[`cljs.core/PersistentQueue` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentQueue.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentQueue.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentQueue",
 :signature ["[meta count front rear __hash]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/PersistentQueue",
 :source {:code "(deftype PersistentQueue [meta count front rear ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IWithMeta\n  (-with-meta [coll meta] (PersistentQueue. meta count front rear __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (first front))\n  (-rest [coll] (rest (seq coll)))\n\n  IStack\n  (-peek [coll] (first front))\n  (-pop [coll]\n    (if front\n      (if-let [f1 (next front)]\n        (PersistentQueue. meta (dec count) f1 rear nil)\n        (PersistentQueue. meta (dec count) (seq rear) [] nil))\n      coll))\n\n  ICollection\n  (-conj [coll o]\n    (if front\n      (PersistentQueue. meta (inc count) front (conj (or rear []) o) nil)\n      (PersistentQueue. meta (inc count) (conj front o) [] nil)))\n\n  IEmptyableCollection\n  (-empty [coll] cljs.core.PersistentQueue/EMPTY)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  ISeqable\n  (-seq [coll]\n    (let [rear (seq rear)]\n      (if (or front rear)\n        (PersistentQueueSeq. nil front (seq rear) nil))))\n\n  ICounted\n  (-count [coll] count))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3734 3781]},
 :full-name "cljs.core/PersistentQueue",
 :clj-symbol "clojure.lang/PersistentQueue"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentQueue"]))
```

-->
