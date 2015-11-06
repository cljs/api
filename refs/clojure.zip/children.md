## clojure.zip/children



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/children</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/children)
</td>
</tr>
</table>


 <samp>
(__children__ loc)<br>
</samp>

---





Source docstring:

```
Returns a seq of the children of node at loc, which must be a branch
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/clojure/zip.cljs#L69-L74):

```clj
(defn children
  [loc]
    (if (branch? loc)
      ((:zip/children (meta loc)) (node loc))
      (throw "called children on a leaf node")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1878
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:69-74](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/clojure/zip.cljs#L69-L74)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/children` @ clojuredocs](http://clojuredocs.org/clojure.zip/children)<br>
[`clojure.zip/children` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/children/)<br>
[`clojure.zip/children` @ crossclj](http://crossclj.info/fun/clojure.zip/children.html)<br>
[`clojure.zip/children` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/children.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/children.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "children",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/children",
 :source {:code "(defn children\n  [loc]\n    (if (branch? loc)\n      ((:zip/children (meta loc)) (node loc))\n      (throw \"called children on a leaf node\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [69 74]},
 :full-name "clojure.zip/children",
 :clj-symbol "clojure.zip/children",
 :docstring "Returns a seq of the children of node at loc, which must be a branch"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/children"]))
```

-->
