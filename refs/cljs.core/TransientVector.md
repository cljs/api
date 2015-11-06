## cljs.core/TransientVector



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/TransientVector</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentVector.java)
</td>
</tr>
</table>


 <samp>
(__TransientVector.__ cnt shift root tail)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L5200-L5329):

```clj
(deftype TransientVector [^:mutable cnt
                          ^:mutable shift
                          ^:mutable root
                          ^:mutable tail]
  ITransientCollection
  (-conj! [tcoll o]
    (if ^boolean (.-edit root)
      (if (< (- cnt (tail-off tcoll)) 32)
        (do (aset tail (bit-and cnt 0x01f) o)
            (set! cnt (inc cnt))
            tcoll)
        (let [tail-node (VectorNode. (.-edit root) tail)
              new-tail  (make-array 32)]
          (aset new-tail 0 o)
          (set! tail new-tail)
          (if (> (bit-shift-right-zero-fill cnt 5)
                 (bit-shift-left 1 shift))
            (let [new-root-array (make-array 32)
                  new-shift      (+ shift 5)]
              (aset new-root-array 0 root)
              (aset new-root-array 1 (new-path (.-edit root) shift tail-node))
              (set! root  (VectorNode. (.-edit root) new-root-array))
              (set! shift new-shift)
              (set! cnt   (inc cnt))
              tcoll)
            (let [new-root (tv-push-tail tcoll shift root tail-node)]
              (set! root new-root)
              (set! cnt  (inc cnt))
              tcoll))))
      (throw (js/Error. "conj! after persistent!"))))

  (-persistent! [tcoll]
    (if ^boolean (.-edit root)
      (do (set! (.-edit root) nil)
          (let [len (- cnt (tail-off tcoll))
                trimmed-tail (make-array len)]
            (array-copy tail 0 trimmed-tail 0 len)
            (PersistentVector. nil cnt shift root trimmed-tail nil)))
      (throw (js/Error. "persistent! called twice"))))

  ITransientAssociative
  (-assoc! [tcoll key val]
    (if (number? key)
      (-assoc-n! tcoll key val)
      (throw (js/Error. "TransientVector's key for assoc! must be a number."))))

  ITransientVector
  (-assoc-n! [tcoll n val]
    (if ^boolean (.-edit root)
      (cond
        (and (<= 0 n) (< n cnt))
        (if (<= (tail-off tcoll) n)
          (do (aset tail (bit-and n 0x01f) val)
              tcoll)
          (let [new-root
                ((fn go [level node]
                   (let [node (tv-ensure-editable (.-edit root) node)]
                     (if (zero? level)
                       (do (pv-aset node (bit-and n 0x01f) val)
                           node)
                       (let [subidx (bit-and (bit-shift-right-zero-fill n level)
                                             0x01f)]
                         (pv-aset node subidx
                                  (go (- level 5) (pv-aget node subidx)))
                         node))))
                 shift root)]
            (set! root new-root)
            tcoll))
        (== n cnt) (-conj! tcoll val)
        :else
        (throw
         (js/Error.
          (str "Index " n " out of bounds for TransientVector of length" cnt))))
      (throw (js/Error. "assoc! after persistent!"))))

  (-pop! [tcoll]
    (if ^boolean (.-edit root)
      (cond
        (zero? cnt) (throw (js/Error. "Can't pop empty vector"))
        (== 1 cnt)                       (do (set! cnt 0) tcoll)
        (pos? (bit-and (dec cnt) 0x01f)) (do (set! cnt (dec cnt)) tcoll)
        :else
        (let [new-tail (unchecked-editable-array-for tcoll (- cnt 2))
              new-root (let [nr (tv-pop-tail tcoll shift root)]
                         (if-not (nil? nr)
                           nr
                           (VectorNode. (.-edit root) (make-array 32))))]
          (if (and (< 5 shift) (nil? (pv-aget new-root 1)))
            (let [new-root (tv-ensure-editable (.-edit root) (pv-aget new-root 0))]
              (set! root  new-root)
              (set! shift (- shift 5))
              (set! cnt   (dec cnt))
              (set! tail  new-tail)
              tcoll)
            (do (set! root new-root)
                (set! cnt  (dec cnt))
                (set! tail new-tail)
                tcoll))))
      (throw (js/Error. "pop! after persistent!"))))

  ICounted
  (-count [coll]
    (if ^boolean (.-edit root)
      cnt
      (throw (js/Error. "count after persistent!"))))

  IIndexed
  (-nth [coll n]
    (if ^boolean (.-edit root)
      (aget (array-for coll n) (bit-and n 0x01f))
      (throw (js/Error. "nth after persistent!"))))

  (-nth [coll n not-found]
    (if (and (<= 0 n) (< n cnt))
      (-nth coll n)
      not-found))

  ILookup
  (-lookup [coll k] (-lookup coll k nil))

  (-lookup [coll k not-found] (if (number? k)
                                (-nth coll k not-found)
                                not-found))

  IFn
  (-invoke [coll k]
    (-lookup coll k))

  (-invoke [coll k not-found]
    (-lookup coll k not-found)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:5200-5329](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L5200-L5329)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/TransientVector` @ clojuredocs](http://clojuredocs.org/clojure.lang/TransientVector)<br>
[`clojure.lang/TransientVector` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/TransientVector/)<br>
[`clojure.lang/TransientVector` @ crossclj](http://crossclj.info/fun/clojure.lang/TransientVector.html)<br>
[`cljs.core/TransientVector` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/TransientVector.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/TransientVector.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "TransientVector",
 :signature ["[cnt shift root tail]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/TransientVector",
 :source {:code "(deftype TransientVector [^:mutable cnt\n                          ^:mutable shift\n                          ^:mutable root\n                          ^:mutable tail]\n  ITransientCollection\n  (-conj! [tcoll o]\n    (if ^boolean (.-edit root)\n      (if (< (- cnt (tail-off tcoll)) 32)\n        (do (aset tail (bit-and cnt 0x01f) o)\n            (set! cnt (inc cnt))\n            tcoll)\n        (let [tail-node (VectorNode. (.-edit root) tail)\n              new-tail  (make-array 32)]\n          (aset new-tail 0 o)\n          (set! tail new-tail)\n          (if (> (bit-shift-right-zero-fill cnt 5)\n                 (bit-shift-left 1 shift))\n            (let [new-root-array (make-array 32)\n                  new-shift      (+ shift 5)]\n              (aset new-root-array 0 root)\n              (aset new-root-array 1 (new-path (.-edit root) shift tail-node))\n              (set! root  (VectorNode. (.-edit root) new-root-array))\n              (set! shift new-shift)\n              (set! cnt   (inc cnt))\n              tcoll)\n            (let [new-root (tv-push-tail tcoll shift root tail-node)]\n              (set! root new-root)\n              (set! cnt  (inc cnt))\n              tcoll))))\n      (throw (js/Error. \"conj! after persistent!\"))))\n\n  (-persistent! [tcoll]\n    (if ^boolean (.-edit root)\n      (do (set! (.-edit root) nil)\n          (let [len (- cnt (tail-off tcoll))\n                trimmed-tail (make-array len)]\n            (array-copy tail 0 trimmed-tail 0 len)\n            (PersistentVector. nil cnt shift root trimmed-tail nil)))\n      (throw (js/Error. \"persistent! called twice\"))))\n\n  ITransientAssociative\n  (-assoc! [tcoll key val]\n    (if (number? key)\n      (-assoc-n! tcoll key val)\n      (throw (js/Error. \"TransientVector's key for assoc! must be a number.\"))))\n\n  ITransientVector\n  (-assoc-n! [tcoll n val]\n    (if ^boolean (.-edit root)\n      (cond\n        (and (<= 0 n) (< n cnt))\n        (if (<= (tail-off tcoll) n)\n          (do (aset tail (bit-and n 0x01f) val)\n              tcoll)\n          (let [new-root\n                ((fn go [level node]\n                   (let [node (tv-ensure-editable (.-edit root) node)]\n                     (if (zero? level)\n                       (do (pv-aset node (bit-and n 0x01f) val)\n                           node)\n                       (let [subidx (bit-and (bit-shift-right-zero-fill n level)\n                                             0x01f)]\n                         (pv-aset node subidx\n                                  (go (- level 5) (pv-aget node subidx)))\n                         node))))\n                 shift root)]\n            (set! root new-root)\n            tcoll))\n        (== n cnt) (-conj! tcoll val)\n        :else\n        (throw\n         (js/Error.\n          (str \"Index \" n \" out of bounds for TransientVector of length\" cnt))))\n      (throw (js/Error. \"assoc! after persistent!\"))))\n\n  (-pop! [tcoll]\n    (if ^boolean (.-edit root)\n      (cond\n        (zero? cnt) (throw (js/Error. \"Can't pop empty vector\"))\n        (== 1 cnt)                       (do (set! cnt 0) tcoll)\n        (pos? (bit-and (dec cnt) 0x01f)) (do (set! cnt (dec cnt)) tcoll)\n        :else\n        (let [new-tail (unchecked-editable-array-for tcoll (- cnt 2))\n              new-root (let [nr (tv-pop-tail tcoll shift root)]\n                         (if-not (nil? nr)\n                           nr\n                           (VectorNode. (.-edit root) (make-array 32))))]\n          (if (and (< 5 shift) (nil? (pv-aget new-root 1)))\n            (let [new-root (tv-ensure-editable (.-edit root) (pv-aget new-root 0))]\n              (set! root  new-root)\n              (set! shift (- shift 5))\n              (set! cnt   (dec cnt))\n              (set! tail  new-tail)\n              tcoll)\n            (do (set! root new-root)\n                (set! cnt  (dec cnt))\n                (set! tail new-tail)\n                tcoll))))\n      (throw (js/Error. \"pop! after persistent!\"))))\n\n  ICounted\n  (-count [coll]\n    (if ^boolean (.-edit root)\n      cnt\n      (throw (js/Error. \"count after persistent!\"))))\n\n  IIndexed\n  (-nth [coll n]\n    (if ^boolean (.-edit root)\n      (aget (array-for coll n) (bit-and n 0x01f))\n      (throw (js/Error. \"nth after persistent!\"))))\n\n  (-nth [coll n not-found]\n    (if (and (<= 0 n) (< n cnt))\n      (-nth coll n)\n      not-found))\n\n  ILookup\n  (-lookup [coll k] (-lookup coll k nil))\n\n  (-lookup [coll k not-found] (if (number? k)\n                                (-nth coll k not-found)\n                                not-found))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5200 5329]},
 :full-name "cljs.core/TransientVector",
 :clj-symbol "clojure.lang/TransientVector"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/TransientVector"]))
```

-->
