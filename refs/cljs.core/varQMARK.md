## cljs.core/var?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/var?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var?)
</td>
</tr>
</table>


 <samp>
(__var?__ v)<br>
</samp>

---





Source docstring:

```
Returns true if v is of type cljs.core.Var
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L1037-L1040):

```clj
(defn var?
  [v]
  (instance? cljs.core.Var v))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1037-1040](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L1037-L1040)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/var?` @ clojuredocs](http://clojuredocs.org/clojure.core/var_q)<br>
[`clojure.core/var?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/var%3F/)<br>
[`clojure.core/var?` @ crossclj](http://crossclj.info/fun/clojure.core/var%3F.html)<br>
[`cljs.core/var?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/var%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/varQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "var?",
 :signature ["[v]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.core/varQMARK",
 :source {:code "(defn var?\n  [v]\n  (instance? cljs.core.Var v))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1037 1040]},
 :full-name "cljs.core/var?",
 :clj-symbol "clojure.core/var?",
 :docstring "Returns true if v is of type cljs.core.Var"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/var?"]))
```

-->
