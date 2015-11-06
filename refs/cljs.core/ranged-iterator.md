## cljs.core/ranged-iterator



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ranged-iterator__ v start end)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L4564-L4569):

```clj
(defn ranged-iterator [v start end]
  (let [i start]
    (RangedIterator. i (- i (js-mod i 32))
      (when (< start (count v))
        (unchecked-array-for v i))
      v start end)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4564-4569](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L4564-L4569)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ranged-iterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ranged-iterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ranged-iterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ranged-iterator",
 :type "function",
 :signature ["[v start end]"],
 :source {:code "(defn ranged-iterator [v start end]\n  (let [i start]\n    (RangedIterator. i (- i (js-mod i 32))\n      (when (< start (count v))\n        (unchecked-array-for v i))\n      v start end)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4564 4569]},
 :full-name "cljs.core/ranged-iterator",
 :full-name-encode "cljs.core/ranged-iterator",
 :history [["+" "0.0-2371"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ranged-iterator"]))
```

-->
