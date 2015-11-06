## cljs.core/unchecked-int



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-int)
</td>
</tr>
</table>


 <samp>
(__unchecked-int__ x)<br>
</samp>

---





Source docstring:

```
Coerce to int by stripping decimal places.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L2304-L2307):

```clj
(defn unchecked-int
  [x]
  (fix x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2304-2307](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L2304-L2307)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/unchecked-int` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-int)<br>
[`clojure.core/unchecked-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-int/)<br>
[`clojure.core/unchecked-int` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-int.html)<br>
[`cljs.core/unchecked-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-int",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core/unchecked-int",
 :source {:code "(defn unchecked-int\n  [x]\n  (fix x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2304 2307]},
 :full-name "cljs.core/unchecked-int",
 :clj-symbol "clojure.core/unchecked-int",
 :docstring "Coerce to int by stripping decimal places."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-int"]))
```

-->
