## cljs.core/vec



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vec)
</td>
</tr>
</table>

<samp>(vec coll)</samp><br>

---

 <samp>
(__vec__ coll)<br>
</samp>

---

Creates a new vector containing the contents of `coll`



---


###### See Also:

[`cljs.core/vector`](../cljs.core/vector.md)<br>
[`cljs.core/vector?`](../cljs.core/vectorQMARK.md)<br>

---


Source docstring:

```
Creates a new vector containing the contents of coll. JavaScript arrays
will be aliased and should not be modified.
```


Source code @ [github]():

```clj
(defn vec
  [coll]
  (if (array? coll)
    (.fromArray PersistentVector coll true)
    (-persistent!
      (reduce -conj!
        (-as-transient (.-EMPTY PersistentVector))
        coll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/vec` @ clojuredocs](http://clojuredocs.org/clojure.core/vec)<br>
[`clojure.core/vec` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/vec/)<br>
[`clojure.core/vec` @ crossclj](http://crossclj.info/fun/clojure.core/vec.html)<br>
[`cljs.core/vec` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/vec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a new vector containing the contents of `coll`",
 :ns "cljs.core",
 :name "vec",
 :signature ["[coll]"],
 :name-encode "vec",
 :history [["+" "0.0-927"]],
 :type "function",
 :clj-equiv {:full-name "clojure.core/vec",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vec"},
 :related ["cljs.core/vector" "cljs.core/vector?"],
 :full-name-encode "cljs.core/vec",
 :source {:code "(defn vec\n  [coll]\n  (if (array? coll)\n    (.fromArray PersistentVector coll true)\n    (-persistent!\n      (reduce -conj!\n        (-as-transient (.-EMPTY PersistentVector))\n        coll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5075 5084],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L5075-L5084"},
 :usage ["(vec coll)"],
 :full-name "cljs.core/vec",
 :docstring "Creates a new vector containing the contents of coll. JavaScript arrays\nwill be aliased and should not be modified.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vec.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vec"]))
```

-->
