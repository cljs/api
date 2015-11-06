## cljs.core/ValSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" title="Added in 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ValSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/APersistentMap.java)
</td>
</tr>
</table>


 <samp>
(__ValSeq.__ mseq _meta)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L7241-L7294):

```clj
(deftype ValSeq [^not-native mseq _meta]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  IMeta
  (-meta [coll] _meta)

  IWithMeta
  (-with-meta [coll new-meta] (ValSeq. mseq new-meta))

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) _meta))

  IHash
  (-hash [coll] (hash-ordered-coll coll))

  ISeq
  (-first [coll]
    (let [^not-native me (-first mseq)]
      (-val me)))

  (-rest [coll]
    (let [nseq (if (satisfies? INext mseq)
                 (-next mseq)
                 (next mseq))]
      (if-not (nil? nseq)
        (ValSeq. nseq _meta)
        ())))

  INext
  (-next [coll]
    (let [nseq (if (satisfies? INext mseq)
                 (-next mseq)
                 (next mseq))]
      (when-not (nil? nseq)
        (ValSeq. nseq _meta))))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7241-7294](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L7241-L7294)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ValSeq` @ clojuredocs](http://clojuredocs.org/clojure.lang/ValSeq)<br>
[`clojure.lang/ValSeq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ValSeq/)<br>
[`clojure.lang/ValSeq` @ crossclj](http://crossclj.info/fun/clojure.lang/ValSeq.html)<br>
[`cljs.core/ValSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ValSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ValSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ValSeq",
 :signature ["[mseq _meta]"],
 :history [["+" "0.0-1820"]],
 :type "type",
 :full-name-encode "cljs.core/ValSeq",
 :source {:code "(deftype ValSeq [^not-native mseq _meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  IMeta\n  (-meta [coll] _meta)\n\n  IWithMeta\n  (-with-meta [coll new-meta] (ValSeq. mseq new-meta))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) _meta))\n\n  IHash\n  (-hash [coll] (hash-ordered-coll coll))\n\n  ISeq\n  (-first [coll]\n    (let [^not-native me (-first mseq)]\n      (-val me)))\n\n  (-rest [coll]\n    (let [nseq (if (satisfies? INext mseq)\n                 (-next mseq)\n                 (next mseq))]\n      (if-not (nil? nseq)\n        (ValSeq. nseq _meta)\n        ())))\n\n  INext\n  (-next [coll]\n    (let [nseq (if (satisfies? INext mseq)\n                 (-next mseq)\n                 (next mseq))]\n      (when-not (nil? nseq)\n        (ValSeq. nseq _meta))))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7241 7294]},
 :full-name "cljs.core/ValSeq",
 :clj-symbol "clojure.lang/ValSeq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ValSeq"]))
```

-->
