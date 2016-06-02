## cljs.spec/alt



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/alt</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/alt)
</td>
</tr>
</table>

<samp>(alt & key-pred-forms)</samp><br>

---

 <samp>
(__alt__ & key-pred-forms)<br>
</samp>

---





Source docstring:

```
Takes key+pred pairs, e.g.

(s/alt :even even? :small #(< % 42))

Returns a regex op that returns a vector containing the key of the
first matching pred and the corresponding value.
```


Source code @ [github]():

```clj
(defmacro alt
  [& key-pred-forms]
  (let [pairs (partition 2 key-pred-forms)
        keys (mapv first pairs)
        pred-forms (mapv second pairs)
        pf (mapv #(res &env %) pred-forms)]
    (assert (clojure.core/and (even? (count key-pred-forms)) (every? keyword? keys)) "alt expects k1 p1 k2 p2..., where ks are keywords")
    `(cljs.spec/alt-impl ~keys ~pred-forms '~pf)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/alt` @ clojuredocs](http://clojuredocs.org/clojure.spec/alt)<br>
[`clojure.spec/alt` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/alt/)<br>
[`clojure.spec/alt` @ crossclj](http://crossclj.info/fun/clojure.spec/alt.html)<br>
[`cljs.spec/alt` @ crossclj](http://crossclj.info/fun/cljs.spec/alt.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/alt.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "alt",
 :signature ["[& key-pred-forms]"],
 :name-encode "alt",
 :history [["+" "1.9.14"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.spec/alt",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/alt"},
 :full-name-encode "cljs.spec/alt",
 :source {:code "(defmacro alt\n  [& key-pred-forms]\n  (let [pairs (partition 2 key-pred-forms)\n        keys (mapv first pairs)\n        pred-forms (mapv second pairs)\n        pf (mapv #(res &env %) pred-forms)]\n    (assert (clojure.core/and (even? (count key-pred-forms)) (every? keyword? keys)) \"alt expects k1 p1 k2 p2..., where ks are keywords\")\n    `(cljs.spec/alt-impl ~keys ~pred-forms '~pf)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljc",
          :lines [195 208],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljc#L195-L208"},
 :usage ["(alt & key-pred-forms)"],
 :full-name "cljs.spec/alt",
 :docstring "Takes key+pred pairs, e.g.\n\n(s/alt :even even? :small #(< % 42))\n\nReturns a regex op that returns a vector containing the key of the\nfirst matching pred and the corresponding value.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/alt.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/alt"]))
```

-->
