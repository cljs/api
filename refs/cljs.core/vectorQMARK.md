## cljs.core/vector?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vector?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vector?)
</td>
</tr>
</table>


 <samp>
(__vector?__ x)<br>
</samp>

---

Returns true if `x` is a vector, false otherwise.



---


###### See Also:

[`cljs.core/vector`](../cljs.core/vector.md)<br>
[`cljs.core/vec`](../cljs.core/vec.md)<br>

---


Source docstring:

```
Return true if x satisfies IVector
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L1781-L1783):

```clj
(defn ^boolean vector?
  [x] (satisfies? IVector x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1781-1783](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L1781-L1783)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/vector?` @ clojuredocs](http://clojuredocs.org/clojure.core/vector_q)<br>
[`clojure.core/vector?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/vector%3F/)<br>
[`clojure.core/vector?` @ crossclj](http://crossclj.info/fun/clojure.core/vector%3F.html)<br>
[`cljs.core/vector?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/vector%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vectorQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a vector, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "vector?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vector" "cljs.core/vec"],
 :full-name-encode "cljs.core/vectorQMARK",
 :source {:code "(defn ^boolean vector?\n  [x] (satisfies? IVector x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1781 1783]},
 :full-name "cljs.core/vector?",
 :clj-symbol "clojure.core/vector?",
 :docstring "Return true if x satisfies IVector"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vector?"]))
```

-->
