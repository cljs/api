## cljs.core/PersistentArrayMap.fromArray



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentArrayMap.fromArray__ arr no-clone no-check)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L5491-L5503):

```clj
(set! (.-fromArray PersistentArrayMap)
  (fn [arr ^boolean no-clone ^boolean no-check]
    (let [arr (if no-clone arr (aclone arr))]
      (if no-check
        (let [cnt (/ (alength arr) 2)]
          (PersistentArrayMap. nil cnt arr nil))
        (let [len (alength arr)]
          (loop [i 0
                 ret (transient (.-EMPTY PersistentArrayMap))]
            (if (< i len)
              (recur (+ i 2)
                (-assoc! ret (aget arr i) (aget arr (inc i))))
              (-persistent! ret))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5491-5503](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L5491-L5503)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentArrayMap.fromArray` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentArrayMap.fromArray.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentArrayMapDOTfromArray.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap.fromArray",
 :signature ["[arr no-clone no-check]"],
 :history [["+" "0.0-1798"]],
 :parent-type "PersistentArrayMap",
 :type "function",
 :full-name-encode "cljs.core/PersistentArrayMapDOTfromArray",
 :source {:code "(set! (.-fromArray PersistentArrayMap)\n  (fn [arr ^boolean no-clone ^boolean no-check]\n    (let [arr (if no-clone arr (aclone arr))]\n      (if no-check\n        (let [cnt (/ (alength arr) 2)]\n          (PersistentArrayMap. nil cnt arr nil))\n        (let [len (alength arr)]\n          (loop [i 0\n                 ret (transient (.-EMPTY PersistentArrayMap))]\n            (if (< i len)\n              (recur (+ i 2)\n                (-assoc! ret (aget arr i) (aget arr (inc i))))\n              (-persistent! ret))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5491 5503]},
 :full-name "cljs.core/PersistentArrayMap.fromArray"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap.fromArray"]))
```

-->
