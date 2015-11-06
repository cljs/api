## cljs.core/unchecked-negate



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-negate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-negate)
</td>
</tr>
</table>


 <samp>
(__unchecked-negate__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L2002-L2003):

```clj
(defn unchecked-negate [x]
  (cljs.core/unchecked-negate x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2002-2003](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L2002-L2003)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2727/src/clj/cljs/core.clj#L399-L400):

```clj
(defmacro ^::ana/numeric unchecked-negate
  ([x] `(- ~x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2727
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:399-400](https://github.com/clojure/clojurescript/blob/r2727/src/clj/cljs/core.clj#L399-L400)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-negate` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-negate)<br>
[`clojure.core/unchecked-negate` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-negate/)<br>
[`clojure.core/unchecked-negate` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-negate.html)<br>
[`cljs.core/unchecked-negate` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-negate.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-negate.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-negate",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-negate",
 :source {:code "(defn unchecked-negate [x]\n  (cljs.core/unchecked-negate x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2002 2003]},
 :extra-sources [{:code "(defmacro ^::ana/numeric unchecked-negate\n  ([x] `(- ~x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2727",
                  :filename "src/clj/cljs/core.clj",
                  :lines [399 400]}],
 :full-name "cljs.core/unchecked-negate",
 :clj-symbol "clojure.core/unchecked-negate"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-negate"]))
```

-->
