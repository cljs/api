## clojure.zip/rightmost



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/rightmost</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/rightmost)
</td>
</tr>
</table>


 <samp>
(__rightmost__ loc)<br>
</samp>

---





Source docstring:

```
Returns the loc of the rightmost sibling of the node at this loc, or self
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/clojure/zip.cljs#L142-L148):

```clj
(defn rightmost
  [loc]
    (let [[node {l :l r :r :as path}] loc]
      (if (and path r)
        (with-meta [(last r) (assoc path :l (apply conj l node (butlast r)) :r nil)] (meta loc))
        loc)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:142-148](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/clojure/zip.cljs#L142-L148)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/rightmost` @ clojuredocs](http://clojuredocs.org/clojure.zip/rightmost)<br>
[`clojure.zip/rightmost` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/rightmost/)<br>
[`clojure.zip/rightmost` @ crossclj](http://crossclj.info/fun/clojure.zip/rightmost.html)<br>
[`clojure.zip/rightmost` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/rightmost.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/rightmost.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "rightmost",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/rightmost",
 :source {:code "(defn rightmost\n  [loc]\n    (let [[node {l :l r :r :as path}] loc]\n      (if (and path r)\n        (with-meta [(last r) (assoc path :l (apply conj l node (butlast r)) :r nil)] (meta loc))\n        loc)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [142 148]},
 :full-name "clojure.zip/rightmost",
 :clj-symbol "clojure.zip/rightmost",
 :docstring "Returns the loc of the rightmost sibling of the node at this loc, or self"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/rightmost"]))
```

-->
