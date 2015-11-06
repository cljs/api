## cljs.core/PersistentHashMap.fromArrays



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentHashMap.fromArrays__ ks vs)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L4775-L4781):

```clj
(set! cljs.core.PersistentHashMap/fromArrays
      (fn [ks vs]
        (let [len (alength ks)]
          (loop [i 0 out (transient cljs.core.PersistentHashMap/EMPTY)]
            (if (< i len)
              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))
              (persistent! out))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4775-4781](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L4775-L4781)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentHashMap.fromArrays` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentHashMap.fromArrays.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentHashMapDOTfromArrays.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentHashMap.fromArrays",
 :signature ["[ks vs]"],
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentHashMap",
 :type "function",
 :full-name-encode "cljs.core/PersistentHashMapDOTfromArrays",
 :source {:code "(set! cljs.core.PersistentHashMap/fromArrays\n      (fn [ks vs]\n        (let [len (alength ks)]\n          (loop [i 0 out (transient cljs.core.PersistentHashMap/EMPTY)]\n            (if (< i len)\n              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))\n              (persistent! out))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4775 4781]},
 :full-name "cljs.core/PersistentHashMap.fromArrays"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashMap.fromArrays"]))
```

-->
