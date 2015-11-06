## cljs.core/unchecked-float



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-float</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-float)
</td>
</tr>
</table>


 <samp>
(__unchecked-float__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L2215):

```clj
(defn ^number unchecked-float [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2215](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L2215)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/core.clj#L436):

```clj
(defmacro unchecked-float [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:436](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/core.clj#L436)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-float` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-float)<br>
[`clojure.core/unchecked-float` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-float/)<br>
[`clojure.core/unchecked-float` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-float.html)<br>
[`cljs.core/unchecked-float` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-float.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-float.cljsdoc
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
 :name "unchecked-float",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-float",
 :source {:code "(defn ^number unchecked-float [x] x)",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2215]},
 :extra-sources [{:code "(defmacro unchecked-float [x] x)",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3208",
                  :filename "src/clj/cljs/core.clj",
                  :lines [436]}],
 :full-name "cljs.core/unchecked-float",
 :clj-symbol "clojure.core/unchecked-float"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-float"]))
```

-->
