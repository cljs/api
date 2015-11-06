## clojure.zip/branch?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/branch?</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/branch?)
</td>
</tr>
</table>


 <samp>
(__branch?__ loc)<br>
</samp>

---





Source docstring:

```
Returns true if the node at loc is a branch
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/clojure/zip.cljs#L64-L67):

```clj
(defn branch?
  [loc]
    ((:zip/branch? (meta loc)) (node loc)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[zip.cljs:64-67](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/clojure/zip.cljs#L64-L67)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/branch?` @ clojuredocs](http://clojuredocs.org/clojure.zip/branch_q)<br>
[`clojure.zip/branch?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/branch%3F/)<br>
[`clojure.zip/branch?` @ crossclj](http://crossclj.info/fun/clojure.zip/branch%3F.html)<br>
[`clojure.zip/branch?` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/branch%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/branchQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "branch?",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/branchQMARK",
 :source {:code "(defn branch?\n  [loc]\n    ((:zip/branch? (meta loc)) (node loc)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/clojure/zip.cljs",
          :lines [64 67]},
 :full-name "clojure.zip/branch?",
 :clj-symbol "clojure.zip/branch?",
 :docstring "Returns true if the node at loc is a branch"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/branch?"]))
```

-->
