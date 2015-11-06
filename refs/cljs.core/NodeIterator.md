## cljs.core/NodeIterator



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[+] 1.7.28" title="Added in 1.7.28" src="https://img.shields.io/badge/+-1.7.28-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__NodeIterator.__ arr i next-entry next-iter)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L6161-L6197):

```clj
(deftype NodeIterator [arr ^:mutable i ^:mutable next-entry ^:mutable next-iter]
  Object
  (advance [this]
    (let [len (alength arr)]
      (loop []
        (if (< i len)
          (let [key (aget arr i)
                node-or-val (aget arr (inc i))
                ^boolean found
                (cond (some? key)
                      (set! next-entry [key node-or-val])
                      (some? node-or-val)
                      (let [new-iter (-iterator node-or-val)]
                        (if ^boolean (.hasNext new-iter)
                          (set! next-iter new-iter)
                          false))
                      :else false)]
            (set! i (+ i 2))
            (if found true (recur)))
          false))))
  (hasNext [this]
    (or (some? next-entry) (some? next-iter) (.advance this)))
  (next [this]
    (cond
      (some? next-entry)
      (let [ret next-entry]
        (set! next-entry nil)
        ret)
      (some? next-iter)
      (let [ret (.next next-iter)]
        (when-not ^boolean (.hasNext next-iter)
          (set! next-iter nil))
        ret)
      ^boolean (.advance this)
      (.next this)
      :else (throw (js/Error. "No such element"))))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:6161-6197](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L6161-L6197)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/NodeIterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/NodeIterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/NodeIterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "NodeIterator",
 :type "type",
 :signature ["[arr i next-entry next-iter]"],
 :source {:code "(deftype NodeIterator [arr ^:mutable i ^:mutable next-entry ^:mutable next-iter]\n  Object\n  (advance [this]\n    (let [len (alength arr)]\n      (loop []\n        (if (< i len)\n          (let [key (aget arr i)\n                node-or-val (aget arr (inc i))\n                ^boolean found\n                (cond (some? key)\n                      (set! next-entry [key node-or-val])\n                      (some? node-or-val)\n                      (let [new-iter (-iterator node-or-val)]\n                        (if ^boolean (.hasNext new-iter)\n                          (set! next-iter new-iter)\n                          false))\n                      :else false)]\n            (set! i (+ i 2))\n            (if found true (recur)))\n          false))))\n  (hasNext [this]\n    (or (some? next-entry) (some? next-iter) (.advance this)))\n  (next [this]\n    (cond\n      (some? next-entry)\n      (let [ret next-entry]\n        (set! next-entry nil)\n        ret)\n      (some? next-iter)\n      (let [ret (.next next-iter)]\n        (when-not ^boolean (.hasNext next-iter)\n          (set! next-iter nil))\n        ret)\n      ^boolean (.advance this)\n      (.next this)\n      :else (throw (js/Error. \"No such element\"))))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [6161 6197]},
 :full-name "cljs.core/NodeIterator",
 :full-name-encode "cljs.core/NodeIterator",
 :history [["+" "1.7.28"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/NodeIterator"]))
```

-->
