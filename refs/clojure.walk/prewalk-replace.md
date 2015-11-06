## clojure.walk/prewalk-replace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/prewalk-replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/prewalk-replace)
</td>
</tr>
</table>


 <samp>
(__prewalk-replace__ smap form)<br>
</samp>

---





Source docstring:

```
Recursively transforms form by replacing keys in smap with their
values.  Like clojure/replace but works on any data structure.  Does
replacement at the root of the tree first.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/clojure/walk.cljs#L80-L86):

```clj
(defn prewalk-replace
  [smap form]
  (prewalk (fn [x] (if (contains? smap x) (smap x) x)) form))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:80-86](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/clojure/walk.cljs#L80-L86)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.walk/prewalk-replace` @ clojuredocs](http://clojuredocs.org/clojure.walk/prewalk-replace)<br>
[`clojure.walk/prewalk-replace` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.walk/prewalk-replace/)<br>
[`clojure.walk/prewalk-replace` @ crossclj](http://crossclj.info/fun/clojure.walk/prewalk-replace.html)<br>
[`clojure.walk/prewalk-replace` @ crossclj](http://crossclj.info/fun/clojure.walk.cljs/prewalk-replace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk/prewalk-replace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.walk",
 :name "prewalk-replace",
 :signature ["[smap form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk/prewalk-replace",
 :source {:code "(defn prewalk-replace\n  [smap form]\n  (prewalk (fn [x] (if (contains? smap x) (smap x) x)) form))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/clojure/walk.cljs",
          :lines [80 86]},
 :full-name "clojure.walk/prewalk-replace",
 :clj-symbol "clojure.walk/prewalk-replace",
 :docstring "Recursively transforms form by replacing keys in smap with their\nvalues.  Like clojure/replace but works on any data structure.  Does\nreplacement at the root of the tree first."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/prewalk-replace"]))
```

-->
