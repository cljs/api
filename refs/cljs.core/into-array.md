## cljs.core/into-array



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/into-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/into-array)
</td>
</tr>
</table>


 <samp>
(__into-array__ aseq)<br>
</samp>

---

Returns a new JavaScript array from the elements of `aseq`.



---


###### See Also:

[`cljs.core/to-array`](../cljs.core/to-array.md)<br>
[`cljs.core/make-array`](../cljs.core/make-array.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L191-L195):

```clj
(defn ^array into-array
  ([aseq]
     (into-array nil aseq))
  ([type aseq]
     (reduce (fn [a x] (.push a x) a) (array) aseq)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:191-195](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L191-L195)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/into-array` @ clojuredocs](http://clojuredocs.org/clojure.core/into-array)<br>
[`clojure.core/into-array` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/into-array/)<br>
[`clojure.core/into-array` @ crossclj](http://crossclj.info/fun/clojure.core/into-array.html)<br>
[`cljs.core/into-array` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/into-array.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/into-array.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new JavaScript array from the elements of `aseq`.",
 :return-type array,
 :ns "cljs.core",
 :name "into-array",
 :signature ["[aseq]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/to-array" "cljs.core/make-array"],
 :full-name-encode "cljs.core/into-array",
 :source {:code "(defn ^array into-array\n  ([aseq]\n     (into-array nil aseq))\n  ([type aseq]\n     (reduce (fn [a x] (.push a x) a) (array) aseq)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/cljs/core.cljs",
          :lines [191 195]},
 :full-name "cljs.core/into-array",
 :clj-symbol "clojure.core/into-array"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/into-array"]))
```

-->
