## cljs.core/keyword



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keyword</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keyword)
</td>
</tr>
</table>


 <samp>
(__keyword__ name)<br>
</samp>
 <samp>
(__keyword__ ns name)<br>
</samp>

---





Source docstring:

```
Returns a Keyword with the given namespace and name.  Do not use :
in the keyword strings, it will be added automatically.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L1779-L1785):

```clj
(defn keyword
  ([name] (cond (keyword? name) name
                (symbol? name) (str* "\uFDD0" ":" (cljs.core/name name))
                :else (str* "\uFDD0" ":" name)))
  ([ns name] (keyword (str* ns "/" name))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1779-1785](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L1779-L1785)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/keyword` @ clojuredocs](http://clojuredocs.org/clojure.core/keyword)<br>
[`clojure.core/keyword` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/keyword/)<br>
[`clojure.core/keyword` @ crossclj](http://crossclj.info/fun/clojure.core/keyword.html)<br>
[`cljs.core/keyword` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/keyword.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/keyword.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "keyword",
 :signature ["[name]" "[ns name]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/keyword",
 :source {:code "(defn keyword\n  ([name] (cond (keyword? name) name\n                (symbol? name) (str* \"\\uFDD0\" \":\" (cljs.core/name name))\n                :else (str* \"\\uFDD0\" \":\" name)))\n  ([ns name] (keyword (str* ns \"/\" name))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1779 1785]},
 :full-name "cljs.core/keyword",
 :clj-symbol "clojure.core/keyword",
 :docstring "Returns a Keyword with the given namespace and name.  Do not use :\nin the keyword strings, it will be added automatically."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keyword"]))
```

-->
