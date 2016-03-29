## cljs.core/PersistentTreeMapSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(PersistentTreeMapSeq. meta stack ascending? cnt __hash)</samp><br>

---

 <samp>
(__PersistentTreeMapSeq.__ meta stack ascending? cnt __hash)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype PersistentTreeMapSeq [meta stack ^boolean ascending? cnt ^:mutable __hash]
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

  ISeqable
  (-seq [this] this)

  ISequential
  ISeq
  (-first [this] (peek stack))
  (-rest [this]
    (let [t (first stack)
          next-stack (tree-map-seq-push (if ascending? (.-right t) (.-left t))
                                        (next stack)
                                        ascending?)]
      (if-not (nil? next-stack)
        (PersistentTreeMapSeq. nil next-stack ascending? (dec cnt) nil)
        ())))

  ICounted
  (-count [coll]
    (if (neg? cnt)
      (inc (count (next coll)))
      cnt))

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) meta))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))

  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta]
    (PersistentTreeMapSeq. meta stack ascending? cnt __hash))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentTreeMapSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentTreeMapSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentTreeMapSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentTreeMapSeq",
 :signature ["[meta stack ascending? cnt __hash]"],
 :name-encode "PersistentTreeMapSeq",
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/PersistentTreeMapSeq",
 :source {:code "(deftype PersistentTreeMapSeq [meta stack ^boolean ascending? cnt ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n  (indexOf [coll x]\n    (-indexOf coll x 0))\n  (indexOf [coll x start]\n    (-indexOf coll x start))\n  (lastIndexOf [coll x]\n    (-lastIndexOf coll x (count coll)))\n  (lastIndexOf [coll x start]\n    (-lastIndexOf coll x start))\n\n  ISeqable\n  (-seq [this] this)\n\n  ISequential\n  ISeq\n  (-first [this] (peek stack))\n  (-rest [this]\n    (let [t (first stack)\n          next-stack (tree-map-seq-push (if ascending? (.-right t) (.-left t))\n                                        (next stack)\n                                        ascending?)]\n      (if-not (nil? next-stack)\n        (PersistentTreeMapSeq. nil next-stack ascending? (dec cnt) nil)\n        ())))\n\n  ICounted\n  (-count [coll]\n    (if (neg? cnt)\n      (inc (count (next coll)))\n      cnt))\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) meta))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IWithMeta\n  (-with-meta [coll meta]\n    (PersistentTreeMapSeq. meta stack ascending? cnt __hash))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [7263 7320],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L7263-L7320"},
 :usage ["(PersistentTreeMapSeq. meta stack ascending? cnt __hash)"],
 :full-name "cljs.core/PersistentTreeMapSeq",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentTreeMapSeq.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentTreeMapSeq"]))
```

-->
