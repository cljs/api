## clojure.zip/left



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/left</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/left)
</td>
</tr>
</table>


 <samp>
(__left__ loc)<br>
</samp>

---





Source docstring:

```
Returns the loc of the left sibling of the node at this loc, or nil
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/clojure/zip.cljs#L150-L155):

```clj
(defn left
  [loc]
    (let [[node {l :l r :r :as path}] loc]
      (when (and path (seq l))
        (with-meta [(peek l) (assoc path :l (pop l) :r (cons node r))] (meta loc)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:150-155](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/clojure/zip.cljs#L150-L155)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/left` @ clojuredocs](http://clojuredocs.org/clojure.zip/left)<br>
[`clojure.zip/left` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/left/)<br>
[`clojure.zip/left` @ crossclj](http://crossclj.info/fun/clojure.zip/left.html)<br>
[`clojure.zip/left` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/left.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/left.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "left",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/left",
 :source {:code "(defn left\n  [loc]\n    (let [[node {l :l r :r :as path}] loc]\n      (when (and path (seq l))\n        (with-meta [(peek l) (assoc path :l (pop l) :r (cons node r))] (meta loc)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [150 155]},
 :full-name "clojure.zip/left",
 :clj-symbol "clojure.zip/left",
 :docstring "Returns the loc of the left sibling of the node at this loc, or nil"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/left"]))
```

-->
