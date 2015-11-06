## clojure.zip/remove



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/remove</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/remove)
</td>
</tr>
</table>


 <samp>
(__remove__ loc)<br>
</samp>

---





Source docstring:

```
Removes the node at loc, returning the loc that would have preceded
it in a depth-first walk.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L237-L251):

```clj
(defn remove
  [loc]
    (let [[node {l :l, ppath :ppath, pnodes :pnodes, rs :r, :as path}] loc]
      (if (nil? path)
        (throw "Remove at top")
        (if (pos? (count l))
          (loop [loc (with-meta [(peek l) (assoc path :l (pop l) :changed? true)] (meta loc))]
            (if-let [child (and (branch? loc) (down loc))]
              (recur (rightmost child))
              loc))
          (with-meta [(make-node loc (peek pnodes) rs) 
                      (and ppath (assoc ppath :changed? true))]
                     (meta loc))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:237-251](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L237-L251)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/remove` @ clojuredocs](http://clojuredocs.org/clojure.zip/remove)<br>
[`clojure.zip/remove` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/remove/)<br>
[`clojure.zip/remove` @ crossclj](http://crossclj.info/fun/clojure.zip/remove.html)<br>
[`clojure.zip/remove` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/remove.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/remove.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "remove",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/remove",
 :source {:code "(defn remove\n  [loc]\n    (let [[node {l :l, ppath :ppath, pnodes :pnodes, rs :r, :as path}] loc]\n      (if (nil? path)\n        (throw \"Remove at top\")\n        (if (pos? (count l))\n          (loop [loc (with-meta [(peek l) (assoc path :l (pop l) :changed? true)] (meta loc))]\n            (if-let [child (and (branch? loc) (down loc))]\n              (recur (rightmost child))\n              loc))\n          (with-meta [(make-node loc (peek pnodes) rs) \n                      (and ppath (assoc ppath :changed? true))]\n                     (meta loc))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1803",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [237 251]},
 :full-name "clojure.zip/remove",
 :clj-symbol "clojure.zip/remove",
 :docstring "Removes the node at loc, returning the loc that would have preceded\nit in a depth-first walk."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/remove"]))
```

-->
