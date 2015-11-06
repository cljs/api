## cljs.core/remove-method



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-method</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-method)
</td>
</tr>
</table>


 <samp>
(__remove-method__ multifn dispatch-val)<br>
</samp>

---





Source docstring:

```
Removes the method of multimethod associated with dispatch-value.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L3483-L3486):

```clj
(defn remove-method
 [multifn dispatch-val]
 (-remove-method multifn dispatch-val))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3483-3486](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L3483-L3486)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/remove-method` @ clojuredocs](http://clojuredocs.org/clojure.core/remove-method)<br>
[`clojure.core/remove-method` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/remove-method/)<br>
[`clojure.core/remove-method` @ crossclj](http://crossclj.info/fun/clojure.core/remove-method.html)<br>
[`cljs.core/remove-method` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/remove-method.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/remove-method.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "remove-method",
 :signature ["[multifn dispatch-val]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/remove-method",
 :source {:code "(defn remove-method\n [multifn dispatch-val]\n (-remove-method multifn dispatch-val))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3483 3486]},
 :full-name "cljs.core/remove-method",
 :clj-symbol "clojure.core/remove-method",
 :docstring "Removes the method of multimethod associated with dispatch-value."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/remove-method"]))
```

-->
