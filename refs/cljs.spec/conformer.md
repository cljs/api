## cljs.spec/conformer



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/conformer</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/conformer)
</td>
</tr>
</table>

<samp>(conformer f)</samp><br>

---

 <samp>
(__conformer__ f)<br>
</samp>

---





Source docstring:

```
takes a predicate function with the semantics of conform i.e. it should return either a
(possibly converted) value or :clojure.spec/invalid, and returns a
spec that uses it as a predicate/conformer
```


Source code @ [github]():

```clj
(defmacro conformer
  [f]
  `(cljs.spec/spec-impl '~f ~f nil true))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/conformer` @ clojuredocs](http://clojuredocs.org/clojure.spec/conformer)<br>
[`clojure.spec/conformer` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/conformer/)<br>
[`clojure.spec/conformer` @ crossclj](http://crossclj.info/fun/clojure.spec/conformer.html)<br>
[`cljs.spec/conformer` @ crossclj](http://crossclj.info/fun/cljs.spec/conformer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/conformer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "conformer",
 :signature ["[f]"],
 :name-encode "conformer",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/conformer",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/conformer"},
 :full-name-encode "cljs.spec/conformer",
 :source {:code "(defmacro conformer\n  [f]\n  `(cljs.spec/spec-impl '~f ~f nil true))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [234 239],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L234-L239"},
 :usage ["(conformer f)"],
 :full-name "cljs.spec/conformer",
 :docstring "takes a predicate function with the semantics of conform i.e. it should return either a\n(possibly converted) value or :clojure.spec/invalid, and returns a\nspec that uses it as a predicate/conformer",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/conformer.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/conformer"]))
```

-->
