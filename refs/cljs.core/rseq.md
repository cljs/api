## cljs.core/rseq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rseq)
</td>
</tr>
</table>


 <samp>
(__rseq__ coll)<br>
</samp>

---

Returns a sequence of the items in `coll` in reverse order in constant time.

Returns nil if `coll` is empty.

`coll` must be a vector or a sorted-map.



---


###### See Also:

[`cljs.core/reverse`](../cljs.core/reverse.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L2317-L2318):

```clj
(defn ^seq rseq [coll]
  (-rseq coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2629
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2317-2318](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L2317-L2318)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/rseq` @ clojuredocs](http://clojuredocs.org/clojure.core/rseq)<br>
[`clojure.core/rseq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/rseq/)<br>
[`clojure.core/rseq` @ crossclj](http://crossclj.info/fun/clojure.core/rseq.html)<br>
[`cljs.core/rseq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/rseq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/rseq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sequence of the items in `coll` in reverse order in constant time.\n\nReturns nil if `coll` is empty.\n\n`coll` must be a vector or a sorted-map.",
 :return-type seq,
 :ns "cljs.core",
 :name "rseq",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/reverse"],
 :full-name-encode "cljs.core/rseq",
 :source {:code "(defn ^seq rseq [coll]\n  (-rseq coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2317 2318]},
 :full-name "cljs.core/rseq",
 :clj-symbol "clojure.core/rseq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rseq"]))
```

-->
