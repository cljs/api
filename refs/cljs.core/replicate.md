## cljs.core/replicate



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/replicate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/replicate)
</td>
</tr>
</table>


 <samp>
(__replicate__ n x)<br>
</samp>

---





Source docstring:

```
Returns a lazy seq of n xs.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2502-L2504):

```clj
(defn replicate
  [n x] (take n (repeat x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2502-2504](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2502-L2504)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/replicate` @ clojuredocs](http://clojuredocs.org/clojure.core/replicate)<br>
[`clojure.core/replicate` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/replicate/)<br>
[`clojure.core/replicate` @ crossclj](http://crossclj.info/fun/clojure.core/replicate.html)<br>
[`cljs.core/replicate` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/replicate.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/replicate.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "replicate",
 :signature ["[n x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/replicate",
 :source {:code "(defn replicate\n  [n x] (take n (repeat x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2502 2504]},
 :full-name "cljs.core/replicate",
 :clj-symbol "clojure.core/replicate",
 :docstring "Returns a lazy seq of n xs."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/replicate"]))
```

-->
