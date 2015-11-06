## cljs.core/RSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/RSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentVector.java)
</td>
</tr>
</table>


 <samp>
(__RSeq.__ ci i meta)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L736-L777):

```clj
(deftype RSeq [ci i meta]
  Object
  (toString [coll]
    (pr-str* coll))

  IMeta
  (-meta [coll] meta)
  IWithMeta
  (-with-meta [coll new-meta]
    (RSeq. ci i new-meta))

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeq
  (-first [coll]
    (-nth ci i))
  (-rest [coll]
    (if (pos? i)
      (RSeq. ci (dec i) nil)
      ()))

  ICounted
  (-count [coll] (inc i))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  IHash
  (-hash [coll] (hash-coll coll))

  IReduce
  (-reduce [col f] (seq-reduce f col))
  (-reduce [col f start] (seq-reduce f start col)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:736-777](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L736-L777)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/RSeq` @ clojuredocs](http://clojuredocs.org/clojure.lang/RSeq)<br>
[`clojure.lang/RSeq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/RSeq/)<br>
[`clojure.lang/RSeq` @ crossclj](http://crossclj.info/fun/clojure.lang/RSeq.html)<br>
[`cljs.core/RSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/RSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/RSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "RSeq",
 :signature ["[ci i meta]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core/RSeq",
 :source {:code "(deftype RSeq [ci i meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IMeta\n  (-meta [coll] meta)\n  IWithMeta\n  (-with-meta [coll new-meta]\n    (RSeq. ci i new-meta))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ISeq\n  (-first [coll]\n    (-nth ci i))\n  (-rest [coll]\n    (if (pos? i)\n      (RSeq. ci (dec i) nil)\n      ()))\n\n  ICounted\n  (-count [coll] (inc i))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  IReduce\n  (-reduce [col f] (seq-reduce f col))\n  (-reduce [col f start] (seq-reduce f start col)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/cljs/core.cljs",
          :lines [736 777]},
 :full-name "cljs.core/RSeq",
 :clj-symbol "clojure.lang/RSeq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/RSeq"]))
```

-->
