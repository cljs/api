## cljs.core/unchecked-negate-int



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-negate-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-negate-int)
</td>
</tr>
</table>


 <samp>
(__unchecked-negate-int__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L2285-L2286):

```clj
(defn unchecked-negate-int [x]
  (cljs.core/unchecked-negate-int x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2285-2286](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/core.cljs#L2285-L2286)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/core.clj#L469-L470):

```clj
(defmacro ^::ana/numeric unchecked-negate-int
  ([x] `(- ~x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:469-470](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/core.clj#L469-L470)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-negate-int` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-negate-int)<br>
[`clojure.core/unchecked-negate-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-negate-int/)<br>
[`clojure.core/unchecked-negate-int` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-negate-int.html)<br>
[`cljs.core/unchecked-negate-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-negate-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-negate-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-negate-int",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-negate-int",
 :source {:code "(defn unchecked-negate-int [x]\n  (cljs.core/unchecked-negate-int x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2285 2286]},
 :extra-sources [{:code "(defmacro ^::ana/numeric unchecked-negate-int\n  ([x] `(- ~x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3297",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [469 470]}],
 :full-name "cljs.core/unchecked-negate-int",
 :clj-symbol "clojure.core/unchecked-negate-int"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-negate-int"]))
```

-->
