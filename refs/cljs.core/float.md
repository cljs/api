## cljs.core/float



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/float</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/float)
</td>
</tr>
</table>


 <samp>
(__float__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/core.cljs#L1566):

```clj
(defn ^number float [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2197
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1566](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/core.cljs#L1566)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2197/src/clj/cljs/core.clj#L352):

```clj
(defmacro float [x] x)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2197
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:352](https://github.com/clojure/clojurescript/blob/r2197/src/clj/cljs/core.clj#L352)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/float` @ clojuredocs](http://clojuredocs.org/clojure.core/float)<br>
[`clojure.core/float` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/float/)<br>
[`clojure.core/float` @ crossclj](http://crossclj.info/fun/clojure.core/float.html)<br>
[`cljs.core/float` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/float.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/float.cljsdoc
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
 :name "float",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/float",
 :source {:code "(defn ^number float [x] x)",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1566]},
 :extra-sources [{:code "(defmacro float [x] x)",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2197",
                  :filename "src/clj/cljs/core.clj",
                  :lines [352]}],
 :full-name "cljs.core/float",
 :clj-symbol "clojure.core/float"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/float"]))
```

-->
