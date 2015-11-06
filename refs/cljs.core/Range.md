## cljs.core/Range



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Range</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Range.java)
</td>
</tr>
</table>


 <samp>
(__Range.__ meta start end step __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L6325-L6394):

```clj
(deftype Range [meta start end step ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))

  IWithMeta
  (-with-meta [rng meta] (Range. meta start end step __hash))

  IMeta
  (-meta [rng] meta)

  ISeqable
  (-seq [rng]
    (if (pos? step)
      (when (< start end)
        rng)
      (when (> start end)
        rng)))

  ISeq
  (-first [rng] start)
  (-rest [rng]
    (if-not (nil? (-seq rng))
      (Range. meta (+ start step) end step nil)
      ()))

  INext
  (-next [rng]
    (if (pos? step)
      (when (< (+ start step) end)
        (Range. meta (+ start step) end step nil))
      (when (> (+ start step) end)
        (Range. meta (+ start step) end step nil))))

  ICollection
  (-conj [rng o] (cons o rng))

  IEmptyableCollection
  (-empty [rng] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [rng other] (equiv-sequential rng other))

  IHash
  (-hash [rng] (caching-hash rng hash-coll __hash))

  ICounted
  (-count [rng]
    (if-not (-seq rng)
      0
      (js/Math.ceil (/ (- end start) step))))

  IIndexed
  (-nth [rng n]
    (if (< n (-count rng))
      (+ start (* n step))
      (if (and (> start end) (zero? step))
        start
        (throw (js/Error. "Index out of bounds")))))
  (-nth [rng n not-found]
    (if (< n (-count rng))
      (+ start (* n step))
      (if (and (> start end) (zero? step))
        start
        not-found)))

  IReduce
  (-reduce [rng f] (ci-reduce rng f))
  (-reduce [rng f s] (ci-reduce rng f s)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6325-6394](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L6325-L6394)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Range` @ clojuredocs](http://clojuredocs.org/clojure.lang/Range)<br>
[`clojure.lang/Range` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Range/)<br>
[`clojure.lang/Range` @ crossclj](http://crossclj.info/fun/clojure.lang/Range.html)<br>
[`cljs.core/Range` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Range.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Range.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Range",
 :signature ["[meta start end step __hash]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/Range",
 :source {:code "(deftype Range [meta start end step ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IWithMeta\n  (-with-meta [rng meta] (Range. meta start end step __hash))\n\n  IMeta\n  (-meta [rng] meta)\n\n  ISeqable\n  (-seq [rng]\n    (if (pos? step)\n      (when (< start end)\n        rng)\n      (when (> start end)\n        rng)))\n\n  ISeq\n  (-first [rng] start)\n  (-rest [rng]\n    (if-not (nil? (-seq rng))\n      (Range. meta (+ start step) end step nil)\n      ()))\n\n  INext\n  (-next [rng]\n    (if (pos? step)\n      (when (< (+ start step) end)\n        (Range. meta (+ start step) end step nil))\n      (when (> (+ start step) end)\n        (Range. meta (+ start step) end step nil))))\n\n  ICollection\n  (-conj [rng o] (cons o rng))\n\n  IEmptyableCollection\n  (-empty [rng] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [rng other] (equiv-sequential rng other))\n\n  IHash\n  (-hash [rng] (caching-hash rng hash-coll __hash))\n\n  ICounted\n  (-count [rng]\n    (if-not (-seq rng)\n      0\n      (js/Math.ceil (/ (- end start) step))))\n\n  IIndexed\n  (-nth [rng n]\n    (if (< n (-count rng))\n      (+ start (* n step))\n      (if (and (> start end) (zero? step))\n        start\n        (throw (js/Error. \"Index out of bounds\")))))\n  (-nth [rng n not-found]\n    (if (< n (-count rng))\n      (+ start (* n step))\n      (if (and (> start end) (zero? step))\n        start\n        not-found)))\n\n  IReduce\n  (-reduce [rng f] (ci-reduce rng f))\n  (-reduce [rng f s] (ci-reduce rng f s)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6325 6394]},
 :full-name "cljs.core/Range",
 :clj-symbol "clojure.lang/Range"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Range"]))
```

-->
