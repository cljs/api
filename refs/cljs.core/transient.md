## cljs.core/transient



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/transient</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/transient)
</td>
</tr>
</table>


 <samp>
(__transient__ coll)<br>
</samp>

---





Source docstring:

```
Returns a new, transient version of the collection, in constant time.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L2667-L2670):

```clj
(defn transient
  [coll]
  (-as-transient coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2667-2670](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L2667-L2670)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/transient` @ clojuredocs](http://clojuredocs.org/clojure.core/transient)<br>
[`clojure.core/transient` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/transient/)<br>
[`clojure.core/transient` @ crossclj](http://crossclj.info/fun/clojure.core/transient.html)<br>
[`cljs.core/transient` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/transient.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/transient.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "transient",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/transient",
 :source {:code "(defn transient\n  [coll]\n  (-as-transient coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2667 2670]},
 :full-name "cljs.core/transient",
 :clj-symbol "clojure.core/transient",
 :docstring "Returns a new, transient version of the collection, in constant time."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/transient"]))
```

-->
