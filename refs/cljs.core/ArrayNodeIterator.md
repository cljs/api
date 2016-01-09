## cljs.core/ArrayNodeIterator



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[+] 1.7.28" title="Added in 1.7.28" src="https://img.shields.io/badge/+-1.7.28-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ArrayNodeIterator.__ arr i next-iter)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L6427-L6445):

```clj
(deftype ArrayNodeIterator [arr ^:mutable i ^:mutable next-iter]
  Object
  (hasNext [this]
    (let [len (alength arr)]
      (loop []
        (if-not (and  (some? next-iter) ^boolean (.hasNext next-iter))
          (if (< i len)
            (let [node (aget arr i)]
              (set! i (inc i))
              (when (some? node)
                (set! next-iter (-iterator node)))
              (recur))
            false)
          true))))
  (next [this]
    (if ^boolean (.hasNext this)
      (.next next-iter)
      (throw (js/Error. "No such element"))))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:6427-6445](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L6427-L6445)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ArrayNodeIterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ArrayNodeIterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ArrayNodeIterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ArrayNodeIterator",
 :type "type",
 :signature ["[arr i next-iter]"],
 :source {:code "(deftype ArrayNodeIterator [arr ^:mutable i ^:mutable next-iter]\n  Object\n  (hasNext [this]\n    (let [len (alength arr)]\n      (loop []\n        (if-not (and  (some? next-iter) ^boolean (.hasNext next-iter))\n          (if (< i len)\n            (let [node (aget arr i)]\n              (set! i (inc i))\n              (when (some? node)\n                (set! next-iter (-iterator node)))\n              (recur))\n            false)\n          true))))\n  (next [this]\n    (if ^boolean (.hasNext this)\n      (.next next-iter)\n      (throw (js/Error. \"No such element\"))))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [6427 6445]},
 :full-name "cljs.core/ArrayNodeIterator",
 :full-name-encode "cljs.core/ArrayNodeIterator",
 :history [["+" "1.7.28"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayNodeIterator"]))
```

-->
