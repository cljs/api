## clojure.data/diff



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.data/diff</samp>](http://clojure.github.io/clojure/branch-master/clojure.data-api.html#clojure.data/diff)
</td>
</tr>
</table>


 <samp>
(__diff__ a b)<br>
</samp>

---





Source docstring:

```
Recursively compares a and b, returning a tuple of
[things-only-in-a things-only-in-b things-in-both].
Comparison rules:

* For equal a and b, return [nil nil a].
* Maps are subdiffed where keys match and values differ.
* Sets are never subdiffed.
* All sequential things are treated as associative collections
  by their indexes, with results returned as vectors.
* Everything else (including strings!) is treated as
  an atom and compared for equality.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/clojure/data.cljs#L144-L161):

```clj
(defn diff
  [a b]
  (if (= a b)
    [nil nil a]
    (if (= (equality-partition a) (equality-partition b))
      (diff-similar a b)
      (atom-diff a b))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── clojure
            └── <ins>[data.cljs:144-161](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/clojure/data.cljs#L144-L161)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.data/diff` @ clojuredocs](http://clojuredocs.org/clojure.data/diff)<br>
[`clojure.data/diff` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.data/diff/)<br>
[`clojure.data/diff` @ crossclj](http://crossclj.info/fun/clojure.data/diff.html)<br>
[`clojure.data/diff` @ crossclj](http://crossclj.info/fun/clojure.data.cljs/diff.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.data/diff.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.data",
 :name "diff",
 :signature ["[a b]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "clojure.data/diff",
 :source {:code "(defn diff\n  [a b]\n  (if (= a b)\n    [nil nil a]\n    (if (= (equality-partition a) (equality-partition b))\n      (diff-similar a b)\n      (atom-diff a b))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/clojure/data.cljs",
          :lines [144 161]},
 :full-name "clojure.data/diff",
 :clj-symbol "clojure.data/diff",
 :docstring "Recursively compares a and b, returning a tuple of\n[things-only-in-a things-only-in-b things-in-both].\nComparison rules:\n\n* For equal a and b, return [nil nil a].\n* Maps are subdiffed where keys match and values differ.\n* Sets are never subdiffed.\n* All sequential things are treated as associative collections\n  by their indexes, with results returned as vectors.\n* Everything else (including strings!) is treated as\n  an atom and compared for equality."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.data/diff"]))
```

-->
