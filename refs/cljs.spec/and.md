## cljs.spec/and



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/and</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/and)
</td>
</tr>
</table>

<samp>(and & pred-forms)</samp><br>

---

 <samp>
(__and__ & pred-forms)<br>
</samp>

---





Source docstring:

```
Takes predicate/spec-forms, e.g.

(s/and even? #(< % 42))

Returns a spec that returns the conformed value. Successive
conformed values propagate through rest of predicates.
```


Source code @ [github]():

```clj
(defmacro and
  [& pred-forms]
  `(cljs.spec/and-spec-impl '~(mapv #(res &env %) pred-forms) ~(vec pred-forms) nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/and` @ clojuredocs](http://clojuredocs.org/clojure.spec/and)<br>
[`clojure.spec/and` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/and/)<br>
[`clojure.spec/and` @ crossclj](http://crossclj.info/fun/clojure.spec/and.html)<br>
[`cljs.spec/and` @ crossclj](http://crossclj.info/fun/cljs.spec/and.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/and.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "and",
 :signature ["[& pred-forms]"],
 :name-encode "and",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/and",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/and"},
 :full-name-encode "cljs.spec/and",
 :source {:code "(defmacro and\n  [& pred-forms]\n  `(cljs.spec/and-spec-impl '~(mapv #(res &env %) pred-forms) ~(vec pred-forms) nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [167 175],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L167-L175"},
 :usage ["(and & pred-forms)"],
 :full-name "cljs.spec/and",
 :docstring "Takes predicate/spec-forms, e.g.\n\n(s/and even? #(< % 42))\n\nReturns a spec that returns the conformed value. Successive\nconformed values propagate through rest of predicates.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/and.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/and"]))
```

-->
