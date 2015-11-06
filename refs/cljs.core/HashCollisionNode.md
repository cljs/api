## cljs.core/HashCollisionNode



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/HashCollisionNode</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashmap.java)
</td>
</tr>
</table>


 <samp>
(__HashCollisionNode.__ edit collision-hash cnt arr)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L6294-L6390):

```clj
(deftype HashCollisionNode [edit
                            ^:mutable collision-hash
                            ^:mutable cnt
                            ^:mutable arr]
  Object
  (inode-assoc [inode shift hash key val added-leaf?]
    (if (== hash collision-hash)
      (let [idx (hash-collision-node-find-index arr cnt key)]
        (if (== idx -1)
          (let [len     (* 2 cnt)
                new-arr (make-array (+ len 2))]
            (array-copy arr 0 new-arr 0 len)
            (aset new-arr len key)
            (aset new-arr (inc len) val)
            (set! (.-val added-leaf?) true)
            (HashCollisionNode. nil collision-hash (inc cnt) new-arr))
          (if (= (aget arr idx) val)
            inode
            (HashCollisionNode. nil collision-hash cnt (clone-and-set arr (inc idx) val)))))
      (.inode-assoc (BitmapIndexedNode. nil (bitpos collision-hash shift) (array nil inode))
                    shift hash key val added-leaf?)))

  (inode-without [inode shift hash key]
    (let [idx (hash-collision-node-find-index arr cnt key)]
      (cond (== idx -1) inode
            (== cnt 1)  nil
            :else (HashCollisionNode. nil collision-hash (dec cnt) (remove-pair arr (quot idx 2))))))

  (inode-lookup [inode shift hash key not-found]
    (let [idx (hash-collision-node-find-index arr cnt key)]
      (cond (< idx 0)              not-found
            (key-test key (aget arr idx)) (aget arr (inc idx))
            :else                  not-found)))

  (inode-find [inode shift hash key not-found]
    (let [idx (hash-collision-node-find-index arr cnt key)]
      (cond (< idx 0)              not-found
            (key-test key (aget arr idx)) [(aget arr idx) (aget arr (inc idx))]
            :else                  not-found)))

  (inode-seq [inode]
    (create-inode-seq arr))

  (ensure-editable [inode e]
    (if (identical? e edit)
      inode
      (let [new-arr (make-array (* 2 (inc cnt)))]
        (array-copy arr 0 new-arr 0 (* 2 cnt))
        (HashCollisionNode. e collision-hash cnt new-arr))))

  (ensure-editable-array [inode e count array]
    (if (identical? e edit)
      (do (set! arr array)
          (set! cnt count)
          inode)
      (HashCollisionNode. edit collision-hash count array)))

  (inode-assoc! [inode edit shift hash key val added-leaf?]
    (if (== hash collision-hash)
      (let [idx (hash-collision-node-find-index arr cnt key)]
        (if (== idx -1)
          (if (> (alength arr) (* 2 cnt))
            (let [editable (edit-and-set inode edit (* 2 cnt) key (inc (* 2 cnt)) val)]
              (set! (.-val added-leaf?) true)
              (set! (.-cnt editable) (inc (.-cnt editable)))
              editable)
            (let [len     (alength arr)
                  new-arr (make-array (+ len 2))]
              (array-copy arr 0 new-arr 0 len)
              (aset new-arr len key)
              (aset new-arr (inc len) val)
              (set! (.-val added-leaf?) true)
              (.ensure-editable-array inode edit (inc cnt) new-arr)))
          (if (identical? (aget arr (inc idx)) val)
            inode
            (edit-and-set inode edit (inc idx) val))))
      (.inode-assoc! (BitmapIndexedNode. edit (bitpos collision-hash shift) (array nil inode nil nil))
                     edit shift hash key val added-leaf?)))

  (inode-without! [inode edit shift hash key removed-leaf?]
    (let [idx (hash-collision-node-find-index arr cnt key)]
      (if (== idx -1)
        inode
        (do (aset removed-leaf? 0 true)
            (if (== cnt 1)
              nil
              (let [editable (.ensure-editable inode edit)
                    earr     (.-arr editable)]
                (aset earr idx (aget earr (- (* 2 cnt) 2)))
                (aset earr (inc idx) (aget earr (dec (* 2 cnt))))
                (aset earr (dec (* 2 cnt)) nil)
                (aset earr (- (* 2 cnt) 2) nil)
                (set! (.-cnt editable) (dec (.-cnt editable)))
                editable))))))

  (kv-reduce [inode f init]
    (inode-kv-reduce arr f init)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:6294-6390](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L6294-L6390)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/HashCollisionNode` @ clojuredocs](http://clojuredocs.org/clojure.lang/HashCollisionNode)<br>
[`clojure.lang/HashCollisionNode` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/HashCollisionNode/)<br>
[`clojure.lang/HashCollisionNode` @ crossclj](http://crossclj.info/fun/clojure.lang/HashCollisionNode.html)<br>
[`cljs.core/HashCollisionNode` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/HashCollisionNode.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/HashCollisionNode.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "HashCollisionNode",
 :signature ["[edit collision-hash cnt arr]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/HashCollisionNode",
 :source {:code "(deftype HashCollisionNode [edit\n                            ^:mutable collision-hash\n                            ^:mutable cnt\n                            ^:mutable arr]\n  Object\n  (inode-assoc [inode shift hash key val added-leaf?]\n    (if (== hash collision-hash)\n      (let [idx (hash-collision-node-find-index arr cnt key)]\n        (if (== idx -1)\n          (let [len     (* 2 cnt)\n                new-arr (make-array (+ len 2))]\n            (array-copy arr 0 new-arr 0 len)\n            (aset new-arr len key)\n            (aset new-arr (inc len) val)\n            (set! (.-val added-leaf?) true)\n            (HashCollisionNode. nil collision-hash (inc cnt) new-arr))\n          (if (= (aget arr idx) val)\n            inode\n            (HashCollisionNode. nil collision-hash cnt (clone-and-set arr (inc idx) val)))))\n      (.inode-assoc (BitmapIndexedNode. nil (bitpos collision-hash shift) (array nil inode))\n                    shift hash key val added-leaf?)))\n\n  (inode-without [inode shift hash key]\n    (let [idx (hash-collision-node-find-index arr cnt key)]\n      (cond (== idx -1) inode\n            (== cnt 1)  nil\n            :else (HashCollisionNode. nil collision-hash (dec cnt) (remove-pair arr (quot idx 2))))))\n\n  (inode-lookup [inode shift hash key not-found]\n    (let [idx (hash-collision-node-find-index arr cnt key)]\n      (cond (< idx 0)              not-found\n            (key-test key (aget arr idx)) (aget arr (inc idx))\n            :else                  not-found)))\n\n  (inode-find [inode shift hash key not-found]\n    (let [idx (hash-collision-node-find-index arr cnt key)]\n      (cond (< idx 0)              not-found\n            (key-test key (aget arr idx)) [(aget arr idx) (aget arr (inc idx))]\n            :else                  not-found)))\n\n  (inode-seq [inode]\n    (create-inode-seq arr))\n\n  (ensure-editable [inode e]\n    (if (identical? e edit)\n      inode\n      (let [new-arr (make-array (* 2 (inc cnt)))]\n        (array-copy arr 0 new-arr 0 (* 2 cnt))\n        (HashCollisionNode. e collision-hash cnt new-arr))))\n\n  (ensure-editable-array [inode e count array]\n    (if (identical? e edit)\n      (do (set! arr array)\n          (set! cnt count)\n          inode)\n      (HashCollisionNode. edit collision-hash count array)))\n\n  (inode-assoc! [inode edit shift hash key val added-leaf?]\n    (if (== hash collision-hash)\n      (let [idx (hash-collision-node-find-index arr cnt key)]\n        (if (== idx -1)\n          (if (> (alength arr) (* 2 cnt))\n            (let [editable (edit-and-set inode edit (* 2 cnt) key (inc (* 2 cnt)) val)]\n              (set! (.-val added-leaf?) true)\n              (set! (.-cnt editable) (inc (.-cnt editable)))\n              editable)\n            (let [len     (alength arr)\n                  new-arr (make-array (+ len 2))]\n              (array-copy arr 0 new-arr 0 len)\n              (aset new-arr len key)\n              (aset new-arr (inc len) val)\n              (set! (.-val added-leaf?) true)\n              (.ensure-editable-array inode edit (inc cnt) new-arr)))\n          (if (identical? (aget arr (inc idx)) val)\n            inode\n            (edit-and-set inode edit (inc idx) val))))\n      (.inode-assoc! (BitmapIndexedNode. edit (bitpos collision-hash shift) (array nil inode nil nil))\n                     edit shift hash key val added-leaf?)))\n\n  (inode-without! [inode edit shift hash key removed-leaf?]\n    (let [idx (hash-collision-node-find-index arr cnt key)]\n      (if (== idx -1)\n        inode\n        (do (aset removed-leaf? 0 true)\n            (if (== cnt 1)\n              nil\n              (let [editable (.ensure-editable inode edit)\n                    earr     (.-arr editable)]\n                (aset earr idx (aget earr (- (* 2 cnt) 2)))\n                (aset earr (inc idx) (aget earr (dec (* 2 cnt))))\n                (aset earr (dec (* 2 cnt)) nil)\n                (aset earr (- (* 2 cnt) 2) nil)\n                (set! (.-cnt editable) (dec (.-cnt editable)))\n                editable))))))\n\n  (kv-reduce [inode f init]\n    (inode-kv-reduce arr f init)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [6294 6390]},
 :full-name "cljs.core/HashCollisionNode",
 :clj-symbol "clojure.lang/HashCollisionNode"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/HashCollisionNode"]))
```

-->
