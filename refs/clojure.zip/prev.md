## clojure.zip/prev



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/prev</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/prev)
</td>
</tr>
</table>


 <samp>
(__prev__ loc)<br>
</samp>

---





Source docstring:

```
Moves to the previous loc in the hierarchy, depth-first. If already
at the root, returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r927/src/cljs/clojure/zip.cljs#L221-L230):

```clj
(defn prev
  [loc]
    (if-let [lloc (left loc)]
      (loop [loc lloc]
        (if-let [child (and (branch? loc) (down loc))]
          (recur (rightmost child))
          loc))
      (up loc)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:221-230](https://github.com/clojure/clojurescript/blob/r927/src/cljs/clojure/zip.cljs#L221-L230)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/prev` @ clojuredocs](http://clojuredocs.org/clojure.zip/prev)<br>
[`clojure.zip/prev` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/prev/)<br>
[`clojure.zip/prev` @ crossclj](http://crossclj.info/fun/clojure.zip/prev.html)<br>
[`clojure.zip/prev` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/prev.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/prev.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "prev",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/prev",
 :source {:code "(defn prev\n  [loc]\n    (if-let [lloc (left loc)]\n      (loop [loc lloc]\n        (if-let [child (and (branch? loc) (down loc))]\n          (recur (rightmost child))\n          loc))\n      (up loc)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [221 230]},
 :full-name "clojure.zip/prev",
 :clj-symbol "clojure.zip/prev",
 :docstring "Moves to the previous loc in the hierarchy, depth-first. If already\nat the root, returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/prev"]))
```

-->
