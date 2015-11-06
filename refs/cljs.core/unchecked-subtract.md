## cljs.core/unchecked-subtract



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-subtract</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-subtract)
</td>
</tr>
</table>


 <samp>
(__unchecked-subtract__ & xs)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2080/src/clj/cljs/core.clj#L383-L384):

```clj
(defmacro ^::ana/numeric unchecked-subtract
  ([& xs] `(- ~@xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2080
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:383-384](https://github.com/clojure/clojurescript/blob/r2080/src/clj/cljs/core.clj#L383-L384)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/unchecked-subtract` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-subtract)<br>
[`clojure.core/unchecked-subtract` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-subtract/)<br>
[`clojure.core/unchecked-subtract` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-subtract.html)<br>
[`cljs.core/unchecked-subtract` @ crossclj](http://crossclj.info/fun/cljs.core/unchecked-subtract.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-subtract.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-subtract",
 :signature ["[& xs]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :full-name-encode "cljs.core/unchecked-subtract",
 :source {:code "(defmacro ^::ana/numeric unchecked-subtract\n  ([& xs] `(- ~@xs)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2080",
          :filename "src/clj/cljs/core.clj",
          :lines [383 384]},
 :full-name "cljs.core/unchecked-subtract",
 :clj-symbol "clojure.core/unchecked-subtract"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-subtract"]))
```

-->
