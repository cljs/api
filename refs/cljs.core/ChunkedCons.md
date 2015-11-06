## cljs.core/ChunkedCons



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ChunkedCons</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ChunkedCons.java)
</td>
</tr>
</table>


 <samp>
(__ChunkedCons.__ chunk more meta __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L3102-L3162):

```clj
(deftype ChunkedCons [chunk more meta ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))
  
  IWithMeta
  (-with-meta [coll m]
    (ChunkedCons. chunk more m __hash))

  IMeta
  (-meta [coll] meta)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeqable
  (-seq [coll] coll)

  ASeq
  ISeq
  (-first [coll] (-nth chunk 0))
  (-rest [coll]
    (if (> (-count chunk) 1)
      (ChunkedCons. (-drop-first chunk) more meta nil)
      (if (nil? more)
        ()
        more)))

  INext
  (-next [coll]
    (if (> (-count chunk) 1)
      (ChunkedCons. (-drop-first chunk) more meta nil)
      (let [more (-seq more)]
        (when-not (nil? more)
          more))))

  IChunkedSeq
  (-chunked-first [coll] chunk)
  (-chunked-rest [coll]
    (if (nil? more)
      ()
      more))

  IChunkedNext
  (-chunked-next [coll]
    (if (nil? more)
      nil
      more))

  ICollection
  (-conj [this o]
    (cons o this))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) meta))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3102-3162](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L3102-L3162)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ChunkedCons` @ clojuredocs](http://clojuredocs.org/clojure.lang/ChunkedCons)<br>
[`clojure.lang/ChunkedCons` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ChunkedCons/)<br>
[`clojure.lang/ChunkedCons` @ crossclj](http://crossclj.info/fun/clojure.lang/ChunkedCons.html)<br>
[`cljs.core/ChunkedCons` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ChunkedCons.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ChunkedCons.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ChunkedCons",
 :signature ["[chunk more meta __hash]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core/ChunkedCons",
 :source {:code "(deftype ChunkedCons [chunk more meta ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n  \n  IWithMeta\n  (-with-meta [coll m]\n    (ChunkedCons. chunk more m __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ASeq\n  ISeq\n  (-first [coll] (-nth chunk 0))\n  (-rest [coll]\n    (if (> (-count chunk) 1)\n      (ChunkedCons. (-drop-first chunk) more meta nil)\n      (if (nil? more)\n        ()\n        more)))\n\n  INext\n  (-next [coll]\n    (if (> (-count chunk) 1)\n      (ChunkedCons. (-drop-first chunk) more meta nil)\n      (let [more (-seq more)]\n        (when-not (nil? more)\n          more))))\n\n  IChunkedSeq\n  (-chunked-first [coll] chunk)\n  (-chunked-rest [coll]\n    (if (nil? more)\n      ()\n      more))\n\n  IChunkedNext\n  (-chunked-next [coll]\n    (if (nil? more)\n      nil\n      more))\n\n  ICollection\n  (-conj [this o]\n    (cons o this))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) meta))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3102 3162]},
 :full-name "cljs.core/ChunkedCons",
 :clj-symbol "clojure.lang/ChunkedCons"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ChunkedCons"]))
```

-->
