## clojure.zip/node



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/node</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/node)
</td>
</tr>
</table>


 <samp>
(__node__ loc)<br>
</samp>

---





Source docstring:

```
Returns the node at loc
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/clojure/zip.cljs#L60-L62):

```clj
(defn node
  [loc] (loc 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:60-62](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/clojure/zip.cljs#L60-L62)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/node` @ clojuredocs](http://clojuredocs.org/clojure.zip/node)<br>
[`clojure.zip/node` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/node/)<br>
[`clojure.zip/node` @ crossclj](http://crossclj.info/fun/clojure.zip/node.html)<br>
[`clojure.zip/node` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/node.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/node.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "node",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/node",
 :source {:code "(defn node\n  [loc] (loc 0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [60 62]},
 :full-name "clojure.zip/node",
 :clj-symbol "clojure.zip/node",
 :docstring "Returns the node at loc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/node"]))
```

-->
