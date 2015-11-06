## cljs.core/sequential?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sequential?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sequential?)
</td>
</tr>
</table>


 <samp>
(__sequential?__ coll)<br>
</samp>

---

Returns true if `coll` implements the `ISequential` protocol, false otherwise.

Lists and vectors are sequential.



---


###### See Also:

[`cljs.core/seq?`](../cljs.core/seqQMARK.md)<br>
[`cljs.core/coll?`](../cljs.core/collQMARK.md)<br>

---


Source docstring:

```
Returns true if coll satisfies ISequential
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L1522-L1524):

```clj
(defn ^boolean sequential?
  [x] (satisfies? ISequential x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1522-1524](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L1522-L1524)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sequential?` @ clojuredocs](http://clojuredocs.org/clojure.core/sequential_q)<br>
[`clojure.core/sequential?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sequential%3F/)<br>
[`clojure.core/sequential?` @ crossclj](http://crossclj.info/fun/clojure.core/sequential%3F.html)<br>
[`cljs.core/sequential?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sequential%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sequentialQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `coll` implements the `ISequential` protocol, false otherwise.\n\nLists and vectors are sequential.",
 :return-type boolean,
 :ns "cljs.core",
 :name "sequential?",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq?" "cljs.core/coll?"],
 :full-name-encode "cljs.core/sequentialQMARK",
 :source {:code "(defn ^boolean sequential?\n  [x] (satisfies? ISequential x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1522 1524]},
 :full-name "cljs.core/sequential?",
 :clj-symbol "clojure.core/sequential?",
 :docstring "Returns true if coll satisfies ISequential"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sequential?"]))
```

-->
