## cljs.core/byte



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/byte</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/byte)
</td>
</tr>
</table>


 <samp>
(__byte__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L1462):

```clj
(defn byte [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1462](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L1462)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L275):

```clj
(defmacro byte [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:275](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L275)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/byte` @ clojuredocs](http://clojuredocs.org/clojure.core/byte)<br>
[`clojure.core/byte` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/byte/)<br>
[`clojure.core/byte` @ crossclj](http://crossclj.info/fun/clojure.core/byte.html)<br>
[`cljs.core/byte` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/byte.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/byte.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "byte",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/byte",
 :source {:code "(defn byte [x] x)",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1820",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1462]},
 :extra-sources [{:code "(defmacro byte [x] x)",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1820",
                  :filename "src/clj/cljs/core.clj",
                  :lines [275]}],
 :full-name "cljs.core/byte",
 :clj-symbol "clojure.core/byte"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/byte"]))
```

-->
