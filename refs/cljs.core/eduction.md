## cljs.core/eduction



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/eduction</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/eduction)
</td>
</tr>
</table>


 <samp>
(__eduction__ xform\* coll)<br>
</samp>

---





Source docstring:

```
Returns a reducible/iterable application of the transducers
to the items in coll. Transducers are applied in order as if
combined with comp. Note that these applications will be
performed every time reduce/iterator is called.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L9255-L9262):

```clj
(defn eduction
  [& xforms]
  (Eduction. (apply comp (butlast xforms)) (last xforms)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9255-9262](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L9255-L9262)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/eduction` @ clojuredocs](http://clojuredocs.org/clojure.core/eduction)<br>
[`clojure.core/eduction` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/eduction/)<br>
[`clojure.core/eduction` @ crossclj](http://crossclj.info/fun/clojure.core/eduction.html)<br>
[`cljs.core/eduction` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/eduction.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/eduction.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "eduction",
 :signature ["[xform* coll]"],
 :history [["+" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core/eduction",
 :source {:code "(defn eduction\n  [& xforms]\n  (Eduction. (apply comp (butlast xforms)) (last xforms)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9255 9262]},
 :full-name "cljs.core/eduction",
 :clj-symbol "clojure.core/eduction",
 :docstring "Returns a reducible/iterable application of the transducers\nto the items in coll. Transducers are applied in order as if\ncombined with comp. Note that these applications will be\nperformed every time reduce/iterator is called."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/eduction"]))
```

-->
