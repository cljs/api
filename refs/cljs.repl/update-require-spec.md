## cljs.repl/update-require-spec



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__update-require-spec__ specs & additions)<br>
</samp>

---





Source docstring:

```
Given the specification portion of a ns form and require spec additions
return an updated specification.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/repl.clj#L223-L238):

```clj
(defn update-require-spec
  [specs & additions]
  (let [[before [requires & other-specs]]
        (split-with
          (fn [[x _]] (not= :require x))
          specs)
        requires'
        `(:require
           ~@(reduce
               (fn [requires spec]
                 (merge-require requires spec))
               (rest requires)
               additions))]
    (concat before [requires'] other-specs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:223-238](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/repl.clj#L223-L238)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/update-require-spec` @ crossclj](http://crossclj.info/fun/cljs.repl/update-require-spec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/update-require-spec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "update-require-spec",
 :signature ["[specs & additions]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.repl/update-require-spec",
 :source {:code "(defn update-require-spec\n  [specs & additions]\n  (let [[before [requires & other-specs]]\n        (split-with\n          (fn [[x _]] (not= :require x))\n          specs)\n        requires'\n        `(:require\n           ~@(reduce\n               (fn [requires spec]\n                 (merge-require requires spec))\n               (rest requires)\n               additions))]\n    (concat before [requires'] other-specs)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/repl.clj",
          :lines [223 238]},
 :full-name "cljs.repl/update-require-spec",
 :docstring "Given the specification portion of a ns form and require spec additions\nreturn an updated specification."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/update-require-spec"]))
```

-->
