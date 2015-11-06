## cljs.core/ArrayNode



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ArrayNode</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashMap.java)
</td>
</tr>
</table>


 <samp>
(__ArrayNode.__ edit cnt arr)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L5043-L5138):

```clj
(deftype ArrayNode [edit ^:mutable cnt ^:mutable arr]
  Object
  (inode-assoc [inode shift hash key val added-leaf?]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (nil? node)
        (ArrayNode. nil (inc cnt) (clone-and-set arr idx (.inode-assoc cljs.core.BitmapIndexedNode.EMPTY (+ shift 5) hash key val added-leaf?)))
        (let [n (.inode-assoc node (+ shift 5) hash key val added-leaf?)]
          (if (identical? n node)
            inode
            (ArrayNode. nil cnt (clone-and-set arr idx n)))))))

  (inode-without [inode shift hash key]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if-not (nil? node)
        (let [n (.inode-without node (+ shift 5) hash key)]
          (cond
            (identical? n node)
            inode

            (nil? n)
            (if (<= cnt 8)
              (pack-array-node inode nil idx)
              (ArrayNode. nil (dec cnt) (clone-and-set arr idx n)))

            :else
            (ArrayNode. nil cnt (clone-and-set arr idx n))))
        inode)))

  (inode-lookup [inode shift hash key not-found]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if-not (nil? node)
        (.inode-lookup node (+ shift 5) hash key not-found)
        not-found)))

  (inode-find [inode shift hash key not-found]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if-not (nil? node)
        (.inode-find node (+ shift 5) hash key not-found)
        not-found)))

  (inode-seq [inode]
    (create-array-node-seq arr))

  (ensure-editable [inode e]
    (if (identical? e edit)
      inode
      (ArrayNode. e cnt (aclone arr))))

  (inode-assoc! [inode edit shift hash key val added-leaf?]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (nil? node)
        (let [editable (edit-and-set inode edit idx (.inode-assoc! cljs.core.BitmapIndexedNode.EMPTY edit (+ shift 5) hash key val added-leaf?))]
          (set! (.-cnt editable) (inc (.-cnt editable)))
          editable)
        (let [n (.inode-assoc! node edit (+ shift 5) hash key val added-leaf?)]
          (if (identical? n node)
            inode
            (edit-and-set inode edit idx n))))))

  (inode-without! [inode edit shift hash key removed-leaf?]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (nil? node)
        inode
        (let [n (.inode-without! node edit (+ shift 5) hash key removed-leaf?)]
          (cond
            (identical? n node)
            inode

            (nil? n)
            (if (<= cnt 8)
              (pack-array-node inode edit idx)
              (let [editable (edit-and-set inode edit idx n)]
                (set! (.-cnt editable) (dec (.-cnt editable)))
                editable))

            :else
            (edit-and-set inode edit idx n))))))

  (kv-reduce [inode f init]
    (let [len (alength arr)]           ; actually 32
      (loop [i 0 init init]
        (if (< i len)
          (let [node (aget arr i)]
            (if-not (nil? node)
              (let [init (.kv-reduce node f init)]
                (if (reduced? init)
                  @init
                  (recur (inc i) init)))
              (recur (inc i) init)))
          init)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5043-5138](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L5043-L5138)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ArrayNode` @ clojuredocs](http://clojuredocs.org/clojure.lang/ArrayNode)<br>
[`clojure.lang/ArrayNode` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ArrayNode/)<br>
[`clojure.lang/ArrayNode` @ crossclj](http://crossclj.info/fun/clojure.lang/ArrayNode.html)<br>
[`cljs.core/ArrayNode` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ArrayNode.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ArrayNode.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ArrayNode",
 :signature ["[edit cnt arr]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/ArrayNode",
 :source {:code "(deftype ArrayNode [edit ^:mutable cnt ^:mutable arr]\n  Object\n  (inode-assoc [inode shift hash key val added-leaf?]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (nil? node)\n        (ArrayNode. nil (inc cnt) (clone-and-set arr idx (.inode-assoc cljs.core.BitmapIndexedNode.EMPTY (+ shift 5) hash key val added-leaf?)))\n        (let [n (.inode-assoc node (+ shift 5) hash key val added-leaf?)]\n          (if (identical? n node)\n            inode\n            (ArrayNode. nil cnt (clone-and-set arr idx n)))))))\n\n  (inode-without [inode shift hash key]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if-not (nil? node)\n        (let [n (.inode-without node (+ shift 5) hash key)]\n          (cond\n            (identical? n node)\n            inode\n\n            (nil? n)\n            (if (<= cnt 8)\n              (pack-array-node inode nil idx)\n              (ArrayNode. nil (dec cnt) (clone-and-set arr idx n)))\n\n            :else\n            (ArrayNode. nil cnt (clone-and-set arr idx n))))\n        inode)))\n\n  (inode-lookup [inode shift hash key not-found]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if-not (nil? node)\n        (.inode-lookup node (+ shift 5) hash key not-found)\n        not-found)))\n\n  (inode-find [inode shift hash key not-found]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if-not (nil? node)\n        (.inode-find node (+ shift 5) hash key not-found)\n        not-found)))\n\n  (inode-seq [inode]\n    (create-array-node-seq arr))\n\n  (ensure-editable [inode e]\n    (if (identical? e edit)\n      inode\n      (ArrayNode. e cnt (aclone arr))))\n\n  (inode-assoc! [inode edit shift hash key val added-leaf?]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (nil? node)\n        (let [editable (edit-and-set inode edit idx (.inode-assoc! cljs.core.BitmapIndexedNode.EMPTY edit (+ shift 5) hash key val added-leaf?))]\n          (set! (.-cnt editable) (inc (.-cnt editable)))\n          editable)\n        (let [n (.inode-assoc! node edit (+ shift 5) hash key val added-leaf?)]\n          (if (identical? n node)\n            inode\n            (edit-and-set inode edit idx n))))))\n\n  (inode-without! [inode edit shift hash key removed-leaf?]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (nil? node)\n        inode\n        (let [n (.inode-without! node edit (+ shift 5) hash key removed-leaf?)]\n          (cond\n            (identical? n node)\n            inode\n\n            (nil? n)\n            (if (<= cnt 8)\n              (pack-array-node inode edit idx)\n              (let [editable (edit-and-set inode edit idx n)]\n                (set! (.-cnt editable) (dec (.-cnt editable)))\n                editable))\n\n            :else\n            (edit-and-set inode edit idx n))))))\n\n  (kv-reduce [inode f init]\n    (let [len (alength arr)]           ; actually 32\n      (loop [i 0 init init]\n        (if (< i len)\n          (let [node (aget arr i)]\n            (if-not (nil? node)\n              (let [init (.kv-reduce node f init)]\n                (if (reduced? init)\n                  @init\n                  (recur (inc i) init)))\n              (recur (inc i) init)))\n          init)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5043 5138]},
 :full-name "cljs.core/ArrayNode",
 :clj-symbol "clojure.lang/ArrayNode"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayNode"]))
```

-->
