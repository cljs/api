## cljs.core/remove-all-methods



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-all-methods</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-all-methods)
</td>
</tr>
</table>


 <samp>
(__remove-all-methods__ multifn)<br>
</samp>

---





Source docstring:

```
Removes all of the methods of multimethod.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L7438-L7441):

```clj
(defn remove-all-methods
 [multifn]
 (-reset multifn))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2024
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7438-7441](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L7438-L7441)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/remove-all-methods` @ clojuredocs](http://clojuredocs.org/clojure.core/remove-all-methods)<br>
[`clojure.core/remove-all-methods` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/remove-all-methods/)<br>
[`clojure.core/remove-all-methods` @ crossclj](http://crossclj.info/fun/clojure.core/remove-all-methods.html)<br>
[`cljs.core/remove-all-methods` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/remove-all-methods.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/remove-all-methods.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "remove-all-methods",
 :signature ["[multifn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/remove-all-methods",
 :source {:code "(defn remove-all-methods\n [multifn]\n (-reset multifn))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2024",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7438 7441]},
 :full-name "cljs.core/remove-all-methods",
 :clj-symbol "clojure.core/remove-all-methods",
 :docstring "Removes all of the methods of multimethod."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/remove-all-methods"]))
```

-->
