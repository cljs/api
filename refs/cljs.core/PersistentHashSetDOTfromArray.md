## cljs.core/PersistentHashSet.fromArray



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" title="Added in 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentHashSet.fromArray__ items no-clone)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L5798-L5809):

```clj
(set! cljs.core.PersistentHashSet/fromArray
  (fn [items ^boolean no-clone]
    (let [len (alength items)]
     (if (<= (/ len 2) cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD)
       (let [arr (if no-clone items (aclone items))]
         (PersistentHashSet. nil
           (cljs.core.PersistentArrayMap/fromArray arr true) nil))
       (loop [i 0
              out (transient cljs.core.PersistentHashSet/EMPTY)]
         (if (< i len)
           (recur (+ i 2) (conj! out (aget items i)))
           (persistent! out)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5798-5809](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L5798-L5809)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentHashSet.fromArray` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentHashSet.fromArray.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentHashSetDOTfromArray.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentHashSet.fromArray",
 :signature ["[items no-clone]"],
 :history [["+" "0.0-1443"]],
 :parent-type "PersistentHashSet",
 :type "function",
 :full-name-encode "cljs.core/PersistentHashSetDOTfromArray",
 :source {:code "(set! cljs.core.PersistentHashSet/fromArray\n  (fn [items ^boolean no-clone]\n    (let [len (alength items)]\n     (if (<= (/ len 2) cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD)\n       (let [arr (if no-clone items (aclone items))]\n         (PersistentHashSet. nil\n           (cljs.core.PersistentArrayMap/fromArray arr true) nil))\n       (loop [i 0\n              out (transient cljs.core.PersistentHashSet/EMPTY)]\n         (if (< i len)\n           (recur (+ i 2) (conj! out (aget items i)))\n           (persistent! out)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5798 5809]},
 :full-name "cljs.core/PersistentHashSet.fromArray"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashSet.fromArray"]))
```

-->
