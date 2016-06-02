## cljs.spec/fn-specs



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/fn-specs</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/fn-specs)
</td>
</tr>
</table>

<samp>(fn-specs v)</samp><br>

---

 <samp>
(__fn-specs__ v)<br>
</samp>

---





Source docstring:

```
Returns :args/:ret/:fn map of specs for var or symbol v.
```


Source code @ [github]():

```clj
(defn fn-specs
  [v]
  (let [s (->sym v)
        reg (registry)]
    (reduce
      (fn [m role]
        (assoc m role (get reg (fn-spec-sym s role))))
      {}
      fn-spec-roles)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/fn-specs` @ clojuredocs](http://clojuredocs.org/clojure.spec/fn-specs)<br>
[`clojure.spec/fn-specs` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/fn-specs/)<br>
[`clojure.spec/fn-specs` @ crossclj](http://crossclj.info/fun/clojure.spec/fn-specs.html)<br>
[`cljs.spec/fn-specs` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/fn-specs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/fn-specs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "fn-specs",
 :signature ["[v]"],
 :name-encode "fn-specs",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/fn-specs",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/fn-specs"},
 :full-name-encode "cljs.spec/fn-specs",
 :source {:code "(defn fn-specs\n  [v]\n  (let [s (->sym v)\n        reg (registry)]\n    (reduce\n      (fn [m role]\n        (assoc m role (get reg (fn-spec-sym s role))))\n      {}\n      fn-spec-roles)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [261 270],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L261-L270"},
 :usage ["(fn-specs v)"],
 :full-name "cljs.spec/fn-specs",
 :docstring "Returns :args/:ret/:fn map of specs for var or symbol v.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/fn-specs.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/fn-specs"]))
```

-->
