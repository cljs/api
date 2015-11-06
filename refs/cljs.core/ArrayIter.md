## cljs.core/ArrayIter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ArrayIter</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ArrayIter.java)
</td>
</tr>
</table>


 <samp>
(__ArrayIter.__ arr i)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L3376-L3383):

```clj
(deftype ArrayIter [arr ^:mutable i]
  Object
  (hasNext [_] (< i (alength arr)))
  (next [_]
    (let [ret (aget arr i)]
      (set! i (inc i))
      ret))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3376-3383](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L3376-L3383)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ArrayIter` @ clojuredocs](http://clojuredocs.org/clojure.lang/ArrayIter)<br>
[`clojure.lang/ArrayIter` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ArrayIter/)<br>
[`clojure.lang/ArrayIter` @ crossclj](http://crossclj.info/fun/clojure.lang/ArrayIter.html)<br>
[`cljs.core/ArrayIter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ArrayIter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ArrayIter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ArrayIter",
 :signature ["[arr i]"],
 :history [["+" "0.0-2301"]],
 :type "type",
 :full-name-encode "cljs.core/ArrayIter",
 :source {:code "(deftype ArrayIter [arr ^:mutable i]\n  Object\n  (hasNext [_] (< i (alength arr)))\n  (next [_]\n    (let [ret (aget arr i)]\n      (set! i (inc i))\n      ret))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3376 3383]},
 :full-name "cljs.core/ArrayIter",
 :clj-symbol "clojure.lang/ArrayIter"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayIter"]))
```

-->
