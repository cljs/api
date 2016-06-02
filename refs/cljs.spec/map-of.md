## cljs.spec/map-of



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/map-of</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/map-of)
</td>
</tr>
</table>

<samp>(map-of kpred vpred)</samp><br>

---

 <samp>
(__map-of__ kpred vpred)<br>
</samp>

---





Source docstring:

```
Returns a spec for a map whose keys satisfy kpred and vals satisfy vpred.
```


Source code @ [github]():

```clj
(defmacro map-of
  [kpred vpred]
  `(and (coll-of (tuple ~kpred ~vpred) {}) map?))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/map-of` @ clojuredocs](http://clojuredocs.org/clojure.spec/map-of)<br>
[`clojure.spec/map-of` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/map-of/)<br>
[`clojure.spec/map-of` @ crossclj](http://crossclj.info/fun/clojure.spec/map-of.html)<br>
[`cljs.spec/map-of` @ crossclj](http://crossclj.info/fun/cljs.spec/map-of.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/map-of.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "map-of",
 :signature ["[kpred vpred]"],
 :name-encode "map-of",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/map-of",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/map-of"},
 :full-name-encode "cljs.spec/map-of",
 :source {:code "(defmacro map-of\n  [kpred vpred]\n  `(and (coll-of (tuple ~kpred ~vpred) {}) map?))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [374 377],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L374-L377"},
 :usage ["(map-of kpred vpred)"],
 :full-name "cljs.spec/map-of",
 :docstring "Returns a spec for a map whose keys satisfy kpred and vals satisfy vpred.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/map-of.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/map-of"]))
```

-->
