## cljs.core/PersistentQueueSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(PersistentQueueSeq. meta front rear __hash)</samp><br>

---

 <samp>
(__PersistentQueueSeq.__ meta front rear __hash)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype PersistentQueueSeq [meta front rear ^:mutable __hash]
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

  IWithMeta
  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear __hash))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (first front))
  (-rest  [coll]
    (if-let [f1 (next front)]
      (PersistentQueueSeq. meta f1 rear nil)
      (if (nil? rear)
        (-empty coll)
        (PersistentQueueSeq. meta rear nil nil))))

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
  (-seq [coll] coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentQueueSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentQueueSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentQueueSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentQueueSeq",
 :signature ["[meta front rear __hash]"],
 :name-encode "PersistentQueueSeq",
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/PersistentQueueSeq",
 :source {:code "(deftype PersistentQueueSeq [meta front rear ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n  (indexOf [coll x]\n    (-indexOf coll x 0))\n  (indexOf [coll x start]\n    (-indexOf coll x start))\n  (lastIndexOf [coll x]\n    (-lastIndexOf coll x (count coll)))\n  (lastIndexOf [coll x start]\n    (-lastIndexOf coll x start))\n\n  IWithMeta\n  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (first front))\n  (-rest  [coll]\n    (if-let [f1 (next front)]\n      (PersistentQueueSeq. meta f1 rear nil)\n      (if (nil? rear)\n        (-empty coll)\n        (PersistentQueueSeq. meta rear nil nil))))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  ISeqable\n  (-seq [coll] coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5527 5571],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L5527-L5571"},
 :usage ["(PersistentQueueSeq. meta front rear __hash)"],
 :full-name "cljs.core/PersistentQueueSeq",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentQueueSeq.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentQueueSeq"]))
```

-->
