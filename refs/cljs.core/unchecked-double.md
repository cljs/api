## cljs.core/unchecked-double



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-double</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-double)
</td>
</tr>
</table>


 <samp>
(__unchecked-double__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L2019):

```clj
(defn ^number unchecked-double [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2019](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L2019)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L377):

```clj
(defmacro unchecked-double [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:377](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L377)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-double` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-double)<br>
[`clojure.core/unchecked-double` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-double/)<br>
[`clojure.core/unchecked-double` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-double.html)<br>
[`cljs.core/unchecked-double` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-double.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-double.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-double",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-double",
 :source {:code "(defn ^number unchecked-double [x] x)",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2019]},
 :extra-sources [{:code "(defmacro unchecked-double [x] x)",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/clj/cljs/core.clj",
                  :lines [377]}],
 :full-name "cljs.core/unchecked-double",
 :clj-symbol "clojure.core/unchecked-double"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-double"]))
```

-->
