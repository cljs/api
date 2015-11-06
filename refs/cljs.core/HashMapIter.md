## cljs.core/HashMapIter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[+] 1.7.28" title="Added in 1.7.28" src="https://img.shields.io/badge/+-1.7.28-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__HashMapIter.__ nil-val root-iter seen)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L6782-L6792):

```clj
(deftype HashMapIter [nil-val root-iter ^:mutable seen]
  Object
  (hasNext [_]
    (and ^boolean seen ^boolean (.hasNext root-iter)))
  (next [_]
    (if-not ^boolean seen
      (do
        (set! seen true)
        nil-val)
      (.next root-iter)))
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
                └── <ins>[core.cljs:6782-6792](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L6782-L6792)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/HashMapIter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/HashMapIter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/HashMapIter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "HashMapIter",
 :type "type",
 :signature ["[nil-val root-iter seen]"],
 :source {:code "(deftype HashMapIter [nil-val root-iter ^:mutable seen]\n  Object\n  (hasNext [_]\n    (and ^boolean seen ^boolean (.hasNext root-iter)))\n  (next [_]\n    (if-not ^boolean seen\n      (do\n        (set! seen true)\n        nil-val)\n      (.next root-iter)))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [6782 6792]},
 :full-name "cljs.core/HashMapIter",
 :full-name-encode "cljs.core/HashMapIter",
 :history [["+" "1.7.28"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/HashMapIter"]))
```

-->
