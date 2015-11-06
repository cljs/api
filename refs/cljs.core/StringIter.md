## cljs.core/StringIter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__StringIter.__ s i)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L3065-L3072):

```clj
(deftype StringIter [s ^:mutable i]
  Object
  (hasNext [_] (< i (alength s)))
  (next [_]
    (let [ret (.charAt s i)]
      (set! i (inc i))
      ret))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3065-3072](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L3065-L3072)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/StringIter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/StringIter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/StringIter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "StringIter",
 :type "type",
 :signature ["[s i]"],
 :source {:code "(deftype StringIter [s ^:mutable i]\n  Object\n  (hasNext [_] (< i (alength s)))\n  (next [_]\n    (let [ret (.charAt s i)]\n      (set! i (inc i))\n      ret))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3065 3072]},
 :full-name "cljs.core/StringIter",
 :full-name-encode "cljs.core/StringIter",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/StringIter"]))
```

-->
