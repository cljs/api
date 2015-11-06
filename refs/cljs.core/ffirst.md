## cljs.core/ffirst



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ffirst</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ffirst)
</td>
</tr>
</table>


 <samp>
(__ffirst__ coll)<br>
</samp>

---

Same as `(first (first coll))`.



---

###### Examples:

```clj
(ffirst [[1 2] [3 4] [5 6]])
;;=> 1
```



---

###### See Also:

[`cljs.core/first`](../cljs.core/first.md)<br>
[`cljs.core/fnext`](../cljs.core/fnext.md)<br>
[`cljs.core/nfirst`](../cljs.core/nfirst.md)<br>

---


Source docstring:

```
Same as (first (first x))
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L1194-L1197):

```clj
(defn ffirst
  [coll]
  (first (first coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1194-1197](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L1194-L1197)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ffirst` @ clojuredocs](http://clojuredocs.org/clojure.core/ffirst)<br>
[`clojure.core/ffirst` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ffirst/)<br>
[`clojure.core/ffirst` @ crossclj](http://crossclj.info/fun/clojure.core/ffirst.html)<br>
[`cljs.core/ffirst` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ffirst.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ffirst.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Same as `(first (first coll))`.",
 :ns "cljs.core",
 :name "ffirst",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first" "cljs.core/fnext" "cljs.core/nfirst"],
 :full-name-encode "cljs.core/ffirst",
 :source {:code "(defn ffirst\n  [coll]\n  (first (first coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1194 1197]},
 :examples [{:id "575ba2",
             :content "```clj\n(ffirst [[1 2] [3 4] [5 6]])\n;;=> 1\n```"}],
 :full-name "cljs.core/ffirst",
 :clj-symbol "clojure.core/ffirst",
 :docstring "Same as (first (first x))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ffirst"]))
```

-->
