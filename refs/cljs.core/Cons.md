## cljs.core/Cons



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Cons</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Cons.java)
</td>
</tr>
</table>


 <samp>
(__Cons.__ meta first rest)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L1201-L1226):

```clj
(deftype Cons [meta first rest]
  IWithMeta
  (-with-meta [coll meta] (Cons. meta first rest))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest))

  ICollection
  (-conj [coll o] (Cons. nil o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll] coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1201-1226](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L1201-L1226)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Cons` @ clojuredocs](http://clojuredocs.org/clojure.lang/Cons)<br>
[`clojure.lang/Cons` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Cons/)<br>
[`clojure.lang/Cons` @ crossclj](http://crossclj.info/fun/clojure.lang/Cons.html)<br>
[`cljs.core/Cons` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Cons.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Cons.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Cons",
 :signature ["[meta first rest]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/Cons",
 :source {:code "(deftype Cons [meta first rest]\n  IWithMeta\n  (-with-meta [coll meta] (Cons. meta first rest))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] first)\n  (-rest [coll] (if (nil? rest) () rest))\n\n  ICollection\n  (-conj [coll o] (Cons. nil o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll] coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1201 1226]},
 :full-name "cljs.core/Cons",
 :clj-symbol "clojure.lang/Cons"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Cons"]))
```

-->
