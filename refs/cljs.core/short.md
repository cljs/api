## cljs.core/short



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/short</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/short)
</td>
</tr>
</table>


 <samp>
(__short__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L2207):

```clj
(defn ^number short [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2207](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L2207)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/core.clj#L380):

```clj
(defmacro short [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:380](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/core.clj#L380)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/short` @ clojuredocs](http://clojuredocs.org/clojure.core/short)<br>
[`clojure.core/short` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/short/)<br>
[`clojure.core/short` @ crossclj](http://crossclj.info/fun/clojure.core/short.html)<br>
[`cljs.core/short` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/short.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/short.cljsdoc
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
 :name "short",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/short",
 :source {:code "(defn ^number short [x] x)",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2207]},
 :extra-sources [{:code "(defmacro short [x] x)",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3115",
                  :filename "src/clj/cljs/core.clj",
                  :lines [380]}],
 :full-name "cljs.core/short",
 :clj-symbol "clojure.core/short"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/short"]))
```

-->
