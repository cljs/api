## cljs.core/IndexedSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IndexedSeq</samp>](https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/jvm/clojure/lang/IndexedSeq.java)
</td>
</tr>
</table>

<samp>(IndexedSeq. arr i meta)</samp><br>

---

 <samp>
(__IndexedSeq.__ arr i meta)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype IndexedSeq [arr i meta]
  Object
  (toString [coll]
   (pr-str* coll))
  (equiv [this other]
    (-equiv this other))
  (indexOf [coll x]
    (-indexOf coll x 0))
  (indexOf [coll x start]
    (-indexOf coll x start))
  (lastIndexOf [coll x]
    (-lastIndexOf coll x (count coll)))
  (lastIndexOf [coll x start]
    (-lastIndexOf coll x start))

  ICloneable
  (-clone [_] (IndexedSeq. arr i meta))

  ISeqable
  (-seq [this]
    (when (< i (alength arr))
      this))

  IMeta
  (-meta [coll] meta)
  IWithMeta
  (-with-meta [coll new-meta]
    (IndexedSeq. arr i new-meta))

  ASeq
  ISeq
  (-first [_] (aget arr i))
  (-rest [_] (if (< (inc i) (alength arr))
               (IndexedSeq. arr (inc i) nil)
               (list)))

  INext
  (-next [_] (if (< (inc i) (alength arr))
               (IndexedSeq. arr (inc i) nil)
               nil))

  ICounted
  (-count [_]
    (max 0 (- (alength arr) i)))

  IIndexed
  (-nth [coll n]
    (let [i (+ n i)]
      (when (< i (alength arr))
        (aget arr i))))
  (-nth [coll n not-found]
    (let [i (+ n i)]
      (if (< i (alength arr))
        (aget arr i)
        not-found)))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IIterable
  (-iterator [coll]
    (IndexedSeqIterator. arr i))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (.-EMPTY List))

  IReduce
  (-reduce [coll f]
    (array-reduce arr f (aget arr i) (inc i)))
  (-reduce [coll f start]
    (array-reduce arr f start i))

  IHash
  (-hash [coll] (hash-ordered-coll coll))

  IReversible
  (-rseq [coll]
    (let [c (-count coll)]
      (if (pos? c)
        (RSeq. coll (dec c) nil)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

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
 :signature ["[arr i meta]"],
 :name-encode "IndexedSeq",
 :history [["+" "0.0-927"]],
 :type "type",
 :clj-equiv {:full-name "clojure.lang/IndexedSeq",
             :url "https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/jvm/clojure/lang/IndexedSeq.java"},
 :full-name-encode "cljs.core/IndexedSeq",
 :source {:code "(deftype IndexedSeq [arr i meta]\n  Object\n  (toString [coll]\n   (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n  (indexOf [coll x]\n    (-indexOf coll x 0))\n  (indexOf [coll x start]\n    (-indexOf coll x start))\n  (lastIndexOf [coll x]\n    (-lastIndexOf coll x (count coll)))\n  (lastIndexOf [coll x start]\n    (-lastIndexOf coll x start))\n\n  ICloneable\n  (-clone [_] (IndexedSeq. arr i meta))\n\n  ISeqable\n  (-seq [this]\n    (when (< i (alength arr))\n      this))\n\n  IMeta\n  (-meta [coll] meta)\n  IWithMeta\n  (-with-meta [coll new-meta]\n    (IndexedSeq. arr i new-meta))\n\n  ASeq\n  ISeq\n  (-first [_] (aget arr i))\n  (-rest [_] (if (< (inc i) (alength arr))\n               (IndexedSeq. arr (inc i) nil)\n               (list)))\n\n  INext\n  (-next [_] (if (< (inc i) (alength arr))\n               (IndexedSeq. arr (inc i) nil)\n               nil))\n\n  ICounted\n  (-count [_]\n    (max 0 (- (alength arr) i)))\n\n  IIndexed\n  (-nth [coll n]\n    (let [i (+ n i)]\n      (when (< i (alength arr))\n        (aget arr i))))\n  (-nth [coll n not-found]\n    (let [i (+ n i)]\n      (if (< i (alength arr))\n        (aget arr i)\n        not-found)))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IIterable\n  (-iterator [coll]\n    (IndexedSeqIterator. arr i))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (.-EMPTY List))\n\n  IReduce\n  (-reduce [coll f]\n    (array-reduce arr f (aget arr i) (inc i)))\n  (-reduce [coll f start]\n    (array-reduce arr f start i))\n\n  IHash\n  (-hash [coll] (hash-ordered-coll coll))\n\n  IReversible\n  (-rseq [coll]\n    (let [c (-count coll)]\n      (if (pos? c)\n        (RSeq. coll (dec c) nil)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1440 1523],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/core.cljs#L1440-L1523"},
 :usage ["(IndexedSeq. arr i meta)"],
 :full-name "cljs.core/IndexedSeq",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IndexedSeq.cljsdoc"}

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
