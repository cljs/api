## clojure.zip/insert-left



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/insert-left</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/insert-left)
</td>
</tr>
</table>


 <samp>
(__insert-left__ loc item)<br>
</samp>

---





Source docstring:

```
Inserts the item as the left sibling of the node at this loc,
without moving
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/zip.cljs#L165-L172):

```clj
(defn insert-left
  [loc item]
    (let [[node {l :l :as path}] loc]
      (if (nil? path)
        (throw "Insert at top")
        (with-meta [node (assoc path :l (conj l item) :changed? true)] (meta loc)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:165-172](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/zip.cljs#L165-L172)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/insert-left` @ clojuredocs](http://clojuredocs.org/clojure.zip/insert-left)<br>
[`clojure.zip/insert-left` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/insert-left/)<br>
[`clojure.zip/insert-left` @ crossclj](http://crossclj.info/fun/clojure.zip/insert-left.html)<br>
[`clojure.zip/insert-left` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/insert-left.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/insert-left.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "insert-left",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/insert-left",
 :source {:code "(defn insert-left\n  [loc item]\n    (let [[node {l :l :as path}] loc]\n      (if (nil? path)\n        (throw \"Insert at top\")\n        (with-meta [node (assoc path :l (conj l item) :changed? true)] (meta loc)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [165 172]},
 :full-name "clojure.zip/insert-left",
 :clj-symbol "clojure.zip/insert-left",
 :docstring "Inserts the item as the left sibling of the node at this loc,\nwithout moving"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/insert-left"]))
```

-->
