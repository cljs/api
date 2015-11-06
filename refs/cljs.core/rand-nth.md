## cljs.core/rand-nth



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand-nth</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand-nth)
</td>
</tr>
</table>


 <samp>
(__rand-nth__ coll)<br>
</samp>

---

Returns a random element from a sequential collection `coll`.

Has the same performance characteristics as `nth`.



---


###### See Also:

[`cljs.core/rand`](../cljs.core/rand.md)<br>

---


Source docstring:

```
Return a random element of the (sequential) collection. Will have
the same performance characteristics as nth for the given
collection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L9065-L9070):

```clj
(defn rand-nth
  [coll]
  (nth coll (rand-int (count coll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9065-9070](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L9065-L9070)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/rand-nth` @ clojuredocs](http://clojuredocs.org/clojure.core/rand-nth)<br>
[`clojure.core/rand-nth` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/rand-nth/)<br>
[`clojure.core/rand-nth` @ crossclj](http://crossclj.info/fun/clojure.core/rand-nth.html)<br>
[`cljs.core/rand-nth` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/rand-nth.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/rand-nth.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a random element from a sequential collection `coll`.\n\nHas the same performance characteristics as `nth`.",
 :ns "cljs.core",
 :name "rand-nth",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rand"],
 :full-name-encode "cljs.core/rand-nth",
 :source {:code "(defn rand-nth\n  [coll]\n  (nth coll (rand-int (count coll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9065 9070]},
 :full-name "cljs.core/rand-nth",
 :clj-symbol "clojure.core/rand-nth",
 :docstring "Return a random element of the (sequential) collection. Will have\nthe same performance characteristics as nth for the given\ncollection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rand-nth"]))
```

-->
