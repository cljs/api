## clojure.core.reducers/flatten



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/flatten</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/flatten)
</td>
</tr>
</table>


 <samp>
(__flatten__)<br>
</samp>
 <samp>
(__flatten__ coll)<br>
</samp>

---





Source docstring:

```
Takes any nested combination of sequential things (lists, vectors,
  etc.) and returns their contents as a single, flat foldable
  collection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/clojure/core/reducers.cljs#L130-L143):

```clj
(defcurried flatten
  "Takes any nested combination of sequential things (lists, vectors,
  etc.) and returns their contents as a single, flat foldable
  collection."
  {}
  [coll]
  (folder coll
   (fn [f1]
     (fn
       ([] (f1))
       ([ret v]
          (if (sequential? v)
            (-reduce (flatten v) f1 ret)
            (f1 ret v)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:130-143](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/clojure/core/reducers.cljs#L130-L143)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/flatten` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/flatten)<br>
[`clojure.core.reducers/flatten` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/flatten/)<br>
[`clojure.core.reducers/flatten` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/flatten.html)<br>
[`clojure.core.reducers/flatten` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/flatten.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/flatten.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "flatten",
 :signature ["[]" "[coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/flatten",
 :source {:code "(defcurried flatten\n  \"Takes any nested combination of sequential things (lists, vectors,\n  etc.) and returns their contents as a single, flat foldable\n  collection.\"\n  {}\n  [coll]\n  (folder coll\n   (fn [f1]\n     (fn\n       ([] (f1))\n       ([ret v]\n          (if (sequential? v)\n            (-reduce (flatten v) f1 ret)\n            (f1 ret v)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [130 143]},
 :full-name "clojure.core.reducers/flatten",
 :clj-symbol "clojure.core.reducers/flatten",
 :docstring "Takes any nested combination of sequential things (lists, vectors,\n  etc.) and returns their contents as a single, flat foldable\n  collection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/flatten"]))
```

-->
