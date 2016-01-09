## cljs.core/HashSetIter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[+] 1.7.28" title="Added in 1.7.28" src="https://img.shields.io/badge/+-1.7.28-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__HashSetIter.__ iter)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/cljs/core.cljs#L7959-L7967):

```clj
(deftype HashSetIter [iter]
  Object
  (hasNext [_]
    (.hasNext iter))
  (next [_]
    (if ^boolean (.hasNext iter)
      (aget (.-tail (.next iter)) 0)
      (throw (js/Error. "No such element"))))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:7959-7967](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/cljs/core.cljs#L7959-L7967)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/HashSetIter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/HashSetIter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/HashSetIter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "HashSetIter",
 :type "type",
 :signature ["[iter]"],
 :source {:code "(deftype HashSetIter [iter]\n  Object\n  (hasNext [_]\n    (.hasNext iter))\n  (next [_]\n    (if ^boolean (.hasNext iter)\n      (aget (.-tail (.next iter)) 0)\n      (throw (js/Error. \"No such element\"))))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [7959 7967]},
 :full-name "cljs.core/HashSetIter",
 :full-name-encode "cljs.core/HashSetIter",
 :history [["+" "1.7.28"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/HashSetIter"]))
```

-->
