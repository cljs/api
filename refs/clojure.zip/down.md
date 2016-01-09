## clojure.zip/down



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/down</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/down)
</td>
</tr>
</table>


 <samp>
(__down__ loc)<br>
</samp>

---





Source docstring:

```
Returns the loc of the leftmost child of the node at this loc, or
nil if no children
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/clojure/zip.cljs#L98-L109):

```clj
(defn down
  [loc]
    (when (branch? loc)
      (let [[node path] loc
            [c & cnext :as cs] (children loc)]
        (when cs
          (with-meta [c {:l [] 
                         :pnodes (if path (conj (:pnodes path) node) [node]) 
                         :ppath path 
                         :r cnext}] (meta loc))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[zip.cljs:98-109](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/clojure/zip.cljs#L98-L109)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/down` @ clojuredocs](http://clojuredocs.org/clojure.zip/down)<br>
[`clojure.zip/down` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/down/)<br>
[`clojure.zip/down` @ crossclj](http://crossclj.info/fun/clojure.zip/down.html)<br>
[`clojure.zip/down` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/down.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/down.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "down",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/down",
 :source {:code "(defn down\n  [loc]\n    (when (branch? loc)\n      (let [[node path] loc\n            [c & cnext :as cs] (children loc)]\n        (when cs\n          (with-meta [c {:l [] \n                         :pnodes (if path (conj (:pnodes path) node) [node]) \n                         :ppath path \n                         :r cnext}] (meta loc))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/clojure/zip.cljs",
          :lines [98 109]},
 :full-name "clojure.zip/down",
 :clj-symbol "clojure.zip/down",
 :docstring "Returns the loc of the leftmost child of the node at this loc, or\nnil if no children"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/down"]))
```

-->
