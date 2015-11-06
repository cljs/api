## cljs.core/reduced



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reduced</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reduced)
</td>
</tr>
</table>


 <samp>
(__reduced__ x)<br>
</samp>

---





Source docstring:

```
Wraps x in a way such that a reduce will terminate with the value x
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L1130-L1133):

```clj
(defn reduced
  [x]
  (Reduced. x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1130-1133](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L1130-L1133)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reduced` @ clojuredocs](http://clojuredocs.org/clojure.core/reduced)<br>
[`clojure.core/reduced` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reduced/)<br>
[`clojure.core/reduced` @ crossclj](http://crossclj.info/fun/clojure.core/reduced.html)<br>
[`cljs.core/reduced` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reduced.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reduced.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "reduced",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/reduced",
 :source {:code "(defn reduced\n  [x]\n  (Reduced. x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1130 1133]},
 :full-name "cljs.core/reduced",
 :clj-symbol "clojure.core/reduced",
 :docstring "Wraps x in a way such that a reduce will terminate with the value x"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduced"]))
```

-->
