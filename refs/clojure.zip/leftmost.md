## clojure.zip/leftmost



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/leftmost</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/leftmost)
</td>
</tr>
</table>


 <samp>
(__leftmost__ loc)<br>
</samp>

---





Source docstring:

```
Returns the loc of the leftmost sibling of the node at this loc, or self
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/clojure/zip.cljs#L157-L163):

```clj
(defn leftmost
  [loc]
    (let [[node {l :l r :r :as path}] loc]
      (if (and path (seq l))
        (with-meta [(first l) (assoc path :l [] :r (concat (rest l) [node] r))] (meta loc))
        loc)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:157-163](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/clojure/zip.cljs#L157-L163)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/leftmost` @ clojuredocs](http://clojuredocs.org/clojure.zip/leftmost)<br>
[`clojure.zip/leftmost` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/leftmost/)<br>
[`clojure.zip/leftmost` @ crossclj](http://crossclj.info/fun/clojure.zip/leftmost.html)<br>
[`clojure.zip/leftmost` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/leftmost.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/leftmost.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "leftmost",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/leftmost",
 :source {:code "(defn leftmost\n  [loc]\n    (let [[node {l :l r :r :as path}] loc]\n      (if (and path (seq l))\n        (with-meta [(first l) (assoc path :l [] :r (concat (rest l) [node] r))] (meta loc))\n        loc)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [157 163]},
 :full-name "clojure.zip/leftmost",
 :clj-symbol "clojure.zip/leftmost",
 :docstring "Returns the loc of the leftmost sibling of the node at this loc, or self"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/leftmost"]))
```

-->
