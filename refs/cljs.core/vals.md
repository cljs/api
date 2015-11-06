## cljs.core/vals



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vals</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vals)
</td>
</tr>
</table>


 <samp>
(__vals__ hash-map)<br>
</samp>

---

Returns a sequence of the values in `hash-map`.



---


###### See Also:

[`cljs.core/keys`](../cljs.core/keys.md)<br>

---


Source docstring:

```
Returns a sequence of the map's values.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/cljs/core.cljs#L5933-L5937):

```clj
(defn vals
  [hash-map]
  (when-let [mseq (seq hash-map)]
    (ValSeq. mseq nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1878
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5933-5937](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/cljs/core.cljs#L5933-L5937)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/vals` @ clojuredocs](http://clojuredocs.org/clojure.core/vals)<br>
[`clojure.core/vals` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/vals/)<br>
[`clojure.core/vals` @ crossclj](http://crossclj.info/fun/clojure.core/vals.html)<br>
[`cljs.core/vals` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/vals.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vals.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sequence of the values in `hash-map`.",
 :ns "cljs.core",
 :name "vals",
 :signature ["[hash-map]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/keys"],
 :full-name-encode "cljs.core/vals",
 :source {:code "(defn vals\n  [hash-map]\n  (when-let [mseq (seq hash-map)]\n    (ValSeq. mseq nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5933 5937]},
 :full-name "cljs.core/vals",
 :clj-symbol "clojure.core/vals",
 :docstring "Returns a sequence of the map's values."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vals"]))
```

-->
