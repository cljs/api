## clojure.zip/make-node



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/make-node</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/make-node)
</td>
</tr>
</table>


 <samp>
(__make-node__ loc node children)<br>
</samp>

---





Source docstring:

```
Returns a new branch node, given an existing node and new
children. The loc is only used to supply the constructor.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/clojure/zip.cljs#L76-L80):

```clj
(defn make-node
  [loc node children]
    ((:zip/make-node (meta loc)) node children))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:76-80](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/clojure/zip.cljs#L76-L80)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/make-node` @ clojuredocs](http://clojuredocs.org/clojure.zip/make-node)<br>
[`clojure.zip/make-node` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/make-node/)<br>
[`clojure.zip/make-node` @ crossclj](http://crossclj.info/fun/clojure.zip/make-node.html)<br>
[`clojure.zip/make-node` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/make-node.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/make-node.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "make-node",
 :signature ["[loc node children]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/make-node",
 :source {:code "(defn make-node\n  [loc node children]\n    ((:zip/make-node (meta loc)) node children))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [76 80]},
 :full-name "clojure.zip/make-node",
 :clj-symbol "clojure.zip/make-node",
 :docstring "Returns a new branch node, given an existing node and new\nchildren. The loc is only used to supply the constructor."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/make-node"]))
```

-->
