## cljs.spec/tuple



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/tuple</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/tuple)
</td>
</tr>
</table>

<samp>(tuple & preds)</samp><br>

---

 <samp>
(__tuple__ & preds)<br>
</samp>

---





Source docstring:

```
takes one or more preds and returns a spec for a tuple, a vector
where each element conforms to the corresponding pred. Each element
will be referred to in paths using its ordinal.
```


Source code @ [github]():

```clj
(defmacro tuple
  [& preds]
  (assert (not (empty? preds)))
  `(cljs.spec/tuple-impl '~(mapv #(res &env %) preds) ~(vec preds)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/tuple` @ clojuredocs](http://clojuredocs.org/clojure.spec/tuple)<br>
[`clojure.spec/tuple` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/tuple/)<br>
[`clojure.spec/tuple` @ crossclj](http://crossclj.info/fun/clojure.spec/tuple.html)<br>
[`cljs.spec/tuple` @ crossclj](http://crossclj.info/fun/cljs.spec/tuple.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/tuple.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "tuple",
 :signature ["[& preds]"],
 :name-encode "tuple",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/tuple",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/tuple"},
 :full-name-encode "cljs.spec/tuple",
 :source {:code "(defmacro tuple\n  [& preds]\n  (assert (not (empty? preds)))\n  `(cljs.spec/tuple-impl '~(mapv #(res &env %) preds) ~(vec preds)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [252 258],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L252-L258"},
 :usage ["(tuple & preds)"],
 :full-name "cljs.spec/tuple",
 :docstring "takes one or more preds and returns a spec for a tuple, a vector\nwhere each element conforms to the corresponding pred. Each element\nwill be referred to in paths using its ordinal.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/tuple.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/tuple"]))
```

-->
