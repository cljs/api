## cljs.core/unchecked-remainder-int



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-remainder-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-remainder-int)
</td>
</tr>
</table>


 <samp>
(__unchecked-remainder-int__ x n)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L1814-L1815):

```clj
(defn unchecked-remainder-int [x n]
  (cljs.core/unchecked-remainder-int x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1814-1815](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L1814-L1815)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2277/src/clj/cljs/core.clj#L419-L420):

```clj
(defmacro ^::ana/numeric unchecked-remainder-int
  ([x n] `(mod ~x ~n)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2277
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:419-420](https://github.com/clojure/clojurescript/blob/r2277/src/clj/cljs/core.clj#L419-L420)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-remainder-int` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-remainder-int)<br>
[`clojure.core/unchecked-remainder-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-remainder-int/)<br>
[`clojure.core/unchecked-remainder-int` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-remainder-int.html)<br>
[`cljs.core/unchecked-remainder-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-remainder-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-remainder-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-remainder-int",
 :signature ["[x n]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-remainder-int",
 :source {:code "(defn unchecked-remainder-int [x n]\n  (cljs.core/unchecked-remainder-int x n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1814 1815]},
 :extra-sources [{:code "(defmacro ^::ana/numeric unchecked-remainder-int\n  ([x n] `(mod ~x ~n)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2277",
                  :filename "src/clj/cljs/core.clj",
                  :lines [419 420]}],
 :full-name "cljs.core/unchecked-remainder-int",
 :clj-symbol "clojure.core/unchecked-remainder-int"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-remainder-int"]))
```

-->
