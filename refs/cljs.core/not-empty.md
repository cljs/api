## cljs.core/not-empty



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not-empty</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not-empty)
</td>
</tr>
</table>


 <samp>
(__not-empty__ coll)<br>
</samp>

---

Returns nil if `coll` is empty, else returns `coll`.



---


###### See Also:

[`cljs.core/empty`](../cljs.core/empty.md)<br>

---


Source docstring:

```
If coll is empty, returns nil, else coll
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L2523-L2525):

```clj
(defn not-empty
  [coll] (when (seq coll) coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2523-2525](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L2523-L2525)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/not-empty` @ clojuredocs](http://clojuredocs.org/clojure.core/not-empty)<br>
[`clojure.core/not-empty` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/not-empty/)<br>
[`clojure.core/not-empty` @ crossclj](http://crossclj.info/fun/clojure.core/not-empty.html)<br>
[`cljs.core/not-empty` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/not-empty.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/not-empty.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns nil if `coll` is empty, else returns `coll`.",
 :ns "cljs.core",
 :name "not-empty",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/empty"],
 :full-name-encode "cljs.core/not-empty",
 :source {:code "(defn not-empty\n  [coll] (when (seq coll) coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2523 2525]},
 :full-name "cljs.core/not-empty",
 :clj-symbol "clojure.core/not-empty",
 :docstring "If coll is empty, returns nil, else coll"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not-empty"]))
```

-->
