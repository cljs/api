## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ArrayNode

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ArrayNode.__ edit cnt arr)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3794-3888](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L3794-L3888)</ins>
</pre>

```clj
(deftype ArrayNode [edit ^:mutable cnt ^:mutable arr]
  Object
  (inode-assoc [inode shift hash key val added-leaf?]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (coercive-= nil node)
        (ArrayNode. nil (inc cnt) (clone-and-set arr idx (.inode-assoc cljs.core.BitmapIndexedNode/EMPTY (+ shift 5) hash key val added-leaf?)))
        (let [n (.inode-assoc node (+ shift 5) hash key val added-leaf?)]
          (if (identical? n node)
            inode
            (ArrayNode. nil cnt (clone-and-set arr idx n)))))))

  (inode-without [inode shift hash key]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (coercive-not= nil node)
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

  (inode-find [inode shift hash key]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (coercive-not= nil node)
        (.inode-find node (+ shift 5) hash key)
        nil)))

  (inode-find [inode shift hash key not-found]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (coercive-not= nil node)
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
      (if (coercive-= nil node)
        (let [editable (edit-and-set inode edit idx (.inode-assoc! cljs.core.BitmapIndexedNode/EMPTY edit (+ shift 5) hash key val added-leaf?))]
          (set! (.-cnt editable) (inc (.-cnt editable)))
          editable)
        (let [n (.inode-assoc! node edit (+ shift 5) hash key val added-leaf?)]
          (if (identical? n node)
            inode
            (edit-and-set inode edit idx n))))))

  (inode-without! [inode edit shift hash key removed-leaf?]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (coercive-= nil node)
        inode
        (let [n (.inode-without! node edit (+ shift 5) hash key removed-leaf?)]
          (cond
            (identical? n node)
            inode

            (coercive-= nil n)
            (if (<= cnt 8)
              (pack-array-node inode edit idx)
              (let [editable (edit-and-set inode edit idx n)]
                (set! (.-cnt editable) (dec (.-cnt editable)))
                editable))

            :else
            (edit-and-set inode edit idx n))))))

  (kv-reduce [inode f init]
    (let [len (.-length arr)]           ; actually 32
      (loop [i 0 init init]
        (if (< i len)
          (let [node (aget arr i)]
            (if (coercive-not= node nil)
              (let [init (.kv-reduce node f init)]
                (if (reduced? init)
                  @init
                  (recur (inc i) init)))))
          init)))))
```


---

```clj
{:full-name "cljs.core/ArrayNode",
 :ns "cljs.core",
 :name "ArrayNode",
 :type "type",
 :signature ["[edit cnt arr]"],
 :source {:code "(deftype ArrayNode [edit ^:mutable cnt ^:mutable arr]\n  Object\n  (inode-assoc [inode shift hash key val added-leaf?]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (coercive-= nil node)\n        (ArrayNode. nil (inc cnt) (clone-and-set arr idx (.inode-assoc cljs.core.BitmapIndexedNode/EMPTY (+ shift 5) hash key val added-leaf?)))\n        (let [n (.inode-assoc node (+ shift 5) hash key val added-leaf?)]\n          (if (identical? n node)\n            inode\n            (ArrayNode. nil cnt (clone-and-set arr idx n)))))))\n\n  (inode-without [inode shift hash key]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (coercive-not= nil node)\n        (let [n (.inode-without node (+ shift 5) hash key)]\n          (cond\n            (identical? n node)\n            inode\n\n            (nil? n)\n            (if (<= cnt 8)\n              (pack-array-node inode nil idx)\n              (ArrayNode. nil (dec cnt) (clone-and-set arr idx n)))\n\n            :else\n            (ArrayNode. nil cnt (clone-and-set arr idx n))))\n        inode)))\n\n  (inode-find [inode shift hash key]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (coercive-not= nil node)\n        (.inode-find node (+ shift 5) hash key)\n        nil)))\n\n  (inode-find [inode shift hash key not-found]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (coercive-not= nil node)\n        (.inode-find node (+ shift 5) hash key not-found)\n        not-found)))\n\n  (inode-seq [inode]\n    (create-array-node-seq arr))\n\n  (ensure-editable [inode e]\n    (if (identical? e edit)\n      inode\n      (ArrayNode. e cnt (aclone arr))))\n\n  (inode-assoc! [inode edit shift hash key val added-leaf?]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (coercive-= nil node)\n        (let [editable (edit-and-set inode edit idx (.inode-assoc! cljs.core.BitmapIndexedNode/EMPTY edit (+ shift 5) hash key val added-leaf?))]\n          (set! (.-cnt editable) (inc (.-cnt editable)))\n          editable)\n        (let [n (.inode-assoc! node edit (+ shift 5) hash key val added-leaf?)]\n          (if (identical? n node)\n            inode\n            (edit-and-set inode edit idx n))))))\n\n  (inode-without! [inode edit shift hash key removed-leaf?]\n    (let [idx  (mask hash shift)\n          node (aget arr idx)]\n      (if (coercive-= nil node)\n        inode\n        (let [n (.inode-without! node edit (+ shift 5) hash key removed-leaf?)]\n          (cond\n            (identical? n node)\n            inode\n\n            (coercive-= nil n)\n            (if (<= cnt 8)\n              (pack-array-node inode edit idx)\n              (let [editable (edit-and-set inode edit idx n)]\n                (set! (.-cnt editable) (dec (.-cnt editable)))\n                editable))\n\n            :else\n            (edit-and-set inode edit idx n))))))\n\n  (kv-reduce [inode f init]\n    (let [len (.-length arr)]           ; actually 32\n      (loop [i 0 init init]\n        (if (< i len)\n          (let [node (aget arr i)]\n            (if (coercive-not= node nil)\n              (let [init (.kv-reduce node f init)]\n                (if (reduced? init)\n                  @init\n                  (recur (inc i) init)))))\n          init)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3794 3888],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L3794-L3888"},
 :full-name-encode "cljs.core_ArrayNode",
 :history [["+" "0.0-1211"]]}

```
