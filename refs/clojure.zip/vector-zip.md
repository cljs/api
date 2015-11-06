## clojure.zip/vector-zip



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/vector-zip</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/vector-zip)
</td>
</tr>
</table>


 <samp>
(__vector-zip__ root)<br>
</samp>

---





Source docstring:

```
Returns a zipper for nested vectors, given a root vector
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/clojure/zip.cljs#L42-L48):

```clj
(defn vector-zip
  [root]
    (zipper vector?
            seq
            (fn [node children] (with-meta (vec children) (meta node)))
            root))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:42-48](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/clojure/zip.cljs#L42-L48)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/vector-zip` @ clojuredocs](http://clojuredocs.org/clojure.zip/vector-zip)<br>
[`clojure.zip/vector-zip` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/vector-zip/)<br>
[`clojure.zip/vector-zip` @ crossclj](http://crossclj.info/fun/clojure.zip/vector-zip.html)<br>
[`clojure.zip/vector-zip` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/vector-zip.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/vector-zip.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "vector-zip",
 :signature ["[root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/vector-zip",
 :source {:code "(defn vector-zip\n  [root]\n    (zipper vector?\n            seq\n            (fn [node children] (with-meta (vec children) (meta node)))\n            root))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [42 48]},
 :full-name "clojure.zip/vector-zip",
 :clj-symbol "clojure.zip/vector-zip",
 :docstring "Returns a zipper for nested vectors, given a root vector"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/vector-zip"]))
```

-->
