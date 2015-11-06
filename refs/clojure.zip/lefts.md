## clojure.zip/lefts



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/lefts</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/lefts)
</td>
</tr>
</table>


 <samp>
(__lefts__ loc)<br>
</samp>

---





Source docstring:

```
Returns a seq of the left siblings of this loc
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/zip.cljs#L87-L90):

```clj
(defn lefts
  [loc]
    (seq (:l (loc 1))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:87-90](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/zip.cljs#L87-L90)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/lefts` @ clojuredocs](http://clojuredocs.org/clojure.zip/lefts)<br>
[`clojure.zip/lefts` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/lefts/)<br>
[`clojure.zip/lefts` @ crossclj](http://crossclj.info/fun/clojure.zip/lefts.html)<br>
[`clojure.zip/lefts` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/lefts.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/lefts.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "lefts",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/lefts",
 :source {:code "(defn lefts\n  [loc]\n    (seq (:l (loc 1))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [87 90]},
 :full-name "clojure.zip/lefts",
 :clj-symbol "clojure.zip/lefts",
 :docstring "Returns a seq of the left siblings of this loc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/lefts"]))
```

-->
