## cljs.core/methods



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/methods</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/methods)
</td>
</tr>
</table>


 <samp>
(__methods__ multifn)<br>
</samp>

---





Source docstring:

```
Given a multimethod, returns a map of dispatch values -> dispatch fns
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L9131-L9133):

```clj
(defn methods
  [multifn] (-methods multifn))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9131-9133](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L9131-L9133)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/methods` @ clojuredocs](http://clojuredocs.org/clojure.core/methods)<br>
[`clojure.core/methods` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/methods/)<br>
[`clojure.core/methods` @ crossclj](http://crossclj.info/fun/clojure.core/methods.html)<br>
[`cljs.core/methods` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/methods.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/methods.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "methods",
 :signature ["[multifn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/methods",
 :source {:code "(defn methods\n  [multifn] (-methods multifn))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9131 9133]},
 :full-name "cljs.core/methods",
 :clj-symbol "clojure.core/methods",
 :docstring "Given a multimethod, returns a map of dispatch values -> dispatch fns"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/methods"]))
```

-->
