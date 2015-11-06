## cljs.core/es6-iterator



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__es6-iterator__ coll)<br>
</samp>

---





Source docstring:

```
EXPERIMENTAL: Return a ES2015 compatible iterator for coll.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L1014-L1017):

```clj
(defn es6-iterator
  [coll]
  (ES6Iterator. (seq coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1014-1017](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L1014-L1017)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/es6-iterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/es6-iterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/es6-iterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "es6-iterator",
 :signature ["[coll]"],
 :history [["+" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core/es6-iterator",
 :source {:code "(defn es6-iterator\n  [coll]\n  (ES6Iterator. (seq coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1014 1017]},
 :full-name "cljs.core/es6-iterator",
 :docstring "EXPERIMENTAL: Return a ES2015 compatible iterator for coll."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/es6-iterator"]))
```

-->
