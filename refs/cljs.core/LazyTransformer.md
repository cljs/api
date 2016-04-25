## cljs.core/LazyTransformer



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(LazyTransformer. stepper first rest meta)</samp><br>

---

 <samp>
(__LazyTransformer.__ stepper first rest meta)<br>
</samp>

---







Source code @ [github]():

```clj
(deftype LazyTransformer [^:mutable stepper ^:mutable first ^:mutable rest meta]
  Object
  (indexOf [coll x]
    (-indexOf coll x 0))
  (indexOf [coll x start]
    (-indexOf coll x start))
  (lastIndexOf [coll x]
    (-lastIndexOf coll x (count coll)))
  (lastIndexOf [coll x start]
    (-lastIndexOf coll x start))

  IWithMeta
  (-with-meta [this new-meta]
    (LazyTransformer. stepper first rest new-meta))

  IMeta
  (-meta [this] meta)

  ICollection
  (-conj [this o]
    (cons o (-seq this)))

  IEmptyableCollection
  (-empty [this]
    ())

  ISequential
  IEquiv
  (-equiv [this other]
    (let [s (-seq this)]
      (if-not (nil? s)
        (equiv-sequential this other)
        (and (sequential? other)
             (nil? (seq other))))))

  IHash
  (-hash [this]
    (hash-ordered-coll this))

  ISeqable
  (-seq [this]
    (when-not (nil? stepper)
      (.step stepper this))
    (if (nil? rest)
      nil
      this))

  ISeq
  (-first [this]
    (when-not (nil? stepper)
      (-seq this))
    (if (nil? rest)
      nil
      first))

  (-rest [this]
    (when-not (nil? stepper)
      (-seq this))
    (if (nil? rest)
      ()
      rest))

  INext
  (-next [this]
    (when-not (nil? stepper)
      (-seq this))
    (if (nil? rest)
      nil
      (-seq rest))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/LazyTransformer` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/LazyTransformer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/LazyTransformer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "LazyTransformer",
 :signature ["[stepper first rest meta]"],
 :name-encode "LazyTransformer",
 :history [["+" "0.0-2301"]],
 :type "type",
 :full-name-encode "cljs.core/LazyTransformer",
 :source {:code "(deftype LazyTransformer [^:mutable stepper ^:mutable first ^:mutable rest meta]\n  Object\n  (indexOf [coll x]\n    (-indexOf coll x 0))\n  (indexOf [coll x start]\n    (-indexOf coll x start))\n  (lastIndexOf [coll x]\n    (-lastIndexOf coll x (count coll)))\n  (lastIndexOf [coll x start]\n    (-lastIndexOf coll x start))\n\n  IWithMeta\n  (-with-meta [this new-meta]\n    (LazyTransformer. stepper first rest new-meta))\n\n  IMeta\n  (-meta [this] meta)\n\n  ICollection\n  (-conj [this o]\n    (cons o (-seq this)))\n\n  IEmptyableCollection\n  (-empty [this]\n    ())\n\n  ISequential\n  IEquiv\n  (-equiv [this other]\n    (let [s (-seq this)]\n      (if-not (nil? s)\n        (equiv-sequential this other)\n        (and (sequential? other)\n             (nil? (seq other))))))\n\n  IHash\n  (-hash [this]\n    (hash-ordered-coll this))\n\n  ISeqable\n  (-seq [this]\n    (when-not (nil? stepper)\n      (.step stepper this))\n    (if (nil? rest)\n      nil\n      this))\n\n  ISeq\n  (-first [this]\n    (when-not (nil? stepper)\n      (-seq this))\n    (if (nil? rest)\n      nil\n      first))\n\n  (-rest [this]\n    (when-not (nil? stepper)\n      (-seq this))\n    (if (nil? rest)\n      ()\n      rest))\n\n  INext\n  (-next [this]\n    (when-not (nil? stepper)\n      (-seq this))\n    (if (nil? rest)\n      nil\n      (-seq rest))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3775 3843],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L3775-L3843"},
 :usage ["(LazyTransformer. stepper first rest meta)"],
 :full-name "cljs.core/LazyTransformer",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/LazyTransformer.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/LazyTransformer"]))
```

-->
