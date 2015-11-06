## clojure.set/index



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/index</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/index)
</td>
</tr>
</table>


 <samp>
(__index__ xrel ks)<br>
</samp>

---





Source docstring:

```
Returns a map of the distinct values of ks in the xrel mapped to a
set of the maps in xrel with the corresponding values of ks.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/clojure/set.cljs#L88-L96):

```clj
(defn index
  [xrel ks]
    (reduce
     (fn [m x]
       (let [ik (select-keys x ks)]
         (assoc m ik (conj (get m ik #{}) x))))
     {} xrel))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1878
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:88-96](https://github.com/clojure/clojurescript/blob/r1878/src/cljs/clojure/set.cljs#L88-L96)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/index` @ clojuredocs](http://clojuredocs.org/clojure.set/index)<br>
[`clojure.set/index` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/index/)<br>
[`clojure.set/index` @ crossclj](http://crossclj.info/fun/clojure.set/index.html)<br>
[`clojure.set/index` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/index.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/index.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.set",
 :name "index",
 :signature ["[xrel ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set/index",
 :source {:code "(defn index\n  [xrel ks]\n    (reduce\n     (fn [m x]\n       (let [ik (select-keys x ks)]\n         (assoc m ik (conj (get m ik #{}) x))))\n     {} xrel))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1878",
          :filename "src/cljs/clojure/set.cljs",
          :lines [88 96]},
 :full-name "clojure.set/index",
 :clj-symbol "clojure.set/index",
 :docstring "Returns a map of the distinct values of ks in the xrel mapped to a\nset of the maps in xrel with the corresponding values of ks."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/index"]))
```

-->
