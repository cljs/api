## cljs.core/double



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/double</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/double)
</td>
</tr>
</table>


 <samp>
(__double__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L2220):

```clj
(defn ^number double [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2220](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L2220)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/core.clj#L431):

```clj
(defmacro double [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:431](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/core.clj#L431)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/double` @ clojuredocs](http://clojuredocs.org/clojure.core/double)<br>
[`clojure.core/double` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/double/)<br>
[`clojure.core/double` @ crossclj](http://crossclj.info/fun/clojure.core/double.html)<br>
[`cljs.core/double` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/double.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/double.cljsdoc
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
 :name "double",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/double",
 :source {:code "(defn ^number double [x] x)",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2220]},
 :extra-sources [{:code "(defmacro double [x] x)",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3255",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [431]}],
 :full-name "cljs.core/double",
 :clj-symbol "clojure.core/double"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/double"]))
```

-->
