## cljs.core/IndexedSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IndexedSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IndexedSeq.java)
</td>
</tr>
</table>


 <samp>
(__IndexedSeq.__ a i)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L332-L369):

```clj
(deftype IndexedSeq [a i]
  ISeqable
  (-seq [this] this)
  ISeq
  (-first [_] (aget a i))
  (-rest [_] (if (< (inc i) (.-length a))
               (IndexedSeq. a (inc i))
               (list)))

  ICounted
  (-count [_] (- (.-length a) i))

  IIndexed
  (-nth [coll n]
    (let [i (+ n i)]
      (when (< i (.-length a))
        (aget a i))))
  (-nth [coll n not-found]
    (let [i (+ n i)]
      (if (< i (.-length a))
        (aget a i)
        not-found)))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o] (cons o coll))

  IReduce
  (-reduce [_ f]
    (ci-reduce a f (aget a i) (inc i)))
  (-reduce [_ f start]
    (ci-reduce a f start i))

  IHash
  (-hash [coll] (hash-coll coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:332-369](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L332-L369)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IndexedSeq` @ clojuredocs](http://clojuredocs.org/clojure.lang/IndexedSeq)<br>
[`clojure.lang/IndexedSeq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IndexedSeq/)<br>
[`clojure.lang/IndexedSeq` @ crossclj](http://crossclj.info/fun/clojure.lang/IndexedSeq.html)<br>
[`cljs.core/IndexedSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IndexedSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IndexedSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IndexedSeq",
 :signature ["[a i]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/IndexedSeq",
 :source {:code "(deftype IndexedSeq [a i]\n  ISeqable\n  (-seq [this] this)\n  ISeq\n  (-first [_] (aget a i))\n  (-rest [_] (if (< (inc i) (.-length a))\n               (IndexedSeq. a (inc i))\n               (list)))\n\n  ICounted\n  (-count [_] (- (.-length a) i))\n\n  IIndexed\n  (-nth [coll n]\n    (let [i (+ n i)]\n      (when (< i (.-length a))\n        (aget a i))))\n  (-nth [coll n not-found]\n    (let [i (+ n i)]\n      (if (< i (.-length a))\n        (aget a i)\n        not-found)))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IReduce\n  (-reduce [_ f]\n    (ci-reduce a f (aget a i) (inc i)))\n  (-reduce [_ f start]\n    (ci-reduce a f start i))\n\n  IHash\n  (-hash [coll] (hash-coll coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/cljs/core.cljs",
          :lines [332 369]},
 :full-name "cljs.core/IndexedSeq",
 :clj-symbol "clojure.lang/IndexedSeq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IndexedSeq"]))
```

-->
