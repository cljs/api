## quote



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/quote</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/quote)
</td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/analyzer.clj#L547-L549):

```clj
(defmethod parse 'quote
  [_ env [_ x] _]
  {:op :constant :env env :form x})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:547-549](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/analyzer.clj#L547-L549)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/quote` @ clojuredocs](http://clojuredocs.org/clojure.core/quote)<br>
[`clojure.core/quote` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/quote/)<br>
[`clojure.core/quote` @ crossclj](http://crossclj.info/fun/clojure.core/quote.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/quote.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "quote",
 :type "special form",
 :source {:code "(defmethod parse 'quote\n  [_ env [_ x] _]\n  {:op :constant :env env :form x})",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [547 549]},
 :full-name "special/quote",
 :full-name-encode "special/quote",
 :clj-symbol "clojure.core/quote",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/quote"]))
```

-->
