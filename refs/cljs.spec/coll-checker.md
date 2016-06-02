## cljs.spec/coll-checker



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/coll-checker</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/coll-checker)
</td>
</tr>
</table>

<samp>(coll-checker pred)</samp><br>

---

 <samp>
(__coll-checker__ pred)<br>
</samp>

---





Source docstring:

```
returns a predicate function that checks *coll-check-limit* items in a collection with pred
```


Source code @ [github]():

```clj
(defn coll-checker
  [pred]
  (let [check? #(valid? pred %)]
    (fn [coll]
      (c/or (nil? coll)
            (c/and
              (coll? coll)
              (every? check? (take *coll-check-limit* coll)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/coll-checker` @ clojuredocs](http://clojuredocs.org/clojure.spec/coll-checker)<br>
[`clojure.spec/coll-checker` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/coll-checker/)<br>
[`clojure.spec/coll-checker` @ crossclj](http://crossclj.info/fun/clojure.spec/coll-checker.html)<br>
[`cljs.spec/coll-checker` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/coll-checker.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/coll-checker.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "coll-checker",
 :signature ["[pred]"],
 :name-encode "coll-checker",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/coll-checker",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/coll-checker"},
 :full-name-encode "cljs.spec/coll-checker",
 :source {:code "(defn coll-checker\n  [pred]\n  (let [check? #(valid? pred %)]\n    (fn [coll]\n      (c/or (nil? coll)\n            (c/and\n              (coll? coll)\n              (every? check? (take *coll-check-limit* coll)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [1030 1038],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L1030-L1038"},
 :usage ["(coll-checker pred)"],
 :full-name "cljs.spec/coll-checker",
 :docstring "returns a predicate function that checks *coll-check-limit* items in a collection with pred",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/coll-checker.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/coll-checker"]))
```

-->
