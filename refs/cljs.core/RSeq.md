## cljs.core/RSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/RSeq</samp>](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/APersistentVector.java)
</td>
</tr>
</table>

<samp>(RSeq. ci i meta)</samp><br>

---

 <samp>
(__RSeq.__ ci i meta)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype RSeq [ci i meta]
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
  (-clone [_] (RSeq. ci i meta))

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
  
  INext
  (-next [coll]
    (when (pos? i)
      (RSeq. ci (dec i) nil)))

  ICounted
  (-count [coll] (inc i))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) meta))

  IHash
  (-hash [coll] (hash-ordered-coll coll))

  IReduce
  (-reduce [col f] (seq-reduce f col))
  (-reduce [col f start] (seq-reduce f start col)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

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
 :name-encode "RSeq",
 :history [["+" "0.0-1424"]],
 :type "type",
 :clj-equiv {:full-name "clojure.lang/RSeq",
             :url "https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/APersistentVector.java"},
 :full-name-encode "cljs.core/RSeq",
 :source {:code "(deftype RSeq [ci i meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n  (indexOf [coll x]\n    (-indexOf coll x 0))\n  (indexOf [coll x start]\n    (-indexOf coll x start))\n  (lastIndexOf [coll x]\n    (-lastIndexOf coll x (count coll)))\n  (lastIndexOf [coll x start]\n    (-lastIndexOf coll x start))\n\n  ICloneable\n  (-clone [_] (RSeq. ci i meta))\n\n  IMeta\n  (-meta [coll] meta)\n  IWithMeta\n  (-with-meta [coll new-meta]\n    (RSeq. ci i new-meta))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ISeq\n  (-first [coll]\n    (-nth ci i))\n  (-rest [coll]\n    (if (pos? i)\n      (RSeq. ci (dec i) nil)\n      ()))\n  \n  INext\n  (-next [coll]\n    (when (pos? i)\n      (RSeq. ci (dec i) nil)))\n\n  ICounted\n  (-count [coll] (inc i))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) meta))\n\n  IHash\n  (-hash [coll] (hash-ordered-coll coll))\n\n  IReduce\n  (-reduce [col f] (seq-reduce f col))\n  (-reduce [col f start] (seq-reduce f start col)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1538 1597],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L1538-L1597"},
 :usage ["(RSeq. ci i meta)"],
 :full-name "cljs.core/RSeq",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/RSeq.cljsdoc"}

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
