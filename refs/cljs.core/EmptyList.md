## cljs.core/EmptyList



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/EmptyList</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentList.java)
</td>
</tr>
</table>


 <samp>
(__EmptyList.__ meta)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L2739-L2793):

```clj
(deftype EmptyList [meta]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  IList

  ICloneable
  (-clone [_] (EmptyList. meta))

  IWithMeta
  (-with-meta [coll meta] (EmptyList. meta))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] nil)
  (-rest [coll] ())

  INext
  (-next [coll] nil)

  IStack
  (-peek [coll] nil)
  (-pop [coll] (throw (js/Error. "Can't pop empty list")))

  ICollection
  (-conj [coll o] (List. meta o nil 1 nil))

  IEmptyableCollection
  (-empty [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other]
    (if (or (list? other)
            (sequential? other))
      (nil? (seq other))
      false))

  IHash
  (-hash [coll] empty-ordered-hash)

  ISeqable
  (-seq [coll] nil)

  ICounted
  (-count [coll] 0)

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2739-2793](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L2739-L2793)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/EmptyList` @ clojuredocs](http://clojuredocs.org/clojure.lang/EmptyList)<br>
[`clojure.lang/EmptyList` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/EmptyList/)<br>
[`clojure.lang/EmptyList` @ crossclj](http://crossclj.info/fun/clojure.lang/EmptyList.html)<br>
[`cljs.core/EmptyList` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/EmptyList.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/EmptyList.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "EmptyList",
 :signature ["[meta]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/EmptyList",
 :source {:code "(deftype EmptyList [meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  IList\n\n  ICloneable\n  (-clone [_] (EmptyList. meta))\n\n  IWithMeta\n  (-with-meta [coll meta] (EmptyList. meta))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] nil)\n  (-rest [coll] ())\n\n  INext\n  (-next [coll] nil)\n\n  IStack\n  (-peek [coll] nil)\n  (-pop [coll] (throw (js/Error. \"Can't pop empty list\")))\n\n  ICollection\n  (-conj [coll o] (List. meta o nil 1 nil))\n\n  IEmptyableCollection\n  (-empty [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other]\n    (if (or (list? other)\n            (sequential? other))\n      (nil? (seq other))\n      false))\n\n  IHash\n  (-hash [coll] empty-ordered-hash)\n\n  ISeqable\n  (-seq [coll] nil)\n\n  ICounted\n  (-count [coll] 0)\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2739 2793]},
 :full-name "cljs.core/EmptyList",
 :clj-symbol "clojure.lang/EmptyList"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/EmptyList"]))
```

-->
