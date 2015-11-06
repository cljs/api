## clojure.zip/insert-right



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/insert-right</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/insert-right)
</td>
</tr>
</table>


 <samp>
(__insert-right__ loc item)<br>
</samp>

---





Source docstring:

```
Inserts the item as the right sibling of the node at this loc,
without moving
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/clojure/zip.cljs#L174-L181):

```clj
(defn insert-right
  [loc item]
    (let [[node {r :r :as path}] loc]
      (if (nil? path)
        (throw "Insert at top")
        (with-meta [node (assoc path :r (cons item r) :changed? true)] (meta loc)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2069
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:174-181](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/clojure/zip.cljs#L174-L181)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/insert-right` @ clojuredocs](http://clojuredocs.org/clojure.zip/insert-right)<br>
[`clojure.zip/insert-right` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/insert-right/)<br>
[`clojure.zip/insert-right` @ crossclj](http://crossclj.info/fun/clojure.zip/insert-right.html)<br>
[`clojure.zip/insert-right` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/insert-right.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/insert-right.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "insert-right",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/insert-right",
 :source {:code "(defn insert-right\n  [loc item]\n    (let [[node {r :r :as path}] loc]\n      (if (nil? path)\n        (throw \"Insert at top\")\n        (with-meta [node (assoc path :r (cons item r) :changed? true)] (meta loc)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [174 181]},
 :full-name "clojure.zip/insert-right",
 :clj-symbol "clojure.zip/insert-right",
 :docstring "Inserts the item as the right sibling of the node at this loc,\nwithout moving"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/insert-right"]))
```

-->
