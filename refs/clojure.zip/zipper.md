## clojure.zip/zipper



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/zipper</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/zipper)
</td>
</tr>
</table>


 <samp>
(__zipper__ branch? children make-node root)<br>
</samp>

---





Source docstring:

```
Creates a new zipper structure. 

branch? is a fn that, given a node, returns true if can have
children, even if it currently doesn't.

children is a fn that, given a branch node, returns a seq of its
children.

make-node is a fn that, given an existing node and a seq of
children, returns a new branch node with the supplied children.
root is the root node.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/zip.cljs#L18-L32):

```clj
(defn zipper
  [branch? children make-node root]
    ^{:zip/branch? branch? :zip/children children :zip/make-node make-node}
    [root nil])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:18-32](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/zip.cljs#L18-L32)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/zipper` @ clojuredocs](http://clojuredocs.org/clojure.zip/zipper)<br>
[`clojure.zip/zipper` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/zipper/)<br>
[`clojure.zip/zipper` @ crossclj](http://crossclj.info/fun/clojure.zip/zipper.html)<br>
[`clojure.zip/zipper` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/zipper.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/zipper.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "zipper",
 :signature ["[branch? children make-node root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/zipper",
 :source {:code "(defn zipper\n  [branch? children make-node root]\n    ^{:zip/branch? branch? :zip/children children :zip/make-node make-node}\n    [root nil])",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [18 32]},
 :full-name "clojure.zip/zipper",
 :clj-symbol "clojure.zip/zipper",
 :docstring "Creates a new zipper structure. \n\nbranch? is a fn that, given a node, returns true if can have\nchildren, even if it currently doesn't.\n\nchildren is a fn that, given a branch node, returns a seq of its\nchildren.\n\nmake-node is a fn that, given an existing node and a seq of\nchildren, returns a new branch node with the supplied children.\nroot is the root node."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/zipper"]))
```

-->
