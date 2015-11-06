## cljs.core/mix-collection-hash



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mix-collection-hash</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mix-collection-hash)
</td>
</tr>
</table>


 <samp>
(__mix-collection-hash__ hash-basis count)<br>
</samp>

---





Source docstring:

```
Mix final collection hash for ordered or unordered collections.
hash-basis is the combined collection hash, count is the number
of elements included in the basis. Note this is the hash code
consistent with =, different from .hashCode.
See http://clojure.org/data_structures#hash for full algorithms.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L809-L819):

```clj
(defn ^number mix-collection-hash
  [hash-basis count]
  (let [h1 m3-seed
        k1 (m3-mix-K1 hash-basis)
        h1 (m3-mix-H1 h1 k1)]
    (m3-fmix h1 count)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2760
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:809-819](https://github.com/clojure/clojurescript/blob/r2760/src/cljs/cljs/core.cljs#L809-L819)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/mix-collection-hash` @ clojuredocs](http://clojuredocs.org/clojure.core/mix-collection-hash)<br>
[`clojure.core/mix-collection-hash` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/mix-collection-hash/)<br>
[`clojure.core/mix-collection-hash` @ crossclj](http://crossclj.info/fun/clojure.core/mix-collection-hash.html)<br>
[`cljs.core/mix-collection-hash` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/mix-collection-hash.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/mix-collection-hash.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type number,
 :ns "cljs.core",
 :name "mix-collection-hash",
 :signature ["[hash-basis count]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core/mix-collection-hash",
 :source {:code "(defn ^number mix-collection-hash\n  [hash-basis count]\n  (let [h1 m3-seed\n        k1 (m3-mix-K1 hash-basis)\n        h1 (m3-mix-H1 h1 k1)]\n    (m3-fmix h1 count)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/cljs/cljs/core.cljs",
          :lines [809 819]},
 :full-name "cljs.core/mix-collection-hash",
 :clj-symbol "clojure.core/mix-collection-hash",
 :docstring "Mix final collection hash for ordered or unordered collections.\nhash-basis is the combined collection hash, count is the number\nof elements included in the basis. Note this is the hash code\nconsistent with =, different from .hashCode.\nSee http://clojure.org/data_structures#hash for full algorithms."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mix-collection-hash"]))
```

-->
