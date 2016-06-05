## cljs.spec/coll-of



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/coll-of</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/coll-of)
</td>
</tr>
</table>

<samp>(coll-of pred init-coll)</samp><br>

---

 <samp>
(__coll-of__ pred init-coll)<br>
</samp>

---





Source docstring:

```
Returns a spec for a collection of items satisfying pred. The generator will fill an empty init-coll.
```


Source code @ [github]():

```clj
(defmacro coll-of
  [pred init-coll]
  `(spec (cljs.spec/coll-checker ~pred) :gen (cljs.spec/coll-gen ~pred ~init-coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/coll-of` @ clojuredocs](http://clojuredocs.org/clojure.spec/coll-of)<br>
[`clojure.spec/coll-of` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/coll-of/)<br>
[`clojure.spec/coll-of` @ crossclj](http://crossclj.info/fun/clojure.spec/coll-of.html)<br>
[`cljs.spec/coll-of` @ crossclj](http://crossclj.info/fun/cljs.spec/coll-of.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/coll-of.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "coll-of",
 :signature ["[pred init-coll]"],
 :name-encode "coll-of",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/coll-of",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/coll-of"},
 :full-name-encode "cljs.spec/coll-of",
 :source {:code "(defmacro coll-of\n  [pred init-coll]\n  `(spec (cljs.spec/coll-checker ~pred) :gen (cljs.spec/coll-gen ~pred ~init-coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [369 372],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L369-L372"},
 :usage ["(coll-of pred init-coll)"],
 :full-name "cljs.spec/coll-of",
 :docstring "Returns a spec for a collection of items satisfying pred. The generator will fill an empty init-coll.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/coll-of.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/coll-of"]))
```

-->
