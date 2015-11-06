## cljs.core/frequencies



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/frequencies</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/frequencies)
</td>
</tr>
</table>


 <samp>
(__frequencies__ coll)<br>
</samp>

---

Returns a map from distinct items in `coll` to the number of times they appear.

`(frequencies [:a :a :b])` => `{:a 2, :b 1}`



---


###### See Also:

[`cljs.core/group-by`](../cljs.core/group-by.md)<br>
[`cljs.core/distinct`](../cljs.core/distinct.md)<br>

---


Source docstring:

```
Returns a map from distinct items in coll to the number of times
they appear.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L8289-L8296):

```clj
(defn frequencies
  [coll]
  (persistent!
   (reduce (fn [counts x]
             (assoc! counts x (inc (get counts x 0))))
           (transient {}) coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8289-8296](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L8289-L8296)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/frequencies` @ clojuredocs](http://clojuredocs.org/clojure.core/frequencies)<br>
[`clojure.core/frequencies` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/frequencies/)<br>
[`clojure.core/frequencies` @ crossclj](http://crossclj.info/fun/clojure.core/frequencies.html)<br>
[`cljs.core/frequencies` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/frequencies.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/frequencies.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a map from distinct items in `coll` to the number of times they appear.\n\n`(frequencies [:a :a :b])` => `{:a 2, :b 1}`",
 :ns "cljs.core",
 :name "frequencies",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/group-by" "cljs.core/distinct"],
 :full-name-encode "cljs.core/frequencies",
 :source {:code "(defn frequencies\n  [coll]\n  (persistent!\n   (reduce (fn [counts x]\n             (assoc! counts x (inc (get counts x 0))))\n           (transient {}) coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8289 8296]},
 :full-name "cljs.core/frequencies",
 :clj-symbol "clojure.core/frequencies",
 :docstring "Returns a map from distinct items in coll to the number of times\nthey appear."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/frequencies"]))
```

-->
