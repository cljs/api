## cljs.core/PersistentHashMap.fromArray



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" title="Added in 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentHashMap.fromArray__ arr no-clone)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L6634-L6642):

```clj
(set! (.-fromArray PersistentHashMap)
  (fn [arr ^boolean no-clone]
    (let [arr (if no-clone arr (aclone arr))
          len (alength arr)]
      (loop [i 0 ret (transient (.-EMPTY PersistentHashMap))]
        (if (< i len)
          (recur (+ i 2)
            (-assoc! ret (aget arr i) (aget arr (inc i))))
          (-persistent! ret))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6634-6642](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L6634-L6642)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentHashMap.fromArray` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentHashMap.fromArray.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentHashMapDOTfromArray.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentHashMap.fromArray",
 :signature ["[arr no-clone]"],
 :history [["+" "0.0-2719"]],
 :parent-type "PersistentHashMap",
 :type "function",
 :full-name-encode "cljs.core/PersistentHashMapDOTfromArray",
 :source {:code "(set! (.-fromArray PersistentHashMap)\n  (fn [arr ^boolean no-clone]\n    (let [arr (if no-clone arr (aclone arr))\n          len (alength arr)]\n      (loop [i 0 ret (transient (.-EMPTY PersistentHashMap))]\n        (if (< i len)\n          (recur (+ i 2)\n            (-assoc! ret (aget arr i) (aget arr (inc i))))\n          (-persistent! ret))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6634 6642]},
 :full-name "cljs.core/PersistentHashMap.fromArray"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashMap.fromArray"]))
```

-->
