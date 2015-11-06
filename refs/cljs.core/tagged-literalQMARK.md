## cljs.core/tagged-literal?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/tagged-literal?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/tagged-literal?)
</td>
</tr>
</table>


 <samp>
(__tagged-literal?__ value)<br>
</samp>

---





Source docstring:

```
Return true if the value is the data representation of a tagged literal
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L9985-L9988):

```clj
(defn tagged-literal?
  [value]
  (instance? TaggedLiteral value))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9985-9988](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L9985-L9988)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/tagged-literal?` @ clojuredocs](http://clojuredocs.org/clojure.core/tagged-literal_q)<br>
[`clojure.core/tagged-literal?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/tagged-literal%3F/)<br>
[`clojure.core/tagged-literal?` @ crossclj](http://crossclj.info/fun/clojure.core/tagged-literal%3F.html)<br>
[`cljs.core/tagged-literal?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/tagged-literal%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/tagged-literalQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "tagged-literal?",
 :signature ["[value]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.core/tagged-literalQMARK",
 :source {:code "(defn tagged-literal?\n  [value]\n  (instance? TaggedLiteral value))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9985 9988]},
 :full-name "cljs.core/tagged-literal?",
 :clj-symbol "clojure.core/tagged-literal?",
 :docstring "Return true if the value is the data representation of a tagged literal"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/tagged-literal?"]))
```

-->
