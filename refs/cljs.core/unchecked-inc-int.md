## cljs.core/unchecked-inc-int



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-inc-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-inc-int)
</td>
</tr>
</table>


 <samp>
(__unchecked-inc-int__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L2262-L2263):

```clj
(defn unchecked-inc-int [x]
  (cljs.core/unchecked-inc-int x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2262-2263](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L2262-L2263)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/core.clj#L457-L458):

```clj
(defmacro ^::ana/numeric unchecked-inc-int
  ([x] `(inc ~x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:457-458](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/core.clj#L457-L458)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-inc-int` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-inc-int)<br>
[`clojure.core/unchecked-inc-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-inc-int/)<br>
[`clojure.core/unchecked-inc-int` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-inc-int.html)<br>
[`cljs.core/unchecked-inc-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-inc-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-inc-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-inc-int",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-inc-int",
 :source {:code "(defn unchecked-inc-int [x]\n  (cljs.core/unchecked-inc-int x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2262 2263]},
 :extra-sources [{:code "(defmacro ^::ana/numeric unchecked-inc-int\n  ([x] `(inc ~x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3264",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [457 458]}],
 :full-name "cljs.core/unchecked-inc-int",
 :clj-symbol "clojure.core/unchecked-inc-int"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-inc-int"]))
```

-->
