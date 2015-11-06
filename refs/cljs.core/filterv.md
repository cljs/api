## cljs.core/filterv



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/filterv</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/filterv)
</td>
</tr>
</table>


 <samp>
(__filterv__ pred coll)<br>
</samp>

---

Returns a vector of the items in `coll` for which `(pred item)` returns true.

`pred` must be free of side-effects.



---




Source docstring:

```
Returns a vector of the items in coll for which
(pred item) returns true. pred must be free of side-effects.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L3058-L3065):

```clj
(defn filterv
  [pred coll]
  (-> (reduce (fn [v o] (if (pred o) (conj! v o) v))
              (transient [])
              coll)
      persistent!))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3058-3065](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L3058-L3065)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/filterv` @ clojuredocs](http://clojuredocs.org/clojure.core/filterv)<br>
[`clojure.core/filterv` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/filterv/)<br>
[`clojure.core/filterv` @ crossclj](http://crossclj.info/fun/clojure.core/filterv.html)<br>
[`cljs.core/filterv` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/filterv.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/filterv.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a vector of the items in `coll` for which `(pred item)` returns true.\n\n`pred` must be free of side-effects.",
 :ns "cljs.core",
 :name "filterv",
 :signature ["[pred coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/filterv",
 :source {:code "(defn filterv\n  [pred coll]\n  (-> (reduce (fn [v o] (if (pred o) (conj! v o) v))\n              (transient [])\n              coll)\n      persistent!))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3058 3065]},
 :full-name "cljs.core/filterv",
 :clj-symbol "clojure.core/filterv",
 :docstring "Returns a vector of the items in coll for which\n(pred item) returns true. pred must be free of side-effects."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/filterv"]))
```

-->
