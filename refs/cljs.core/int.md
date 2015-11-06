## cljs.core/int



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/int)
</td>
</tr>
</table>


 <samp>
(__int__ x)<br>
</samp>

---

Coerces `x` to an integer by stripping decimal places.



---


###### See Also:

[`cljs.core/char`](../cljs.core/char.md)<br>
[`cljs.core/integer?`](../cljs.core/integerQMARK.md)<br>

---


Source docstring:

```
Coerce to int by stripping decimal places.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L1824-L1827):

```clj
(defn int
  [x]
  (bit-or x 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1824-1827](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L1824-L1827)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2268/src/clj/cljs/core.clj#L520-L521):

```clj
(defmacro ^::ana/numeric int [x]
  `(bit-or ~x 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2268
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:520-521](https://github.com/clojure/clojurescript/blob/r2268/src/clj/cljs/core.clj#L520-L521)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/int` @ clojuredocs](http://clojuredocs.org/clojure.core/int)<br>
[`clojure.core/int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/int/)<br>
[`clojure.core/int` @ crossclj](http://crossclj.info/fun/clojure.core/int.html)<br>
[`cljs.core/int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Coerces `x` to an integer by stripping decimal places.",
 :ns "cljs.core",
 :name "int",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function/macro",
 :related ["cljs.core/char" "cljs.core/integer?"],
 :full-name-encode "cljs.core/int",
 :source {:code "(defn int\n  [x]\n  (bit-or x 0))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1824 1827]},
 :extra-sources [{:code "(defmacro ^::ana/numeric int [x]\n  `(bit-or ~x 0))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2268",
                  :filename "src/clj/cljs/core.clj",
                  :lines [520 521]}],
 :full-name "cljs.core/int",
 :clj-symbol "clojure.core/int",
 :docstring "Coerce to int by stripping decimal places."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/int"]))
```

-->
