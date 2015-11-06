## cljs.core/LazySeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/LazySeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/LazySeq.java)
</td>
</tr>
</table>


 <samp>
(__LazySeq.__ meta fn s __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L2551-L2613):

```clj
(deftype LazySeq [meta ^:mutable fn ^:mutable s ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))
  (sval [coll]
    (if (nil? fn)
      s
      (do
        (set! s (fn))
        (set! fn nil)
        s)))

  IWithMeta
  (-with-meta [coll meta] (LazySeq. meta fn s __hash))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll]
    (-seq coll)
    (when-not (nil? s)
      (first s)))
  (-rest [coll]
    (-seq coll)
    (if-not (nil? s)
      (rest s)
      ()))

  INext
  (-next [coll]
    (-seq coll)
    (when-not (nil? s)
      (next s)))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))

  ISeqable
  (-seq [coll]
    (.sval coll)
    (when-not (nil? s)
      (loop [ls s]
        (if (instance? LazySeq ls)
          (recur (.sval ls))
          (do (set! s ls)
            (seq s))))))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2551-2613](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L2551-L2613)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/LazySeq` @ clojuredocs](http://clojuredocs.org/clojure.lang/LazySeq)<br>
[`clojure.lang/LazySeq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/LazySeq/)<br>
[`clojure.lang/LazySeq` @ crossclj](http://crossclj.info/fun/clojure.lang/LazySeq.html)<br>
[`cljs.core/LazySeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/LazySeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/LazySeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "LazySeq",
 :signature ["[meta fn s __hash]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/LazySeq",
 :source {:code "(deftype LazySeq [meta ^:mutable fn ^:mutable s ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n  (sval [coll]\n    (if (nil? fn)\n      s\n      (do\n        (set! s (fn))\n        (set! fn nil)\n        s)))\n\n  IWithMeta\n  (-with-meta [coll meta] (LazySeq. meta fn s __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll]\n    (-seq coll)\n    (when-not (nil? s)\n      (first s)))\n  (-rest [coll]\n    (-seq coll)\n    (if-not (nil? s)\n      (rest s)\n      ()))\n\n  INext\n  (-next [coll]\n    (-seq coll)\n    (when-not (nil? s)\n      (next s)))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  ISeqable\n  (-seq [coll]\n    (.sval coll)\n    (when-not (nil? s)\n      (loop [ls s]\n        (if (instance? LazySeq ls)\n          (recur (.sval ls))\n          (do (set! s ls)\n            (seq s))))))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2551 2613]},
 :full-name "cljs.core/LazySeq",
 :clj-symbol "clojure.lang/LazySeq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/LazySeq"]))
```

-->
