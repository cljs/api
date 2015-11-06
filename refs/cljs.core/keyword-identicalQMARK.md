## cljs.core/keyword-identical?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1877"><img valign="middle" alt="[+] 0.0-1877" title="Added in 0.0-1877" src="https://img.shields.io/badge/+-0.0--1877-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__keyword-identical?__ x y)<br>
</samp>

---





Source docstring:

```
Efficient test to determine that two keywords are identical.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L2821-L2829):

```clj
(defn ^boolean keyword-identical?
  [x y]
  (if (identical? x y)
    true
    (if (and (keyword? x)
             (keyword? y))
      (identical? (.-fqn x) (.-fqn y))
      false)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2821-2829](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L2821-L2829)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/keyword-identical?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/keyword-identical%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/keyword-identicalQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "keyword-identical?",
 :signature ["[x y]"],
 :history [["+" "0.0-1877"]],
 :type "function",
 :full-name-encode "cljs.core/keyword-identicalQMARK",
 :source {:code "(defn ^boolean keyword-identical?\n  [x y]\n  (if (identical? x y)\n    true\n    (if (and (keyword? x)\n             (keyword? y))\n      (identical? (.-fqn x) (.-fqn y))\n      false)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2821 2829]},
 :full-name "cljs.core/keyword-identical?",
 :docstring "Efficient test to determine that two keywords are identical."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keyword-identical?"]))
```

-->
