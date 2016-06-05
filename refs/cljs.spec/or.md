## cljs.spec/or



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/or</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/or)
</td>
</tr>
</table>

<samp>(or & key-pred-forms)</samp><br>

---

 <samp>
(__or__ & key-pred-forms)<br>
</samp>

---





Source docstring:

```
Takes key+pred pairs, e.g.

(s/or :even even? :small #(< % 42))

Returns a destructuring spec that
returns a vector containing the key of the first matching pred and the
corresponding value.
```


Source code @ [github]():

```clj
(defmacro or
  [& key-pred-forms]
  (let [pairs (partition 2 key-pred-forms)
        keys (mapv first pairs)
        pred-forms (mapv second pairs)
        pf (mapv #(res &env %) pred-forms)]
    (assert (clojure.core/and (even? (count key-pred-forms)) (every? keyword? keys)) "spec/or expects k1 p1 k2 p2..., where ks are keywords")
    `(cljs.spec/or-spec-impl ~keys '~pf ~pred-forms nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/or` @ clojuredocs](http://clojuredocs.org/clojure.spec/or)<br>
[`clojure.spec/or` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/or/)<br>
[`clojure.spec/or` @ crossclj](http://crossclj.info/fun/clojure.spec/or.html)<br>
[`cljs.spec/or` @ crossclj](http://crossclj.info/fun/cljs.spec/or.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/or.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "or",
 :signature ["[& key-pred-forms]"],
 :name-encode "or",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/or",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/or"},
 :full-name-encode "cljs.spec/or",
 :source {:code "(defmacro or\n  [& key-pred-forms]\n  (let [pairs (partition 2 key-pred-forms)\n        keys (mapv first pairs)\n        pred-forms (mapv second pairs)\n        pf (mapv #(res &env %) pred-forms)]\n    (assert (clojure.core/and (even? (count key-pred-forms)) (every? keyword? keys)) \"spec/or expects k1 p1 k2 p2..., where ks are keywords\")\n    `(cljs.spec/or-spec-impl ~keys '~pf ~pred-forms nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [151 165],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L151-L165"},
 :usage ["(or & key-pred-forms)"],
 :full-name "cljs.spec/or",
 :docstring "Takes key+pred pairs, e.g.\n\n(s/or :even even? :small #(< % 42))\n\nReturns a destructuring spec that\nreturns a vector containing the key of the first matching pred and the\ncorresponding value.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/or.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/or"]))
```

-->
