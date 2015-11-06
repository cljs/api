## cljs.core/split-with



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/split-with</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/split-with)
</td>
</tr>
</table>


 <samp>
(__split-with__ pred coll)<br>
</samp>

---

Returns a vector of `[(take-while pred coll) (drop-while pred coll)]`



---


###### See Also:

[`cljs.core/split-at`](../cljs.core/split-at.md)<br>
[`clojure.string/split`](../clojure.string/split.md)<br>
[`cljs.core/take-while`](../cljs.core/take-while.md)<br>
[`cljs.core/drop-while`](../cljs.core/drop-while.md)<br>

---


Source docstring:

```
Returns a vector of [(take-while pred coll) (drop-while pred coll)]
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L5928-L5931):

```clj
(defn split-with
  [pred coll]
  [(take-while pred coll) (drop-while pred coll)])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5928-5931](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L5928-L5931)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/split-with` @ clojuredocs](http://clojuredocs.org/clojure.core/split-with)<br>
[`clojure.core/split-with` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/split-with/)<br>
[`clojure.core/split-with` @ crossclj](http://crossclj.info/fun/clojure.core/split-with.html)<br>
[`cljs.core/split-with` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/split-with.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/split-with.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a vector of `[(take-while pred coll) (drop-while pred coll)]`",
 :ns "cljs.core",
 :name "split-with",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/split-at"
           "clojure.string/split"
           "cljs.core/take-while"
           "cljs.core/drop-while"],
 :full-name-encode "cljs.core/split-with",
 :source {:code "(defn split-with\n  [pred coll]\n  [(take-while pred coll) (drop-while pred coll)])",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5928 5931]},
 :full-name "cljs.core/split-with",
 :clj-symbol "clojure.core/split-with",
 :docstring "Returns a vector of [(take-while pred coll) (drop-while pred coll)]"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/split-with"]))
```

-->
