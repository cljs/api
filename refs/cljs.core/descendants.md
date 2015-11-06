## cljs.core/descendants



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/descendants</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/descendants)
</td>
</tr>
</table>


 <samp>
(__descendants__ tag)<br>
</samp>
 <samp>
(__descendants__ h tag)<br>
</samp>

---



###### See Also:

[`cljs.core/ancestors`](../cljs.core/ancestors.md)<br>
[`cljs.core/isa?`](../cljs.core/isaQMARK.md)<br>
[`cljs.core/make-hierarchy`](../cljs.core/make-hierarchy.md)<br>
[`cljs.core/derive`](../cljs.core/derive.md)<br>

---


Source docstring:

```
Returns the immediate and indirect children of tag, through a
relationship established via derive. h must be a hierarchy obtained
from make-hierarchy, if not supplied defaults to the global
hierarchy. Note: does not work on JavaScript type inheritance
relationships.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L7400-L7407):

```clj
(defn descendants
  ([tag] (descendants @(get-global-hierarchy) tag))
  ([h tag] (not-empty (get (:descendants h) tag))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7400-7407](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L7400-L7407)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/descendants` @ clojuredocs](http://clojuredocs.org/clojure.core/descendants)<br>
[`clojure.core/descendants` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/descendants/)<br>
[`clojure.core/descendants` @ crossclj](http://crossclj.info/fun/clojure.core/descendants.html)<br>
[`cljs.core/descendants` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/descendants.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/descendants.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "descendants",
 :signature ["[tag]" "[h tag]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/ancestors"
           "cljs.core/isa?"
           "cljs.core/make-hierarchy"
           "cljs.core/derive"],
 :full-name-encode "cljs.core/descendants",
 :source {:code "(defn descendants\n  ([tag] (descendants @(get-global-hierarchy) tag))\n  ([h tag] (not-empty (get (:descendants h) tag))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7400 7407]},
 :full-name "cljs.core/descendants",
 :clj-symbol "clojure.core/descendants",
 :docstring "Returns the immediate and indirect children of tag, through a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy. Note: does not work on JavaScript type inheritance\nrelationships."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/descendants"]))
```

-->
