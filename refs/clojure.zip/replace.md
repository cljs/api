## clojure.zip/replace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/replace)
</td>
</tr>
</table>


 <samp>
(__replace__ loc node)<br>
</samp>

---





Source docstring:

```
Replaces the node at this loc, without moving
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/zip.cljs#L183-L187):

```clj
(defn replace
  [loc node]
    (let [[_ path] loc]
      (with-meta [node (assoc path :changed? true)] (meta loc))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:183-187](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/zip.cljs#L183-L187)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/replace` @ clojuredocs](http://clojuredocs.org/clojure.zip/replace)<br>
[`clojure.zip/replace` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/replace/)<br>
[`clojure.zip/replace` @ crossclj](http://crossclj.info/fun/clojure.zip/replace.html)<br>
[`clojure.zip/replace` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/replace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/replace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "replace",
 :signature ["[loc node]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/replace",
 :source {:code "(defn replace\n  [loc node]\n    (let [[_ path] loc]\n      (with-meta [node (assoc path :changed? true)] (meta loc))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [183 187]},
 :full-name "clojure.zip/replace",
 :clj-symbol "clojure.zip/replace",
 :docstring "Replaces the node at this loc, without moving"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/replace"]))
```

-->
