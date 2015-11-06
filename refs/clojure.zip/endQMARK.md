## clojure.zip/end?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/end?</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/end?)
</td>
</tr>
</table>


 <samp>
(__end?__ loc)<br>
</samp>

---





Source docstring:

```
Returns true if loc represents the end of a depth-first walk
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/clojure/zip.cljs#L232-L235):

```clj
(defn end?
  [loc]
    (= :end (loc 1)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:232-235](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/clojure/zip.cljs#L232-L235)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/end?` @ clojuredocs](http://clojuredocs.org/clojure.zip/end_q)<br>
[`clojure.zip/end?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/end%3F/)<br>
[`clojure.zip/end?` @ crossclj](http://crossclj.info/fun/clojure.zip/end%3F.html)<br>
[`clojure.zip/end?` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/end%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/endQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "end?",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/endQMARK",
 :source {:code "(defn end?\n  [loc]\n    (= :end (loc 1)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [232 235]},
 :full-name "clojure.zip/end?",
 :clj-symbol "clojure.zip/end?",
 :docstring "Returns true if loc represents the end of a depth-first walk"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/end?"]))
```

-->
