## cljs.spec/cat



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/cat</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/cat)
</td>
</tr>
</table>

<samp>(cat & key-pred-forms)</samp><br>

---

 <samp>
(__cat__ & key-pred-forms)<br>
</samp>

---





Source docstring:

```
Takes key+pred pairs, e.g.

(s/cat :e even? :o odd?)

Returns a regex op that matches (all) values in sequence, returning a map
containing the keys of each pred and the corresponding value.
```


Source code @ [github]():

```clj
(defmacro cat
  [& key-pred-forms]
  (let [pairs (partition 2 key-pred-forms)
        keys (mapv first pairs)
        pred-forms (mapv second pairs)
        pf (mapv #(res &env %) pred-forms)]
    ;;(prn key-pred-forms)
    (assert (clojure.core/and (even? (count key-pred-forms)) (every? keyword? keys)) "cat expects k1 p1 k2 p2..., where ks are keywords")
    `(cljs.spec/cat-impl ~keys ~pred-forms '~pf)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/cat` @ clojuredocs](http://clojuredocs.org/clojure.spec/cat)<br>
[`clojure.spec/cat` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/cat/)<br>
[`clojure.spec/cat` @ crossclj](http://crossclj.info/fun/clojure.spec/cat.html)<br>
[`cljs.spec/cat` @ crossclj](http://crossclj.info/fun/cljs.spec/cat.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/cat.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "cat",
 :signature ["[& key-pred-forms]"],
 :name-encode "cat",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/cat",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/cat"},
 :full-name-encode "cljs.spec/cat",
 :source {:code "(defmacro cat\n  [& key-pred-forms]\n  (let [pairs (partition 2 key-pred-forms)\n        keys (mapv first pairs)\n        pred-forms (mapv second pairs)\n        pf (mapv #(res &env %) pred-forms)]\n    ;;(prn key-pred-forms)\n    (assert (clojure.core/and (even? (count key-pred-forms)) (every? keyword? keys)) \"cat expects k1 p1 k2 p2..., where ks are keywords\")\n    `(cljs.spec/cat-impl ~keys ~pred-forms '~pf)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [210 224],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljc#L210-L224"},
 :usage ["(cat & key-pred-forms)"],
 :full-name "cljs.spec/cat",
 :docstring "Takes key+pred pairs, e.g.\n\n(s/cat :e even? :o odd?)\n\nReturns a regex op that matches (all) values in sequence, returning a map\ncontaining the keys of each pred and the corresponding value.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/cat.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/cat"]))
```

-->
