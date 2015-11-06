## clojure.zip/right



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/right</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/right)
</td>
</tr>
</table>


 <samp>
(__right__ loc)<br>
</samp>

---





Source docstring:

```
Returns the loc of the right sibling of the node at this loc, or nil
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/clojure/zip.cljs#L135-L140):

```clj
(defn right
  [loc]
    (let [[node {l :l  [r & rnext :as rs] :r :as path}] loc]
      (when (and path rs)
        (with-meta [r (assoc path :l (conj l node) :r rnext)] (meta loc)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[zip.cljs:135-140](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/clojure/zip.cljs#L135-L140)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/right` @ clojuredocs](http://clojuredocs.org/clojure.zip/right)<br>
[`clojure.zip/right` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/right/)<br>
[`clojure.zip/right` @ crossclj](http://crossclj.info/fun/clojure.zip/right.html)<br>
[`clojure.zip/right` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/right.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/right.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "right",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/right",
 :source {:code "(defn right\n  [loc]\n    (let [[node {l :l  [r & rnext :as rs] :r :as path}] loc]\n      (when (and path rs)\n        (with-meta [r (assoc path :l (conj l node) :r rnext)] (meta loc)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/clojure/zip.cljs",
          :lines [135 140]},
 :full-name "clojure.zip/right",
 :clj-symbol "clojure.zip/right",
 :docstring "Returns the loc of the right sibling of the node at this loc, or nil"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/right"]))
```

-->
