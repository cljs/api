## cljs.core/prefer-method



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prefer-method</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prefer-method)
</td>
</tr>
</table>


 <samp>
(__prefer-method__ multifn dispatch-val-x dispatch-val-y)<br>
</samp>

---





Source docstring:

```
Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y
when there is a conflict
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/core.cljs#L9790-L9794):

```clj
(defn prefer-method
  [multifn dispatch-val-x dispatch-val-y]
  (-prefer-method multifn dispatch-val-x dispatch-val-y))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.107
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9790-9794](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/core.cljs#L9790-L9794)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/prefer-method` @ clojuredocs](http://clojuredocs.org/clojure.core/prefer-method)<br>
[`clojure.core/prefer-method` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/prefer-method/)<br>
[`clojure.core/prefer-method` @ crossclj](http://crossclj.info/fun/clojure.core/prefer-method.html)<br>
[`cljs.core/prefer-method` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/prefer-method.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/prefer-method.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "prefer-method",
 :signature ["[multifn dispatch-val-x dispatch-val-y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/prefer-method",
 :source {:code "(defn prefer-method\n  [multifn dispatch-val-x dispatch-val-y]\n  (-prefer-method multifn dispatch-val-x dispatch-val-y))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.107",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9790 9794]},
 :full-name "cljs.core/prefer-method",
 :clj-symbol "clojure.core/prefer-method",
 :docstring "Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y\nwhen there is a conflict"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prefer-method"]))
```

-->
