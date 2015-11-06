## cljs.core/comparator



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1586"><img valign="middle" alt="[+] 0.0-1586" title="Added in 0.0-1586" src="https://img.shields.io/badge/+-0.0--1586-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/comparator</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/comparator)
</td>
</tr>
</table>


 <samp>
(__comparator__ pred)<br>
</samp>

---





Source docstring:

```
Returns an JavaScript compatible comparator based upon pred.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L9225-L9229):

```clj
(defn comparator
  [pred]
  (fn [x y]
    (cond (pred x y) -1 (pred y x) 1 :else 0)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9225-9229](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L9225-L9229)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/comparator` @ clojuredocs](http://clojuredocs.org/clojure.core/comparator)<br>
[`clojure.core/comparator` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/comparator/)<br>
[`clojure.core/comparator` @ crossclj](http://crossclj.info/fun/clojure.core/comparator.html)<br>
[`cljs.core/comparator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/comparator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/comparator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "comparator",
 :signature ["[pred]"],
 :history [["+" "0.0-1586"]],
 :type "function",
 :full-name-encode "cljs.core/comparator",
 :source {:code "(defn comparator\n  [pred]\n  (fn [x y]\n    (cond (pred x y) -1 (pred y x) 1 :else 0)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9225 9229]},
 :full-name "cljs.core/comparator",
 :clj-symbol "clojure.core/comparator",
 :docstring "Returns an JavaScript compatible comparator based upon pred."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/comparator"]))
```

-->
